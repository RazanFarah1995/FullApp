package com.example.Subject;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.util.Objects;
@Data
public class SubjectDto {
    @NotNull
    private Long id;
    @NotNull
    @NotBlank
    private String name;

    private Integer degree;



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

