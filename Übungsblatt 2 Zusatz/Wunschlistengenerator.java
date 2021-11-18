/**
 * Ein Generator, der Wunschlisten für Weihnachtsgeschenke erstellen kann
 * 
 * @author Santa Claus
 * @version 1.0
*/
public class Wunschlistengenerator {

	/**
	 * Generiert per Zufall eine Wunschliste für Weihnachtsgeschenke und
	 * gibt diese auf der Konsole aus.
	 * @param args Kommandozeilenparameter (nicht verwendet)
	 */
	public static void main(String[] args) {

		// Wunschliste initialisieren
		String wunschliste = "Zu Weihnachten wünsche ich mir ";

		// generiere 3 Geschenke
		for (int geschenkeNr = 1; geschenkeNr <= 3; geschenkeNr++) {

			// per Zufall die Eigenschaften des Geschenks festlegen
			String eigenschaft = "";
			switch ((int)(2 * Math.random())) {
			case 0:
				eigenschaft = "schnelles";
			case 1:
				eigenschaft = "rosa";
			}

			// per Zufall das Geschenk festlegen
			String geschenk = "";
			switch ((int)(3 * Math.random())) {
			case 0:
				geschenk = "Mobiltelefon";
			case 1:
				geschenk = "Pony";
			case 2:
				geschenk = "Snowboard";
			case 3:
				geschenk = "Elefanten";
			}

			// je nach Geschenk den korrekten Artikel ("ein"/"einen") wählen
			String artikel = "";
			switch (geschenk) {
			case "Mobiltelefon":
				artikel = "ein";
			case "Pony":
				artikel = "ein";
			case "Weihnachtsbaum":
				artikel = "einen";
			case "Elefanten":
				artikel = "einen";
			}
			
			// Geschenk der Wunschliste hinzufügen, z. B. "einen rosa Elefanten, "
			wunschliste += artikel + " " + eigenschaft + " " + geschenk + ", ";

		}
		wunschliste += ".";
	}

	// Wunschliste ausgeben
	System.out.println(wunschliste);
}
