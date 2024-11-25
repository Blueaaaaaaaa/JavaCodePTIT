import java.util.Scanner;
import java.lang.Math;

class OOP {
   private long tuSo;
   private long mauSo;

   public OOP(long tuSo, long mauSo) {
      this.tuSo = tuSo; 
      this.mauSo = mauSo;
   }
   public long gcd(long a, long b) {
      if (b == 0) return a;
      return gcd(b, a % b);
   }
   @Override
   public String toString() {
      long ucln = gcd(Math.abs(tuSo), Math.abs(mauSo));
      tuSo /= ucln;
      mauSo /= ucln;
      return tuSo + "/" + mauSo;
   }
}

public class Main{
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      long tuSo = sc.nextLong();
      long mauSo = sc.nextLong();
      OOP phanSo = new OOP(tuSo, mauSo);
      System.out.println(phanSo);
   }
}
