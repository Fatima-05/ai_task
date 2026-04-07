class RoomReservation {
    private int id;
    private String name;
    private int services;
    private int days;
    private double bill;
    private double tax;
    private int ranking;

    void setId(int id){ 
    this.id=id; 
    }

    void setName(String name){
        this.name=name; 
    }

    void setServices(int services){ 
        this.services=services; 
    }

    void setDays(int days){ 
        this.days=days;
    }
    void setRanking(int ranking){ 
        this.ranking=ranking; 
    }

    int getId(){ 
        return id; 
    }

    String getName(){ 
        return name; 
    }

    int getServices(){
        return services; 
    }

    int getDays(){ 
        return days; 
    }

    double getBill(){ 
        return bill; 
    }

    double getTax(){ 
        return tax;
    }

    int getRanking(){ 
        return ranking; 
    }

    void calculateBill(){
        double serviceCost=services*1000*days;
        double stayCost;
        if(days<5)
            stayCost=days*2000;
        else
            stayCost=days*1000;
        bill=serviceCost+stayCost;
    }

    void calculateTax(){
        if(bill<10000)
            tax=500;
        else
            tax=bill*0.02;
    }

    void displayInfo(){
        System.out.println("ID:"+id);
        System.out.println("Name:"+name);
        System.out.println("Services:"+services);
        System.out.println("Days:"+days);
        System.out.println("Bill:"+bill);
        System.out.println("Tax:"+tax);

        if(ranking==1)
            System.out.println("Ranking: Worst");
        else if(ranking>=2 && ranking<=4)
            System.out.println("Ranking: Medium");
        else if(ranking==5)
            System.out.println("Ranking: Best");
    }

    int fact(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) f *= i;
        return f;
    }

    boolean isArmstrong(int num) {
        int sum = 0, temp = num;
        while (temp > 0) {
            int d = temp % 10;
            sum += fact(d);
            temp /= 10;
        }
        return sum == num;
    }
}
public class Main2 {
    public static void main(String[] args) {
        RoomReservation R1 = new RoomReservation();

        R1.setId(2312);
        R1.setName("Fatu");
        R1.setServices(3);
        R1.setDays(10);
        R1.setRanking(5);
    
        R1.calculateBill();
        R1.calculateTax();
        R1.displayInfo();

        double diff = Math.abs(R1.getBill() - R1.getTax());
        System.out.println("Difference: " + diff);

        if (R1.getRanking() == 2 || R1.getRanking() == 4) {
            R1.setRanking(3);
        }

        int id = R1.getId();
        String s = String.valueOf(id);

        if (s.length() % 2 == 1) {
            char last = s.charAt(s.length() - 1);
            char mid = s.charAt(s.length() / 2);

            if (last == mid)
                System.out.println("Yes");
            else
                System.out.println("No");
        }

        if (R1.isArmstrong(id)) {
            System.out.println("Armstrong Number");

            int count = 0;
            for (int i = id - 1; i > 0 && count < 3; i--) {
                if (R1.isArmstrong(i)) {
                    System.out.println("Previous: " + i);
                    count++;
                }
            }
        }

        int n = R1.getServices();
        int value = n;

        for (int i = 1; i <= 100; i++) {
            System.out.print(value + " ");

            if (i % 3 == 0)
                value += n;
        }

    }
}