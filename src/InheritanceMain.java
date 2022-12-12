public class InheritanceMain {
    public static void main(String[] args) {
        // InheritanceObject inheritanceObject = new InheritanceObject();
        Calculations calculations = new Calculations();
        Calculations calculationsWithParam = new Calculations(6, 7);
        ExtendsCalculations extendsCalculations = new ExtendsCalculations();
        System.out.println("Done");
    }
}

// {   // calculations
//      first = 0;
//     { 
//      this.first = 1;
//     }
//     {
//      this.first = 2;
//     }
// }
