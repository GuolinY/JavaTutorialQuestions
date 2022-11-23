package q98e3;

public class q98e3 {

  public static void main(String[] args) {
    //
    assert (args.length == 1);
    int x = Integer.parseInt(args[0]);
    System.out.print(" " + x);
    while (x != 1) {
      x = next(x);
      System.out.print(" " + x);
    }
  }

  private static int next(int x) {
    return x % 2 == 0 ? x / 2 : 3 * x + 1;
  }
}
