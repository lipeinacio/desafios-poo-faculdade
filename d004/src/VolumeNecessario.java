import javax.swing.JOptionPane;

public class VolumeNecessario {
    private int base;
    private int altura;
    private int comprimento;
    private int volume; // "private int volume = base * altura * comprimento;" --> teste falho.

    /*  public void volumeNecessario(){
        volume = (base * altura * comprimento); --> teste falho.
    }*/
    public void volumeConcreto(){ // Solução encontrada: Usar "Integer.parseInt" para converter uma string em um numero primitivo inteiro (int).
        base = Integer.parseInt(JOptionPane.showInputDialog("Informe a medida da base: "));

        altura = Integer.parseInt(JOptionPane.showInputDialog("Informe a medida da altura: "));

        comprimento = Integer.parseInt(JOptionPane.showInputDialog("Informe a medida do comprimento: "));

        volume = base * altura * comprimento;

        JOptionPane.showMessageDialog( null, "O volume de concreto necessário é: " + this.volume);

    }
    }

