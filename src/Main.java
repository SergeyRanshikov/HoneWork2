public class Main {
    public static void main(String[] args) {
        System.out.println("Привет, Мир!");
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);
        var friend = 19;
        System.out.println(friend);
        friend = friend * 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var totalWeight = boxer1 + boxer2;
        System.out.println("Общий вес боксеров " + totalWeight + "кг.");
        var weightDifference = boxer2 - boxer1;
        System.out.println("Разница между весами боксеров " + weightDifference + "кг.");
        var weightDifference2 = (boxer1 + boxer2) % boxer1;
        System.out.println("Разница между весами боксеров 2 вариант расчета " + weightDifference2 + "кг.");
        var totalTime = 640;
        var time1 = 8;
        var amountOfWorkers = totalTime / time1;
        System.out.println("Всего работников в компании " + amountOfWorkers + " человек");
        amountOfWorkers = amountOfWorkers + 94;
        var totalTime2 = amountOfWorkers * time1;
        System.out.println("Если в компании работает " + amountOfWorkers + " человек, то всего " + totalTime2 + " часов работы может быть поделено между сотрудниками");

    }
}