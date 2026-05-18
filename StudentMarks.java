public class StudentMarks{ 
public static void main(String args[]){
    String[][] marks={{ "telugu", "hindi", "english", "maths", "science", "social" }, { "45", "67", "78", "35", "55", "92" }, { "56", "74", "87", "94", "96", "88" }, { "44", "65", "37", "80", "82", "91" }};
for(String i=0;i<marks.length;i++){
    for(String j=0;j<marks[i].length;j++){
        System.out.print(marks[i][j]+" ");

    }
    System.out.println();
}
}
}




