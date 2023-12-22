import java.time.LocalDate;
import java.time.Period;

public class Person {
    private String nom;
    private String prenom;
    private String matricule;
    private int age;
    private LocalDate dateNaissance;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }


    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }


    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(LocalDate dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public static int getUniqueIDCounter() {
        return uniqueIDCounter;
    }

    public static void setUniqueIDCounter(int uniqueIDCounter) {
        Person.uniqueIDCounter = uniqueIDCounter;
    }

    // Constructeur

}
