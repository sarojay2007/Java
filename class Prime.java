import java.util.Scanner;
class prime
{
public static void main(String[] args)
{
Scanner sc = new
Scanner (System.in);
System.out.print("Enter number:");
int n = sc.nextlnt();
int i, c=0;
for (i=1; i<=n; i++)
{
if (n % i = = 0)
c++
}
if (c==2)
System.out.println(n+"is prime");
else
System.out.println(n+"is Not prime");
}
}