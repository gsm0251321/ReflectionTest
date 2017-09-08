package com.lesson3.test;

import java.lang.reflect.Field;

import com.lesson3.bean.Son;

/**
 * Field 类型的获取
 * 
 * getType()和 getGenericType()获取的field类型不同,getGenericType() 方法能够获取到泛型类型
 * 
 * @author gsm02
 *
 */
public class TestClassFieldTest {

	public static void main(String[] args) {
		Class cls = Son.class;

		Field[] filed2 = cls.getFields();

		for (Field f : filed2) {
			System.out.println("Field :" + f.getName());
			System.out.println("Field type:" + f.getType());
			System.out.println("Field generic type:" + f.getGenericType());
			System.out.println("-------------------");
		}

	}

}
