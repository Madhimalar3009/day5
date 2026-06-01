import java.util.Scanner;
class len1{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter the string: ");
 String str= sc.nextLine().toLowerCase();
int count=0; 
for(int i=0;i<str.length();i++){
char ch=str.charAt(i);
if(ch=='a'||ch=='i'||ch=='o'||ch=='e'||ch=='u'){
count++;
}
}
System.out.println("number of vowels:"+count);
}
}   