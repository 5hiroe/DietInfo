package fr.shiroe.dietinfo.models;

public class KalModel {
    private final String name;
    private final String amount;

    public KalModel(String names, String amounts){
        name = names;
        amount = amounts;
    }

    public String getName() {
        return name;
    }

    public String getAmount() {
        return amount;
    }
}
