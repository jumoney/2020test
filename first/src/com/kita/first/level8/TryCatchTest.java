package com.kita.first.level8;

public class TryCatchTest {

	public static void main(String[] args) {
		meth();
		
		try {
			meth2();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		int a = div(10, 0);
		System.out.println(a);
	}
	public static int div(int n1, int n2){
		
		try {
			return n1/n2;
		}catch(Exception e){
			return 0;
		}
	}
	
	public static void meth2() throws Exception{
		Class.forName("adasddd");
	}
	
	public static void meth() {
		int result = 2;
	
		try {
			//result = 10/0;
			if(result%2 == 0) {
				return;
			}
			Class.forName("dd");
		}catch(ClassNotFoundException e) {
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("예외가 발생하였습니다.");
		} finally {
			System.out.println("finally");
		}
		System.out.println("result: " + result);
		System.out.println("종료!");

	}

}
