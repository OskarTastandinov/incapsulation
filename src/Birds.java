public abstract class Birds extends Animals {
    private final String livingEnvironment; // среда проживания
    public Birds(String nickname, int age, String livingEnvironment) {
        super(nickname, age);
        if (livingEnvironment == null || livingEnvironment.isEmpty()){
            this.livingEnvironment = "default";
        } else {
            this.livingEnvironment = livingEnvironment;
        }
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public abstract void huntBirds();
}
