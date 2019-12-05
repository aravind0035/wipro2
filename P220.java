import java.util.*;
class P220{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int v=0;
do{
System.out.println("options:\n 1.Add \n 2.Sub");
int n=sc.nextInt();
System.out.println("Enter two numbers:");
int a=sc.nextInt();
int b=sc.nextInt();
switch(n){
case 1: int c =a+b;
        System.out.println("sum :"+c);
         break;
case 2: int x=a-b;
        System.out.println("Diff :"+x);
        break;
}
System.out.println("Do you want to continue Enter y :");
char c=sc.next().charAt(0);
if(c=='y'){
 v=1;
}
else{
break;
}
}while(true);
}
}