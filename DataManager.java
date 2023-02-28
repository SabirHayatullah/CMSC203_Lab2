// Sabir Hayatullah


/**
 * The DataManager class should never depend on the GUI, but rather the reverse. 
 * So the DataManager methods should not use the GUI directly.  If you want data
 * to get from the user to the manager, have the GUI get the data, and call the manager 
 * with the data that the GUI got from a text field or other data structure.
 * @author Sabir Hayatullah
 *
 */
public class DataManager {
    
	DataManager() {	}
	/* Empty constructor since this class only provides
	 *  methods to retrieve data and does not store any 
	 *  instance variables.

	  This method illustrates how the GUI can interact 
	 *  with the manager to retrieve the "Hello World" string
	 */
	
	
	public String getHello() {
		return "Hello World";
	}
	
	/* This method illustrates how the GUI can interact 
	 * with the manager to retrieve the "Howdy y'all" string
	 * 
	 */

	public String getHowdy() {
		return "Howdy y'all";
	}
/*
 * This method illustrates how the GUI can interact 
 * with the manager to retrieve the "Ni hau" string
 */
	public String getChinese() {
		return "Ni hau";
	}


}
