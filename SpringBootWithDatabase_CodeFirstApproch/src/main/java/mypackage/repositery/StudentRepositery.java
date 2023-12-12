package mypackage.repositery;

import org.springframework.data.jpa.repository.JpaRepository;

import mypackage.model.*;
public interface StudentRepositery extends JpaRepository<Student, Integer> {

}
