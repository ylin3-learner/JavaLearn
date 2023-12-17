package com.imooc.model;

public class Department {
	// Θ妮┦场絪腹场嘿计舱计
		private String departmentNo;
		private String departmentName;
		private Staff[] myStaff;
		private int staffCount;
		
		public Department() {
			
		}
		
		public Department(String departmentNo, String departmentName) {
			this.setDepartmentNo(departmentNo);
			this.setDepartmentName(departmentName);
			this.setMyStaff(myStaff);
			this.setStaffCount(staffCount);
		}
		
		public void setDepartmentNo(String departmentNo) {
			this.departmentNo = departmentNo;
		}
		
		public String getDepartmentNo() {
			return this.departmentNo;
		}

		public String getDepartmentName() {
			return departmentName;
		}

		public void setDepartmentName(String departmentName) {
			this.departmentName = departmentName;
		}

		public Staff[] getMyStaff() {
			if (this.myStaff == null)
				this.myStaff = new Staff[100];  // 安砞场程Τ 100 
			return myStaff;
		}

		public void setMyStaff(Staff[] myStaff) {
			this.myStaff = myStaff;
		}


		
		public int getStaffCount() {
			return staffCount;
		}

		public void setStaffCount(int staffCount) {
			if (this.staffCount < 0 )
				this.staffCount = 0;
			this.staffCount = staffCount;
		}

		// 砞﹚よ猭参璸赣场计 -承array, ㄌΩ睰计, 程计+1 == 计
		public void addStaff(Staff staff) {
			for(int i=0; i < this.getMyStaff().length; i++) {
				if (this.getMyStaff()[i] == null) {
					this.getMyStaff()[i] = staff;
					this.staffCount = i + 1;
					return;
				}
			}
	    }
}
