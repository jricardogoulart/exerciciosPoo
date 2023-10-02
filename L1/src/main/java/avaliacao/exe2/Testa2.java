package avaliacao.exe2;
/**
 *ClasseTeste
 * @author jrica
 */
public class Testa2 {

       public static void main(String[] args) {
        Carro meuCarro = new Carro("Toyota", "Corolla", 2022, 4);
      
        meuCarro.ligar();
        meuCarro.acelerar();
        meuCarro.desligar();
        
        System.out.println(meuCarro.toString());

        Moto minhaMoto = new Moto("Honda", "CBR 1000", 2023, true);
    
        minhaMoto.ligar();
        minhaMoto.empinar();
        minhaMoto.desligar();
        
        System.out.println(minhaMoto.toString());
    }
}
    

