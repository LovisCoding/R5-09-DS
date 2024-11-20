public class Q3 {
    public static void main(String[] args) {
        if (args.length > 0) {
            try {
                int numberOfStars = Integer.parseInt(args[0]);
                for (int i = 0; i < numberOfStars; i++) {
                    System.out.print("*");
                }
                System.out.println(); // Saut de ligne après les étoiles
            } catch (NumberFormatException e) {
                System.out.println("Veuillez fournir un entier valide en paramètre.");
            }
        } else {
            System.out.println("Veuillez fournir un paramètre pour le nombre d'étoiles.");
        }
    }
}
