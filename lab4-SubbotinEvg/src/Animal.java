public class Animal implements Nameable{
    private final String genus;
    private final String family;
    private String nickname;

    public Animal(String genus, String family) {
        this(genus, family, "");
    }

    public Animal(String genus, String family, String nickname) {
        this.genus = genus;
        this.family = family;
        this.nickname = nickname;
    }

    @Override
    public String getName() {
        return !nickname.equals("")
                ?nickname
                :"Род - " + genus + ", семейство - " + family;
    }

    public String getGenus() {
        return genus;
    }

    public String getFamily() {
        return family;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "genus='" + genus + '\'' +
                ", family='" + family + '\'' +
                ", nickname='" + nickname + '\'' +
                '}';
    }
}
