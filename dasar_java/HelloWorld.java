public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("nanda");

        String nama = "nanda";

        System.out.println(nama);

        int hasil = angka(10, 2);

        System.out.println(hasil);

        perulangan();
        System.out.println("Halo bang");
    }



    public static int angka(int a,int b){
        return a + b;
    }



    public static void perulangan(){
        for(int i = 1;i < 10;i++){
            System.out.println(i);
        }
    }
}
