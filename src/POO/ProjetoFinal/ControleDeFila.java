package POO.ProjetoFinal;

import java.util.HashMap;
import java.util.Queue;

public class ControleDeFila {
    static final TipoLista urgente = TipoLista.URGENTE;
    static Fila filaUrgente = new Fila(urgente);

    static final TipoLista preferencial = TipoLista.PREFERENCIAL;
    static Fila filaPreferencial = new Fila(preferencial);

    static final TipoLista idoso80 = TipoLista.IDOSO80;
    static Fila filaIdoso80 = new Fila(idoso80);

    static final TipoLista idoso = TipoLista.IDOSO;
    static Fila filaIdoso = new Fila(idoso);

    static final TipoLista vip = TipoLista.VIP;
    static Fila filaVip = new Fila(vip);

    static Fila filaGeral = new Fila();
    static HashMap<Fila, Queue<Senha>>

    public static void main(String[] args) {

    }
}

