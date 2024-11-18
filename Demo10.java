public class Demo10 {
    public static void main(String[] args){
    StringBuilder sb = new StringBuilder("jay");
    System.out.println(sb);
    System.out.println(sb.charAt(0));
    //set char at index
    sb.setCharAt(0, 'p');
    System.out.println(sb);
    System.out.println(sb.insert(0,'s'));
    System.out.println(sb.insert(2,'a'));
    System.out.println(sb.delete(2,3));
    StringBuilder sb1 =new StringBuilder("h");
    sb1.append("e");
    sb1.append("l");
    sb1.append("l");
    sb1.append("o");
    System.out.println(sb1);
    System.out.println(sb1.length());
    }
}
