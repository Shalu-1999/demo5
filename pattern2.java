import java.util.Scanner;
class Pattern1{
public static void main(String args[]){
Scanner src=new Scanner(System.in);
char ch=src.next().charAt(0);
int row=src.nextInt();
printPattern(ch,row);
}
public static void printPattern(char c,int n){
int i=0;
while(i<=n){
i++;
printLine(c,i);
}
}
public static void printLine(char c,int col){
System.out.print("\n");
int j=0;
while(j<=col){
j++;
System.out.print(c);
}
}
}