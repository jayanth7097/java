import java.util.*;
public class Demo9 {
public static void main(String[] args){
    String name = "jayanth";
    String lastname = "nalla";
    Scanner sc = new Scanner(System.in);
    String yname=sc.nextLine();
    System.out.println("your name is "+ yname);
    String  fullname = name +" "+ lastname; 
    System.out.println(fullname);
    System.out.println(fullname.length());
    for (int i=0;i<fullname.length();i++){
        System.out.println(fullname.charAt(i)+" ");
    }
    String name1= "jayanth";
    String name2= "jayanth";
    if(name1.compareTo(name2)==0){
        System.out.println("Strings are  equal");

    }
    else {
    System.out.println("Strings are not equal");
    }
    String jay = name1.substring(4);
    System.out.println(jay);
}
    
}
