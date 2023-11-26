package com.example.Subject;

import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class SubjectServiceImpl implements SubjectService {
    private static final int MAXIMUM_SUBJECT_COUNT = 6;
    private final SubjectRepository SubjectRepository;

    public SubjectServiceImpl(SubjectRepository SubjectRepository) {
        this.SubjectRepository = SubjectRepository;
    }

    @Override
    public List<SubjectDto> findAll() {
        return SubjectRepository.findAll();
    }

    @Override
    public SubjectDto getById(Long id) {
        return SubjectRepository.getById(id);
    }

    @Override
    public Long save(SubjectDto SubjectsDto) {
        if (SubjectRepository.findAll().size() >= MAXIMUM_SUBJECT_COUNT) {
            throw new TooMuchSubjectException();
        }
        return SubjectRepository.save(SubjectsDto);
    }

    @Override
    public void deleteById(Long id) {
        SubjectRepository.deleteById(id);
    }
}
