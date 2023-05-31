package aiss.GitHubMiner.controller;

import aiss.GitHubMiner.models.commit.CommitGet;
import aiss.GitHubMiner.models.issue.IssueGet;
import aiss.GitHubMiner.models.postGitMiner.Project;
import aiss.GitHubMiner.models.project.ProjectsGet;
import aiss.GitHubMiner.service.GitHubMinerService;
import aiss.GitHubMiner.service.parseToGitMiner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/github")
public class GitHubMinerController {

    @Autowired
    GitHubMinerService service;
    @Autowired
    parseToGitMiner parser;

    /* No es necesario implementar mucho más, porque en el proyecto ya viene implementado todos los datos de este,
     * además con sus issues y commits, y a su vez estos con el resto de datos necesarios.*/
    @GetMapping("/{owner}/{repository}")
    public Project findProjectByNameRepos(@PathVariable String owner, @PathVariable String repository,
                                          @RequestParam(required = false, name = "sinceDays", defaultValue = "2") Integer since,
                                          @RequestParam(required = false, name = "sinceIssues", defaultValue = "20") Integer updatedAfter,
                                          @RequestParam(required = false, name = "max_pages", defaultValue = "2") Integer maxPages){
        ProjectsGet projectsGet = service.getProject(owner, repository);
        List<CommitGet> commitGets = service.getCommits(owner, repository,since,maxPages);
        List<IssueGet> issueGets = service.getIssues(owner, repository,updatedAfter,maxPages);
        Project project = parser.parseToGitMiner(projectsGet,commitGets,issueGets);
        return project;
    }

    // Creo que está bien, pero es necesario comprobarlo.
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/{owner}/{repository}") // Guardar projectos
    public Project createProject(@PathVariable String owner, @PathVariable String repository,
                                 @RequestParam(required = false, name = "sinceDays", defaultValue = "2") Integer since,
                                 @RequestParam(required = false, name = "sinceIssues", defaultValue = "20") Integer updatedAfter,
                                 @RequestParam(required = false, name = "max_pages", defaultValue = "2") Integer maxPages){
        Project project = findProjectByNameRepos(owner, repository, since, updatedAfter,maxPages);
        Project newProject = new Project(project.getId(), project.getName(), project.getWebUrl(),
                project.getCommits(), project.getIssues());
        Project sendProject = service.postProject(newProject);
        return sendProject;
    }

    /* No hay ni update ni delete porque no se almacenan datos aquí. Eso lo implementaremos en gitminer, que es donde
     * se almacenarán y se guardarán.*/
}
