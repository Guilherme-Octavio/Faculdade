package POO.Classe.Abstract;

public abstract class robo {
    String id;

    public robo(String id){
        this.id = id.toUpperCase();
    }
    abstract String comunicar(String EntradaMensagem);
    abstract String locomover();
}