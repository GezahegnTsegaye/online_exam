package com.exam.dal.repository;

import com.exam.dal.entity.Exam;
import com.exam.dal.entity.Submission;
import com.exam.dal.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface SubmissionRepository extends JpaRepository<Submission, Long> {
    List<Submission> findByStudent(User student);
    List<Submission> findByExam(Exam exam);
    Optional<Submission> findByStudentAndExam(User student, Exam exam);
}
