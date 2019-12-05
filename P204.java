class P204{
 public static void main(String[] args){
 char c1=args[0].charAt(0);
 char c2=args[1].charAt(0);
 if(c1<c2){
 System.out.print(c1+","+c2);
 }
 else if(c2<c1){
 System.out.print(c2+","+c1);
 }
}
}