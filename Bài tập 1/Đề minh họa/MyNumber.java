package deMinhHoa;
import java.util.Arrays;
import java.util.Scanner;

public class MyNumber {
    private int number;
    
    public MyNumber(){
        number=0;
    }
    
    public void enterNumber(){
        Scanner in = new Scanner(System.in);
        this.number = in.nextInt();
    }
    
    // Tổng các số từ 1 đến n
    public int continousSum(){
        return number*(number+1)/2;
    }
    
    // Đưa ra dãy số nguyên tố nhỏ hơn hoặc bằng n 
    public void primeLessThanOrEqual(){
        if (number==0){
            System.out.println("");
            return;
        }
        int[] isPrime = new int[number+1];
        Arrays.fill(isPrime, 1);
        isPrime[0]=isPrime[1]=0;
        for(int i = 2; i*i <= number; i++){
            if(isPrime[i]==1){
                for(int j = i*i; j <= number; j+=i)
                    isPrime[j]=0;
            }
        }
        for(int i = 2; i <= number; i++){
            if(isPrime[i]==1) System.out.print(i + " ");
        }
        System.out.println();
    }
}
