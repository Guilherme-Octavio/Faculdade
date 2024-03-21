package POO.Classe.PolimorfismoHeranca;

public class TestarC3PO {
    public static void main(String[] args) {
        C3PO c3po = new C3PO();
        R2D2 r2d2 = new R2D2();

        System.out.println(c3po.falar());
        System.out.println(r2d2.falar(5));
    }
}
