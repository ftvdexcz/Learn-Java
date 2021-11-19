package mydemo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/*Demo đọc ghi file text và binary (object)*/

public class Main {
    public static void main(String[] args) {
        // ghi file 
        int[] a = new int[10];
        for (int i = 0; i < 10; i++) {
            a[i] = i;
        }
        String fout = "src/mydemo/out.txt";
        PrintWriter p;
        try{
            p = new PrintWriter(fout);
            for (int i = 0; i < 10; i++) {
                p.print(a[i] + " ");
            }
            p.close();
        }catch(FileNotFoundException e){
            System.out.println(e);
        }
        
        // đọc file với BufferedReader
        BufferedReader br;
        try{
            String fin = fout;
            br = new BufferedReader(new FileReader(fin));
            String line="";
            while((line=br.readLine())!=null){
                System.out.println(line);
            }
            br.close();
        }catch(FileNotFoundException e){
            System.out.println(e);
        }catch(IOException e){
            System.out.println(e);
        }
        
        // ghi đối tượng sinh viên ra file binary
        List<SinhVien> list = new ArrayList<>();
        list.add(new SinhVien(1, "Nguyen Van A"));
        list.add(new SinhVien(2, "Nguyen Van B"));
        list.add(new SinhVien(3, "Nguyen Van C"));
        
        IOFile.viet("src/mydemo/sinhvien.dat", list);
        List<SinhVien> readlist = new ArrayList<>();
        readlist = IOFile.doc("src/mydemo/sinhvien.dat");
        for(SinhVien s: readlist)
            System.out.println(s);
    }
}
