import.java.util.*

      class B04{
      
       public static void main(String[] args)
       {
        new B04().start()
       }
       
       void start()
       {
       Scanner s = new Scanner(System.in)
       System.out.println("연봉을 원단위로 입력하시오.")       
       int don = s.nextInt();
       
       print();
       }
       
       void print()
       {
       if(don<1000000000)
       {
       int so = don * 0.095
       System.out.println("연봉 금액에 대한 소득세는"+so+ 입니다.);
       }
       if(don<40000000)
       {
              int so = don * 0.19
       System.out.println("연봉 금액에 대한 소득세는"+so+ 입니다.);
       }
       if(don<80000000)
       {
                    int so = don * 0.28
       System.out.println("연봉 금액에 대한 소득세는"+so+ 입니다.);       
       }
       if(don>80000000
       {
                int so = don * 0.37
       System.out.println("연봉 금액에 대한 소득세는"+so+ 입니다.); 
       }
      }
 }
           
