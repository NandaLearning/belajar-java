public class SwitchCase {
    public static void main(String[] args) {
        CaseBiasa(); // CASE BIASA
        CaseLambda(); // CASE LAMBDA
    }


    public static void CaseBiasa(){
        var Nilai = "A";

        switch (Nilai) {
            case "A":
                System.out.println("Kamu pintar");
                break;
            case "B":
                System.out.println("Lumayan");
                break;
            case "C":
                System.out.println("Coba lagi");
            default:
               System.out.println("Remedial");
                break;
        }
    }


    public static void CaseLambda(){
        String nilai = "A";

        switch(nilai){
            case "A" -> System.out.println("Pintar");
            case "B" -> System.out.println("Lumayan");
            case "C" -> System.out.println("Coba Lagi");
            default -> System.out.println("salah jurusan");
        }
    }


}
