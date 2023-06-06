public class Classroom {
       public static void main(String[] args){

           Wilder firstwilder = new Wilder("Imane", true);
           Wilder secondwilder = new Wilder("Jean Paul", false);

           System.out.println(firstwilder.whoAmI());
           System.out.println(secondwilder.whoAmI());
    }
}

//Je m'appelle Imane et je suis aware
//Je m'appelle Jean Paul et je ne suis pas aware
