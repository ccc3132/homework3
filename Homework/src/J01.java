import java.util.*;
public class J01 {
	int num1,num2,num3,max_num,min_num;

	public static void main(String[] args) {

		new J01().start();
	}
	
	void start()
	{
		Scanner s  = new Scanner(System.in);

		System.out.print("첫번째 숫자를 입력하세요.:");
		this.num1 = s.nextInt();
		System.out.println("두번째 숫자를 입력하세요.:");
		this.num2 = s.nextInt();
		System.out.println("세번째 숫자를 입력하세요.");
		this.num3 = s.nextInt();
		
		
		
		print();
	}
	void print()
	{
		if(num1 > num2)
		{
		max_num = num1;
		min_num = num2;
		}
		if(num3>num1)
		{
		max_num = num3;
		min_num = num1;
		}
		if(num3> num1)
		{
		max_num = num3;
		min_num = num2;
		}
	System.out.println("가장 큰수는"+max_num+"이고 가장 낮은 수는"+min_num+"입니다.");	
		
	}
}
