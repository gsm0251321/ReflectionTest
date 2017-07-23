package com.test2.test;

import java.lang.reflect.Field;

import org.junit.After;
import org.junit.Test;

import com.test2.bean.A;

/**
 * Field 类型的获取/修饰符获取
 * 
 * @author gsm02
 *
 */
public class FieldGetSetTest {

	@After
	public void after() {
		System.out.println("=========");
	}

	@Test
	public void publicTest() {
		A testa = new A();
		testa.a = 10;

		System.out.println("testa.a = " + testa.a);

		Class c = A.class;

		try {
			Field fielda = c.getField("a");

			int ra = fielda.getInt(testa);

			System.out.println("reflection testa.a = " + ra);

			fielda.setInt(testa, 15);

			System.out.println("testa.a = " + testa.a);

		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test()
	public void privateTest() {
		A testa = new A();
		testa.setB(3);

		System.out.println("testa.b = " + testa.getB());

		Class c = A.class;

		try {
			Field fieldb = c.getDeclaredField("b");

			// 允许访问private修饰的成员
			fieldb.setAccessible(true);

			int rb = fieldb.getInt(testa);

			System.out.println("reflection testa.b = " + rb);

			fieldb.setInt(testa, 20);

			System.out.println("testa.b = " + testa.getB());

		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
