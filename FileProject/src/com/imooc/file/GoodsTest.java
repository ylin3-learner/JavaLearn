package com.imooc.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class GoodsTest {

	public static void main(String[] args) {
		// Define Goods instance
		Goods goods1 = new Goods("s001", "Computer", 1500.0);
		
		// ObjectOutputStream belongs to byte-stream ; call FileOutputStream
		try {
			FileOutputStream fos = new FileOutputStream("fileText.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			FileInputStream fis = new FileInputStream("fileText.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			// write object info into file
			oos.writeObject(goods1);
			oos.flush();
			// read object info from file
			Goods goods;
			try {
				goods = (Goods)ois.readObject();
				System.out.println(goods);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			fos.close();
			oos.close();
			fis.close();
			ois.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
