import java.util.Scanner;
public class Concertina {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ok = 'O';
        while (ok == 'O')
        {
        System.out.println("que vouslez vous convertir ?");
        System.out.println("1- des C en F ?");
        System.out.println("2- des F en c ?");
        int reponse = sc.nextInt();
        int tute;

            switch (reponse) {
                case 1:
                    System.out.println("quel est ta valeur en degré celsius ?");
                    tute = sc.nextInt();
                    tute = (int) ((tute * 4.5) + 32);
                    System.out.println("votre valeur en degré Fahrenheit est de " + tute);
                    break;
                case 2:
                    System.out.println("quel est ta valeur en degré Fahrenheit ?");
                    tute = sc.nextInt();
                    tute = ((tute - 32) * 5) / 9;

                    System.out.println("votre valeur en degré Celsius est de " + tute);

                    break;
                default:
                    System.out.println("TG");
                    break;
                            }

            System.out.println("voulez vous recommencer ?");
            sc.nextLine();
            ok = sc.nextLine().charAt(0);


        }
System.out.println("OK cool");
    }
}