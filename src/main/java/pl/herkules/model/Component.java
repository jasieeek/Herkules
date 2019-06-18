package pl.herkules.model;

public class Component {
    private String name;
    private String amountGrams;
    private String amountSimple;

    public Component(String name, String amountGrams, String amountSimple) {
        this.name = name;
        this.amountGrams = amountGrams;
        this.amountSimple = amountSimple;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAmountGrams() {
        return amountGrams;
    }

    public void setAmountGrams(String amountGrams) {
        this.amountGrams = amountGrams;
    }

    public String getAmountSimple() {
        return amountSimple;
    }

    public void setAmountSimple(String amountSimple) {
        this.amountSimple = amountSimple;
    }

    @Override
    public String toString() {
        return "Component{" +
                "name='" + name + '\'' +
                ", amountGrams='" + amountGrams + '\'' +
                ", amountSimple='" + amountSimple + '\'' +
                '}';
    }
}
