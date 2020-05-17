package WILDAN_TECHNO_ART;
 
public class latihan_java {
    public static void main(String[] args){
        //Membuat Instance dan Mendefinisikan Tipe Data String
        All_in_One<String> nama = new All_in_One<>();
        nama.setManusia("Wildan");
        System.out.println("Nama Saya: "+nama.getManusia());
        
        //Membuat Instance dan Mendefinisikan Tipe Data Integer
        All_in_One<Integer> umur = new All_in_One<>();
        umur.setManusia(19);
        System.out.println("Usia Saya: "+umur.getManusia()+" Tahun");
        
        //Membuat Instance dan Mendefinisikan Tipe Data Boolean
        All_in_One<Boolean> kondisi = new All_in_One<>();
        kondisi.setManusia(true);
        System.out.println("Saya Sedang Belajar Java: "+kondisi.getManusia());
        
        //Membuat Instance dan Mendefinisikan Tipe Data Float
        All_in_One<Float> IPK = new All_in_One<>();
        IPK.setManusia(3.5f);
        System.out.println("Nilai IPK Saya: "+IPK.getManusia());
        
        //Membuat Instance dan Mendefinisikan Tipe Data Character
        All_in_One<Character> Karakter = new All_in_One<>();
        Karakter.setManusia('W');
        System.out.println("Huruf Awalan Nama Saya Adalah: "+Karakter.getManusia());
    }
}
