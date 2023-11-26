package com.example.Subjecteureka;

import java.util.List;

public interface SubjectService {
    List<SubjectDto> findAll();
    SubjectDto getById(Long id);
    Long save(SubjectDto SubjectDto);
    void deleteById(Long id);
}
