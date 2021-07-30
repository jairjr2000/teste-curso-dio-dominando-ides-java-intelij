package br.com.dio.model;

import java.util.Objects;

public class Cat {
    private String color;
    private String name;
    private Integer age;

    public Cat(String color, String name, Integer age) {
        this.color = color;
        this.name = name;
        this.age = age;
    }

    public Cat() {

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return Objects.equals(color, cat.color) && Objects.equals(name, cat.name) && Objects.equals(age, cat.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, name, age);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
