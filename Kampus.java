import java.util.Scanner;
public class Kampus{
    public static void main(String[]args){
        Scanner sc=new Scanner (System.in);
        String nim= sc.nextLine();

        String nama= sc.nextLine();

        String jrs= sc.nextLine();
        
        String Isi=Bio(nim, nama, jrs);
        
        System.out.println(Isi);

    }
    
    public static String Bio(String nim, String nama, String jrs){
        String Isi="NIM: "+ nim+"\n"+"Nama: "+ nama
        +"\n"+"Jurusan: "+ jrs;
        return Isi;
    }
}