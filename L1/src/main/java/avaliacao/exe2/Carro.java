package avaliacao.exe2;

/**
 *SubClasse
 * @author jrica
 */
public class Carro extends Veiculo {
   
    private int numeroPortas;

    public Carro(String marca, String modelo, int ano, int numeroPortas) {
        super(marca, modelo, ano);
        this.setNumeroPortas(numeroPortas);
    }

    public final void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void acelerar() {
        System.out.println("O carro está acelerando.");
    }

    @Override
    public String toString() {
        return "Carro{" + "numeroPortas=" + numeroPortas + super.toString() + '}';
    }
    
}

