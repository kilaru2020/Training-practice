package practice;

public class Bear {
	  String species;
	  /**
	 * @param speciesOfBear
	 */
	public Bear(String speciesOfBear) {
	    species = speciesOfBear;
	  }
	 
	  public static void main(String[] args) {
	    
		  Bear baloo = new Bear("Sloth bear"); 
	    System.out.println(baloo); // Prints: Bear@4517d9a3
	    // set object to null
	    baloo = null;
	    System.out.println(baloo); // Prints: null
	    System.out.println(baloo);
	    //aa
	    //aa
	    
	  }
	}