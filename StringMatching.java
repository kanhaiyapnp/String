import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
class PatternMatching{
public static void main(String...k)
{

Scanner sc =new Scanner(System.in);
String text=sc.nextLine();
int n=sc.nextInt();
sc.nextLine();
String pattern[];
String s="";
pattern=new String[n];
for(int i=0;i<n;i++)
{
pattern[i]=sc.nextLine();
}
for(int i=0;i<n;i++){
Pattern p=Pattern.compile(pattern[i]);
Matcher m=p.matcher(text);
while(m.find()){
s=s+String.valueOf(m.start())+" ";
}
}
System.out.println(s);
}}


