package acc.java.joption;

import javax.swing.JOptionPane;

public class PrincipalAnimais {
    public static void main(String[] args) {

        Gato gato = new Gato();
        Dog dog = new Dog();

            while (true) {
                String nomeGato = JOptionPane.showInputDialog("Digite o nome do gato:");
                if (!(nomeGato.isEmpty())) {
                    gato.setNome(nomeGato);
                    break;   
                }
            }
                
            while (true) {
                String nomeCachorro = JOptionPane.showInputDialog("Digite o nome do dog:");
                if (!(nomeCachorro.isEmpty())) {
                    dog.setNome(nomeCachorro);
                    break;   
                }
            }
                    
        JOptionPane.showMessageDialog(null, gato.getNome() + ": " + gato.emitirSon());
        JOptionPane.showMessageDialog(null, dog.getNome() + ": " + dog.emitirSon());
    }
}
