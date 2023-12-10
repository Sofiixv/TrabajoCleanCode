/* Este es un ejemplo de como seria mi patata caliente de una forma mas limpia siguiendo los consejos del clean code, esta no esta completa ya 
que me he centrado en mejorar una de las funciones que hice que fue la de buclePreguntas, esta era una funcion muy larga, en este ejemplo de clean code 
he intentado dividir esta funcion en varias funciones en las que cada una hace una funcion para que esta se encargue simplemente de mostrar la pregunta y 
saber si ha acertado o fallado ademas esto lo hice con un switch case en el que repetia lo mismo pero solo cambiando la pregunta, asi recive la pregunta 
la solucion y el numero de intetnos haciendo que el codigo quede mas limpio, facil de leer y tambien quitar lineas innecesarias que solo complicaban mas el 
trabajo.
*/




import java.util.Random;
import java.util.Scanner;

public class App {
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) throws Exception {
        
     eleccionPregunta(preguntaAleatoria());
     eleccionSolucion(preguntaAleatoria());   
     buclePreguntas(eleccionPregunta(0), eleccionSolucion(0), eleccionNivel(0));
      
    }

     public static int preguntaAleatoria(){
        Random r = new Random();
        int numAleatorio;
        numAleatorio = r.nextInt(4) + 1;
        
        return numAleatorio;    
            
        }
    public static void buclePreguntas(String Pregunta, int solucion, int intentos){
        //recibe la Pregunta
          int respuesta=0;
          int contadorIntentos=0;
          boolean acierto=false;
          System.out.println(pregunta);
          while(respuesta != solucion){
            if(contadorIntentos==intentos){
              break;
              
            }
            contadorIntentos++;
          System.out.println("Tu respuesta >");
          if (respuesta==solucion){
          System.out.println("Tu respuesta es correcta");
          acierto = true;
          
          }
          else {
          System.out.println("Has fallado, vuelve a intentarlo");
          System.out.println("Intentos restantes: "+contadorIntentos);
            if (respuesta > solucion){
            System.out.println("Te has pasado");        
            }
            else if (respuesta < solucion){
            System.out.println("Te has quedado corto");
            }
          }
              
            
          }
        
      }
      
      public static String eleccionPregunta(int numPregunta){
        //recibe la pregunta aleatoria
        String pregunta ="";
        switch (numPregunta){
          case 1:
            pregunta = "x pregunta 1";
            break;
          case 2:
            pregunta = "x pregunta 2";
            break;
          case 3:
            pregunta = "x pregunta 3";
            break;
          case 4:
            pregunta = "x pregunta 4";
            break;
          case 5:
            pregunta = "x pregunta 5";
            break;
        }
        return pregunta;
        
      }
      
      public static int eleccionSolucion(int numPregunta){
        int solucion=0;
        switch(numPregunta){
          case 1:
            solucion = 1;
            break;
          case 2:
            solucion = 2;
            break;
          case 3:
            solucion = 3;
            break;
          case 4:
            solucion = 4;
            break;
          case 5:
            solucion = 5;
            break;
          
        }
        return solucion;
        
      } 

      public static int eleccionNivel (int nivel){
        //esta funcion coge la opcion del menu de eleccion de nivel y dependiendo de la eleccion 
        //vuelve true un boolean y a este se le asignan los valores de ese nivel

        

      }
      
}
