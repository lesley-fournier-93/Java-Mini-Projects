class Switch_3 {
    public static void main(String[] args) {
        int start = 8;  // z.B.

        System.out.println("Countdown ab " + start + ": ");

        switch (start) {
            case 10: System.out.println("zehn");
            case 9:  System.out.println("neun");
            case 8:  System.out.println("acht");
            case 7:  System.out.println("sieben");
            case 6:  System.out.println("sechs");
            case 5:  System.out.println("fuenf");
            case 4:  System.out.println("vier");
            case 3:  System.out.println("drei");
            case 2:  System.out.println("zwei");
            case 1:  System.out.println("eins"); break;
            default: System.out.println("Zahl außerhalb des Bereiches");
        }
    }
}
