import java.util.Scanner;

public class CalificacionPromedio {

    static int [] calificaciones = new int[5];
    static String nombreEstudiante;

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nombre del estudiante:");
        nombreEstudiante = scanner.next();
        for(int i=0;i<5;i++){
            System.out.println("Calificación "+(i+1)+":");
            calificaciones[i] = scanner.nextInt();
        }
        int promedio = calculaPromedio(calificaciones);
        imprimirResultados(nombreEstudiante,promedio,  obtenerCalificacion(promedio));

    }

    public static void imprimirResultados(String nombre, int promedio, char calificacion){
        System.out.println("Promedio: "+promedio);
        System.out.println("Calificación: "+calificacion);

    }

    public static int calculaPromedio(int[] arrayCalificaciones ){
        if (arrayCalificaciones!=null){
            if (arrayCalificaciones.length>=5){
                return ((arrayCalificaciones[0]+arrayCalificaciones[1]+
                        arrayCalificaciones[2]+arrayCalificaciones[3]+
                        arrayCalificaciones[4])/5);
            }
        }
        return 0;
    }

    public static char obtenerCalificacion(int promedio){

            char calificacion=0;

            if (promedio <= 50){
                calificacion = 'F';
            }else if (promedio >= 51 && promedio <= 60){
                calificacion =  'E';
            }else if (promedio >= 61 && promedio <= 70){
                calificacion =  'D';
            }else if (promedio >= 71 && promedio <= 80){
                calificacion =  'C';
            }else if (promedio >= 81 && promedio <= 90){
                calificacion =  'B';
            }else if (promedio >= 91 && promedio <= 100){
                calificacion = 'A';
            }
            return calificacion;
    }
}
