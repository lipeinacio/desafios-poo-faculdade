package modelo;

public class Veiculo {
    private String placa;
    private String modelo;
    private int ano;
    private String fabricante;
    private String cor;
    private Cliente cliente;
    
    public void toVeiculo(String placa, String modelo, int ano, String fabricante, String cor){
        this.ano = ano;
        this.cor = cor;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.placa = placa;
    
    }
     public String toVeiculoString(){
        return  "  PLACA: " + placa + "," + "  ANO: " + ano + "," + "  FABRICANTE: " + fabricante + "," + "  MODELO: " + modelo + "," + "  COR: " + cor + ".";
    
    }
    
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public String toVeiculo() {
        return null;
    }
            
}