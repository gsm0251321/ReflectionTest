package com.lesson1.test;

/**
 * 3. 通过 Class.forName() 方法
 * 
 * 
 * 有时候，我们没有办法创建一个类的实例，甚至没有办法用 Car.class 这样的方式去获取一个类的 Class 对象。
 * 
 * 这在 Android 开发领域很常见，因为某种目的，Android 工程师把一些类加上了 @hide 注解，所示这些类就没有出现在 SDK
 * 当中，那么，我们要获取这个并不存在于当前开发环境中的类的 Class 对象时就没有辙了吗？答案是否定的，Java 给我们提供了
 * Class.forName() 这个方法。
 * 
 * 只要给这个方法中传入一个类的全限定名称就好了，那么它就会到 Java 虚拟机中去寻找这个类有没有被加载。
 * 
 * @author gsm02
 *
 */
public class ClassForName {

	public static void main(String[] args) {
		// "com.lesson1.getClass.bean.Car" 就是 Car 这个类的全限定名称，它包括包名+类名。
		// 如果找不到时，它会抛出 ClassNotFoundException 这个异常，这个很好理解，因为如果查找的类没有在 JVM
		// 中加载的话，自然要告诉开发者。

		try {
			Class clz = Class.forName("com.lesson1.getClass.bean.Car");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
