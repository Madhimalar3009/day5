import java.util.Scanner;

class s  tudent1{
    public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter number of students: ");
 int n = sc.nextInt();
 int highest = 0;
int sum = 0;
int fail = 0;
 for (int i = 1; i <= n; i++)
 {
System.out.print("Enter mark: ");
int mark = sc.nextInt();
 if (mark > highest)
 highest = mark;
if (mark < 35)
fail++;
sum += mark;
}
 System.out.println("Highest = " + highest);
 System.out.println("Average = " + (sum / (double)n));
 System.out.println("Failed Students = " + fail);
    }
}