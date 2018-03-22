package me.learning.spring;

public class TextEditor {
    private SpellCheck spellCheck;
    public TextEditor(SpellCheck spellCheck){
        System.out.println("inside TextEditor constructor.");
        this.spellCheck=spellCheck;
    }
    public void spellCheck(){
        spellCheck.checkSpelling();
    }
}
