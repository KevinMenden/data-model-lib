package life.qbic.datamodel.services;

public class Person {

  private String firstName
  private String lastName
  private String email

  public Person(String first, String last, String email) {
    this.firstName = first
    this.lastName = last
    this.email = email
  }

  String getFirstName() {
    return firstName
  }

  String getLastName() {
    return lastName
  }
  
  String getEMail() {
    return email
  }
}
