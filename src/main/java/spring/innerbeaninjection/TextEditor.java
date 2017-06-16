package spring.innerbeaninjection;


public class TextEditor {

    private SpellChecker spellChecker;

    // SETTER METHOD to inject the dependency.
    public void setSpellChecker(SpellChecker spellChecker) {
        System.out.println("Inside setSpellChecker METHOD." );
        this.spellChecker = spellChecker;
    }

    // GETTER METHOD to return spellChecker
    public SpellChecker getSpellChecker() {
        System.out.println("Inside getSpellChecker METHOD." );
        return spellChecker;
    }

    public void spellCheck() {
        System.out.println("Inside spellCheck METHOD." );
        spellChecker.checkSpelling();
    }
}
