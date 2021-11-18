interface InterA{
    public void fnA1(); 
    public void fnA2(); 
}
interface InterB{
    public void fnB1(); 
    public void fnB2(); 
}

interface InterC{
    public void fnC1(); 
    public void fnC2(); 
}

class NewClass implements InterA, InterB, InterC{
     public void fnA1(){
        System.out.println("Hello From InterA, fnA1");
    }; 
    public void fnA2(){
        System.out.println("Hello From InterA, fnA2");
    };
    
    public void fnB1(){
        System.out.println("Hello From InterB, fnB1");
    }; 
    public void fnB2(){
        System.out.println("Hello From InterB, fnB1");
    }; 
    
    public void fnC1(){
        System.out.println("Hello From InterC, fnC1");
    }; 
    public void fnC2(){
        System.out.println("Hello From InterC, fnC1");
    };
    
}

public class Std extends NewClass{
    
    
    public static void main(String args[]){

   NewClass NC = new Std();
   NC.fnA1();
   NC.fnA2();
   NC.fnB1();
   NC.fnB2();
   NC.fnC1();
   NC.fnC2();
   }
}