class P213{
public static void main(String[] args){
int a=Integer.parseInt(args[0]);
for(int a=10;a<99;a++){
for(int i=2;i<=a/2;i++){
if(a%i==0){
f=1;
break;
}
}
if(f==0){
System.out.println("Prime Number");
}
}
}
}

