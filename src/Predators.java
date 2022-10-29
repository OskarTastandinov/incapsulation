import java.util.Objects;

public class Predators extends Mammals {
    private final String typeFood; // тип пищи

    public String getTypeFood() {
        return typeFood;
    }
    public Predators(String nickname, int age, String livingEnvironment, double movementSpeed, String typeFood) {
        super(nickname, age, livingEnvironment,movementSpeed);
        if (typeFood == null || typeFood.isEmpty()){
            this.typeFood = "default";
        }else {
            this.typeFood = typeFood;
        }
    }
    public void hunt(){
        System.out.println("Охотиться на млекопитающих");
    }
    @Override
    public final void eat() {
        System.out.println("Кушать мясо и пить воду у водопоя");
    }
    @Override
    public void sleep() {
        System.out.println("Спать где хочется. За исключение медведей им положено впадать в спячку в берлоге не всю зиму");
    }
    @Override
    public final void moveAround() {
        System.out.println("Перемещаться тихо и скрытно");
    }
    @Override
    public final void walk() {
        System.out.println("Гулять где хочется");
    }
    @Override
    public String toString() {
        return "Имя млекопитающего - " + getNickname() + ", возраст животного - " + getAge() +
                ", тип пищи - " + getTypeFood() + ", cреда проживания - " + getLivingEnvironment() +
                ", cкорость перемещения - " + getMovementSpeed() + " км/ч";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Predators predators = (Predators) o;
        return Objects.equals(typeFood, predators.typeFood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(typeFood);
    }
}
