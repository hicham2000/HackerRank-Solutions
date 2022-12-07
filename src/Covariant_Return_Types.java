import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Complete the classes below
class Flower {
    String whatsYourName(){
        return "I have many names and types.";
    }
}

class Jasmine extends Flower {
    String whatsYourName(){
        return "Jasmine";
    }
}

class Lily extends Flower{
    String whatsYourName(){
        return "Lily";
    }
}

class Region {
    Flower yourNationalFlower(){
        Flower flower = new Flower();
        return flower;
    }
}

class WestBengal extends Region{
    Jasmine yourNationalFlower(){
        Jasmine jasmine = new Jasmine();
        return jasmine;
    }
}

class AndhraPradesh extends Region{
    Lily yourNationalFlower(){
        Lily lily = new Lily();
        return lily;
    }
}
public class Covariant_Return_Types {
}
