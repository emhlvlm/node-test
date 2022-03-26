pipelineJob('CI'){

     description('This is automaticly triggered when new commit is pushed to git hub. It clones the repo and builds new docker image with commit tag. It tests container based on that image and if its successful, deploys that image to dockerhub')
     
     triggers {
          githubPush()
     }

     definition {
          cpsScm {
               scm {
                    git{
                         remote {
                              url("https://github.com/emhlvlm/node-test.git")
                         }
                    branch('main')
                    }
               }
               scriptPath("CI/Jenkinsfile")
          }
     }                   
}
