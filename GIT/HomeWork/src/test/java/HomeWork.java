import org.testng.annotations.Test;

import java.util.Arrays;

public class HomeWork {
@Test
     public void homeWork(){
         String[] phoneModels = {"Nokia 1100", "Siemens C40", "Motorola RZR", "SonyEricsson WalkMan", "LG Optimus One"};

         System.out.println(Arrays.toString(phoneModels));
         System.out.println(Arrays.toString(phoneModels).substring(1, 11));


     }
}
