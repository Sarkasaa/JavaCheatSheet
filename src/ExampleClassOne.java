public class ExampleClassOne { // public: verfügbar für jede andere Klasse und Package

    int exampleInt = 4; // long, int, short, char, byte, double, float, boolean: native Types: Typen, die keine Klassen oder Objekte sind

    public static void main(String[] args) { // static: kann ohne Instanz aufgerufen werden, bzw. kann auch nicht als Instanz aufgerufen werden
        // ist die Hauptmethode, wird aufgerufen, wenn das Programm startet

        ExampleClassOne exampleInstance; // neue Variable des Typen ExampleClassOne

        exampleInstance = new ExampleClassOne(); // Instanzierung eines Objekts der Klasse ExampleClassOne

        int resultInt = exampleInstance.privateExampleMethod(exampleInstance.exampleInt); // Lokale Variable, da sie in einer Methode definiert wird

        System.out.println(resultInt);

        System.out.println(ExampleEnum.RED.colorHex);

    }

    private int privateExampleMethod(int integer) { // private: kann nur in dieser Klasse aufgerufen werden; int: ist der return-type der Methode

        integer++; // das gleiche wie integer = integer + 1;

        return integer; // return: muss return-type matchen
    }

    protected String protectedExampleMethod() { // protected: kann nur in dieser Klasse, in sub-Klassen und gleichen Package aufgerufen werden

        return "this is a string";
    }
}
