package bank.assignment.service;

import bank.assignment.exception.UserNotFoundException;
import bank.assignment.model.Branch;
import bank.assignment.repo.BranchRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class BranchService {
    private final BranchRepo branchRepo;

    @Autowired
    public BranchService(BranchRepo branchRepo) {
        this.branchRepo = branchRepo;
    }

    public Branch addBranch(Branch branch) {
        branch.setBranchCode(UUID.randomUUID().toString());
        return branchRepo.save(branch);
    }

    public List<Branch> findAllBranchs() {
        return branchRepo.findAll();
    }

    public Branch updateBranch(Branch branch) {
        return branchRepo.save(branch);
    }

    public Branch findBranchById(Long id) {
        return branchRepo.findBranchById(id)
                .orElseThrow(() -> new UserNotFoundException("User by id " + id + " was not found"));
    }

    public void deleteBranch(Long id){
        branchRepo.deleteBranchById(id);
    }
}
