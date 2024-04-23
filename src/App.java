import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    
    // 1- SWITCH:
    // Preguntas estación del año. Mediante un switch, respondes una cosa u otra.
        Scanner teclado = new Scanner(System.in);
        System.out.println("Di una estación del año.");
        String userInput = teclado.nextLine().toLowerCase();
        switch(userInput){
            case "primavera":
                System.out.println("La primavera la sangre altera");
                break;
            case "verano":
                System.out.println("¡Qué bien, la piscina y la playa!");
                break;
            case "otoño":
                System.out.println("Me encantan los colores y la temperatura del otoño :)");
                break;
            case "invierno":
               System.out.println("Tiempo de estar en casa con la calefacción bien a gustito");
                break;
            default:
            System.out.println("No conozco ninguna estación con ese nombre.");
        }
        // 2- WHILE:
        // Una asociación benéfica te envía a pedir caridad. Preguntas "una ayudita?"
        System.out.println("¿Una ayudita, por favor?");
        String respuesta = teclado.nextLine().toLowerCase();
        int veces = 0;
        int donativoTotal = 0;
        // Si te dicen que sí preguntas cuánto quieren poner. Si te dicen que no, te deprimes y te vas para tu casa.
        while ((respuesta.equals("sí"))||(respuesta.equals("si"))){
            System.out.println("¿Con cuánto le gustaría colaborar?");
            int donativo = Integer.parseInt(teclado.nextLine());
            if (donativo <= 0){
                System.out.println("Por favor, no sea usted egoísta, contribuya con algo");
            } else{
                donativoTotal += donativo;
                veces++;
            }
            System.out.println("¿Una ayudita, por favor?");
            respuesta = teclado.nextLine().toLowerCase();
        }
        // Al final, tienes que decir cuánta gente te ha ayudado y cuánto dinero has recaudado.
        System.out.println("Han colaborado un total de " + veces + " personas y hemos reunido un total de " + donativoTotal + " euros.");

        // 3- SWITCH  - WHILE: El archivo sonoro!
        // // Usando una variable byte, preguntas cuál de los sonidos quieres escuchar.
        // Cuando eligen un número, aparece la onomatopeya de ese sonido.
        // Luego le preguntas: quieres escuchar otro? Y sigue hasta que diga no.
       boolean gameOn = true;
        while (gameOn){
            System.out.println("¿Qué sonido quieres escuchar? Introduce el número.");
            System.out.println("1. Cohete");
            System.out.println("2. Perro");
            System.out.println("3. Pistola");
            System.out.println("4. Cristal rompiéndose");
            System.out.println("5. Ambulancia");
            System.out.println("6. Salir");
            Integer nSonido = Integer.parseInt(teclado.nextLine());
            byte byteSonido = nSonido.byteValue();

            switch(byteSonido){
                        case 1:
                            System.out.println("¡Ziuuum!");
                            break;
                        case 2:
                            System.out.println("¡Guau, guau!");
                            break;
                        case 3:
                            System.out.println("¡Pum! ¡Pum!");
                            break;
                        case 4:
                        System.out.println("¡Crish! ¡Crash!");
                            break;
                        case 5:
                            System.out.println("¡Nino nino nino nino!");
                            break;
                        case 6:
                            gameOn = false;
                        break;
                        default:
                        System.out.println("No conozco ninguna estación con ese nombre.");
                    }
       } 

        teclado.close();
    }
}
