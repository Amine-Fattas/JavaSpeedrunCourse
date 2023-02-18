package oop.e_interfaces;


import java.util.ArrayList;
import java.util.Arrays;

//Example Galerie Photo/Video

class DataObject {
    @Override
    public String toString() {
        return "Hello I am an Data Object";
    }
}
class DataBaseManager {

    private ControllerDelegate controllerDelegate;
    private ArrayList<DataObject> data = new ArrayList<>(Arrays.asList(
            new DataObject(),
            new DataObject()
    ));

    DataBaseManager(ControllerDelegate controllerDelegate){
        this.controllerDelegate = controllerDelegate;
    }
    void getDataObjects(){
        controllerDelegate.printDataBaseObject(data);
    }
}

interface ControllerDelegate {
    void printDataBaseObject(ArrayList<DataObject> dataObjects);
}

class Controller implements ControllerDelegate {

    @Override
    public void printDataBaseObject(ArrayList<DataObject> dataObjects) {
        System.out.println(dataObjects.toString());
    }
}


class Delegation {
    public static void main(String[] args) {
        Controller controller = new Controller();
        DataBaseManager dataBaseManager = new DataBaseManager(controller);

        dataBaseManager.getDataObjects();

    }
}