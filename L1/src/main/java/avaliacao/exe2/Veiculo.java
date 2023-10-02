package avaliacao.exe2;

/**
 *SuperClasse
 * @author jrica
 */
public abstract class Veiculo {
    
    protected String marca;
    protected String modelo;
    protected int ano;

    public Veiculo(String marca, String modelo, int ano) {
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setAno(ano);
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public final void setMarca(String marca) {
        this.marca = marca;
    }

    public final void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public final void setAno(int ano) {
        this.ano = ano;
    }

    public void ligar() {
        System.out.println("O veículo "+ this.marca + ", " + this.modelo +" está ligado.");
    }

    public void desligar() {
        System.out.println("O veículo " + this.marca + ", " + this.modelo +" está desligado.");
    }

    @Override
    public String toString() {
        return "Veiculo{" + "marca= " + marca + ", modelo= " + modelo + ", ano=" + ano + '}';
    }
    
}

    

