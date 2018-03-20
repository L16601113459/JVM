package com.atguigu.jvm.jop2018;

import java.util.ArrayList;
import java.util.List;

/**
 * 抛出堆内存溢出错误实例
 * 
 * 		OutOfMemoryError
 * 		outofmemoryerror
 * @author Wp
 *
 */
public class JVMTest02 {

	
	byte[] byteArray = new byte[1*1024*1024];
	public static void main(String[] args) {

		List<JVMTest02> list = new ArrayList<JVMTest02>();
		int count = 0;
		try {
			while (true) {
				list.add(new JVMTest02());
				count = count + 1;
			}
		} catch (Throwable e) {
			System.out.println("******count: " + count);
			e.printStackTrace();
		}
		
	}

}
