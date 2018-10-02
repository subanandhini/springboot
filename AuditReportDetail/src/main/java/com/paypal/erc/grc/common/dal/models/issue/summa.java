package com.paypal.erc.grc.common.dal.models.issue;

import java.util.Scanner;

public class summa {

	public static void main(String[] args) {
		summa s= new summa();
		s.repeat();
	}
	public void repeat() {
		System.out.println("Enter a string");
		Scanner sa=new Scanner(System.in);
		String in=sa.next();
		char []c= in.toCharArray();
		int count=0;
		out: for (int i = 0; i < c.length-1; i++) {
			for (int j = 0; j < c.length; j++) {
				if(c[i]==c[j]&&i!=j) {
					count =c[i];
					break out;
				}
				else 
					count =0;
			}
		}
		if(count==0) {
			System.out.println("no value ");
		}
		else {
			System.out.println("found match    "+(char)count);
		}
	}

}
