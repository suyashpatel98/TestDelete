package org.domain;

import org.domain.payment.Payment;

public class User extends Person {
    int age;
    String city;

    Payment payment;

    public User(UserBuilder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.id = builder.id;
        this.city = builder.city;
    }

    /*
    Builder pattern
     */
    public static class UserBuilder {
        String name, id, city;
        int age;

        public UserBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public UserBuilder setId(String id) {
            this.id = id;
            return this;
        }

        public UserBuilder setCity(String city) {
            this.city = city;
            return this;
        }

        public UserBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public User build() {
            return new User(this);
        }
        public UserBuilder() {
        }
    }
}
