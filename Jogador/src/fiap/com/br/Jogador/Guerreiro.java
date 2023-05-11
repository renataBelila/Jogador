package fiap.com.br.Jogador;

public abstract class Guerreiro extends Jogador implements Fase {
	
	private int x;
	private int y;
	
	
	public Guerreiro() {
		super();
	
	}
	public Guerreiro(String nome) {
		super(nome);
		
	}
	@Override
	public void mover(int x, int y) {
		System.out.printf("o guerreiro se moveu nas direções:", x,y);
		
	}
	


}
