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


El servidor, por su lado, estar� compuesto por varios threads para poder atender m�ltiples consultas
simult�neamente. Estos threads deben terminar cuando no haya m�s clientes. Los threads servidores estar�n
continuamente solicitando mensajes al buffer y respondiendo las respectivas consultas (responder consiste en 
incrementar el valor del mensaje y avisarle al cliente que puede continuar). El n�mero de servidores tambi�n debe
ser un n�mero arbitrario.
El n�mero de clientes, el n�mero de servidores, el n�mero de consultas de cada uno de los clientes y el tama�o del
buffer deben estar en un archivo, el cual ser� procesado por el main del programa.

