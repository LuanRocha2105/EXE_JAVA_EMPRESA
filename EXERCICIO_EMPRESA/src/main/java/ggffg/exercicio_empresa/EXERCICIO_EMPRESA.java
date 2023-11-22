package ggffg.exercicio_empresa;

import java.util.*;

public class EXERCICIO_EMPRESA {

    public static void main(String[] args) {
        
        List<Cliente> clientes = new ArrayList<>();
        
        Comercio c1 = new Comercio("01", "comercio1", "00.000.000/0001-00", "eletronico");
        Comercio c2 = new Comercio("02", "comercio2", "00.000.000/0001-01", "alimenticio");
        Administradora a1 = new Administradora("03", "comercio1", "00.000.000/0001-02", 5.6, true);
        Administradora a2 = new Administradora("04", "comercio1", "00.000.000/0001-03", 3.4, false);
        Fisica f1 = new Fisica("05", "fisica1", "000.000.000-00");
        Fisica f2 = new Fisica("06", "fisic21", "000.000.000-01");
     
        clientes.add(c1);
        clientes.add(c2);
        clientes.add(a1);
        clientes.add(a2);
        clientes.add(f1);
        clientes.add(f2);
        
        for(Cliente i : clientes){
            
           i.imprimir();
            
        }
        
        a1.calcularAtivosFinanceiros();
        
        c1.novaVenda(01, 56.90);
        
    }
}
