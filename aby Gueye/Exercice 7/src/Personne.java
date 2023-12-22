import java.text.SimpleDateFormat;
import java.util.Date;

public class Personne {
    protected String nom;
    protected Date dateNaissance;
    protected double taille;

    // Constructeur
    public Personne(String nom, Date dateNaissance, double taille) {
        this.nom = nom;
        this.dateNaissance = dateNaissance;
        this.taille = taille;
    }

    // Méthode toString
    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return "Nom: " + nom + ", Date de naissance: " + sdf.format(dateNaissance) + ", Taille: " + taille;
    }
}
