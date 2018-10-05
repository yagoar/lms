package de.iteratec.swet.mitarbeiter;

/**
 * Exception für Fehler bei der Suche nach einem Mitarbeiter
 */
public class MitarbeiterNotFoundException extends Exception {
    /**
     * Erstellt die Exception.
     *
     * @param message exception message.
     */
    public MitarbeiterNotFoundException(final String message) {
        super(message, null);
    }
}
