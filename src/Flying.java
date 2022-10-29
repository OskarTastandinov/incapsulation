public class Flying extends Birds {
    private String typeOfMovement; // тип передвижения
    public Flying(String nickname, int age, String livingEnvironment, String typeOfMovement) {
        super(nickname, age, livingEnvironment);
        if (typeOfMovement == null || typeOfMovement.isEmpty()){
            this.typeOfMovement = "default";
        } else {
            this.typeOfMovement = typeOfMovement;
        }
    }
    public void huntBirds() {
        System.out.println("Охотиться на рыб для чаек и альбатросов.\n " +
                "Охотиться на мелкую живность соколу");
    }
    public void fly(){
        System.out.println("Летать над морем для чайки и альбатроса.\n " +
                "Летать над землей соколу");
    }

    public String getTypeOfMovement() {
        return typeOfMovement;
    }
    public void eat() {
        System.out.println("Есть рыбу чайки и альбатроса. Есть мелкую живность соколу");
    }
    @Override
    public void sleep() {
        System.out.println("Спать в гнездах для соколов. Спать в гнездах на скалах чайкам и альбатросу");
    }
    @Override
    public void moveAround() {
        System.out.println("Полётом");
    }

    @Override
    public String toString() {
        return "Название птицы - " + getNickname() + ", возраст птицы - " + getAge() +
                ", среда обитания - " + getLivingEnvironment() + ", тип передвижения - " + getTypeOfMovement();
    }
}

