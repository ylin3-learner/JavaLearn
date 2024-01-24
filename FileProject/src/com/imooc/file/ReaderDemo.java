package com.imooc.file;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

public class ReaderDemo {

	public static void main(String[] args) {
		try {
			FileInputStream fileInputStream = new FileInputStream("temp.txt");
			
			InputStreamReader reader = new InputStreamReader(fileInputStream, StandardCharsets.UTF_8);
			
			// ����FileOutputStream �N�奻Ū�J��OutputStreamWriter���r�`�Ʋդ�
			// OutputStreamWriter�N�r�`�ন�r��
			// �q�LBufferedWriter �ʸ� OutputStreamWriter �����g�i���t��
			FileOutputStream fileOutputStream = new FileOutputStream("temp1.txt");  // �r�ſ�X�y
			OutputStreamWriter writer = new OutputStreamWriter(fileOutputStream, StandardCharsets.UTF_8);
			BufferedWriter bfw = new BufferedWriter(writer);
			// �ϥΤFStandardCharsets.UTF_8�ӫ��wUTF-8�s�X
			// �ʳ��G�J�줣�P�����榡, �S�|���ýX
			/**
			 * �ѨM�覡�G�ϥαa���۰��˴��s�X���w�A�Ҧp Apache Commons IO �M Juniversalchardet�C
			 * �ϥ� Apache Commons IO ���� BOMInputStream ���˴��åh���줸�ն��ǼаO(BOM)�A�H�Ψϥ� UniversalDetector �Ӧ۰��˴��r���s�X
			 */
			int result = 0;
			char[] characterBuffer = new char[10];
			long startTime = System.currentTimeMillis();
//			while ((result = reader.read()) != -1) {
//				System.out.print((char) result);
//			}
			while((result = reader.read(characterBuffer)) != -1) {
				String characterString = new String(characterBuffer, 0, result);
				bfw.write(characterString);
				bfw.flush();
				System.out.print(characterString);
			}
			long endTime = System.currentTimeMillis();
			
			fileInputStream.close();
			reader.close();
			fileOutputStream.close();
			writer.close();
			bfw.close();
			System.out.println("\nDuration Time: " + (endTime - startTime));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
