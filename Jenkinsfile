node {
     stage('gitclone'){
         git 'https://github.com/sheker9123/spring-java.git'
     }
     
     stage("Maven Clean Build"){
        sh  "/bin/mvn clean package"
     }
     
     stage("SonarQube Analysis"){
        withSonarQubeEnv('sonarserver') {
           sh 'mvn clean package sonar:sonar'
        } 
     }
     
     stage("Build Docker Image"){
        sh "docker build -t demojava ."
     }
     
     stage("docker push to ecr repository")
     docker.withRegistry('https://472484234840.dkr.ecr.us-east-1.amazonaws.com/demojava', 'ecr:us-east-1:7da16bfe-d614-4b77-aca3-ec20b4443de7') {
        docker.image('demojava').push('latest3')
     }
}     
