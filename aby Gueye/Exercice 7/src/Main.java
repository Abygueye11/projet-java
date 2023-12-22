import java.util.Date;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Employe emp1 = Employe.creerEmploye("Ahmed", 50000);
        Employe emp2 = Employe.creerEmploye("Khadija", new Date(), "Babysitter");

        Employe.afficherDetails(emp1);
        Employe.afficherDetails(emp2);

        
        Employe.trierEmployes();
        Employe.afficherCollectionTriee();


    }
}
