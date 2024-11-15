package apksamaj.akhil.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import apksamaj.akhil.dao.User;


public interface UserRepository extends JpaRepository<User, Long> {
    // Custom query methods can be defined here if needed
}