public abstract class Personagem {
    private boolean vivo;
    protected float posicaoX;
    protected float posicaoY;
    protected float posicaoZ;
    protected int cor;

    
    
    public Personagem(int cor) {
		super();
		this.cor = cor;
	}

	public abstract void correr (float x, float y);

    public abstract void saltar (float z);

    public abstract void atirar ();

    public void morrer (){
        vivo = false;
        System.out.println("Morto...");
    }
}
