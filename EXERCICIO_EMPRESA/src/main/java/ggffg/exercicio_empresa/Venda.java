package ggffg.exercicio_empresa;

public class Venda {
    
        private int id;
        private double valor;
        private Comercio comercio;

    public Venda(int id, double valor) {
        this.id = id;
        this.valor = valor;
    }       

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Comercio getComercio() {
        return comercio;
    }

    public void setComercio(Comercio comercio) {
        this.comercio = comercio;
    }
    
    
}
