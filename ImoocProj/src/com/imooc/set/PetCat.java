package com.imooc.set;

public class PetCat {
		private String name;  // 名字
		private int month;  // 年齡
		private String species;  // 品種
		public PetCat(String name, int month, String species) {
			super();
			this.name = name;
			this.month = month;
			this.species = species;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getMonth() {
			return month;
		}
		public void setMonth(int month) {
			this.month = month;
		}
		public String getSpecies() {
			return species;
		}
		public void setSpecies(String species) {
			this.species = species;
		}
		@Override
		public String toString() {
			return "PetCat [name=" + name + ", month=" + month + ", species=" + species + "]";
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + month;
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			result = prime * result + ((species == null) ? 0 : species.hashCode());
			return result;
		}
		@Override
		public boolean equals(Object obj) {
			// 判斷對象是否相等, 相等則返回true, 不用繼續比較屬性
			if (this == obj)
				return true;
			// 判斷obj 是否是PetCat的對象
			if (obj.getClass() == PetCat.class) {
				PetCat cat = (PetCat) obj;
				return (cat.getName().equals(name)) && (cat.getMonth() == month) && (cat.getSpecies().equals(species));
			}
			
			return false;
		}
		
		
}
