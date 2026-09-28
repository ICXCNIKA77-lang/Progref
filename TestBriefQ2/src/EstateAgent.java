public abstract class EstateAgent implements iEstateAgent {
    String AgentName;
    double PropertyPrice;

    public EstateAgent(String AgentName, double PropertyPrice) {
        this.AgentName = AgentName;
        this.PropertyPrice = PropertyPrice;

    }


    public String getAgentName() {
        return AgentName;
    }

     public double getPropertyPrice() {
        return PropertyPrice;
    }

    public double getAgentCommission() {
        double AgentCommission;
        AgentCommission = ((double) 20 / 100) * PropertyPrice;

        return AgentCommission;
    }
}
