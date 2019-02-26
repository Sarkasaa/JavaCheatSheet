public class ExampleClassTwo implements IExampleInterface { // implements: implementiert die abstrakten Methoden des Interfaces


    public ExampleClassTwo() {

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
