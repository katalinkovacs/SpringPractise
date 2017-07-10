package spring.annotation.autowired;

import org.springframework.beans.factory.annotation.Autowired;


public class TextEditor {

    private SpellChecker spellChecker;

    @Autowired
    //@Autowired(required = false)  --> turn off the default behavior
    public void setSpellChecker( SpellChecker spellChecker ){
        this.spellChecker = spellChecker;
    }

    public SpellChecker getSpellChecker( ) {
        return spellChecker;
    }

    public void spellCheck() {
        spellChecker.checkSpelling();
    }
}
