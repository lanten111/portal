package com.student.portal;

import com.student.portal.domain.Student;
import com.student.portal.repository.StudentRepository;
import com.student.portal.service.StudentService;
import com.student.portal.service.impl.StudentServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class StudentServiceTest {

    private Student student;

    @Mock
    private StudentRepository studentRepository;

    private StudentServiceImpl studentService;

    @BeforeEach
    public void setUp() {
        studentService = new StudentServiceImpl(studentRepository);
        student = new Student(1L, "bruce", "wayne","1234567890",
                "9406225557081","2019");
    }

    @Test
    public void shouldReturnStudents() {
        given(studentRepository.findAll()).willReturn(Collections.singletonList(student));

        final List<Student> students = studentService.getStudents();

        assertEquals(students, students);
        verify(studentRepository, times(1)).findAll();
    }

    @Test
    public void shouldReturnStudentById() {
        final long id = 1L;
        given(studentRepository.findById(id)).willReturn(Optional.of(student));

        final Optional<Student> students = studentService.getStudent(id);

        assertNotNull(students);
        verify(studentRepository, times(1)).findById(id);
    }
}
