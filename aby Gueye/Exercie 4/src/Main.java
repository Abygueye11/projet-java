// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


         public Person(String nom, String prenom, LocalDate dateNaissance) {
            this.nom = nom;
            this.prenom = prenom;
            this.dateNaissance = dateNaissance;
            this.matricule = generateMatricule();
            this.age = calculateAge();


        }

        // Génération de la matricule
        private String generateMatricule() {
            String initials = (prenom.substring(0, 1) + nom.substring(0, 1)).toUpperCase();
            // Ajouter la logique pour générer le numéro d'identification à 4 chiffres
            // (vous pouvez utiliser une variable statique pour compter les instances)
            return initials + String.format("%04d", generateUniqueID());
        }

        //Génération d'un identifiant unique à 4 chiffres
        private static int uniqueIDCounter = 1;

        private int generateUniqueID() {
            return uniqueIDCounter++;
        }

        // Calcul de l'âge
        private int calculateAge() {
            LocalDate currentDate = LocalDate.now();
            return Period.between(dateNaissance, currentDate).getYears();
        }

        // Teste d'implémentation
        public static void main(String[] args) {
            LocalDate Yoff = LocalDate.of(2007, 8, 25); // Remplacez ceci par la date de naissance réelle
            Person issaLaye = new Person("Laye", "Issa", Yoff);
            System.out.println("Matricule: " + issaLaye.matricule);
            System.out.println("Âge: " + issaLaye.age + " ans");
        }

    }
}