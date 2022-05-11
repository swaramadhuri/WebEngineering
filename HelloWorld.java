import java.util.*;
 
public class HelloWorld {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = 4;
      int count = 0;
      ArrayList<Integer> al = new ArrayList<Integer>();
      for(int i = 0; i < n; i++) {
        int x = sc.nextInt();
        if(al.contains(x)) {
          count++;
        } else {
          al.add(x);
        }
      }
      
      System.out.println(count);
    }
}