
class Mod_1 {
    public static void main(String[] args) {
        int a = 10, b = 5; // Beispielwerte

        if (a % b == 0) {
            System.out.println(a + " ist durch " + b + " teilbar:");
            System.out.println(b + " passt " + (a / b) + " Mal in " + a + ".");
        } else {
            System.out.println(a + " ist nicht durch " + b + " teilbar:");
            System.out.println("Der Rest der Division ist " + (a % b) + ".");
        }
    }
}

