public abstract class Mammals extends Animals {
    private final String livingEnvironment;
    private double movementSpeed;
    public Mammals(String nickname, int age, String livingEnvironment, double movementSpeed) {
        super(nickname, age);
        if (livingEnvironment == null || livingEnvironment.isEmpty()){
            this.livingEnvironment = "default";
        } else {
            this.livingEnvironment = livingEnvironment;
        }
        if (movementSpeed <= 0){
            this.movementSpeed = 1;
        }else {
            this.movementSpeed = movementSpeed;
        }
    }
    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public double getMovementSpeed() {
        return movementSpeed;
    }
    public abstract void walk();
}
