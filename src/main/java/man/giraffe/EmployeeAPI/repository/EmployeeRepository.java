package man.giraffe.EmployeeAPI.repository;

import man.giraffe.EmployeeAPI.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}