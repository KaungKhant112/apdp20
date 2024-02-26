package CompositePattern;

public class CompositePatternDemo {
    public static void main(String[] args) {
        Employee ceo=new Employee("Mr. Kelvin", "CEO", 4000000);
        Employee hMarket=new Employee("Ms. Marry", "Marketing head", 2000000);
        Employee hSales=new Employee("Ms. Catherine", "Sales Head", 2000000);
        Employee clerk1=new Employee("Mr. Andrew", "Marketing clerk", 1000000);
        Employee clerk2=new Employee("Mr. Robet", "Market clerk", 1000000);
        Employee salesRep1=new Employee("Mr. David", "sales representative", 1000000);
        Employee salesRep2=new Employee("Mr. Obama", "sales representative", 1000000);
        ceo.addSubordinate(hMarket);
        ceo.addSubordinate(hSales);
        hMarket.addSubordinate(clerk1);
        hMarket.addSubordinate(clerk2);
        hSales.addSubordinate(salesRep1);
        hSales.addSubordinate(salesRep2);
        System.out.println(ceo);
        System.out.println("CEO Subordinates");
        for (Employee head: ceo.getSubordinates())
        {
            System.out.println(head);
            System.out.println();
            System.out.println("Employee of head");
            for (Employee clerkorSaleRep: head.getSubordinates())
            {
                System.out.println(clerkorSaleRep);

            }
            System.out.println();
        }

    }
}
