import java.util.Scanner;
class strlen{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter the string: ");
 String str= sc.nextLine();

System.out.println("length="+str.length());
sc.close();
}
}