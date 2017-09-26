/** This class is only for inheritance purposes **/

public abstract class User{

  private int id; // the unique id of the user
  private String firstName;
  private String lastName;

  /**
    Constructor
    Initializes all fields to null
  **/
  public User(){
    this.id = 0;
    this.firstName = null;
    this.lastName = null;
  }

  /**
    Constructor
    Initializes all fields to passed values
    @param aId assigns the users id
    @param aFirstName assigns the users firstName
    @param aLastName assigns the users lastName
  **/
  public User(int aId, String aFirstName, String aLastName){
    this.id = aId;
    this.firstName = aFirstName;
    this.lastName = aLastName;
  }

  /**
    Setter
    @param aId assigns the user id
  **/
  public void setId(int aId){
    this.id = aId;
  }

  /**
    Getter
    @return the id of the target user
  **/
  public int getId(){
    return this.id;
  }

  /**
    Setter
    @param aFirstName assigns the users firstName
  **/
  public void setFirstName(String aFirstName){
    this.firstName = aFirstName;
  }

  /**
    Getter
    @return the firstName of the target user
  **/
  public String getFirstName(){
    return this.firstName;
  }

  /**
    Setter
    @param aLastName assigns the users lastName
  **/
  public void setLastName(String aLastName){
    this.lastName = aLastName;
  }

  /**
    Getter
    @return the lastName of the target user
  **/
  public String getLastName(){
    return this.lastName;
  }
}
