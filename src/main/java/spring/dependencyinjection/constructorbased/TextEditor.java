package spring.dependencyinjection.constructorbased;


public class TextEditor {

    private SpellChecker spellChecker;

    // CONSTRUCTOR
    public TextEditor( SpellChecker spellChecker ) {
        System.out.println("Inside TextEditor constructor." );
        this.spellChecker = spellChecker;
    }


    public void spellCheck() {
        System.out.println("checkSpelling METHOD called." );
        spellChecker.checkSpelling();
    }

}
