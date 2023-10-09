/**
 * The class for apple model
 */ 
public class AppleModel { 
    private String color; 
    private String type; 
    private int weight; 
    private boolean ripe; 
    private int juice = 10; 
    private boolean rotten = false;
}

public void setColor(String color){ 

    if (color.toLowerCase() == "red" || )
}

/** 
 * Set the give weight 0++ to 3
 * 
 * @param weight
 */


public void setWeight(int weight){ 
    if (weight >= 0 && weight <= 3){ 
        this.weight = weight;
    }
}

public void setRipe(boolean ripe){ 
    this.ripe = ripe;
}