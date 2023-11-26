package com.example.Subjecteureka;

import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping(path="subject")

public class SubjectController {
    private final SubjectService SubjectService;
    public SubjectController(SubjectService SubjectService) {
        this.SubjectService = SubjectService;
    }
    @GetMapping(path="", produces= MediaType.APPLICATION_JSON_VALUE)
    public List<SubjectDto> allSubjects() {
        log.info("allSubjects");
        return SubjectService.findAll();
    }
    @PostMapping(path="")
    public void newSubject(@RequestBody @Valid SubjectDto SubjectDto) {
        SubjectService.save(SubjectDto);
    }
    @PutMapping(path="/")
    public void replaceSubject(@RequestBody @Valid SubjectDto SubjectDto) {
        SubjectService.save(SubjectDto);
    }
    @DeleteMapping (path="/{id}")
    public void deleteSubject(@PathVariable("id") Long id) {
        SubjectService.deleteById(id);
    }
}
