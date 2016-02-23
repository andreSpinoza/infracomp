import java.util.Random;

public class Server extends Thread{
	
	private int nServers;
	private Buffer buffer;
	
	public server()
	{
		
	}
	
	public int darNumeroAleatoriodeMensajesdeServidores()
	{
		Random rnd = new Random(2);
		nServers = rnd.nextInt();	
		
		return nServers;
	}
	
	public void pedirMensajes()
	{
		
	}
	
	public synchronized int responderMensaje()
	{
		
	}
	
	public void run ()
	{
		int nThreads = darNumeroAleatoriodeMensajesdeServidores();
		for (int i = 0; i < nThreads; i++) {
			
			Server hiloServidor = new Server();
			
	}
	}
}


El servidor, por su lado, estará compuesto por varios threads para poder atender múltiples consultas
simultáneamente. Estos threads deben terminar cuando no haya más clientes. Los threads servidores estarán
continuamente solicitando mensajes al buffer y respondiendo las respectivas consultas (responder consiste en 
incrementar el valor del mensaje y avisarle al cliente que puede continuar). El número de servidores también debe
ser un número arbitrario.
El número de clientes, el número de servidores, el número de consultas de cada uno de los clientes y el tamaño del
buffer deben estar en un archivo, el cual será procesado por el main del programa.

