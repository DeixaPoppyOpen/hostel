package Domain;



import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
import javax.inject.Named;


@Named
public class User implements Serializable {


    public Date getCheckIn() {
        return checkIn;
    }


    public void setCheckIn(Date checkIn) {
        this.checkIn = checkIn;
    }


    public Date getCheckOut() {
        return checkOut;
    }


    public void setCheckOut(Date checkOut) {
        this.checkOut = checkOut;
    }

 
    public Date getReservationDate() {
        return reservationDate;
    }


    public void setReservationDate(Date reservationDate) {
        this.reservationDate = reservationDate;
    }


    public Date getBirthday() {
        return birthday;
    }


    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

 
    public Integer getNumberGuests() {
        return numberGuests;
    }


    public void setNumberGuests(Integer numberGuests) {
        this.numberGuests = numberGuests;
    }

    public String getInfo() {
        return info;
    }

  
    public void setInfo(String info) {
        this.info = info;
    }


    public double getDimensionRoom() {
        return dimensionRoom;
    }


    public void setDimensionRoom(Integer dimensionRoom) {
        this.dimensionRoom = dimensionRoom;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }


 
    private String firstName;
    private String lastName;
    private Integer age;
    private String  email;
    private String  adress;
    private Integer zipcode;
    private String country;
    private String title;
    private String city;
    private String state;
    private Date birthday;
    private Integer roomNumber;
    private double dimensionRoom;
    private String info;
    private Integer numberGuests;
    private Date reservationDate;
    private Date checkIn;
    private Date checkOut;
    
    

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

  
    public String getLastName() {
        return lastName;
    }

    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

   
    public Integer getAge() {
        return age;
    }

   
    public void setAge(Integer age) {
        this.age = age;
    }

 
    public String getEmail() {
        return email;
    }

 
    public void setEmail(String email) {
        this.email = email;
    }


    public String getAdress() {
        return adress;
    }

 
    public void setAdress(String adress) {
        this.adress = adress;
    }


    public Integer getZipcode() {
        return zipcode;
    }


    public void setZipcode(Integer zipcode) {
        this.zipcode = zipcode;
    }


    public String getCountry() {
        return country;
    }

 
    public void setCountry(String country) {
        this.country = country;
    }


    public String getTitle() {
        return title;
    }

  
    public void setTitle(String title) {
        this.title = title;
    }

    String getFirstname() {
        return firstName;
    }

   
    public String getCity() {
        return city;
    }

  
    public void setCity(String city) {
        this.city = city;
    }

  
    public String getState() {
        return state;
    }

 
    
}