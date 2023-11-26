package com.example.Subject;

import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;


@Component
public class SubjectMemoryRepository implements SubjectRepository {
    private final List<SubjectDto> subjects= new ArrayList<>();

    public int findSubjectById(Long id) {
        int found = -1;
        for (int i = 0; i < subjects.size(); i++) {
            if (subjects.get(i).getId().equals(id)) {
                found = i;
                break;
            }
        }
        return found;
    }

    @Override
    public List<SubjectDto> findAll() {
        return subjects;
    }

    @Override
    public SubjectDto getById(Long id) {
        int subjectByIdIndex = findSubjectById(id);

        return subjectByIdIndex == -1 ? null : subjects.get(subjectByIdIndex);
    }

    @Override
    public Long save(SubjectDto subjectDto) {
        int found = findSubjectById(subjectDto.getId());

        if (found != -1) {
            SubjectDto foundSubject = subjects.get(found);
            foundSubject.setName(subjectDto.getName());
            foundSubject.setDegree(subjectDto.getDegree());

        } else {
            subjects.add(subjectDto);
        }
        return null;
    }

    @Override
    public void deleteById(Long id) {
        int found = findSubjectById(id);

        if (found != -1) {
            subjects.remove(found);
        }
    }
}
