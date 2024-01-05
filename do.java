import java.util.Scanner;
class Loop{
public static void main(String args[]){
Scanner src=new Scanner(System.in);
int n=src.nextInt();
int i=n;
do
{
System.out.print(i+",");
i=i-5;
}while(i>=0);

}
}