package com.imooc.model;

public class Department {
	// �����ݩʡG�����s���B�����W�١B���u�ƲաB���u�H��
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
				this.myStaff = new Staff[100];  // ���]�@�ӳ����̦h�� 100 �W���u
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

		// �]�w��k�έp�ӳ������u�Ӽ� -�Ы�array, �̦��K�[���u�Ӽ�, �̫�Ӽ�+1 == ���u�Ӽ�
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
