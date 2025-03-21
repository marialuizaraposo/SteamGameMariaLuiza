public class Biblioteca {
    private int id;
    private List game = games;
    public abstract void adicionargame();
}

public class Jogo {
    private int id;
    private String titulo;
    @override
    public void adicionargame(){
        System.out.println("Jogo " + this.titulo "adicionado na biblioteca")
    }
}