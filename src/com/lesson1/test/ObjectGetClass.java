package com.lesson1.test;

import com.lesson1.bean.Car;

/**
 * 通过 Object.getClass()
 * 
 * 对于一个对象而言，如果这个对象可以访问，那么调用 getClass() 方法就可以获取到了它的相应的 Class 对象。
 * 值得注意的是，这种方法不适合基本类型如 int、float 等等。
 * 
 * @author gsm02
 *
 */
public class ObjectGetClass {

	public static void main(String[] args) {
		Car car = new Car();

		Class clazz = car.getClass();
	}

}
