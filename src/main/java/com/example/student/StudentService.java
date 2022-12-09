package com.example.student;

import org.springframework.stereotype.Service;

@Service
public class StudentService {
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public void createStudent(Student student) {
        studentRepository.save(student);
    }

    public Student getStudent(String studentId) {
        return studentRepository
                .findById(studentId)
                .orElse(null);
    }
}
