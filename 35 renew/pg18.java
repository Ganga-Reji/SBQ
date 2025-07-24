public class Antenna {
    // Private attributes
    private int antennaid;
    private String antennaName;
    private String projectLead;
    private double antennaVSWR;

    // Parametrized constructor
    public Antenna(int antennaid, String antennaName, String projectLead, double antennaVSWR) {
        this.antennaid = antennaid;
        this.antennaName = antennaName;
        this.projectLead = projectLead;
        this.antennaVSWR = antennaVSWR;
    }

    // Getter and Setter for antennaid
    public int getAntennaid() {
        return antennaid;
    }

    public void setAntennaid(int antennaid) {
        this.antennaid = antennaid;
    }

    // Getter and Setter for antennaName
    public String getAntennaName() {
        return antennaName;
    }

    public void setAntennaName(String antennaName) {
        this.antennaName = antennaName;
    }

    // Getter and Setter for projectLead
    public String getProjectLead() {
        return projectLead;
    }

    public void setProjectLead(String projectLead) {
        this.projectLead = projectLead;
    }

    // Getter and Setter for antennaVSWR
    public double getAntennaVSWR() {
        return antennaVSWR;
    }

    public void setAntennaVSWR(double antennaVSWR) {
        this.antennaVSWR = antennaVSWR;
    }
}