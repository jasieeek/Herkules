package pl.herkules.model;


import java.util.List;

public class Recipe {
    private String name;
    private List<Component> shoppingList;
    private int time;
    private List<String> recipe;

    public Recipe(String name, List<Component> shoppingList, int time, List<String> recipe) {
        this.name = name;
        this.shoppingList = shoppingList;
        this.time = time;
        this.recipe = recipe;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Component> getShoppingList() {
        return shoppingList;
    }

    public void setShoppingList(List<Component> shoppingList) {
        this.shoppingList = shoppingList;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public List<String> getRecipe() {
        return recipe;
    }

    public void setRecipe(List<String> recipe) {
        this.recipe = recipe;
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "name='" + name + '\'' +
                ", shoppingList=" + shoppingList +
                ", time=" + time +
                ", recipe=" + recipe +
                '}';
    }
}
