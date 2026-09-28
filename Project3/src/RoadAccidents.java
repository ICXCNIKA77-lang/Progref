public abstract class RoadAccidents implements IRoadAccidents {
    String AccidentVehicleType;
    String City;
    int AccidentTotal;

    public RoadAccidents(String AccidentVehicleType, String City, int AccidentTotal){
        this.AccidentVehicleType = AccidentVehicleType;
        this.City = City;
        this.AccidentTotal = AccidentTotal;
    }

    @Override
    public String getCity() {
        return City;
    }

    @Override
    public String getAccidentVehicleType() {
        return AccidentVehicleType;
    }

    @Override
    public int getAccidentTotal() {
        return AccidentTotal;
    }

    public abstract void printAccidentReport();


}

