package ggffg.exercicio_empresa;

import java.util.*;

public class Comercio extends Juridica{
    
    private String ramoOperacao;
    private List<Venda> vendas;

    public Comercio(String ramoOperacao, String fantasia, String cnpj) {
        super(fantasia, cnpj);
        this.ramoOperacao = ramoOperacao;
        vendas = new ArrayList<>();
    }

    
    @Override
    public void imprimir() {
        
        System.out.println("Usuario: " + this.usuario);
        System.out.println("Nome: " + this.fantasia);
        System.out.println("CNPJ: " +this.cnpj);
        System.out.println("Ramo: " +this.ramoOperacao);
        System.out.println("\n");
                
    }
    
    public void novaVenda(int id, double valor){
        
        Venda venda = new Venda(id, valor);
        venda.setComercio(this);
        this.vendas.add(venda);
        
    }
    
}
