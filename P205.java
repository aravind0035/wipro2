class P205{
public static void main(String[] args){
char c=args[0].charAt(0);
if(Character.isLetter(c))
{
  System.out.println("Alphabet");
}
else if(Character.isDigit(c)){
System.out.println("Digit");
}
else{
System.out.println("Special Character");
}
}
}