package avaliacao.exe1;

/**
 *CLASSE TESTE
 * @author jrica
 */
public class Testa1 {
    public static void main(String[] args) {
        
         Endereco endereco = new Endereco("Rua Dos Palmares ","Franca ","São Paulo ","14405-102 ");
         Pessoa pessoa = new Pessoa("Ricardo", "20 Anos",endereco);
         
         System.out.println(pessoa);
        
    }
    
}
