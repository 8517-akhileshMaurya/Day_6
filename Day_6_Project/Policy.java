package Day_6_Project;

public class Policy {

    private String policyNumber;
    private String policyHolderName;
    private double premiumAmount;

    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    public String getPolicyHolderName() {
        return policyHolderName;
    }

    public void setPolicyHolderName(String policyHolderName) {
        this.policyHolderName = policyHolderName;
    }

    public double getPremiumAmount() {
        return premiumAmount;
    }

    public void setPremiumAmount(double premiumAmount) {
        this.premiumAmount = premiumAmount;
    }

    public Policy(String policyNumber , String policyHolderName , double premiumAmount){
        this.policyNumber = policyNumber;
        this.policyHolderName = policyHolderName;
        this.premiumAmount = premiumAmount;
    }

    @Override
    public String toString() {
        return   "==================" + '\n' +
                 "Policy Number = " + policyNumber + '\n' +
                 "Policy HolderName = " + policyHolderName + '\n' +
                 "Premium Amount = " + premiumAmount ;
    }
}
