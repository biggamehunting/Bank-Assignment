package bank.assignment.resource;

import bank.assignment.model.Branch;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import bank.assignment.service.BranchService;

import java.util.List;

@RestController
@RequestMapping("/bank")
public class BranchResource {
    private final BranchService branchService;

    public BranchResource(BranchService branchService) {
        this.branchService = branchService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Branch>> getAllBranchs () {
        List<Branch> branches = branchService.findAllBranchs();
        return new ResponseEntity<>(branches, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Branch> getBranchById (@PathVariable("id") Long id) {
        Branch branch = branchService.findBranchById(id);
        return new ResponseEntity<>(branch, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Branch> addBranch(@RequestBody Branch branch) {
        Branch newBranch = branchService.addBranch(branch);
        return new ResponseEntity<>(newBranch, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Branch> updateBranch(@RequestBody Branch branch) {
        Branch updateBranch = branchService.updateBranch(branch);
        return new ResponseEntity<>(updateBranch, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteBranch(@PathVariable("id") Long id) {
        branchService.deleteBranch(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
