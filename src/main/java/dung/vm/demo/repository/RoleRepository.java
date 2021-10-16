package dung.vm.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dung.vm.demo.entity.Role;


@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

}
