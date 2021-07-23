package coordPrac;

public class Coffee extends CaffeineBev {
    void prepareRecipe() {
        boilWater();
        brewCoffeeGrinds();
        pourInCup();
        addSugarAndMilk();
    }

    private void addSugarAndMilk() {
        System.out.println("설탕과 우유를 추가한다");
    }

    private void brewCoffeeGrinds() {
        System.out.println("필터를 활용해 커피를 내린다");
    }
}