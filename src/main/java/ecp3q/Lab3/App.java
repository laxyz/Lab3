package ecp3q.Lab3;
public class App extends ArraysList {
	
    public static void main( String[] args )
    {
    	App app = new App();
    	//Remove even number
    	System.out.print("Remove even => ");
    	app.removeEven();
    	System.out.println(app.toString());
    	
    	//Add First
    	System.out.print("Add first => ");
    	app.addFirst(5);
    	System.out.println(app.toString());
    	
    	//Add Last
    	System.out.print("Add last => ");
    	app.addLast(6);
    	System.out.println(app.toString());
    }
}
