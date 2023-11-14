package geiffel.da4.issuetracker.commentaire;

import geiffel.da4.issuetracker.issue.Issue;
import geiffel.da4.issuetracker.user.User;

public class Commentaire {
    private Long id;
    private User author;
    private Issue issue;
    private String contenu;

    public Commentaire(Long id, User author, Issue issue, String contenu) {
        this.id = id;
        this.author = author;
        this.issue = issue;
        this.contenu = contenu;
        //this.author.addCommentaire(this);
      //  this.issue.addCommentaire(this);

    }

    public Commentaire() {
    }

    public Long getAuthorId(){
        return this.author.getId();
    }
    public Long getIssueCode() {
        return this.issue.getCode();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public Issue getIssue() {
        return issue;
    }

    public void setIssue(Issue issue) {
        this.issue = issue;
    }

    public String getContenu() {
        return contenu;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }


}
