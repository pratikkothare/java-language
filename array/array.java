import java.util.*;
//String: Strings are commonly used to represent text. Operations such as concatenation, substring extraction, and character searching are often performed on strings.
//Array: Arrays are used to store collections of elements, such as a list of numbers, objects, or characters. You can iterate over arrays, sort them, or apply various algorithms.
public class array {
    public static void main(String[] args) {
        
    
    int marks[]= new int[50];
    int numbers[]={1,2,3,4,5,6,7,8,9};
    char arr[]={'a','b'}; 

    Scanner sc=new Scanner(System.in);
    System.out.println("enter maths marks: ");
     marks[0]=sc.nextInt();
     System.out.println("enter phy marks: ");
     marks[1]=sc.nextInt();
     System.out.println("enter chem marks: ");
     marks[2]=sc.nextInt();
    System.out.println(marks[0]);
    System.out.println(marks[1]);
    System.out.println(marks[2]);

    marks[0]=marks[0]+ 2;
    System.out.println(marks[0]);
   

    float percentage= (marks[0]+ marks[1]+ marks[2])/3;
    System.out.println(percentage +"%");
    
    System.out.println(marks.length);
    int i;

    for(i=0;i<marks.length;i++){
        System.out.print(marks[i]+" ");
    }
    System.out.println(numbers.length);

    System.out.println(arr);
    }
     
    
    
}
