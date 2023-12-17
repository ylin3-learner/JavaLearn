package com.imooc;
/**
 * 
 * @author user
 *
 */
public class VarListCmp {
	// F6 虫˙秸刚 -- Step over
	// F5 よ猭ず场秸刚 -- Step into
	// F7 パよ猭 / ㄧ计ず场breakpoint
	// 跑把计よ猭琌程砆砐拜!
	
	public int sum(int... n) {
		int sum = 0;
		System.out.println("盿跑把计砆秸ノ!");
		for(int i:n) {
			sum += i;
		}
		return sum;
	}
	
	public int sum(int a, int b) {
		System.out.println("ぃ盿跑把计砆秸ノ!");
		return a + b;
	}
	public static void main(String[] args) {
		VarListCmp test = new VarListCmp();
		System.out.println("㎝: "+test.sum(1, 2));
	}

}
