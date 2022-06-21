import java.util.Scanner;

public class calculator {
	
	public void Power(int x,int y)
  {
	  
	    	int res=1;
	    	while(x!=0)
	    	{
	    		res=res * y;
	    		--x;
	    	}
	    	System.out.println(" power of number = "+res);
	    	
	
	  
  }
   public static double squareRoot()   
	{  
	  System.out.println("Enter square number  : ");
	  Scanner s=new Scanner(System.in);
	  int num=s.nextInt();
		double t;  
		double sqrtroot=num/2;  
		do   
		{  
			t=sqrtroot;  
			sqrtroot=(t+(num/t))/2;  
		}   
		while((t-sqrtroot)!= 0);  
			System.out.println(sqrtroot);  
	}

	public static void main(String[] args) {
		
				
		int ch;
		double num1, num2, res;

		Scanner sc = new Scanner(System.in);
		do
		{
			
			 System.out.println("============ Calculator ============");
			 System.out.println("1. Addition \n");
			 System.out.println("2. Subtraction \n");
			 System.out.println("3. Multiplication \n");
			 System.out.println("4. Division \n");
			 System.out.println("5. Power \n");
			 System.out.println("6. Square Root \n")
			 System.out.println("7. Quit \n");
			 System.out.println("====================================");
			 System.out.println("Enter your choice : ");
			 ch = sc.nextInt();
				    
			 switch (ch) 
			 {
			 case 1:
				    System.out.println("Enter two numbers : ");
				    num1 = sc.nextDouble();
				    num2 = sc.nextDouble();
				    res = num1 + num2;
				    System.out.println(num1 + " + " + num2 + " = " + res);
				    break;
				    		
			case 2:
					System.out.println("Enter two numbers : ");
				    num1 = sc.nextDouble();
				    num2 = sc.nextDouble();
					res = num1 - num2;
					System.out.println(num1 + " - " + num2 + " = " + res);
				    break;
			    		
			case 3:
					System.out.println("Enter two numbers : ");
				    num1 = sc.nextDouble();
				    num2 = sc.nextDouble();
				    res = num1 * num2;
				    System.out.println(num1 + " * " + num2 + " = " + res);
				    break;
				    		
			case 4:
					System.out.println("Enter two numbers : ");
					num1 = sc.nextDouble();
				    num2 = sc.nextDouble();
				    res = num1 / num2;
				    System.out.println(num1 + " / " + num2 + " = " + res);
				    break;
					
			case 5:
					System.out.println("Enter the base and exponent : ");
					int base = sc.nextInt();
					int expo = sc.nextInt();
					res = pow(base, expo);
					System.out.println("Power = " +res);
					break;
			
			case 6:
					System.out.println("Square Root is : " +squareRoot());
					break;
				    		
			case 7:
				    break;

			default:
				    System.out.println("Invalid choice!!");
				    break;
			}
		}while(ch != 7);
			    
		sc.close();
	}

}
