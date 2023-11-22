package ggffg.exercicio_empresa;

public abstract class Juridica extends Cliente {
    
    public String fantasia;
    public String cnpj;

    public Juridica(String fantasia, String cnpj) {
        this.fantasia = fantasia;
        this.cnpj = cnpj;
        validarCNPJ(this.cnpj);
    }
    
    
    private boolean validarCNPJ(String cnpj){
    
       System.out.print("verificando...");
        boolean confirm = true;
        
        return confirm;
        
    }
        
    
}
