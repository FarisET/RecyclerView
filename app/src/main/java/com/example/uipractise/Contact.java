package com.example.uipractise;

public class Contact {
    private String Name;
    private String email;
    private String imageUrl;

    public Contact(String name, String email, String imageUrl) {
        Name = name;
        this.email = email;
        this.imageUrl = imageUrl;
    }

    public String getName() {
        return Name;
    }

    public String getEmail() {
        return email;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "Name='" + Name + '\'' +
                ", email='" + email + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                '}';
    }
}
