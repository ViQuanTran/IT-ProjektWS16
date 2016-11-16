package notizbuchSystem.shared;

import java.util.Date;

import notizbuchSystem.shared.bo.Freigabe;
import notizbuchSystem.shared.bo.Nutzer;

public interface ReportGenerator {
	
// habe ich die Klasse Nutzer und Freigabe richtig importiert?
	
	public void setNutzer(Nutzer nutzer);
	
//	Warum hat es ein Konstruktor? public ReportGenerator();
	

	public void init();

// Wo ist die Klasse NotizNachTitelUndDatumReport und NotizNachNutzerUndBerechtigungReport
	
	public NotizNachTitelUndDatumReport erstelleNotizNachTitelundDatumReport(Date edatum, Date mdatum, Date fdatum, String titel);
	
	public NotizNachNutzerUndBerechtigungReport erstelleNotizNachNutzerUndBerechtigungReport(Nutzer nutzer, Freigabe freigabe);
}
