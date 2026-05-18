public class Studentinfo {
    String name;
    int rollno;
    int marks;

    Studentinfo(String name,int rollno,int marks){
        this.name=name;
        this.rollno=rollno;
        this.marks=marks;

    }
    
    public static void main(String args[]){
Studentinfo obj=new Studentinfo("laddu",25,99); 

System.out.println(obj.name);
    System.out.println(obj.rollno);
System.out.println(obj.marks);



    }

    
}
