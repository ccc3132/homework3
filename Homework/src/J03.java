import java.util.*;
public class J03 {

	
	int month,day;
	int day_count;
	char i = 0;
	public static void main(String[] args) {
		new J03().start();
	}
	
	void start()
	{
		Scanner s = new Scanner(System.in);
		System.out.print("월을 입력하시오.");
		this.month =s.nextInt();
		System.out.print("일을 입력하시오.");
		this.day = s.nextInt();
		
		
		print();
	}
	void print()
	{
		if(month>12||day>31)
			System.out.println("잘못 입력하셨습니다.");
		else{
		for(i=1;i<month;i++)
		{
			if((i==4)||(i==6)||(i==9)||(i==11))
				day_count+=30;
			else if((i==2))
				day_count+=28;
			else
				day_count+=31;
			
			
		}
		System.out.println("이날짜는 1년중"+day_count+"번쨰 날에 해당 됩니다");
	}
	
	}
	

}
