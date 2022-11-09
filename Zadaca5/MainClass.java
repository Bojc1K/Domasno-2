public class MainClass {

    public static void main(String[] args){
        Predmet sist = new Predmet();
        sist.ime = "sist";
        sist.profesor = "Kostadinka Veljanovska";
        sist.krediti = 6;
        sist.semestar = 3;
        Predmet podatocni = new Predmet("podatocni");
        podatocni.profesor = "Pece Mitrevski";
        podatocni.krediti = 6;
        podatocni.semestar = 3;
        Predmet kio = new Predmet("Kio", "Mimoza Jovanovska", 6);

        System.out.println("-Predmet 1" +
                "\nPredmet: " + sist.ime + "\nProfesor: " + sist.profesor +
                "\nKrediti: " + sist.krediti + "\nSemestar: " + sist.semestar +
                "\n\n-Predmet 2" +
                "\nPredmet: " + podatocni.ime + "\nProfesor: " + podatocni.profesor +
                "\nKrediti: " + podatocni.krediti + "\nSemestar: " + podatocni.semestar +
                "\n\n-Predmet 3" +
                "\nPredmet: " + kio.ime + "\nProfesor: " + kio.profesor +
                "\nKrediti: " + kio.krediti);
        //Pecatenjeto go organizirame so nov red (\n)
        // potoa kazuvame sto sakame da ispecatime ("Predmet: ")
        // i na kraj go pecatime so povikuvanje na konstruktorot vo klasata Predmet,
        // so soodvetniot objekt sist, podatocni ili kio i na krajot soodvetnata promenliva od objektot (sist.ime)
    }
}
