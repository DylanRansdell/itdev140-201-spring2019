/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package muhich_zookeeper;

/**
 *
 * @author plain
 */
abstract class Animal {
    private String type, gender, dietType, zooLocation;
    private int age, animalIdNumber;
    
    public Animal(String type, String gender, String dietType, String zooLocation,
            int age, int animalIdNumber){
        this.type = type;
        this.gender = gender;
        this.dietType = dietType;
        this.zooLocation = zooLocation;
        this.age = age;
        this.animalIdNumber = animalIdNumber;
    }
    public String move(){
        return "Animals move.";
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDietType() {
        return dietType;
    }

    public void setDietType(String dietType) {
        this.dietType = dietType;
    }

    public String getZooLocation() {
        return zooLocation;
    }

    public void setZooLocation(String zooLocation) {
        this.zooLocation = zooLocation;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAnimalIdNumber() {
        return animalIdNumber;
    }

    public void setAnimalIdNumber(int animalIdNumber) {
        this.animalIdNumber = animalIdNumber;
    }
    
}
