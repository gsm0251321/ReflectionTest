package com.test1.test;

import com.test1.bean.Car;

public class Test02 {

	public static void main(String[] args) {
		try {
			Class clz = Class.forName("com.test1.bean.Car");

			Class clz1 = float.class;

			Class clz2 = Void.class;

			Class clz3 = new int[] {}.getClass();

			Class clz4 = new Car[] {}.getClass();

			System.out.println(clz.getName());
			System.out.println(clz1.getName());
			System.out.println(clz2.getName());
			System.out.println(clz3.getName());
			System.out.println(clz4.getName());

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
