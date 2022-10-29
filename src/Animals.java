import java.util.Objects;
public abstract class Animals {
    private final String nickname;
    private final int age;

    public abstract void eat(); // метод кушать
    public abstract void sleep(); // метод спать
    public abstract void moveAround(); // метод перемещаться

    public Animals(String nickname, int age){
        if (nickname == null || nickname.isEmpty()){
            this.nickname = "default";
        }else {
            this.nickname = nickname;
        }
        if (age <= 0){
            this.age = 1;
        } else {
            this.age = age;
        }
    }
    public String getNickname() {
        return nickname;
    }

    public int getAge() {
        return age;
    }
}
