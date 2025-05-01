
public class Main {
    public static void main(String[] args) {
        
        Personaje p1 = new PersonajeFisico("Nelson",2,1.5);
        Personaje p2 = new PersonajeMagico("Paula",3,2.5);

        System.out.println("--------------------------------------");
        ((PersonajeFisico) p1).mostrarInformacion();
        System.out.println("--------------------------------------");
        ((PersonajeMagico) p2).mostrarInformacion();
        System.out.println("--------------------------------------");
    

    }
}