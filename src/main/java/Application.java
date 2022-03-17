import org.example.animals.Kotik;

public class Application {
    public static void main(String[] args) {

        Kotik barsik = new Kotik("Barsik","Meow", 45, 5);

        Kotik sonya = new Kotik();
        sonya.setName("Sonya");
        sonya.setVoice("Mew");
        sonya.setSatiety(50);
        sonya.setWeight(4);

        String[] barsikDay = barsik.liveAnotherDay();

        for (String day: barsikDay)
        {
            System.out.println(day);
        }

        System.out.printf("Имя котика: %s. Вес: %s\n",sonya.getName(), sonya.getWeight());

        System.out.println("Одинакого ли разговаривают котики? - " + compareVoice(sonya, barsik));

        System.out.println("Создано котиков - " + Kotik.getCount());
    }
    public static boolean compareVoice(Kotik cat1, Kotik cat2){
        return cat1.equals(cat2);
    }
}
