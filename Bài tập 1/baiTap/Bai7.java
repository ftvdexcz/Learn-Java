package baiTap;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.lang.StringBuilder;
import java.util.HashSet;

public class Bai7 {
    private String str;
    
    public void enterString(){
        System.out.println("Nhập chuỗi");
        Scanner in = new Scanner(System.in);
        str = in.nextLine();
    }
    
    public int getLength(){
        return str.length();
    }
    
    public int countWords(){
        String[] words = str.split("\\s+");
//        System.out.println(Arrays.toString(words));
        return words.length;
    }
    
    public int countParagraph(){
        StringTokenizer s = new StringTokenizer(str, ".?!");
        return s.countTokens();
    }
    
    public String[] words(){
        String[] words = str.split("[0-9]*\\s+[0-9]*|[0-9]+");
        return words;
    }
    
    public String[] digits(){
        String[] digits = str.split("[A-Za-z]*\\s+[A-Za-z]*|[A-Za-z]+");
        return digits;
    }
    
    public String[] specialWords(){
        String[] digits = str.split("[0-9A-Za-z]*\\s+[0-9A-Za-z]*|[0-9A-Za-z]+");
        return digits;
    }
    
    public long sumOfDigitInString(){
        long s=0;
        String[] digits = str.split("[A-Za-z]*\\s+[A-Za-z]*|[A-Za-z]+");
        for(String x: digits){
            s += Long.parseLong(x);
        }
        return s;
    }
    
    public void frequencyEachWord(){
        String[] words = str.split("\\s+");
        int[] fre = new int[words.length];
        Arrays.fill(fre,1);
        for(int i = 0; i < words.length-1; i++){
            if(fre[i]==1){
                for(int j = i + 1; j < words.length; j++){
                    if(words[i].equals(words[j])){
                        fre[j]=-1;
                        fre[i]++;
                    }
                }
            }
        }
        
        for(int j = 0; j < words.length; j++){
            if(fre[j]!=-1){
                System.out.println("Số lần xuất hiện của từ " + words[j] + ": " + fre[j]);
            }
        }
    }
    
    public void wordIn2String(){
        System.out.println("Nhập thêm 1 chuỗi khác");
        Scanner in = new Scanner(System.in);
        String str2 = in.nextLine();
        String[] words1 = str.split("\\s+");
        String[] words2 = str2.split("\\s+");
        HashSet<String> set = new HashSet<>();
        set.addAll(Arrays.asList(words1));
        set.retainAll(Arrays.asList(words2));
        System.out.println("Các từ xuất hiện trong 2 chuỗi là: " + set);
    }
    
    public static void main(String[] args) {
        Bai7 b = new Bai7();
        b.enterString();
        System.out.println(b.getLength());
        System.out.println(b.countWords());
        System.out.println(b.countParagraph());
        System.out.println(Arrays.toString(b.words()));
        System.out.println(Arrays.toString(b.digits()));
        System.out.println(Arrays.toString(b.specialWords()));
        System.out.println("Tổng các số trong chuỗi = " + b.sumOfDigitInString());
        b.frequencyEachWord();
        b.wordIn2String();
    }
}
