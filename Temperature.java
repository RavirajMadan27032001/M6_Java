class Temperature
{
public static void main(String[] args)
{
float t=33;
String result=(t>=0&&t<10)?("Very Cold"):
             (t>=10&&t<20)?("Cold"):
             (t>=20&&t<30)?("Moderator"):
             (t>=30&&t<40)?("Summer"):
             (t>=40&&t<50)?("Very hot"):
             ("abc");
System.out.println(result);


}
}
