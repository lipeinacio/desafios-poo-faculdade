
package controle;

import modelo.Cliente;
import modelo.Veiculo;

public class Principal {
    public static void main(String [] args){
    Cliente cli = new Cliente();
    Veiculo vei = new Veiculo();
    
    cli.toCliente("123456789-10", "Joao", "Rua Magalhoes", "21-32144-3123", "joaopedefeijao@dominio.com");
    
    vei.toVeiculo("ADS-0000", "Uai", 2010, "kawaii", "Preto");
    
    
    System.out.println("Cliente: " + cli.toClienteString());
    System.out.println("Veículo: " + vei.toVeiculoString() );
    
     }
}