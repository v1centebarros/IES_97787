package pt.ua.deti.ies.lab03.ex3_2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pt.ua.deti.ies.lab03.ex3_2.models.Employee;



@Repository
public interface EmployeeRepository extends JpaRepository<pt.ua.deti.ies.lab03.ex3_2.models.Employee, Long>{

    Employee findByEmailId(String email);
}
