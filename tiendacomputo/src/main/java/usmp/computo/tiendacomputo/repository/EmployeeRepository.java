package usmp.computo.tiendacomputo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import usmp.computo.tiendacomputo.domain.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer>{

    
}