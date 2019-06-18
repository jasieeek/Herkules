package pl.herkules.scan;

import pl.herkules.model.Component;
import pl.herkules.model.Recipe;
import pl.herkules.singleton.MainReport;

import java.time.DayOfWeek;
import java.util.*;

public class DietScan {

    private MainReport wholeReport = MainReport.getInstance();

    public String scan(){
        List<Component> shoppingList = new LinkedList<>();
        shoppingList.add(new Component("Pietruszka", "0.1kg", "jedna srednia pietruszka"));
        shoppingList.add(new Component("Jogurt nautralny", "0.2kg", "4 lyzki stolowe"));
        wholeReport.setShoppingList(shoppingList);

        List<Recipe> recipesList = new LinkedList<>();
        List<String> recipe = new ArrayList<>();
        recipe.add("Umyj, obierz i pokroj pietruszke w kostke");
        recipe.add("Przygotowana pietruszke wrzuc do miski i polej jogurtem");
        recipesList.add(new Recipe("Pietruszka w jogurcie naturalnym", shoppingList, 20, recipe));
        wholeReport.setRecipeList(recipesList);

        Map<DayOfWeek, List<String>> summary = new LinkedHashMap<>();
        List<String> namesList = new LinkedList<>();
        namesList.add("Platki z mlekiem");
        namesList.add("Salatka grecka");
        namesList.add("Schabowy z ziemniakami");
        namesList.add("Pasta z tunczyka");
        summary.put(DayOfWeek.MONDAY, namesList);
        summary.put(DayOfWeek.TUESDAY, namesList);
        summary.put(DayOfWeek.WEDNESDAY, namesList);
        summary.put(DayOfWeek.THURSDAY, namesList);
        summary.put(DayOfWeek.FRIDAY, namesList);
        summary.put(DayOfWeek.SATURDAY, namesList);
        summary.put(DayOfWeek.SUNDAY, namesList);
        wholeReport.setSummary(summary);

        return "raport";
    }
}
