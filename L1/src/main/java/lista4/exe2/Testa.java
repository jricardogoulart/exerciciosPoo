package lista4.exe2;
public class Testa {
    
    public static void mostra (Animal objeto){
        System.out.println(objeto.toString());
        System.out.println("O/A "+objeto.getName()+ " " + objeto.move()+"\n");
    }
    
    public static void main(String[] args) {
        Snake objSnake = new Snake(true, false, "Coral", 23);
        mostra(objSnake);
        
        Horse objHorse = new Horse(true, "Mustang",28);
        mostra(objHorse);
    }
    
}
