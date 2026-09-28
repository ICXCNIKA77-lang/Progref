public class RoadAccidentsReport extends RoadAccidents {

    public RoadAccidentsReport(String AccidentVehicleType, String City, int AccidentTotal) {
        super(AccidentVehicleType, City, AccidentTotal);
    }

    @Override
    public void printAccidentReport (){

        System.out.println("Vehicle type: " + getAccidentVehicleType());
        System.out.println("City: " + getCity());
        System.out.println("Accident Total: " + getAccidentTotal());

    }
}
