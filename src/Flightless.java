public class Flightless extends Birds {
    private String typeOfMovement; // тип передвижения
    public Flightless(String nickname, int age, String livingEnvironment, String typeOfMovement) {
        super(nickname, age, livingEnvironment);
        if (typeOfMovement == null || typeOfMovement.isEmpty()){
            this.typeOfMovement = "default";
        } else {
            this.typeOfMovement = typeOfMovement;
        }
    }
    @Override
    public void huntBirds() {
        System.out.println("Охотиться на на мелких насекомых (для птиц додо). \n" +
                "Охотиться на насекомых павлинам. Охотиться на рыб пингвинам");
    }
    public void walk(){
        System.out.println("Гулять в безопасном месте, где нет хищников");
    }
    @Override
    public String toString() {
        return "Название птицы - " + getNickname() + ", возраст птицы - " + getAge() +
                ", среда обитания - " + getLivingEnvironment() + ", тип передвижения - " + getTypeOfMovement();
    }
    public String getTypeOfMovement() {
        return typeOfMovement;
    }
    @Override
    public void eat() {
        System.out.println("Есть насекомых пингвину. Есть насекомых птице Додо и павлину");
    }
    @Override
    public void sleep() {
        System.out.println("Спать в укрытиях");
    }
    @Override
    public void moveAround() {
        System.out.println("Перемещаться тихо и быстро");
    }
}

