package POO.ProjetoFinal;

/*
 * Autores         Guilherme Octávio Silva Amorim
 *               Lucas Lotti
 *               Augusto Calhas
 * Data          15/03/2024
 * Disciplina    Programação Orientada a Objetos
 * Atividade     AVALIATIVA FINAL (3SI)
 */

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

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

    static final TipoLista normal = TipoLista.NORMAL;
    static Fila filaNormal = new Fila(normal);

    static Map<TipoLista, Fila> filas;

    public ControleDeFila(){
        this.filas = new HashMap<>();
        CreateFilas();
    }

    void CreateFilas(){
        for (TipoLista l: TipoLista.values()){
            filas.put(l, new Fila(l));
        }
    }

    void InserirFilas(TipoLista t){
        Fila filaSelecionada = filas.get(t);
        filaSelecionada.inserir();
    }

    void Chamar(){
        
    }


    public static void main(String[] args) throws SQLException {

    }
}

