import java.util.*;
public class SplittingString{
  public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    String a=s.nextLine();
    String sp[]=a.split(" ");
    System.out.print(Arrays.toString(sp));
}
}