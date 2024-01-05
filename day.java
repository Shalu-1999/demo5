import java.util.Scanner;
class InputDayNumberIf{
public static void main(String args[]){
Scanner src=new Scanner(System.in);
int dn;
dn=src.nextInt();

if(dn==0){System.out.println("sunday");}
else if(dn==1){System.out.println("monday");}
else if(dn==2){System.out.println("tuesday");}
else if(dn==3){System.out.println("wednesday");}
else if(dn==4){System.out.println("thursday");}
else if(dn==5){System.out.println("friday");}
else if(dn==6){System.out.println("saturday");}
else{System.out.println("invalid");}
}
}

