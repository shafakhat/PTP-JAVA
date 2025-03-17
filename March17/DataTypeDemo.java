 import java.util.Scanner;

 class DataTypeDemo{
 	public static void main(String ptp[]){
 		Scanner sc = new Scanner(System.in);

 		int a = sc.nextInt();
 		sc.nextLine();
 		String str = sc.nextLine();
 		double d = sc.nextDouble();
 		sc.nextLine();
 		String str1 = sc.nextLine();

 		System.out.println("myInt is: "+a);
 		System.out.println("myString is: "+str);
 		System.out.println("myDouble is: "+d);
 		System.out.println("myString is: "+str1);
 	}
 }