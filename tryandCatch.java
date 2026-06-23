public class tryandCatch{
    public static void main(String args[]){

   try{

    int x=10;
    int y=0;
    int z=x/y;
     
   } catch (ArithmeticException e) {
    System.out.println("Error found: " + e.getMessage());
   } finally {
    System.out.println("cannot divide by zero");
   }
   }
    }
