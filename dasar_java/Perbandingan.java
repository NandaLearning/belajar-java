public class Perbandingan {
    public static void main(String[] args) {
        System.out.println("Hello world");
        Banding(12, 10);
    }

    public static void Banding(int a,int b){
        if(a > b){
          System.out.println("Dia lebih besar");
        }
        else if (a < b) {
            System.out.println("dia lebih kecil");
        }
        else{
            System.out.println("sama dengan");
        }
    }
}
