package com.example.Client;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ComplexController {
    private static final int successfulStudents= 50;
    private final SubjectClient subjectsClient;

    @GetMapping("find-all-successful-students")
    List<SubjectDto> findAllsuccessfulStudents() {
        return subjectsClient.allSubjects().stream()
                .filter(subject -> subject.getdegree() > successfulStudents)
                .toList();
    }
}
