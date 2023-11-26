package com.example.Client;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

public class SubjectDto {
    @NotNull
    private Long id;
    @NotNull
    @NotBlank
    private String name;

    private Integer degree;

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public int getdegree() {
        return degree;
    }

    public void setdegree(Integer degree) {
        this.degree = degree;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "SubjectDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", degree='" + degree +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SubjectDto that = (SubjectDto) o;
        return id.equals(that.id) && name.equals(that.name) && degree.equals(that.degree);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, degree);
    }
}