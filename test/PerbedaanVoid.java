public class PerbedaanVoid {
    public static void main(String[] args) {
        System.out.println(angka(10, 1));
        System.out.println(nama("nanda"));
        biasa();
    }

    // Kalo bukan void itu memberikan callback untuk user
    public static int angka(int a,int b){
        return a + b;
    }

    public static String nama(String aku){
        return aku;
    }




    // kalo void tidak memberikan callback untuk user
    public static void biasa(){
        System.out.println("gua void");
    }






}
