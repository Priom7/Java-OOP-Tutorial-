abstract class Calculator{

   public abstract void sum(int a, int b);
   
   public abstract void multilication(int a, int b);
   
   public void display(){
	System.out.println("Hello World");
   }
}

public class Machine extends Calculator{
    
      public void sum(int a, int b){
        System.out.println(a+b);
    }
    
    public void multilication(int a, int b){
        System.out.println(a*b);
    }

    public static void main(String args[]){
        
	Calculator obj = new Machine();
    obj.sum(9, 7);
	obj.multilication(2, 9);
	obj.display();
   }
}
