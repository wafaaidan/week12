import java.util.Scanner;

public class pembahasanUts {
    Scanner ns = new Scanner(System.in);
    double gajiPokok = 0, tunjanganTrans = 0, tunjanganMakan = 0;
    public void inputData() {
        System.out.print("Masukkan Gaji Pokok           : ");
        gajiPokok = ns.nextDouble();
        System.out.print("Masukkan Tunjangan Transport  : ");
        tunjanganTrans = ns.nextDouble();
        System.out.print("Masukkan Tunjangan Makan      : ");
        tunjanganMakan = ns.nextDouble();
    }
    public double CutgajiPokok(double gaji) {
        return gaji * 0.90;
    }
    public double hitungGajiBersih(double x, double y, double z){
        return x + y + z;
    }
    public void TampilData(double gajiBersih){
        System.out.println("Gaji bersih karyawan = " + gajiBersih);
    }

    public static void main(String[] args) {
        pembahasanUts nsdap = new pembahasanUts();
  
        nsdap.gajiPokok = nsdap.CutgajiPokok(nsdap.gajiPokok);
        nsdap.TampilData(nsdap.hitungGajiBersih(nsdap.gajiPokok, nsdap.tunjanganTrans, nsdap.tunjanganMakan));



    }
}
