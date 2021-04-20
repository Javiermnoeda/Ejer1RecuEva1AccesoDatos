import java.io.*;
import java.util.*;

public class Ejercicio {
    public static void main(String[] args) throws IOException{
        File fichero = new File("C:\\Users\\AlumnoM\\IdeaProjects\\Ejer1RecuEva1AccesoDatos\\src\\nombres.bin");
        BufferedReader lectura = new BufferedReader(new FileReader(fichero));
        String linea="";
        TreeSet<Character> inicial = new TreeSet <Character>();
        while ((linea=lectura.readLine())!=null) {
            inicial.add(linea.charAt(0));
        }
        System.out.println(inicial);
    }



}
