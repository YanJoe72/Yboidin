package geiffel.da4.issuetracker.issue;

import geiffel.da4.issuetracker.exceptions.ResourceAlreadyExistsException;
import geiffel.da4.issuetracker.exceptions.ResourceNotFoundException;

import geiffel.da4.issuetracker.issue.Issue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Qualifier("jpa")
public class IssueJPAService implements IssueService {
    @Autowired
    private IssueRepository issueRepository;


    @Override
    public List<Issue> getAll() {
        return issueRepository.findAll();
    }

    @Override
    public Issue getByCode(Long code) {
        /*
        Optional<Issue> issue = issueRepository.findByCode(code);
        if (issue.isPresent()) {
            return issue.get();
        } else {
            throw new ResourceNotFoundException("User", code);
        }
        */
        return null;
    }

    @Override
    public Issue create(Issue newUser) throws ResourceAlreadyExistsException {
        return null;
    }

    @Override
    public void update(Long code, Issue updatedIssue) throws ResourceNotFoundException {

    }

    @Override
    public void delete(Long code) throws ResourceNotFoundException {

    }

}
