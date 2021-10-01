package baiTap;

import java.util.Scanner;
import java.util.Arrays;
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
    public int tich() {
        int mul = 1;
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
                    System.out.println((number / i) + " ");
                }
            }
        }
        System.out.println();
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
                    System.out.println((number / i) + " ");
                }
            }
        }
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
    public void fiboLessThanN(){
        if(number < 2) return;
        System.out.println("Các số fibo nhỏ hơn n");
        long[] fibo = new long[20];
        fibo[0] = fibo[1] = 1;
        int i = 1; 
        while(fibo[i] < number){
            System.out.print(fibo[i] + " ");
            i++;
            fibo[i]=fibo[i-1]+fibo[i-2];
        }
        System.out.println();
    }
    
    private boolean isPrime(long n){
        if(n < 2) return false;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0) return false;
        }
        return true;
    }
    
    // 1.13: Fibo nhỏ hơn n và là số nguyên tố
    public void fiboPrimeLessThanN(){
        if(number < 2) return;
        System.out.println("Các số fibo nhỏ hơn n và là số nguyên tố");
        long[] fibo = new long[20];
        fibo[0] = fibo[1] = 1;
        int i = 1; 
        while(fibo[i] < number){
            if(isPrime(fibo[i]))
                System.out.print(fibo[i] + " ");
            i++;
            fibo[i]=fibo[i-1]+fibo[i-2];
        }
        System.out.println();
    }
    
    // 1.14: Liệt kê xâu nhị phân độ dài n
    public void xauNhiPhan(){
        int[] x = new int[number+1];
        Arrays.fill(x, 0);
    }
}
