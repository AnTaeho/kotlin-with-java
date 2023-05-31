package com.lannstark.lec13;

public class House {

  private String address;
  private LivingRoom livingRoom;

  public House(String address) {
    this.address = address;
    this.livingRoom = new LivingRoom(10);
  }

  public LivingRoom getLivingRoom() {
    return livingRoom;
  }

  public class LivingRoom {
    private double area;

    public LivingRoom(double area) {
      this.area = area;
    }

    public String getAddress() {
      return House.this.address;
    }
  }

}