package lab2p2_hectoracosta;


public class Animal {
    
    private String scientificName;

    /**
     * Get the value of scientificName
     *
     * @return the value of scientificName
     */
    public String getScientificName() {
        return scientificName;
    }

    /**
     * Set the value of scientificName
     *
     * @param scientificName new value of scientificName
     */
    public void setScientificName(String scientificName) {
        this.scientificName = scientificName;
    }

        private String commonName;

    /**
     * Get the value of commonName
     *
     * @return the value of commonName
     */
    public String getCommonName() {
        return commonName;
    }

    /**
     * Set the value of commonName
     *
     * @param commonName new value of commonName
     */
    public void setCommonName(String commonName) {
        this.commonName = commonName;
    }

    private String habitat;

    /**
     * Get the value of habitat
     *
     * @return the value of habitat
     */
    public String getHabitat() {
        return habitat;
    }

    /**
     * Set the value of habitat
     *
     * @param habitat new value of habitat
     */
    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

        private String food;

    /**
     * Get the value of food
     *
     * @return the value of food
     */
    public String getFood() {
        return food;
    }

    /**
     * Set the value of food
     *
     * @param food new value of food
     */
    public void setFood(String food) {
        this.food = food;
    }

        private String description;

    /**
     * Get the value of description
     *
     * @return the value of description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Set the value of description
     *
     * @param description new value of description
     */
    public void setDescription(String description) {
        this.description = description;
    }

        private String geography;

    /**
     * Get the value of geography
     *
     * @return the value of geography
     */
    public String getGeography() {
        return geography;
    }

    /**
     * Set the value of geography
     *
     * @param geography new value of geography
     */
    public void setGeography(String geography) {
        this.geography = geography;
    }

        private int hp;

    /**
     * Get the value of hp
     *
     * @return the value of hp
     */
    public int getHp() {
        return hp;
    }

    /**
     * Set the value of hp
     *
     * @param hp new value of hp
     */
    public void setHp(int hp) {
        this.hp = hp;
    }

    public Animal() {
    }
    
    public Animal(String scientificName, String commonName, String habitat, String food, String description, String geography, int hp) {
        this.scientificName = scientificName;
        this.commonName = commonName;
        this.habitat = habitat;
        this.food = food;
        this.description = description;
        this.geography = geography;
        this.hp = hp;
    }

    
    
}
