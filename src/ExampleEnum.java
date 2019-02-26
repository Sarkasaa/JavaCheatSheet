public enum ExampleEnum { // aufzählung von vorgefertigeten Dingen
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF);

    public int colorHex;

    ExampleEnum(int colorHex) {
        this.colorHex = colorHex;
    }
}
