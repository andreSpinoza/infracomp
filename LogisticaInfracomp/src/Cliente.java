import java.util.Random;

public class Cliente extends Thread {
	
	private int nMensajes;
	private int numeroThreads;
	private int idCliente;
	private Mensaje mensaje;
	
	private Buffer buffer;
	
	public Cliente (int nMensajes, int idCliente)
	{
	
	}
	
//	TODO
	public synchronized Mensaje generarMensaje(int thCliente, int valorMensaje)
	{
		Mensaje msj = new Mensaje(thCliente, valorMensaje);
		return msj;	
	}
	
//	TODO
	public synchronized Mensaje enviarMensaje ()
	{
		return null;
		
	}
	
//	TODO limitar e numero de Threads
	public int darNumeroAleatoriodeClientes()
	{
		Random rnd = new Random(2);
		numeroThreads = rnd.nextInt();	
		
		return numeroThreads;
	}
	
	public int darNumeroAleatoriodeMensajesdeCliente()
	{
		Random rnd = new Random(2);
		nMensajes = rnd.nextInt();	
		
		return nMensajes;
	}
	

	public void run()
	{
		int nThreads = darNumeroAleatoriodeClientes();
		for (int i = 0; i < nThreads; i++) {
			int nMjs = darNumeroAleatoriodeMensajesdeCliente();
			
			Cliente hiloCliente = new Cliente(nMjs, i);
			
		}
		
	}

}
