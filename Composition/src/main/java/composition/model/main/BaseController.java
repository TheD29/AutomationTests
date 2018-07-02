package composition.model.main;

public abstract class BaseController {


    protected BaseModel actions;


    public void setUp() {
        actions = new BaseModel();
    }

}
