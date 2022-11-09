public class MainClass {

     public static void main(String[] args){
        Covek covek = new Covek();
        covek.ime = "Petar";
        covek.prezime = "Bojkovski";
        covek.maticen = 1234567891011A;

         System.out.println("Imeto na covekot e: " + covek.ime +
                 "\nPrezimeto na covekot e: " + covek.prezime +
                 "\nCovekot ima maticen broj: " + covek.maticen);
    }
}
