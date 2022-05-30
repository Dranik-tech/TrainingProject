import java.util.Calendar;
import java.util.Objects;

public class House {
    private int id;
    private int apartmentNumber;
    private double square;
    private int floor;
    private int roomNumber;
    private String street;
    private String buildingType;
    private int lifeTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getApartmentNumber() {
        return apartmentNumber;
    }

    public void setApartmentNumber(int apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getBuildingType() {
        return buildingType;
    }

    public void setBuildingType(String buildingType) {
        this.buildingType = buildingType;
    }

    public int getLifeTime() {
        return lifeTime;
    }

    public void setLifeTime(int lifeTime) {
        this.lifeTime = lifeTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        House house = (House) o;
        return id == house.id && apartmentNumber == house.apartmentNumber && Double.compare(house.square, square) == 0 && floor == house.floor && roomNumber == house.roomNumber && lifeTime == house.lifeTime && Objects.equals(street, house.street) && Objects.equals(buildingType, house.buildingType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, apartmentNumber, square, floor, roomNumber, street, buildingType, lifeTime);
    }

    @Override
    public String toString() {
        return "House{" +
                "id=" + id +
                ", apartmentNumber=" + apartmentNumber +
                ", square=" + square +
                ", floor=" + floor +
                ", roomNumber=" + roomNumber +
                ", street='" + street + '\'' +
                ", buildingType='" + buildingType + '\'' +
                ", lifeTime=" + lifeTime +
                '}';
    }

    public House(int id) {
        this.id = id;
    }

    public House(int id, int apartmentNumber, double square) {
        this.id = id;
        this.apartmentNumber = apartmentNumber;
        this.square = square;
    }

    public House(int id, int apartmentNumber, double square, int floor, int roomNumber, String street, String buildingType, int lifeTime) {
        this.id = id;
        this.apartmentNumber = apartmentNumber;
        this.square = square;
        this.floor = floor;
        this.roomNumber = roomNumber;
        this.street = street;
        this.buildingType = buildingType;
        this.lifeTime = lifeTime;
    }
    
}
