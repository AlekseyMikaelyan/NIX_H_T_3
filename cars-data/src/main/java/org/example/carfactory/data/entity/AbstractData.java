package org.example.carfactory.data.entity;

public abstract class AbstractData<T> {
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
