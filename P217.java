class P217{
public static void main(String[] args){
int n=Integer.parseInt(args[0]);
int a,sum=0,b=0,rev=0;
while(n>0){
a=n%10;
n=n/10;
rev=rev*10+a;
}
System.out.println(args[0]+"-->"+rev);
}
}
