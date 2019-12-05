class P219{
public static void main(String[] args){
int a=2,b=3,c=5,count=0,n=2;
while(true)
{
 if(count==5){
  break;
  }
 if(n%a==0 && n%b==0 && n%c==0){
 count=count+1;
 System.out.println(n);
}
n++;
}
}
}
