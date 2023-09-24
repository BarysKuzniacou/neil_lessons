package enum_pack;

public enum Animal {
    DOG("собака"), CAT("кот"), COW("коровв");

    private String translation;

    Animal(String translation) {
        this.translation = translation;
    }

    public String getTranslation() {
        return "Перевод: " + translation;
    }
}
