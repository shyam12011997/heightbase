package org.data;

public class Student {
	public void height(int a,int b,int c,int d,int e,int f) {
		if (a>b && a>c && a>d && a>e && a>f) {
			System.out.println("A is tallest");
		}
		else if (b>a && b>c && b>d && b>e && b>f) {
			System.out.println("B is tallest");
		}
		else if (c>a && c>b && c>d && c>e && c>f ) {
			System.out.println("C is tallest");
		}
		else if (d>a && d>b && d>c && d>e && d>f) {
			System.out.println("D is tallest");
		}
		else if (e>a && e>b && e>c && e>d && e>f) {
			System.out.println("E is tallest");
		}
		else if (f>a && f>b && f>c && f>d && f>e) {
			System.out.println("F is tallest");
		}
		else {
			System.out.println("No one is tallest");
		}
     }
	  public static void main(String[] args) {
		Student a =new Student ();
		a.height(178, 160, 173, 175, 170, 165);
	}
   }
