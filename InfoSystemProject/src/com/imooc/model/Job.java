package com.imooc.model;

public class Job {
	// �����ݩʡG¾�Ƚs���B¾�ȦW��
	private String jobNo;
	private String jobName;
	
	public Job() {
		
	}
	
	public Job(String jobNo, String jobName) {
		this.setJobNo(jobNo);
		this.setJobName(jobName);
	}
	
	public String getJobNo() {
		return jobNo;
	}
	public void setJobNo(String jobNo) {
		this.jobNo = jobNo;
	}
	public String getJobName() {
		return jobName;
	}
	public void setJobName(String jobName) {
		this.jobName = jobName;
	}
	
	//  �����y�z�G����y�z¾�Ƚs���B¾�ȦW�� -- ��^�r�Ŧ�(��@¾�d��h), ��Ѵ��������L
	public String displayInfo() {
		String str = "¾�Ƚs���G" + this.getJobNo() + "\n¾�ȦW�١G" + this.getJobName();
		return str;
	}
}
