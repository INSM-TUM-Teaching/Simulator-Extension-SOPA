package cost_driver;

public abstract class costDriver  {
    protected String id;

    public costDriver(String id){
        this.id = id;
    }

    public String getId() {
        return id;
    }
}