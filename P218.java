class P218{
public static void main(String[] args){
int n=Integer.parseInt(args[0]);
int a,sum=0,rev=0;
while(n>0){
a=n%10;
n=n/10;
rev=rev*10+a;
}
int b=Integer.parseInt(args[0]);
if(b==rev){
 System.out.println(args[0]+" Is a Palindrome");
}
else{
 System.out.println(args[0]+" Is not a Palindrome");
}
}
}
