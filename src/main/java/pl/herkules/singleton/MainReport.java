package pl.herkules.singleton;

import pl.herkules.model.Component;
import pl.herkules.model.Recipe;

import java.time.DayOfWeek;
import java.util.List;
import java.util.Map;

public class MainReport {
    private List<Recipe> recipeList;
    private List<Component> shoppingList;
    private Map<DayOfWeek,List<String>> summary;

    private static MainReport instance = new MainReport();

    public static MainReport getInstance() {
        return instance;
    }

    private MainReport() {

    }

    public List<Recipe> getRecipeList() {
        return recipeList;
    }

    public void setRecipeList(List<Recipe> recipeList) {
        this.recipeList = recipeList;
    }

    public List<Component> getShoppingList() {
        return shoppingList;
    }

    public void setShoppingList(List<Component> shoppingList) {
        this.shoppingList = shoppingList;
    }

    public Map<DayOfWeek, List<String>> getSummary() {
        return summary;
    }

    public void setSummary(Map<DayOfWeek, List<String>> summary) {
        this.summary = summary;
    }

    @Override
    public String toString() {
        return "MainReport{" +
                "recipeList=" + recipeList +
                ", shoppingList=" + shoppingList +
                ", summary=" + summary +
                '}';
    }
}
