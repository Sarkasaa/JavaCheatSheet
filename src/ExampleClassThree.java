public class ExampleClassThree extends ExampleClassTwo {

    @Override
    public int exampleMethodToOverride(int integer) {
        return super.exampleMethodToOverride(integer) + 3; // super: Querverweis auf die Klasse, die extended wurde (Superklasse)
    }
}
