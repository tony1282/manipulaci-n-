import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class manipulacionArchivos {
    public static void leerArchivo (String fileName){
        File file; // Apunta a un archivo fisico en el disco duro
        FileReader reader; //llave con permisos de solo lectura
        BufferedReader bufer; //recuperar informacion de un archivo
        String line; //recupera atchivos de texto

        try {
            // crear un apuntador al archivo fisico 
            file = new File("C:\\archivos\\" + fileName + ".txt");
            //abrir el archivo para lectura 
            reader = new FileReader(file);
            //configurar el bufer para leer los datos del archivo 
            bufer = new BufferedReader(reader);
            while ((line = bufer.readLine()) != null){
                System.out.println("Linea leida:" + line );
            }
            reader.close();

            //catch atrapa el error 
            //exception manejo de errores 
        } catch (IOException e) {
            System.out.println("error al leer el archivo: " + e.toString());
        }


    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String fileName;

        System.out.println("lectura de archivos de texto");
        System.out.println("Escribe el nombre del archivo");
        fileName = bufer.readLine();
        leerArchivo(fileName);

        


    
        
    }
}