public class TipeDataArray {
    public static void main(String[] args) {
        // Cara bikin Array yang di tentukan jumlah nya

        String[] nama = new String[3];

        nama[0] = "nanda";
        nama[1] = "lukman";
        nama[2] = "uhuy";

        System.out.println(nama[0]);


        // Ada cara lain bikin Array yang bebas isi nya

        int[] angka = { 1,2,3,4,5 };

        System.out.println(angka[1]);



        // Array di dalam Array

        String[][] Siswa = { { "Kelas 1" }, { "Kelas 2" } };

        System.out.println(Siswa[1][0]);  /* yang pertaman nentuin array yang ke berapa
                                             yang ke dua nentuin nilai di dalem array yang ke berapa
                                          */
    } 
}
