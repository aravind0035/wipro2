class P215{
public static void main(String[] args){
int n=Integer.parseInt(args[0]);
int a,sum=0;
while(n>0){
a=n%10;
n=n/10;
sum+=a;
}
System.out.println(args[0]+"-->"+sum);
}
}
