public class Calculator{

    public int add(int a, int b){
      return a+b;
    }
    public double add(int a,double b ){
      return a+b;
    }
    public int add(int a, int b, int c){ 
        return a+b+c;
    }
    public double add(double a,int b,double c){
          return a+b-c;
    }
     public double add(double a,double b,double c){
        
        return a+b+c;
     }
     public int add(int a,int b,double c){
    return  a+b+(int)c;
     }

public static void main(String args[]){
    Calculator c=new Calculator();
    System.out.println(c.add(11,12));
    System.out.println(c.add(12,13));
    System.out.println(c.add(34,56,21));
    System.out.println(c.add(54,76,88));
    System.out.println(c.add(34,56,78));
    System.out.println(c.add(31,24,3));
}
}