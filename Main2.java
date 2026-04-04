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
}