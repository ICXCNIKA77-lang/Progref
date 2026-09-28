public class EstateAgentSales extends EstateAgent {

    public EstateAgentSales(String AgentName, double PropertyPrice) {
        super(AgentName, PropertyPrice);
    }

    public void printPropertyReport() {
        System.out.println("ESTATE AGENT REPORT ");
        System.out.println("*********************************************************");
        System.out.println("ESTATE AGENT NAME : " + AgentName);
        System.out.println("PROPERTY PRICE : " + PropertyPrice);
        System.out.println("AGENT COMMISSION : " + getAgentCommission());
    }
}
