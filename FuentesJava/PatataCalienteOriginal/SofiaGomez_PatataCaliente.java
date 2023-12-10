/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sofiagomez_patatacaliente;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alumnot
 */
public class SofiaGomez_PatataCaliente {

    //preguntas
    static Scanner sc = new Scanner(System.in);
    final static String pregunta1 = "   ¿Que número decimal corresponde al octal 01101?";
    final static String pregunta2 = "   ¿En que año se creó java?";
    final static String pregunta3 = "   ¿Cuantos cáracteres se representan en el estándar ASCII extendido?";
    final static String pregunta4 = "   ¿En la secuencia de Fibonacci que número seguiría: 0, 1, 1, 2, 3, 5, 8, 13, 21...?";
    final static String pregunta5 = "   ¿Cual de estas opciones es un framework?\n   1.CSS\n   2.Python\n   3.r\n   5.React\n   6.Kotlin"
            + "";
    //puntuacion y niveles
    static int puntuacion=0;
    static int preguntasAcertadas=0;
    static int preguntasFalladas=0;
    static boolean gameOver=false;
    static boolean nivelMedio=false;
    static boolean nivelAvanzado=false;
    static boolean nivelInicial=false;
    
    
    //colores
    static String green="\033[32m";
    static String red="\033[31m";
    static String yellow="\033[33m";
    static String cyan="\033[36m"; 
    static String purple="\033[35m";
    static String white="\033[37m";

    public static void main(String[] args) {
        int opcion;
        for (int i = 0; i < 100; i++) {
            pintaTitulo();
            opcion = pintaMenu();
            System.out.println("*******************************************************************");
            System.out.println("*******************************************************************");
        switch (opcion) {
            case 1:
               
                puntuacion=0;
                preguntasAcertadas=0;
                preguntasFalladas=0;
                buclePreguntas();
                break;
            case 2:
                instrucciones();
                System.out.println("*******************************************************************");
                System.out.println("*******************************************************************");                
                i=10;
                break;
            case 3:
                System.out.println("Ｈａｓ ｓａｌｉｄｏ ｄｅｌ ｐｒｏｇｒａｍａ");
                i=100;
                System.out.println("Tu puntuacion ha sido: "+puntuacion);
                System.out.println("Preguntas acertadas: "+preguntasAcertadas);
                System.out.println("Preguntas falladas: "+preguntasFalladas);
                break;
            default:
                System.out.println("Elige una opcion correcta");
                break;
 
        }
        }
    }

    public static void pintaTitulo() {
        
        System.out.println(red+" (                                                                (     (            )              \n"
                +red+ " )\\ )    (       *   )    (       *   )    (         (     (      )\\ )  )\\ )      ( /(   *   )      \n"
                +red+ "(()/(    )\\    ` )  /(    )\\    ` )  /(    )\\        )\\    )\\    (()/( (()/( (    )\\())` )  /( (    \n"
                +red+ " /(_))((((_)(   ( )(_))((((_)(   ( )(_))((((_)(    (((_)((((_)(   /(_)) /(_)))\\  ((_)\\  ( )(_)))\\   \n"
                +red+ "(_))   )\\ _ )\\ (_(_())  )\\ _ )\\ (_(_())  )\\ _ )\\   )\\___ )\\ _ )\\ (_))  (_)) ((_)  _((_)(_(_())((_)  \n"
                +red+ "| _ \\  (_)_\\(_)|_   _|  (_)_\\(_)|_   _|  (_)_\\(_) ((/ __|(_)_\\(_)| |   |_ _|| __|| \\| ||_   _|| __| \n"
                +red+ "|  _/   / _ \\    | |     / _ \\    | |     / _ \\    | (__  / _ \\  | |__  | | | _| | .` |  | |  | _|  \n"
                +red+ "|_|    /_/ \\_\\   |_|    /_/ \\_\\   |_|    /_/ \\_\\    \\___|/_/ \\_\\ |____||___||___||_|\\_|  |_|  |___| \n"
                +red+ "                                                                                                    ");

    }

    public static int pintaMenu() {

        System.out.println("𝓑𝓲𝓮𝓷𝓿𝓮𝓷𝓲𝓭𝓸 𝓪𝓵 𝓳𝓾𝓮𝓰𝓸 𝓭𝓮𝓼𝓪𝓻𝓸𝓵𝓵𝓪𝓭𝓸 𝓹𝓸𝓻 𝓢𝓸𝓯𝓲𝓪 𝓖𝓸𝓶𝓮𝔃");
        System.out.println("-Que desea hacer?");
        System.out.println(yellow+"    1.Elgir Nivel\n"+yellow+"    2.Leer las instrucciones\n"+yellow+"    3.Salir del programa");
        System.out.print("-Seleccione una opcion: ");

        return sc.nextInt();
        
    }

    public static void buclePreguntas() {  
        int vecesJugadas=0;
        int nivel;
        int solucion =0;
        int respuesta;
        int intentos=0;
        boolean repetida1=false;
        boolean repetida2=false;
        boolean repetida3=false;
        boolean repetida4=false;
        boolean repetida5=false;
        String tuNivel="X";
        int contador=0;
        int correctasAcumuladas=0;
        int puntuacionFallos=0;
        int intentosFallos = 0;
        
        
        do {
        nivelInicial=false;    
        nivelMedio=false;
        nivelAvanzado=false;
         if (gameOver) {
             break;
         }
         else if (!gameOver) {
         vecesJugadas++;
         System.out.println("Estos son los niveles de dificultad: ");
         niveles();
         System.out.print("-Que nivel deseas jugar: ");
         nivel = sc.nextInt();
            switch (nivel) {
                case 1:
                    intentos=10;
                    tuNivel=green+"inicial";
                    nivelInicial=true;
                    break;
                case 2:
                    intentos=5;
                    tuNivel=cyan+"medio";
                    nivelMedio=true;
                    break;
                case 3:
                    intentos=2;
                    tuNivel=red+"avanzado";
                    nivelAvanzado=true;
                    break;
                default:
                    intentos=10;
                    tuNivel=green+"inicial";
                    nivelInicial=true;
                    break;
            }
            System.out.println("*******************************************************************");
            System.out.println("*******************************************************************");                
                System.out.println(white+"Bienvenido al nivel "+tuNivel);
                 System.out.println("   *Tienes "+intentos+" intentos*");
                 
                 
                do { 
                 contador=0;
                 intentosFallos=0;
                 switch (preguntaAleatoria()){
                    case 1:
                        if (!repetida1){
                        repetida1=true;
                        System.out.println(pregunta1);
                        solucion=15;
                        System.out.println("--Tu respuesta: ");
                        System.out.print("> ");
                        respuesta = sc.nextInt();
                        if (respuesta==solucion){
                            System.out.println(green+"Tu respuesta es correcta");
                            contador++;
                            preguntasAcertadas++;
                            correctasAcumuladas++;
                            puntuacion+=sistemaPuntuacionCorrecta();
                            System.out.println(purple+"[Has gastado 0 intentos || Has obtenido una puntuacion de "+sistemaPuntuacionCorrecta()+"]");
                            System.out.println("*******************************************************************");
                            System.out.println("*******************************************************************");                            
                            break;
                        }
                        else if (respuesta<solucion || respuesta>solucion){
                            correctasAcumuladas=0;
                            preguntasFalladas++;
                           if (respuesta<solucion) {
                                System.out.println(red+"Incorrecto, te has quedado corto sigue intentandolo");
                           }
                           else {
                               System.out.println(red+"Incorrecto, te has pasado sigue intentandolo");
                           }
                            puntuacionFallos=sistemaPuntuacionCorrecta();
                            do {
                                intentos--;
                                System.out.println("Intentos restantes: "+intentos);
                                puntuacionFallos-=sistemaPuntuacionFallos();
                                intentosFallos++;
                                if (intentos>0) {
                                    System.out.println("Prueba de nuevo:");
                                    System.out.print("> ");
                                    respuesta=sc.nextInt();
                                    if (respuesta<solucion) {
                                    System.out.println(red+"Incorrecto, te has quedado corto sigue intentandolo");
                                    }
                                    else if (respuesta>solucion){
                                    System.out.println(red+"Incorrecto, te has pasado sigue intentandolo");
                                      }
                                    }
                                else {
                                    System.out.println("Has perdido :("); 
                                    break;
                                }
                                
                                
                            } 
                            while (respuesta!=solucion);
                            if (intentos==0){
                                explosion();
                                gameOver=true;
                                contador++;
                                break;
                            }
                            else{
                            System.out.println(green+"Tu respuesta es correcta");
                            puntuacion+=puntuacionFallos;
                            System.out.println(purple+"[Has gastado "+intentosFallos+" intentos || Has obtenido una puntuación de "+puntuacionFallos+"]");
                            System.out.println("*******************************************************************");
                            System.out.println("*******************************************************************");                            
                            contador++;
                            break;
                            }
                            }
                         
                        }
                    case 2:
                        if (!repetida2){
                        repetida2=true;
                        System.out.println(pregunta2);
                        solucion=1995;
                        System.out.println("--Tu respuesta: ");
                        System.out.print("> ");
                        respuesta = sc.nextInt();
                        if (respuesta==solucion){
                            System.out.println(green+"Tu respuesta es correcta");
                            contador++;
                            preguntasAcertadas++;
                            correctasAcumuladas++;
                            puntuacion+=sistemaPuntuacionCorrecta();
                            System.out.println(purple+"[Has gastado 0 intentos || Has obtenido una puntuación de "+sistemaPuntuacionCorrecta()+"]");
                            System.out.println("*******************************************************************");
                            System.out.println("*******************************************************************");                            
                            break;
                        }
                        else if (respuesta<solucion || respuesta>solucion){
                            correctasAcumuladas=0;
                            preguntasFalladas++;
                           if (respuesta<solucion) {
                                System.out.println(red+"Incorrecto, te has quedado corto sigue intentandolo");
                           }
                           else {
                               System.out.println(red+"Incorrecto, te has pasado sigue intentandolo");
                           }
                            puntuacionFallos=sistemaPuntuacionCorrecta();
                            do {
                                intentos--;
                                System.out.println("Intentos restantes: "+intentos);
                                puntuacionFallos-=sistemaPuntuacionFallos();
                                intentosFallos++;
                                if (intentos>0) {
                                    System.out.println("Prueba de nuevo:");
                                    System.out.print("> ");
                                    respuesta=sc.nextInt();
                                    if (respuesta<solucion) {
                                    System.out.println(red+"Incorrecto, te has quedado corto sigue intentandolo");
                                    }
                                    else if (respuesta>solucion){
                                    System.out.println(red+"Incorrecto, te has pasado sigue intentandolo");
                                      }
                                    }
                                else {
                                    System.out.println("Has perdido :("); 
                                    break;
                                }
                                
                                
                            } 
                            while (respuesta!=solucion);
                            if (intentos==0){
                                explosion();
                                gameOver=true;
                                contador++;
                                break;
                            }
                            else{
                            System.out.println(green+"Tu respuesta es correcta"); 
                            puntuacion+=puntuacionFallos;
                            System.out.println(purple+"[Has gastado "+intentosFallos+" intentos || Has obtenido una puntuacion de "+puntuacionFallos+"]");
                            System.out.println("*******************************************************************");
                            System.out.println("*******************************************************************");                            
                            contador++;
                            break;
                            }
                            }
                        }
                    case 3:
                        if (!repetida3){
                        repetida3=true;
                        System.out.println(pregunta3);
                        solucion=256;
                        System.out.println("--Tu respuesta: ");
                        System.out.print("> ");
                        respuesta = sc.nextInt();
                        if (respuesta==solucion){
                            System.out.println(green+"Tu respuesta es correcta");
                            contador++;
                            preguntasAcertadas++;
                            correctasAcumuladas++;
                            puntuacion+=sistemaPuntuacionCorrecta();
                            System.out.println(purple+"[Has gastado 0 intentos || Has obtenido una puntuacion de "+sistemaPuntuacionCorrecta()+"]");
                            System.out.println("*******************************************************************");
                            System.out.println("*******************************************************************");                            
                            break;
                        }
                        else if (respuesta<solucion || respuesta>solucion){
                            correctasAcumuladas=0;
                            preguntasFalladas++;
                           if (respuesta<solucion) {
                                System.out.println(red+"Incorrecto, te has quedado corto sigue intentandolo");
                           }
                           else {
                               System.out.println(red+"Incorrecto, te has pasado sigue intentandolo");
                           }
                            puntuacionFallos=sistemaPuntuacionCorrecta();
                            do {
                                intentos--;
                                System.out.println("Intentos restantes: "+intentos);
                                puntuacionFallos-=sistemaPuntuacionFallos();
                                intentosFallos++;
                                if (intentos>0) {
                                    System.out.println("Prueba de nuevo:");
                                    System.out.print("> ");
                                    respuesta=sc.nextInt();
                                    if (respuesta<solucion) {
                                    System.out.println(red+"Incorrecto, te has quedado corto sigue intentandolo");
                                    }
                                    else if (respuesta>solucion){
                                    System.out.println(red+"Incorrecto, te has pasado sigue intentandolo");
                                      }
                                    }
                                else {
                                    System.out.println("Has perdido :("); 
                                    break;
                                }
                                
                                
                            } 
                            while (respuesta!=solucion);
                            if (intentos==0){
                                explosion();
                                gameOver=true;
                                contador++;
                                break;
                            }
                            else{
                            System.out.println(green+"Tu respuesta es correcta"); 
                            puntuacion+=puntuacionFallos;
                            System.out.println(purple+"[Has gastado "+intentosFallos+" intentos || Has obtenido una puntuacion de "+puntuacionFallos+"]");
                            System.out.println("*******************************************************************");
                            System.out.println("*******************************************************************");                            
                            contador++;
                            break;
                            }
                            }
                        }
                    case 4:
                        if (!repetida4){
                        repetida4=true;
                        System.out.println(pregunta4);
                        solucion=34;
                        System.out.println("--Tu respuesta: ");
                        System.out.print("> ");
                        respuesta = sc.nextInt();
                        if (respuesta==solucion){
                            System.out.println(green+"Tu respuesta es correcta");
                            contador++;
                            preguntasAcertadas++;
                            correctasAcumuladas++;
                            puntuacion+=sistemaPuntuacionCorrecta();
                            System.out.println(purple+"[Has gastado 0 intentos || Has obtenido una puntuacion de "+sistemaPuntuacionCorrecta()+"]");
                            System.out.println("*******************************************************************");
                            System.out.println("*******************************************************************");                            
                            break;
                        }
                          else if (respuesta<solucion || respuesta>solucion){
                              correctasAcumuladas=0;
                              preguntasFalladas++;
                           if (respuesta<solucion) {
                                System.out.println(red+"Incorrecto, te has quedado corto sigue intentandolo");
                           }
                           else {
                               System.out.println(red+"Incorrecto, te has pasado sigue intentandolo");
                           }
                            puntuacionFallos=sistemaPuntuacionCorrecta();
                            do {
                                intentos--;
                                System.out.println("Intentos restantes: "+intentos);
                                puntuacionFallos-=sistemaPuntuacionFallos();
                                intentosFallos++;
                                if (intentos>0) {
                                    System.out.println("Prueba de nuevo:");
                                    System.out.print("> ");
                                    respuesta=sc.nextInt();
                                    if (respuesta<solucion) {
                                    System.out.println(red+"Incorrecto, te has quedado corto sigue intentandolo");
                                    }
                                    else if (respuesta>solucion){
                                    System.out.println(red+"Incorrecto, te has pasado sigue intentandolo");
                                      }
                                    }
                                else {
                                    System.out.println("Has perdido :("); 
                                    break;
                                }
                                
                                
                            } 
                            while (respuesta!=solucion);
                            if (intentos==0){
                                explosion();
                                gameOver=true;
                                contador++;
                                break;
                            }
                            else{
                            System.out.println(green+"Tu respuesta es correcta"); 
                            puntuacion+=puntuacionFallos;
                            System.out.println(purple+"[Has gastado "+intentosFallos+" intentos || Has obtenido una puntuacion de "+puntuacionFallos+"]");
                            System.out.println("*******************************************************************");
                            System.out.println("*******************************************************************");                            
                            contador++;
                            break;
                            }
                            }
                        }
                    case 5:                        
                        if (!repetida5){
                        repetida5=true;
                        System.out.println(pregunta5);
                        solucion=5;
                        System.out.println("--Tu respuesta: ");
                        System.out.print("> ");
                        respuesta = sc.nextInt();
                        if (respuesta==solucion){
                            System.out.println(green+"Tu respuesta es correcta");
                            contador++;
                            preguntasAcertadas++;
                            correctasAcumuladas++;
                            puntuacion+=sistemaPuntuacionCorrecta();
                            System.out.println(purple+"[Has gastado 0 intentos || Has obtenido una puntuacion de "+sistemaPuntuacionCorrecta()+"]");
                            System.out.println("*******************************************************************");
                            System.out.println("*******************************************************************");                            
                            break;
                        }
                        else if (respuesta<solucion || respuesta>solucion){
                            correctasAcumuladas=0;
                            preguntasFalladas++;
                           if (respuesta<solucion) {
                                System.out.println(red+"Incorrecto, te has quedado corto sigue intentandolo");
                           }
                           else {
                               System.out.println(red+"Incorrecto, te has pasado sigue intentandolo");
                           }
                            puntuacionFallos=sistemaPuntuacionCorrecta();
                            do {
                                intentos--;
                                System.out.println("Intentos restantes: "+intentos);
                                puntuacionFallos-=sistemaPuntuacionFallos();
                                intentosFallos++;
                                if (intentos>0) {
                                    System.out.println("Prueba de nuevo:");
                                    System.out.print("> ");
                                    respuesta=sc.nextInt();
                                    if (respuesta<solucion) {
                                    System.out.println(red+"Incorrecto, te has quedado corto sigue intentandolo");
                                    }
                                    else if (respuesta>solucion){
                                    System.out.println(red+"Incorrecto, te has pasado sigue intentandolo");
                                      }
                                    }
                                else {
                                    System.out.println("Has perdido :("); 
                                    break;
                                }
                                
                                
                            } 
                            while (respuesta!=solucion);
                            if (intentos==0){
                                explosion();
                                gameOver=true;
                                contador++;
                                break;
                            }
                            else{
                            System.out.println(green+"Tu respuesta es correcta"); 
                            puntuacion+=puntuacionFallos;
                            System.out.println(purple+"[Has gastado "+intentosFallos+" intentos || Has obtenido una puntuacion de "+puntuacionFallos+"]");
                            System.out.println("*******************************************************************");
                            System.out.println("*******************************************************************");                            
                            contador++;
                            break;
                            }
                            }
                        }

         }
         
                }
                while (contador<1);
                if (correctasAcumuladas==3) {
                    easterEgg();
                    System.out.println("*******************************************************************");
                    System.out.println("*******************************************************************"); 
                    
                }
                
        } }
        while(vecesJugadas<5);
        System.out.println("*******************************************************************");
        System.out.println("*******************************************************************"); 
        System.out.println("*Has terminado el juego");
        System.out.println("*Tu puntuacion ha sido: "+puntuacion);
        System.out.println("* Has acertado "+preguntasAcertadas);
        System.out.println("*Has fallado "+preguntasFalladas);
        System.out.println("*******************************************************************");
        System.out.println("*******************************************************************"); 
        
        gameOver=false;
        
    }
    
    public static int preguntaAleatoria(){
        Random r = new Random();
        int numAleatorio;
        numAleatorio = r.nextInt(4) + 1;
        
        return numAleatorio;    
            
        }
    
    public static void easterEgg(){
         int rondaGanada=0;
        int rondaPerdida=0;
        System.out.println("Has descubierto un easter egg");
        System.out.println("-Va a comenzar un piedra, papel, tijera, si ganas a la maquina obtendras 50 puntos, suerte!");
        System.out.println("-Gana el que gane 3 rondas");
        do{
            int eleccionUsuario=0;
            int eleccionMaquina=0;
           
            System.out.println("Que vas a sacar?");
            System.out.println("    1.Piedra\n    2.Papel\n    3.Tijera");
            System.out.print("> ");
            eleccionUsuario = sc.nextInt();
            System.out.println("Has sacado:");
            if (eleccionUsuario<=3 && eleccionUsuario>0) {
            switch (eleccionUsuario) {
                case 1:
                    piedra();
                    break;
            
                case 2:
                    papel();
                    break;
                
                case 3:
                    tijera();
                    break;
                    
                    
            }
            }
            else {
            piedra();
            
            }
            System.out.println("");
            System.out.println("La maquina ha sacado:");
            eleccionMaquina=eleccionAleatoria();
            switch (eleccionMaquina) {
               case 1:
                    piedra();
                    break;
            
                case 2:
                    papel();
                    break;
                
                case 3:
                    tijera();
                    break;
            }
            
            if (eleccionUsuario!=eleccionMaquina) {
                
                if (eleccionUsuario==1) {
                    if (eleccionMaquina==2) {
                        System.out.println("Has perdido");
                        rondaPerdida++;
                    }
                    else if (eleccionMaquina==3){
                        System.out.println("Has ganado");
                        rondaGanada++;
                    }
                    
                }
                else if (eleccionUsuario==2) {
                    if (eleccionMaquina==3) {
                        System.out.println("Has perdido");
                        rondaPerdida++;
                    }
                    else if (eleccionMaquina==1){
                        System.out.println("Has ganado");
                        rondaGanada++;
                    }
                
                
            }
                else if (eleccionUsuario==3) {
                    if (eleccionMaquina==1) {
                        System.out.println("Has perdido");
                        rondaPerdida++;
                    }
                    else if (eleccionMaquina==2){
                        System.out.println("Has ganado");
                        rondaGanada++;
                    }
                         
            }
            }
            else {
                System.out.println("Ha habido empate, se repite la ronda");
                
            }
            System.out.println(rondaGanada+"-"+rondaPerdida);
            
        } while(rondaGanada!=3 && rondaPerdida!=3);
        if (rondaGanada==3) {
            System.out.println("Enhorabuena! has ganado");
            puntuacion += 50;
            System.out.println("【+】 【5】【0】 【p】【u】【n】【t】【o】【s】"); 
            
        
        }
        else if (rondaPerdida==3) {
            System.out.println("Vaya, has perdido por lo tanto no obtienes nada");
        }
                
        
        
        
        
       
    }
    
    public static void explosion(){
        System.out.println("     _.-^^---....,,--       \n" +
" _--                  --_  \n" +
"<                        >)\n" +
"|                         | \n" +
" \\._                   _./  \n" +
"    ```--. . , ; .--'''       \n" +
"          | |   |             \n" +
"       .-=||  | |=-.   \n" +
"       `-=#$%&%$#=-'   \n" +
"          | ;  :|     \n" +
" _____.,-#%&$@%#&#~,._____");
    
    }
    
    public static int sistemaPuntuacionCorrecta(){
        int puntosObtenidos=0;
        if (nivelMedio) 
            puntosObtenidos=200;
        
        else if (nivelAvanzado) {
            puntosObtenidos=500;        
        }
        else if (nivelInicial)
            puntosObtenidos=100;
        
        return puntosObtenidos;
    
    }
    public static int sistemaPuntuacionFallos(){
        int puntuacionRestante=0;
        if (nivelMedio){
        puntuacionRestante=20;
        }
        else if (nivelAvanzado) {
        puntuacionRestante=50;
        }
        else if (nivelInicial){
        puntuacionRestante=10;
        }
    
        return puntuacionRestante;
    }
    
    public static void niveles(){
        System.out.println(green+"    1.NIVEL INICIAL\n"+cyan+"    2.NIVEL INTERMEDIO\n"+red+"    3.NIVEL AVANZADO");
        
    }
    
    public static void instrucciones(){
        System.out.println("Bienvenido a las instrucciones de la patata caliente estas son las siguientes:\n" +
"--Tras elegir la opción uno empezará el juego.\n" +
"--Tienes que elegir uno de los tres niveles, el nivel por defecto siempre será el inicial. Las características de cada uno son las siguientes:\n" +
"	Nivel Inicial: 10 intentos, ganarás 100 puntos por pregunta acertada, cada intento fallado serán 10 puntos menos de la puntuación que obtendrás.\n" +
"	Nivel Medio: 5 intentos, ganarás 200 puntos por pregunta acertada, cada intento fallado serán 20 puntos menos de la puntuación que obtendrás.\n" +
"	Nivel Avanzado: 2 intentos, ganarás 500 puntos por pregunta acertada, cada intento fallado serán 50 puntos menos de la puntuación que obtendrás.\n" +
"--Tras elegir nivel empezarán las preguntas, estas saldrán de forma aleatoria, si fallas el juego te avisará si es un número mayor o si es un número menor. \n" +
"--Si aciertas volverás al menú de elegir nivel y así hasta que termine el juego.\n" +
"--Todas las respuestas deben ser númericas.\n" +
"--Solo se pueden jugar 5 veces, tras estas 5 veces volverá a salir el menú, igual si pierdes.\n" +
"--Te reto a acertar 3 preguntas seguidas y descubrir lo que pasa.\n" +
"--Esto es todo lo que necesitas saber, mucha suerte!");
    }
    public static void piedra(){
        System.out.println("    _______\n" +
"---'   ____)\n" +
"      (_____)\n" +
"      (_____)\n" +
"      (____)\n" +
"---.__(___)");
    
    }
    public static void papel() {
        System.out.println("    _______\n" +
"---'   ____)____\n" +
"          ______)\n" +
"          _______)\n" +
"         _______)\n" +
"---.__________)");
    }
    
    public static void tijera(){
        System.out.println("    _______\n" +
"---'   ____)____\n" +
"          ______)\n" +
"       __________)\n" +
"      (____)\n" +
"---.__(___)");
    }
    public static int eleccionAleatoria(){
    Random r = new Random();
        int eleccionAleatoria;
        eleccionAleatoria = r.nextInt(3) + 1;
        
        return eleccionAleatoria; 
    } 

    
}
