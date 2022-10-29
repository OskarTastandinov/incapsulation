import java.util.Objects;

public class Herbivores extends Mammals{ // травоядные
    private final String typeFood; // тип пищи

    public String getTypeFood() {
        return typeFood;
    }

    public Herbivores(String nickname, int age, String livingEnvironment, double movementSpeed, String typeFood) {
        super(nickname, age, livingEnvironment,movementSpeed);
        if (typeFood == null || typeFood.isEmpty()){
            this.typeFood = "default";
        }else {
            this.typeFood = typeFood;
        }
    }
    public void graze(){                                        // метод пастись
        System.out.println("Пастись на открытой местности, чтобы следить за хищниками");
    }
    @Override
    public final void eat() {                                          // метод кушать
        System.out.println("Кушать траву и пить воду у водопоя");
    }
    @Override
    public void sleep() {                                          // метод спать
        System.out.println("Спать стадом");
    }
    @Override
    public void moveAround() {                             // метод перемещаться
        System.out.println("Перемещаться стадом");
    }
    @Override
    public void walk() {                                  //  метод гулять
        System.out.println("Гулять только стадом, на открытой местности");
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
        Herbivores that = (Herbivores) o;
        return Objects.equals(typeFood, that.typeFood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(typeFood);
    }

}

