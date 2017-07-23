package com.test1.test;

import com.test1.bean.Car;

public class Test01 {

	@SuppressWarnings({ "unused", "rawtypes" })
	public static void main(String[] args) {

		Car car = new Car();

		Class clazz = car.getClass();
		Class cls1 = int.class;
		Class cls2 = String.class;

		try {
			Class clz = Class.forName("com.test1.bean.Car");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("============");
	}

}
