import java.util.Scanner;
class InputSwap2{
public static void main(String args[])
{
Scanner src=new Scanner(System.in);
int num1,num2;
num1=src.nextInt();
num2=src.nextInt();

num1=num1+num2;
num2=num1-num2;
num1=num1-num2;
System.out.println(num1+"\n"+num2);
}
}