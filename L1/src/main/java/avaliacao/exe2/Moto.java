package avaliacao.exe2;

/**
 *SubClasse
 * @author jrica
 */
class Moto extends Veiculo {
    private boolean possuiPartidaEletrica;

    public Moto(String marca, String modelo, int ano, boolean possuiPartidaEletrica) {
        super(marca, modelo, ano);
        this.setPossuiPartidaEletrica(possuiPartidaEletrica);
    }

    public boolean possuiPartidaEletrica() {
        return possuiPartidaEletrica;
    }

    public final void setPossuiPartidaEletrica(boolean possuiPartidaEletrica) {
        this.possuiPartidaEletrica = possuiPartidaEletrica;
    }

    public void empinar() {
        System.out.println("A moto está empinando.");
    }

    @Override
    public String toString() {
        return "Moto{" + "possuiPartidaEletrica=" + possuiPartidaEletrica + super.toString() + '}';
    }
    
    
}
