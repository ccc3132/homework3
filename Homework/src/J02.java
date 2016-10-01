import java.util.*;
public class J02 {

	double m2_area,pyung_area;
	public static void main(String[] args) {
		
		new J02().start();

	}
	void start()
	{
		Scanner s = new Scanner(System.in);
		
		System.out.print("아파트의 분양 면적을 입력하시오.:");
			this.m2_area=s.nextDouble();
			
			print();
	}
	
	void print()
	{
		pyung_area = m2_area/3.305;
		
		System.out.println("아파트의 평형은"+pyung_area+"입니다.");
		if(pyung_area>=50)
			System.out.println("대형 아파트 입니다.");
		else if(pyung_area>=30)
			System.out.println("중형 아파트 입니다.");
		else if(pyung_area>=15)
			System.out.println("중소형 아파트 입니다.");
		else if(pyung_area<15)
			System.out.println("소형 아파트 입니다.");
	}
}
