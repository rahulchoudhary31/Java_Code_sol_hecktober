//WAP to find volume and surface area of cuboid.
//v=l*b*h
//sa=2*(l*b+b*h+h*l)
import java.util.*;
class Cuboid 
{
public static void main(String [] args)
{
int l,b,h,v,sa;
Scanner sc=new Scanner(System.in);
System.out.println("Enter length,breadth,height of cuboid:");
l=sc.nextInt();	
b=sc.nextInt();	
h=sc.nextInt();	
v=l*b*h;
sa=2*(l*b+b*h+h*l);
System.out.println("volume of cuboid="+v);
System.out.println("surface area of cuboid="+sa);
}
}