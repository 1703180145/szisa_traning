import java.util.Random;
import java.util.Scanner;


public class ��ϰ {
	/*��һ�������������һ�����֣�
	�ɲ����߲£����������ִ����������֣�������߻ش𡺴��ˡ�����С�ڣ���ش�С�ˡ���
	ֱ�������߲��С�
	��������д����ģ�������ߣ����������0~1000֮�䡣��ʹ��������ʱ��ͬʱ��ӡ���²������*/


	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
	int x = (int)(Math.random()*1000); 
	int a;
	int i=0;
	System.out.println("���Ǹ������ֵ���Ϸ���������0-1000֮������֣����������֣��Ҹ�����ƫ����ƫС��ֱ����¶�");
	do{
		a=input.nextInt();
		if(a<1000&&a>0){
				if(x<a){
					System.out.println("���µ�����ƫ��");
					i++;
				}else if(x>a){
					System.out.println("���µ�����ƫС");
					i++;
				}else{
					i++;
					break;
				}
		}else{
			System.out.println("�������ֲ��Ϸ�");
		}
				}while(true);
				System.out.println("������Ϊ"+x);
				System.out.println("�����еĴ���Ϊ"+i);
	}
	}	

	

