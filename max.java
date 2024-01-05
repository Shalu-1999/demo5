import java.util.*;
class FindMax{
public static void main(String args[]){
Scanner src=new Scanner(System.in);
int a=src.nextInt();
int b=src.nextInt();
int c=src.nextInt();
int max;
if(a>b)
{
if(a>c)max=a;
else max=c;
}
else{
if(b>c)max=b;
else max=c;
}
System.out.println("maximum no is:"+max);
}
}