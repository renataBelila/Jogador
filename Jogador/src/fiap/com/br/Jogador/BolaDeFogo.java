package fiap.com.br.Jogador;

public class BolaDeFogo implements Fase {
	
	private int poder;

	@Override
	public void mover(int x, int y) {
		System.out.printf("a bola de fogo foi lancada na posição:",x,y);
	}
	
	
	
	

}
