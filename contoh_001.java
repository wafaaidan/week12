public class contoh_001 { //-----------------------------------------------------------------------------------------------------> 2. contoh class
    public void judulApp(String j){ //-------------------------------------------------------------------------------------------> 4. penggunaan method
        System.out.println(j);
    }
    public double hitungLuasPP(double x, double y) { //--------------------------------------------------------------------------> 6. penggunaan parameter pada function
        return x * y;       //parameter digunakan sebagai template yang baru diisikan pada public static void
    }
    public String ukuranPP(double luasPP) {//------------------------------------------------------------------------------------> 5. penggunaan function
        if (luasPP < 25) {
            return "kecil"; 
        } else {
            return "besar";
        }
    }
    public static void main(String[] args) {
        double panjang, lebar, luas; 
        contoh_001 objectPP = new contoh_001(); //-------------------------------------------------------------------------------> 3. penggunaan object
        panjang = 20;   //-------------------------------------------------------------------------------------------------------> 1. contoh variable
        lebar = 10;     //------------------------------------------------------------------------------------------|
        luas = objectPP.hitungLuasPP(panjang, lebar); // pemanggilan function dengan parameter
        objectPP.judulApp("Menghitung Luas Persegi Panjang");
        System.out.println("luasPP = " + luas);
        System.out.println("Ukuran PP = " + objectPP.ukuranPP(objectPP.hitungLuasPP(panjang, lebar)));
    }
}
