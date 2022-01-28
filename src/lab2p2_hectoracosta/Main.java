package lab2p2_hectoracosta;

import java.util.ArrayList;

public class Main {
    
    public static ArrayList<Animal> animals = new ArrayList();
    
    public static void main(String[] args) {
        
        Animal default1 = new Animal("Panthera onca","Jaguar","Selva Tropical","Carne","tigre de America","America",100);
        Animal default2 = new Animal("Felis concolor","Puma","Montaña","Carne","especie nativa de norteamerica","America",100);
        Animal default3 = new Animal("Syntheosciurus brochus","Ardilla de montaña","Montaña","Nueces","Posee una larga cola","America",50);
        
        animals.add(default3);
        animals.add(default2);
        animals.add(default1);
        
    }
    
    
    public static void delete(String scientificName){
        
        for (Animal animal : animals) {
            if(animal.getScientificName().equals(scientificName)){
                animals.remove(animal);
            }
        }
        System.out.println("Animal eliminado");
    }
    
    public static void editAtr(int attribute){
        switch(attribute){
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            default:
        }
    }
    
    public static void editScientificName(Animal animal,String newScientificName){
        animal.setScientificName(newScientificName);
    }
    
    public static void editCommonName(Animal animal, String newCommonName){
    
    }
    
    
}
