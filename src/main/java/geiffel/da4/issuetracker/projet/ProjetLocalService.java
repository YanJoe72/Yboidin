package geiffel.da4.issuetracker.projet;

import geiffel.da4.issuetracker.issue.Issue;
import geiffel.da4.issuetracker.utils.LocalService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
@Qualifier("local")
public class ProjetLocalService extends LocalService<Projet, Long> implements ProjetService {
    public ProjetLocalService(List<Projet> projets) { super(projets);}

    @Override
    protected String getIdentifier() {
        return "id";
    }


    @Override
    public List<Projet> getAll() {
        return super.getAll();
    }

    @Override
    public Projet getById(Long id) {
        IndexAndValue<Projet> found = this.findByProperty(id);
        return found.value();
    }
}
