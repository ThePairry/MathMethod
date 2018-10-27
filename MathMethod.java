import java.util.Scanner;
class MathMethod
{  
    static Scanner sc = new Scanner(System.in);
    public static int getF(int x,int fx)       
    {
      System.out.print("Enter x => ");    
      x = sc.nextInt();      
      fx = x+5;     
      System.out.print("f(x) => "+fx);   
      System.out.println();
      return x;      
    }  

    public static void getG(int x1,int fx,int y,int gxy)        
    {
     
      fx = x1+5;
      System.out.println();          
      System.out.print("Enter y => ");          
      y = sc.nextInt();          
      gxy = x1+y;          
      System.out.print("g(x,y) => "+gxy);          
      System.out.println();
    }       

    public static void getH(int x1,int fx,int hx)        
    {       
      fx = x1+5;          
      hx=x1+fx;          
      System.out.println();          
      System.out.println("h(x) => "+hx);         
      System.out.println();        
    }     

    public static void main (String[]args)        
    {     
      int x = 0;           
      int fx = 0;           
      int y = 0;          
      int gxy = 0;          
      int hx = 0; 

      int x1 = getF(x,fx);      
      getG(x1,fx,y,gxy);          
      getH(x1,fx,hx);        
    } 
  }