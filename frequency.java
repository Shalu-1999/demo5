import java.util.Scanner;
class FrequencyChar{
public static void main(String ars[]){
Scanner scr=new Scanner(System.in);
String str=scr.nextLine();
char ch=scr.next().charAt(0);
int count=0;
for(int i=0;i<=str.length()-1;i++){
if(str.charAt(i)==ch){
count++;
}
}
System.out.println(count);}
}