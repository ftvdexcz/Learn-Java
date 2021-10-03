package baiTap;
import java.util.Scanner;
import java.lang.StringBuilder;
import java.util.Arrays;

public class Bai14 {
    private String str;
    
    public void enterString(){
        Scanner in = new Scanner(System.in);
        System.out.println("Nhập vào 1 xâu");
        str = in.nextLine();
    }
    
    public String chuanHoa1(){
        StringBuilder s = new StringBuilder("");
        String res = str.trim(); // bỏ cách ở đầu
        res = res.toLowerCase();
        String[] words = res.split("\\s+");
        for(String x: words){
            x = x.substring(0,1).toUpperCase() + x.substring(1);
            s.append(x + " ");
        }
        return s.toString();
    }
    
    public String chuanHoa2(){
        StringBuilder s = new StringBuilder("");
        String res = str.trim().toLowerCase();
        String[] words = res.split("\\s+");
        words[0] = words[0].toUpperCase();
        for(int i = 1; i < words.length; i++){
            words[i] = words[i].substring(0,1).toUpperCase() + words[i].substring(1);
            if(i==words.length-1)
                s.append(words[i] + ", ");
            else 
                s.append(words[i] + " ");
        }
        s.append(words[0]);
        return s.toString();
    }
    
    public String chuanHoa3(){
        StringBuilder s = new StringBuilder("");
        String res = str.trim().toLowerCase();
        String[] words = res.split("\\s+");
        s.append(words[words.length-1]);
        for(int i = 0; i < words.length-1; i++){
            s.append(words[i].substring(0,1));
        }
        s.append("@ptit.edu.vn");
        return s.toString();
    }
    
    public String chuanHoa4(){
        String res=str;
        res = res.replaceAll("\\s+", " ");
        res = res.replaceAll(" \\.", "\\.");
        res = res.replaceAll("\\.", "\\. ");
        res = res.replaceAll(" \\,", "\\,");
        res = res.replaceAll("\\,", "\\, ");
        res = res.replaceAll("\\s+", " ");
        res = res.trim().toLowerCase();
        String out = res;
        System.out.println(out);
        boolean isCap = true;
        StringBuilder s = new StringBuilder("");
        for(int i = 0; i < out.length(); i++){
            char c = out.charAt(i);
            if(c == '.'){
                isCap = true;
            }
            if(isCap && Character.isAlphabetic(c)){
                c = Character.toUpperCase(c);
                isCap = false;
            }
            s.append(c);
        }
        return s.toString();
    }
    
    public static void main(String[] args) {
        Bai14 b = new Bai14();
        b.enterString();
        System.out.println(b.chuanHoa1());
        System.out.println(b.chuanHoa2());
        System.out.println(b.chuanHoa3());
        System.out.println(b.chuanHoa4());
    }
}
