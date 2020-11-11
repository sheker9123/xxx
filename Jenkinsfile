node {
     stage('gitclone'){
         git 'https://github.com/sheker9123/xxx.git'
     }
     
     stage("Maven Clean Build"){
        sh  "/bin/mvn clean package"
     }
	 
	 stage("Build Docker Image"){
        sh "docker build -t testrepo ."
     }
     
     stage('Submit Stack'){
            sh "aws cloudformation create-stack --stack-name ecrrepo --template-body file://ecrcloudformationtemplate.json --region 'us-east-1'"
     }
      
     stage("docker push to ecr repository")
     docker.withRegistry('https://472484234840.dkr.ecr.us-east-1.amazonaws.com/testrepo', 'ecr:us-east-1:7da16bfe-d614-4b77-aca3-ec20b4443de7') {
        docker.image('testrepo').push('latest3')
     }
}     
