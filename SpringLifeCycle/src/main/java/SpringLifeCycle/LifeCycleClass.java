package SpringLifeCycle;

public class LifeCycleClass {
	public void init() throws Exception
    {
        System.out.println(
            "LifeCycle"
            + "instantiated"
            + "init() method");
    }
  
    public void destroy() throws Exception
    {
        System.out.println(
            "Conatiner closed "
            + "destroy() method");
    }

}
