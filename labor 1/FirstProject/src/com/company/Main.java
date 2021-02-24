package com.company;

public class Main {

    public static double maxElement( double tomb[] ){
        double max = Double.NEGATIVE_INFINITY;
        for( int i=0; i<tomb.length; ++i ){
            if( tomb[i] > max){
                max = tomb[ i ];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        // 1 Feladat
        System.out.println("Tibor");

        // 2dik Feladat
        String nev = "Bartha Tibor";
        for (int i = 0; i < nev.length(); ++i) {
            System.out.println(nev.charAt(i));
        }

        System.out.printf("\n");

        // 3Feladat
        String szo = "ALMAFA";

        int l;
        l = szo.length();

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < i; j++) {
                System.out.printf("%c", szo.charAt(j));
            }
            System.out.printf("%c\n", szo.charAt(i));
        }

        System.out.printf("\n");

        // 4dik feladat

        String[] tomb;
        String nev2 = "Kerekes Bálint Ádám József";
        tomb = nev2.split(" ");

        for (int i=0; i < tomb.length; i++) {
            System.out.printf("%c",tomb[i].charAt(0));
        }

        System.out.printf("\n\n");

        // Fugvenyenk - 1feladat

        double x[] ={7, 1, -3, 45, 9};
        System.out.printf("MAX: %6.2f\n", maxElement( x ));

        package com.company;

        public class Main {
            public static void main(String[] args) {
//        int array[];
//        int[] array1;
                for(int i=0; i<args.length;i++)
                {
                    System.out.println(args[i]);
                }

                //Math.sqrt(234);
                System.out.println(createMonogram("Gall Botond"));
            }

            /**
             *
             * @param name -> ennek fogjuk meghatarozni a monogramjat
             * @return -> a monogram
             */
            public static String createMonogram(String name) {
                //name tartalma: Antal Jozsef
                String[] tomb;
                tomb = name.split(" ");
                //tomb[0] = Antal
                //tomb[1] = Jozsef
                String monogram = "";
//        for(int i = 0; i < tomb.length; ++i) {
//            monogram += tomb[i].charAt(0);
//        }
                for (String s : tomb) {
                    monogram += s.charAt(0);
                }

                return monogram;
            }



        }


    }
}