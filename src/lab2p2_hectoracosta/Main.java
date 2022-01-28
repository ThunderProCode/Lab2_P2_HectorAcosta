package lab2p2_hectoracosta;

import java.util.ArrayList;
import javax.swing.JOptionPane;

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
    
    public static void mainMenu(){
        
        int opt =  Integer.parseInt(JOptionPane.showInputDialog("\"----MENU----\\n1)Crear Animal\\n2)Editar Animal\\n3)Eliminar Animal\\n4)Listar por nombre\\n5)Listar todos\\n6)Salir\\nIngrese una opcion: \""));
        switch(opt){
            case 1:
                
                break;
            case 2:
                String scientificName = JOptionPane.showInputDialog("Ingrese nombre cientifico del animal a editar: ");
                Animal animal = getAnimalByScientificName(scientificName);
                if(!animal.equals(null)){
                    editMenu(animal);
                }else{
                    JOptionPane.showMessageDialog(null, "Animal no encontrado");
                }
                break;
            case 3:
                scientificName = JOptionPane.showInputDialog("Ingrese nombre cientifico del animal a eliminar: ");
                animal = getAnimalByScientificName(scientificName);
                
                if(!animal.equals(null)){
                    delete(animal);
                }else{
                    JOptionPane.showMessageDialog(null, "Animal no encontrado");
                }
                break;
            case 4:
                
                break;
            case 5:
                break;
            case 6:
                break;
        }
    }
    
    public static void editMenu(Animal animal){
        int opt = Integer.parseInt( JOptionPane.showInputDialog("----EDITAR ANIMAL----\n1)Editar un atributo:\n2)Editar todos los atributos: \nIngrese una opcion: ") );
        switch(opt){
            case 1:
                int attribute = Integer.parseInt( JOptionPane.showInputDialog("0- Nombre Cientifico\n1- Nombre Comun\n2- Habitat\n3- Alimentacion\n4- Descripcion\n5- Ubicacion geografica\n6- Vida\nIngrese una opcion: ") );
                editAtr(animal,attribute);
                break;
            case 2:
                break;
        }
    }
    
    public static void delete(Animal animal){
        animals.remove(animal);
        JOptionPane.showMessageDialog(null,"Animal eliminado");
    }
    
    public static void editAtr(Animal animal,int attribute){
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
    
    public static Animal getAnimalByScientificName(String scientificName){
        for (Animal animal : animals) {
            if(animal.getScientificName().equals(scientificName)){
                return animal;
            }
        }
        return null;
    }
    
    public static void editScientificName(Animal animal,String newScientificName){
        animal.setScientificName(newScientificName);
    }
    
    public static void editCommonName(Animal animal, String newCommonName){
        animal.setCommonName(newCommonName);
    }
    
    public static void editHabitat(Animal animal, String newHabitat){
        animal.setHabitat(newHabitat);
    }
    
    public static void editFood(Animal animal, String newFood){
        animal.setFood(newFood);
    }
    
    public static void editDescription(Animal animal, String newDescription){
        animal.setDescription(newDescription);
    }
    
    public static void editGeography(Animal animal, String newGeography){
        animal.setGeography(newGeography);
    }
    
    public static void editHp(Animal animal, int newHp){
        animal.setHp(newHp);
    }
    
}
