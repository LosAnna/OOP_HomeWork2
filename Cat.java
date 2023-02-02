public final class Cat {
    private final String name;
    private final String breed;

    public Cat(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }
    public void sayInfo() {
        System.out.printf("Кошку зовут %s, порода %s", this.name, this.breed);
    }
}