public class Main {
    public static void main(String[] args) {

        Server server = Server.getInstance();
        System.out.println(server.showStatus());


        // O  fabrica de masini care implementeaza un sistem centralizat de monitorizare a productei.
        // Sistemul trebuie sa asigure adaugarea si modificarea datelor despre masinile fabricate la niveluol sediului central,
        //intr-un mediu securizat(sistemul va exista sub forma unui server dispus in datacenter-ul din HQ).
        //Programatorii trebuie sa se asigure ca sistemul nu va putea fi replicat si ca toate datele vor fi manageriate
        //prin intermediul singurului server mentionat anterior.

        FabricaMasini.getInstance();

    }
}