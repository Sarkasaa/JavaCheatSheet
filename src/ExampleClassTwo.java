public class ExampleClassTwo implements IExampleInterface { // implements: implementiert die abstrakten Methoden des Interfaces


    public ExampleClassTwo() { // constructor: wird aufgerufen, sobald die Klasse instanziert wird
        System.out.println("hey it's me, the constructor");
    }

    @Override // Hinweis, dass eine Methode überschrieben wird
    public boolean abstractExampleMethod(boolean bool) {
        return !bool;
    }

    public int exampleMethodToOverride(int integer) {
        integer = integer + 4;

        return integer;
    }

}
