package com.tnsif.basics;

public class NestedLoopDemo {

	public static void main(String[] args) {
		int beg = 1;
		int end = 20;
		for(int i = beg;i<=end;i++)
			for(int j = 1;j<=10;j++)
				System.out.println(i + "x" +j+"="+i*j);
	}

}