import java.util.Random;
import java.util.Scanner;


public class 练习 {
	/*由一个出题者随机出一个数字，
	由猜题者猜，若所猜数字大于所出数字，则出题者回答『大了』；若小于，则回答『小了』；
	直到猜题者猜中。
	现在请编写程序模拟出题者，随机数字在0~1000之间。当使用者猜中时，同时打印出猜测次数。*/


	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
	int x = (int)(Math.random()*1000); 
	int a;
	int i=0;
	System.out.println("这是个猜数字的游戏，我随机出0-1000之间的数字，你输入数字，我告诉你偏大还是偏小，直到你猜对");
	do{
		a=input.nextInt();
		if(a<1000&&a>0){
				if(x<a){
					System.out.println("您猜的数字偏大");
					i++;
				}else if(x>a){
					System.out.println("您猜的数字偏小");
					i++;
				}else{
					i++;
					break;
				}
		}else{
			System.out.println("您的数字不合法");
		}
				}while(true);
				System.out.println("该数字为"+x);
				System.out.println("您猜中的次数为"+i);
	}
	}	

	

