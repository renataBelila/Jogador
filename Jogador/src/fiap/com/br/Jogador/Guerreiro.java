package fiap.com.br.Jogador;

public class Guerreiro extends Jogador{
	
	private int x;
	private int y;
	
	
	
	public Guerreiro(String nome) {
		super(nome);
	}
	
	public void mover(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println(getNome() + " moveu-se para x=" + x + ", y=" + y);
    }

}
