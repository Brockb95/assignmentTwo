public class Employee extends User{

  private int socialSecurityNumber;
  private float monthlySalary;
  private int accountNumber;

  /**
    Constructor
    Sets all fields to 0
  **/
  public Employee(){
    this.socialSecurityNumber = 0;
    this.monthlySalary = 0;
    this.accountNumber = 0;
  }

  /**
    Constructor
    @param aSSN assigns the Employee socialSecurityNumber
    @param aMonthlySalary assigns the Employee monthlySalary
    @param aAccountNumber assigns the Employee accountNumber
  **/
  public Employee(int aSSN, float aMonthlySalary, int aAccountNumber){
    this.socialSecurityNumber = aSSN;
    this.monthlySalary = aMonthlySalary;
    this.accountNumber = aAccountNumber;
  }

  /**
    Setter
    @param aSSN assigns the Employee socialSecurityNumber
  **/
  public void setSocialSecurityNumber(int aSSN){
    this.socialSecurityNumber = aSSN;
  }

  /**
    Getter
    @return the socialSecurityNumber of the target Employee
  **/
  public int getSocialSecurityNumber(){
    return this.socialSecurityNumber;
  }

  /**
    Setter
    @param aMonthlySalary assigns the monthlySalary of the target Employee
  **/
  public void setMonthlySalary(float aMonthlySalary){
    this.monthlySalary = aMonthlySalary;
  }

  /**
    Getter
    @return the monthlySalary of the target Employee
  **/
  public float getMonthlySalary(){
    return this.monthlySalary;
  }

  /**
    Setter
    @param aAccountNumber assigns the aAccountNumber of the target Employee
  **/
  public void setAccountNumber(int aAccountNumber){
    this.accountNumber = aAccountNumber;
  }

  /**
    Getter
    @return the accountNumber of the target Employee
  **/
  public int getAccountNumber(){
    return this.accountNumber;
  }
}
