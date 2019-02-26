public interface IExampleInterface { // kann nur abstrakte Methoden beinhalten und mehrere können von einer Klasse implementiert werden

    boolean abstractExampleMethod(boolean bool); // abstrakte Methoden haben keinen Body

    default void defaultMethod() { // Methode mit Body in einem Interface

    }

}
