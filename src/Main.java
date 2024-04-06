//Importamos los paquetes que vamos a necesitar
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        //Creamos los objetos FileWriter, File y Scanner
        FileWriter writer = new FileWriter("result.txt"); //Para escribir en el archivo result.txt
        File file= new File("oscar_age_female.csv"); //Para apuntar al archivo con los datos de origen
        Scanner scan = new Scanner(file); //Para leer los datos del archivo de origen


        //La condicion es que seguimos iterando mientras haya mas lineas en el archivo de origen
        while (scan.hasNextLine()) {
            String currentLine = scan.nextLine(); //Variable que guarda la linea que estamos iterando
            System.out.println(currentLine);      //Y la muestra en consola

            //datos[] es un array con los campos del archivo .csv separados para cada linea o elemento
            String datos[] = currentLine.split(", ");
            writer.write("Name: "+ datos[3]+"\n"); //Escribimos en el archivo result.txt
            writer.write("Year: "+ datos[1]+"\n");
            writer.write("Age: "+ datos[2]+"\n");
            writer.write("Movie: "+ datos[4]+"\n");
            writer.write("====================\n");

        }
        //Hemos salido del bucle y el trabajo esta terminado
        System.out.println("Finished job! Check the result in: result.txt");
        scan.close(); //Cerramos el Scanner
    }
}