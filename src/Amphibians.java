public class Amphibians extends Animals {
    private final String livingEnvironment; // среда проживания
    public Amphibians(String nickname, int age, String livingEnvironment) {
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
    public static void huntForUs(){
        System.out.println("Охотиться на насекомых");
    }
    @Override
    public void eat () {
        System.out.println("Кушать насекомых");
    }
    @Override
    public void sleep () {
        System.out.println("Спать в воде");
    }
    @Override
    public void moveAround () {
        System.out.println("Перемещаться в воде и прыжками по суше. Если это уж пресноводный, то перемещаться только в воде");
    }

    @Override
    public String toString() {
        return "Название земноводного - " + getNickname() + ", возраст - " + getAge() + " год(лет), среда обитания - " + getLivingEnvironment();
    }
}
