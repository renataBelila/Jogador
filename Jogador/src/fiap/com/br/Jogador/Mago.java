package fiap.com.br.Jogador;

public class Mago extends Jogador implements Fase {
	
	private int mp;


	public Mago(String nome) {
		super(nome);
	}


	public Mago(String string, int i, int j) {
		// TODO Auto-generated constructor stub
	}


	@Override
	public void mover(int x, int y) {
		System.out.printf("o mago se moveu tantas posições:",x,y);
		
	}
	
	
	
	


}
