public class Q4 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Erreur : Veuillez fournir un nombre entier comme paramètre.");
            return;
        }

        try {
            int lignes = Integer.parseInt(args[0]);
            for (int ligneActuelle = 1; ligneActuelle <= lignes; ligneActuelle++) {
                System.out.println("*".repeat(ligneActuelle)); // Affiche les étoiles en répétant la chaîne
            }
        } catch (NumberFormatException ex) {
            System.out.println("Erreur : Le paramètre fourni n'est pas un entier valide.");
        }
    }
}
