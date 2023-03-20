public class FabricaMasini {
    int cod;
    String model;

    private static FabricaMasini instance;

    private FabricaMasini()
    {
        cod = 0;
        model = "";
    }

    public static FabricaMasini getInstance()
    {
        if(instance == null) {
            instance = new FabricaMasini();
            return instance;
        }
        return instance;
    }


}
