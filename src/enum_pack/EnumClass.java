package enum_pack;

public class EnumClass {
    public static void main(String[] args) {
        Season season = Season.WINTER;

        System.out.println(season.name());
        System.out.println(season.getAvgTemperature());

        Animal cat = Animal.valueOf("CAT");

        System.out.println(cat.getTranslation());
        System.out.println(cat.ordinal());
    }
}
