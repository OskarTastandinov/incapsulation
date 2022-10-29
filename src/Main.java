public class Main {
    public static void main(String[] args){
        task1();
        System.out.println();
        task2();
        System.out.println();
        task3();
        System.out.println();
        task4();
        System.out.println();
        task5();
        System.out.println();
    }
    public static void task1(){
        Herbivores gasel = new Herbivores("Газель Маша", 5,
                "\nРоссия", 15, "Трава у дома");
        System.out.println(gasel.toString());
        gasel.eat();
        gasel.sleep();
        gasel.moveAround();
        gasel.walk();
        gasel.graze();
        System.out.println();
        Herbivores giraffe = new Herbivores("Жираф Мэлман", 10,
                "Нью-Йоркский зоопарк", 1, "\nХавка с Нью-Йоркского зоопарка");
        System.out.println(giraffe.toString());
        giraffe.eat();
        giraffe.sleep();
        giraffe.moveAround();
        giraffe.walk();
        giraffe.graze();
        System.out.println();
        Herbivores horse = new Herbivores("Конь Юлий", 10,
                "\nКиевская Русь, город Киев", 50, "Вкусняшки со шведского стола князя киевского Владимира");
        System.out.println(horse.toString());
        giraffe.eat();
        giraffe.sleep();
        giraffe.moveAround();
        giraffe.walk();
        giraffe.graze();

        System.out.println(gasel.equals(giraffe));
        System.out.println(gasel.equals(horse));
        System.out.println(horse.equals(giraffe));
        System.out.println(gasel.hashCode());
    }
    public static void task2(){
        Predators hyena = new Predators("Гиена Танюха", 20,
                "\nАфрика", 25, "Мясо млекопитающих и всякая падаль");
        System.out.println(hyena.toString());
        hyena.eat();
        hyena.sleep();
        hyena.moveAround();
        hyena.walk();
        hyena.hunt();
        System.out.println();
        Predators tiger = new Predators("Тигр Шерхан", 25,
                "\nДальний восток", 50, "Мясо млекопитающих");
        System.out.println(tiger.toString());
        tiger.eat();
        tiger.sleep();
        tiger.moveAround();
        tiger.walk();
        tiger.hunt();
        System.out.println();
        Predators bear = new Predators("Медведь Михаил", 30,
                "\nРоссия", 60, "\nМясо млекопитающих и всякую падаль и еще ягоды и коренья леса");
        System.out.println(bear.toString());
        bear.eat();
        bear.sleep();
        bear.moveAround();
        bear.walk();
        bear.hunt();

        System.out.println(bear.equals(tiger));// вывод метода equals
        System.out.println(bear.equals(hyena));// вывод метода equals
        System.out.println(tiger.equals(hyena));// вывод метода equals
    }
    public static void task3() {
        Amphibians frog = new Amphibians("Лягушка Анна", 2, "Воронежское водохранилище");
        System.out.println(frog.toString());
        frog.eat();
        frog.sleep();
        frog.moveAround();
        frog.huntForUs();
        System.out.println();
        Amphibians alreadyFreshwater = new Amphibians("Уж пресноводный", 1, "река Лена");
        System.out.println(alreadyFreshwater.toString());
        alreadyFreshwater.eat();
        alreadyFreshwater.sleep();
        alreadyFreshwater.moveAround();
        alreadyFreshwater.huntForUs();
        System.out.println(frog.equals(alreadyFreshwater)); // вывод метода equals
    }
    public static void task4(){
        Flightless peacock = new Flightless("Павлин Иван", 5,"Зоопарк г. Москвы", " С помощью лапок");
        System.out.println(peacock.toString());
        peacock.huntBirds();
        peacock.eat();
        peacock.moveAround();
        peacock.walk();
        System.out.println();
        Flightless penguin = new Flightless("Пингвин Иван", 6,"Зоопарк г. Москвы", " С помощью лапок");
        System.out.println(penguin.toString());
        penguin.huntBirds();
        penguin.eat();
        penguin.moveAround();
        penguin.walk();
        System.out.println();
        Flightless dodoBird = new Flightless("Додо Иван", 4,"Зоопарк г. Москвы", " С помощью лапок");
        System.out.println(dodoBird.toString());
        dodoBird.huntBirds();
        dodoBird.eat();
        dodoBird.moveAround();
        dodoBird.walk();

        System.out.println(dodoBird.equals(penguin));// вывод метода equals
        System.out.println(dodoBird.equals(peacock));// вывод метода equals
        System.out.println(peacock.equals(penguin));// вывод метода equals
    }
    public static void task5(){
        Flying seagull = new Flying("Чайка Валя", 3, "Скалы у моря", "с помощью крыльев");
        System.out.println(seagull.toString());
        seagull.huntBirds();
        seagull.eat();
        seagull.moveAround();
        seagull.fly();
        System.out.println();
        Flying albatross = new Flying("Альбатрос Валя", 2, "Скалы у моря", "с помощью крыльев");
        System.out.println(albatross.toString());
        albatross.huntBirds();
        albatross.eat();
        albatross.moveAround();
        albatross.fly();
        System.out.println();
        Flying falcon = new Flying("Сокол Валя", 1, "Скалы у моря", "с помощью крыльев");
        System.out.println(falcon.toString());
        falcon.huntBirds();
        falcon.eat();
        falcon.moveAround();
        falcon.fly();

        System.out.println(seagull.equals(albatross));// вывод метода equals
        System.out.println(seagull.equals(falcon));// вывод метода equals
        System.out.println(falcon.equals(albatross));// вывод метода equals

    }

}

