public class Customer extends User{

  private String phoneNumber;
  private String address;

  /**
    Constructor
    Initializes all fields to null
  **/
  public Customer(){
    this.phoneNumber = null;
    this.address = null;
  }

  /**
    Constructor
    @param aPhoneNumber assigns the Customer phoneNumber
    @param aAddress assigns the Customer address
  **/
  public Customer(String aPhoneNumber, String aAddress){
    this.phoneNumber = aPhoneNumber;
    this.address = aAddress;
  }

  /**
    Setter
    @param aPhoneNumber assigns the Customer phoneNumber
  **/
  public void setPhoneNumber(String aPhoneNumber){
    this.phoneNumber = aPhoneNumber;
  }

  /**
    Getter
    @return the phoneNumber of the target Customer
  **/
  public String getPhoneNumber(){
    return this.phoneNumber;
  }

  /**
    Setter
    @param aAddress assigns the Customer address
  **/
  public void setAddress(String aAddress){
    this.address = aAddress;
  }

  /**
    Getter
    @return the address of the target Customer
  **/
  public String getAddress(){
    return this.address;
  }
}
