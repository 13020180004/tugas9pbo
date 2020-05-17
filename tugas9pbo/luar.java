import java.util.Scanner;
class luar
{
    private int a;
 
    public void setA(int nilai)
    {
        a = nilai;
    }
    public int getA()
    {
        return a;
    }
    class dalam
    {
        private int x = 100;
 
        public void liat()
        {
           System.out.println("Nilai a dari kelas luar = "+a);
           System.out.println("Nilai x dari kelas dalam = "+x);
        }
    }
    public void lihatData()
    {
        dalam bb = new dalam();
        bb.liat();
    }
}	
Class main/utama
public class Main
{
    public static void main(String[] args)
    {
        luar bc = new luar();
        bc.setA(50);
        bc.lihatData();
    }
}
Output :
Nilai a dari kelas luar = 50
Nilai x dari kelas dalam = 100
