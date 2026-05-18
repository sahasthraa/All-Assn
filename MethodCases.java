public class MethodCases{
    public static void main(String[] args) {
        System.out.println(largestNum(23,54));
        System.out.println(checkNum(16));
    }
    public static int largestNum(int a, int b) {
        if(a>b){
            return a;

            }else{
                return b;
            }
        }
            public static String checkNum(int n) {
                if(n%2==0){
                    return "even";
                }else{
                    return "odd";
                }
            }
        }
        
    
    


