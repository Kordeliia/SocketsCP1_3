import java.io.IOException;
import Servidor.Servidor;
//Clase principal que hará uso del servidor
public class MainServ {
    public static void main(String[] args) throws IOException {
        Servidor serv = new Servidor(); //Se crea el servidor
        System.out.println("Iniciando servidor\n");
        serv.startServer(); //Se inicia el servidor
    }
}