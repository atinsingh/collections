package com.company;

import java.util.Objects;

public class Guest {
    private int guestId;
    private String name;
    private String phone;
    private int age;

    public Guest(String name, String phone, int age) {
        this.guestId = (int)Math.random()*10000;
        this.name = name;
        this.phone = phone;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public int getAge() {
        return age;
    }

    public int getGuestId() {
        return guestId;
    }

    @Override
    public String toString() {
        return "Guest{" +
                "guestId=" + guestId +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Guest guest = (Guest) o;
        return guestId == guest.guestId && age == guest.age && Objects.equals(name, guest.name) && Objects.equals(phone, guest.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(guestId, name, phone, age);
    }
}
