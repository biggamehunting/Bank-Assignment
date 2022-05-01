package bank.assignment.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import bank.assignment.model.Branch;

import java.util.Optional;

public interface BranchRepo extends JpaRepository<Branch, Long> {
    void deleteBranchById(Long id);

    Optional<Branch> findBranchById(Long id);
}
