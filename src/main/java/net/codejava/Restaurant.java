package net.codejava;

import java.util.Objects;

public class Restaurant  {
    private String name;

    private String street;
    private int hall;
    private String cuisine;
    private int id;
    double price;
    private String nameDish;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getNameDish() {
        return nameDish;
    }

    public void setNameDish(String nameDish) {
        this.nameDish = nameDish;
    }

    public Restaurant(int id, String name, String nameDish, double price , String street, int hall, String cuisine) {
        this.id = id;
        this.name = name;
        this.nameDish = nameDish;
        this.street = street;
        this.hall = hall;
        this.cuisine = cuisine;
        this.price =price;
    }





    public Restaurant(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getHall() {
        return hall;
    }



    public String getCuisine() {
        return cuisine;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Restaurant that = (Restaurant) o;
        return hall == that.hall &&
                id == that.id &&
                Double.compare(that.price, price) == 0 &&
                Objects.equals(name, that.name) &&
                Objects.equals(street, that.street) &&
                Objects.equals(cuisine, that.cuisine) &&
                Objects.equals(nameDish, that.nameDish);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result += result * 31 + price;
        result += result * 31 + (name == null ? 0 : name.hashCode());
        result += result * 31 + (nameDish == null ? 0 : nameDish.hashCode());

        return result;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", street='" + street + '\'' +
                ", hall=" + hall +
                ", cuisine='" + cuisine + '\'' +
                ", id=" + id +
                ", price=" + price +
                ", nameDish='" + nameDish + '\'' +
                '}';
    }

    public void setHall(int hall) {
        this.hall = hall;
    }


    public void setCuisine(String cuisine) {
        this.cuisine = cuisine;
    }

    public void print(){

        System.out.print("Номер:" + id+ "\nНазвание: " + name + ", Улица: " + street + ", Зал: "+ hall  + ", Кухня: " + cuisine + ",");
        System.out.print("Фирменное блюдо: " + nameDish + " ,Цена: "+ price);

        System.out.println("\n");
    }



    public void saveObject(){
        System.out.println("Saving object ");
    }

    public void updateObject(){
        System.out.println("Updating object ");
    }

    public void removeObject(){
        System.out.println("Deleting object ");
    }

    public void loadObject(){
        System.out.println("Loading object ");
    }

}



