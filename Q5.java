public class Q5 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Erreur : Veuillez fournir un nombre entier comme paramètre.");
            return;
        }

        try {
            int lignes = Integer.parseInt(args[0]);
            for (int ligneActuelle = lignes; ligneActuelle > 0; ligneActuelle--) {
                System.out.println("*".repeat(ligneActuelle)); // Affiche les étoiles pour la ligne actuelle
            }
        } catch (NumberFormatException ex) {
            System.out.println("Erreur : Le paramètre fourni n'est pas un entier valide.");
        }
    }
}

}
