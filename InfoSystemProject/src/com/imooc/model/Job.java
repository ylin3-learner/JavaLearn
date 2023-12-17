package com.imooc.model;

public class Job {
	// 成員屬性：職務編號、職務名稱
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
	
	//  類型描述：能夠描述職務編號、職務名稱 -- 返回字符串(單一職責原則), 交由測試類打印
	public String displayInfo() {
		String str = "職務編號：" + this.getJobNo() + "\n職務名稱：" + this.getJobName();
		return str;
	}
}
