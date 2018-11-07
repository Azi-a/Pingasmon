package ec.spec;

import org.omg.CORBA.Object;

/**A minimally enhanced version of Object, that allows for getting and setting a name.
 * Note that this is different from the .toString() method which returns a string that represents
 * the object, usually inlcuding data values / a huge String.
 * @author zayd.moosajee.1
 *
 */
public interface ObjectX extends Object 
{
	
	
	/**
	 * @param newName i mean how much more self explanatory can it get
	 */
	public void setName(String newName);
	
	
	
	/**
	 * @return name of ObjectX
	 */
	public String getName();
	
	
	
}
