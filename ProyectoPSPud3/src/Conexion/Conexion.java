package Conexion;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Conexion
{
	//Variable con el puerto para la conexión
    private final int puerto = 2517;
    //variable con la Ip del servidor
    private final String dirIP = "127.0.0.1"; 
  //Mensajes entrantes en el servidor
    protected String mensajeServidor;
  //Socket del servidor de nuestra app
    protected ServerSocket ss;
  //Socket del cliente de nuestra app
    protected Socket cs;
  //Flujo de datos de salida de nuestra app
    protected DataOutputStream salidaServidor, salidaCliente; 
  //Constructor de nuestra conexion
    public Conexion(String tipo) throws IOException {
        if(tipo.equalsIgnoreCase("servidor")) {
            ss = new ServerSocket(puerto);
            cs = new Socket();
        } else {
            cs = new Socket(dirIP, puerto);
        }
    }
}