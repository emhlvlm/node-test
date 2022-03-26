pipelineJob('CD'){
     description('This is automaticly triggered when image is pushed to docker hub. It takes that image and deploys docker container on aws e2c instance.')
     
     // Add Docker Hub triggers after seed job deployment. This is missing from JOB DSL documentation
     
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
               scriptPath("CD/Jenkinsfile")
          }
     }                   
}
