import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Escribe un bucle while que genere números aleatorios hasta que salga el número 7. Has de usar la función getRandomNumber
        int randomNumber = 0;
        while (randomNumber != 7) {
            randomNumber = getRandomNumber(10);
            System.out.println("Número generado: " + randomNumber);
        }
        System.out.println("¡Salió el número 7!");

        //Escribe un bucle while que genere números aleatorios hasta que salga un número mayor a 70. Has de usar la función getRandomNumber
        randomNumber = 0;
        while (randomNumber <= 70) {
            randomNumber = getRandomNumber(100);
            System.out.println("Número generado: " + randomNumber);
        }
        System.out.println("¡Salió un número mayor a 70!");

        //Escribe un bucle do while que genere un número aleatorio entre 1 y 100. El usuario debe adivinar el número aleatorio y el programa debe seguir solicitando intentos hasta que el usuario adivine correctamente. Después de cada intento, el programa debe indicar si el número ingresado es mayor o menor que el número generado. Has de usar la función getRandomNumber
        int secretNumber = getRandomNumber(100);
        int guess;

        do {
            System.out.print("Adivina el número (entre 1 y 100): ");
            guess = scanner.nextInt();

            if (guess < secretNumber) {
                System.out.println("El número es mayor.");
            } else if (guess > secretNumber) {
                System.out.println("El número es menor.");
            } else {
                System.out.println("¡Correcto! Has adivinado el número.");
            }
        } while (guess != secretNumber);

        scanner.close();
    }

    /**
     * Function name: getRandomNumber
     * 
     * @param number (int)
     * @return (int)
     * 
     * Inside the function:
     * 1. choose a random integer between 1 and the number given
     */
    public static int getRandomNumber(int number){
        return (int)(Math.random() * number) + 1;
    }
}
