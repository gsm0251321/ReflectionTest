package com.lesson1.test;

import com.lesson1.bean.Car;

/**
 * 2. 通过 .class 标识
 * 
 * Car 是一个类，car 是它的对象，通过 car.getClass() 就获取到了 Car 这个类的 Class 对象，<br>
 * 也就是说通过一个类的实例的 getClass() 方法就能获取到它的 Class。如果不想创建这个类的实例的话，就需要通过 `.class 这个标识。
 * 
 * @author gsm02
 *
 */
public class GetDotClass {

	public static void main(String[] args) {
		Class clazz = Car.class;
		Class cls1 = int.class;
		Class cls2 = String.class;
	}

}
