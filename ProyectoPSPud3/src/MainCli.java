import java.io.IOException;
import Cliente.Cliente;
//Clase principal para conectar Cliente
public class MainCli {
    public static void main(String[] args) throws IOException     {
        Cliente cli = new Cliente();
        System.out.println("Iniciando cliente\n");
        cli.startClient();
    }
}