public class trycatch {
    public static void main(String args[]){

        try{
            int [] arr = {11,22,33,44,55};
            System.out.println(arr[5]);

        } catch (Exception e){
            System.out.println("Error found: " +e.getMessage());

            System.out.println("choose a number between the arr length");
                }
    }
}
