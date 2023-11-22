package ggffg.exercicio_empresa;

import java.util.*;

public class Administradora extends Juridica implements InstituicaoFinanceira{

    private double taxaCorretagem;
    private boolean plataformaOnline;
    List<Investimento> investimentos = new ArrayList<>();

    public Administradora(String usuario, String fantasia, String CNPJ, double taxaCorretagem, boolean plataformaOnline) {
        this.usuario = usuario;
        this.fantasia = fantasia;
        this.CNPJ = CNPJ;
        this.taxaCorretagem = taxaCorretagem;
        this.plataformaOnline = plataformaOnline;
    }

    
    
    @Override
    public void imprimir() {
        System.out.println("Usuario: " + this.usuario);
        System.out.println("Nome: " + this.fantasia);
        System.out.println("CNPJ: " +this.CNPJ);
        System.out.println("Taxa de Corretagem: " +this.taxaCorretagem);    
        System.out.println("\n");
    }

    @Override
    public void calcularAtivosFinanceiros() {
        
        System.out.println("calculando");
        
    }  

    private void novoInvestimento(int id, double valor){
        
        Investimento invest = new Investimento(id, valor);
        invest.setAdm(this);
        this.investimentos.add(invest);
        
    }    
}
