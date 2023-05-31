# Git Repository Mining Tool
This project, developed in the course Software Architecture and Integration, aims to develop a Git repository mining tool that allows loading, processing, and analyzing data from Git projects hosted on different platforms. To achieve this, an application will be developed using a three-microservice architecture.(GitHubMiner, GitLabMiner and GitMiner).

The GitLabMiner and GitHubMiner services will focus on reading data from GitLab and GitHub, respectively, and sending it to GitMiner for storage using a common data model. GitMiner will store the data and provide it externally through a REST API for querying and analysis.


## GitLabMiner
GitLabMiner is an adapter service that reads data from the GitLab REST API and sends it to GitMiner using the appropriate data model (refer to Figure 2). In a real-world data engineering scenario, this process could occur periodically, for example, every 24 hours. In this case, the service implements a RESTful service with an operation to retrieve data from GitLab and send it to GitMiner each time it is invoked. Specifically, the operation can be invoked as follows:

## GitHubMiner
The functionality of GitHubMiner is similar to that of the previous service. However, in this case, the information is retrieved from GitHub through its REST API. 

## GitMiner

GitMiner is responsible for integrating and storing all the data in a H2 database. It implements a REST API that allows manipulation of the following resources:

  *  Projects: Implements various read and write operations to add and list projects. Among others, it needs to implement the appropriate POST operation for the adapters to add data for new projects.

  *  Commits: Implements several read operations to list all commits and search for commits by ID.

  *  Issues: Implements several read operations to list all issues, search for issues by ID and by status.

  *  Comments: Implements several read operations to list all comments and search for comments by ID.
