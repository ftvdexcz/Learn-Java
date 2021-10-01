package baiTap;

import java.util.Scanner;
import java.util.Arrays;
import java.lang.StringBuilder;
// Các bài tập liên quan đến lớp số nguyên: 1, 2

public class MyNumber {

    private int number;

    // 1.1: Nhập n
    public void enterNumber() {
        Scanner in = new Scanner(System.in);
        System.out.println("Nhập số nguyên n:");
        number = in.nextInt();
    }

    // 1.2: Tổng 1 đến n
    public int tong() {
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        return sum;
    }

    // 1.3: Tích 1 đến n
    public long tich() {
        long mul = 1;
        for (int i = 2; i <= number; i++) {
            mul *= i;
        }
        return mul;
    }

    // 1.4: Tổng chẵn đến n
    public int tongChan() {
        int sum = 0;
        for (int i = 2; i <= number; i += 2) {
            sum += i;
        }
        return sum;
    }

    // 1.5: Tổng lẻ đến n
    public int tongLe() {
        int sum = 0;
        for (int i = 1; i <= number; i += 2) {
            sum += i;
        }
        return sum;
    }

    // 1.8: Các số nguyên tố nhỏ hơn hoặc bằng n
    public void primeLessThanOrEqual() {
        if (number == 0) {
            return;
        }
        int[] isPrime = new int[number + 1];
        Arrays.fill(isPrime, 1);
        isPrime[0] = isPrime[1] = 0;
        for (int i = 2; i * i <= number; i++) {
            if (isPrime[i] == 1) {
                for (int j = i * i; j <= number; j += i) {
                    isPrime[j] = 0;
                }
            }
        }
        System.out.println("Các số nguyên tố nhỏ hơn hoặc bằng n là");
        for (int i = 2; i <= number; i++) {
            if (isPrime[i] == 1) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    // 1.9: Ước số của n
    public void uoc() {
        System.out.println("Ước số của n là");
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
                if (i * i != number) {
                    System.out.print((number / i) + " ");
                }
            }
        }
        System.out.println(number);
      
    }

    // 1.10: Ước số nguyên tố của n
    public void uocSoNguyenTo() {
        if (number == 0) {
            return;
        }
        System.out.println("Ước số nguyên tố của n là");
        int[] isPrime = new int[number + 1];
        Arrays.fill(isPrime, 1);
        isPrime[0] = isPrime[1] = 0;
        for (int i = 2; i * i <= number; i++) {
            if (isPrime[i] == 1) {
                for (int j = i * i; j <= number; j += i) {
                    isPrime[j] = 0;
                }
            }
        }

        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                if (isPrime[i] == 1) {
                    System.out.print(i + " ");
                }
                if (i * i != number && isPrime[number / i] == 1) {
                    System.out.print((number / i) + " ");
                }
            }
        }
        if(isPrime[number]==1) System.out.print(number);
        System.out.println();
    }

    // 1.11: Số fibonacci thứ n 
    public long nthFibo() {
        if (number == 0 || number == 1) {
            return 1;
        }
        long[] fibo = new long[number + 1];
        fibo[0] = fibo[1] = 1;
        int i = 2;
        while (i <= number) {
            fibo[i] = fibo[i - 1] + fibo[i - 2];
            i++;
        }
        return fibo[number];
    }

    // 1.12: Viết ra dãy số fibonacci nhỏ hơn n
    public void fiboLessThanN() {
        if (number < 2) {
            return;
        }
        System.out.println("Các số fibo nhỏ hơn n");
        long[] fibo = new long[20];
        fibo[0] = fibo[1] = 1;
        int i = 1;
        while (fibo[i] < number) {
            System.out.print(fibo[i] + " ");
            i++;
            fibo[i] = fibo[i - 1] + fibo[i - 2];
        }
        System.out.println();
    }

    // 1.13: Fibo nhỏ hơn n và là số nguyên tố
    private boolean isPrime(long n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public void fiboPrimeLessThanN() {
        if (number < 2) {
            return;
        }
        System.out.println("Các số fibo nhỏ hơn n và là số nguyên tố");
        long[] fibo = new long[20];
        fibo[0] = fibo[1] = 1;
        int i = 1;
        while (fibo[i] < number) {
            if (isPrime(fibo[i])) {
                System.out.print(fibo[i] + " ");
            }
            i++;
            fibo[i] = fibo[i - 1] + fibo[i - 2];
        }
        System.out.println();
    }

    // 1.14: Liệt kê xâu nhị phân độ dài n
    private boolean isFinal(int[] x) {
        for (int i = 1; i <= number; i++) {
            if (x[i] == 0) {
                return false;
            }
        }
        return true;
    }

    public void xauNhiPhan() {
        int[] x = new int[number + 1];
        Arrays.fill(x, 0);
        System.out.println("Các xâu nhị phân độ dài " + number + " là");
        while (!isFinal(x)) {
            for (int j = 1; j <= number; j++) {
                System.out.print(x[j]);
            }
            System.out.println();
            int i = number;
            while (x[i] == 1) {
                x[i] = 0;
                i--;
            }
            x[i] = 1;
        }
        for (int j = 1; j <= number; j++) {
            System.out.print(x[j]);
        }
        System.out.println();
    }

    // 1.15: Hoán vị độ dài n 
    private boolean isFinalPermutation(int[] x) {
        for (int i = 1; i <= number; i++) {
            if (x[i] != number - i + 1) {
                return false;
            }
        }
        return true;
    }

    public void sinhHoanVi() {
        int x[] = new int[number + 1];
        for (int i = 1; i <= number; i++) {
            x[i] = i;
        }
        System.out.println("Các hoán vị từ 1 đến n");
        while (!isFinalPermutation(x)) {
            for (int j = 1; j <= number; j++) {
                System.out.print(x[j]);
            }
            System.out.println();
            int j = number - 1;
            while (x[j] > x[j + 1]) {
                j--;
            }
            int k = number, tmp;
            while (x[k] < x[j]) {
                k--;
            }
            // swap
            tmp = x[k];
            x[k] = x[j];
            x[j] = tmp;
            int s = j + 1, r = number;
            while (s < r) {
                tmp = x[s];
                x[s] = x[r];
                x[r] = tmp;
                s++;
                r--;
            }
        }
        for (int j = 1; j <= number; j++) {
            System.out.print(x[j]);
        }
        System.out.println();
    }

    // 1.16: Viết ra các số nguyên tố có n chữ số 
    public void nDigitPrime() {
        System.out.println("Các số nguyên tố có n chữ số");
        for (int i = (int) Math.pow(10, number - 1); i < Math.pow(10, number); i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    // 1.17: Số thuận nghịch có n chữ số
    public void nDigitReversible() {
        System.out.println("Các số thuận nghịch có n chữ số");
        for (int i = (int) Math.pow(10, number - 1); i < Math.pow(10, number); i++) {
            StringBuilder s = new StringBuilder(Integer.toString(i));
            if (s.toString().equals(s.reverse().toString())) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    // 2.2: Tổng chữ số của n
    public int sumOfDigit() {
        int sum = 0, n = number;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    // 2.3: Phân tích n thành thừa số nguyên tố 
    public void primeFactor() {
        System.out.print(number + " = ");
        int n = number;
        while (n % 2 == 0) {
            System.out.print("2");
            n /= 2;
            if (n != 1) {
                System.out.print("*");
            }
        }

        for (int k = 3; k <= Math.sqrt(n); k += 2) {
            while (n % k == 0) {
                System.out.print(k);
                n /= k;
                if (n != 1) {
                    System.out.print("*");
                }
            }
        }
        if (n > 1) {
            System.out.print(n);
        }
        System.out.println();
    }

    // 2.4: Kiểm tra có phải số thuận nghịch không 
    public boolean isReversible() {
        StringBuilder s = new StringBuilder(Integer.toString(number));
        return s.toString().equals(s.reverse().toString());
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public static void main(String[] args) {
        MyNumber n = new MyNumber();
        n.setNumber(28);
        System.out.println(n.tong());
        System.out.println(n.tich());
        System.out.println(n.tongChan());
        System.out.println(n.tongLe());
        n.primeLessThanOrEqual();
        n.uoc();
        n.uocSoNguyenTo();
//        System.out.println("Số fibo thứ n = " + n.nthFibo());
        n.fiboLessThanN();
        n.fiboPrimeLessThanN();
//        n.xauNhiPhan();
//        n.sinhHoanVi();
//        n.nDigitPrime();
//        n.nDigitReversible();
        System.out.println("Tổng chữ số của n = " + n.sumOfDigit());
        n.primeFactor();
        System.out.println(n.isReversible());
    }
}
