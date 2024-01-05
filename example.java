import java.util.Scanner;
class Loop1{
public static void main(String args[]){
Scanner src=new Scanner(System.in);
int n=src.nextInt();
for(int i=n;i>=0;i=i-5)System.out.print(i+",");
}
}