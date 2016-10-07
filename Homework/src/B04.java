import java.util.*;

      class B04{
      double so = 0;
      double don = 0;
       public static void main(String[] args)
       {
        new B04().start();
       }
       
       void start()
       {
       Scanner s = new Scanner(System.in);
       System.out.print("연봉을 원단위로 입력하시오.");       
        this.don = s.nextInt();
       
       print();
       }
       
       void print()
       {
       if(don<10000000)
       {
        so = don * 0.095;
       }
       else if(don<40000000)
       {
               so = don * 0.19;
       }
       else if(don<80000000)
       {
                   so = don * 0.28;    
       }
       else if(don>80000000)
       {
                 so = don * 0.37;
       }
       System.out.println("연봉 금액에 대한 소득세는"+so+ "입니다."); 
      }
 }
           
