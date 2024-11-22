package patterns.structural.flyweight;

public class FormattedCharacter implements CustomerCharacter {
    private char character;

    public FormattedCharacter(char character) {
        this.character = character;
    }

    @Override
    public void display(String font, int size, String color) {
        System.out.println("Carattere" + character + " con font " + font + " di dimensione " + size + " e colore " + color);
    }
}
