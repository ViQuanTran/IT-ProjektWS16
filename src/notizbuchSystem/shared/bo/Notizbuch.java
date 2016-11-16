package notizbuchSystem.shared.bo;

import java.util.Vector;

public class Notizbuch extends Eintragung{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

// nicht besser Singular?
	
	private Vector<Notiz> enthalteneNotizen;
	
	public void setEnthalteneNotizen(Vector<Notiz> enthalteneNotizen){
		this.enthalteneNotizen = enthalteneNotizen;
	}
	
	public Vector<Notiz> getEnthalteneNotizen(){
		return this.enthalteneNotizen;
	}
	
	
}
