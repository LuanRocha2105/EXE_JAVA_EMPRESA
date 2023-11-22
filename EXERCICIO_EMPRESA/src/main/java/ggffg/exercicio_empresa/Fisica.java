package ggffg.exercicio_empresa;

public class Fisica extends Cliente{
    
    private String nome;
    private String cpf;

    public Fisica(String usuario, String nome, String cpf) {
        this.usuario = usuario; 
        this.nome = nome;
        this.cpf = cpf;
        validarCPF(this.cpf);
    }
    

    @Override
    public void imprimir() {
        System.out.println("Usuario: " + this.usuario);
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " +this.cpf);
        System.out.println("\n");
    }
    
    private boolean validarCPF(String cpf){
        
        System.out.print("verificando...");
        boolean confirm = true;
        
        return confirm;
    }
    
    
        
}
