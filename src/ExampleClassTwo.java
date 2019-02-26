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

    @Override
    public String toString() { // stellt das momentane Objekt als Text dar (kann für anderes Verhalten überschrieben werden)
        return super.toString();
    }

    @Override
    public boolean equals(Object obj) { // überprüft, ob das momentane Objekt dem anderen gleicht (kann für anderes Verhalten überschrieben werden, z.B. bei Listen)
        return super.equals(obj);
    }

    @Override
    public int hashCode() { // gibt den Hashcode des momentanen Objekts zurück (quasi checksum)
        return super.hashCode();
    }
}
