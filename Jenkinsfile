//git tokenid on jenkins
def git_auth = "5dcb0253-4860-4c65-8985-efaf7137755f"
//git repo
def git_url = "https://github.com/857940779/springboot2-eureka.git"
//git pull branch
def git_branch="master"

node{
    stage('pull'){
         checkout([$class: 'GitSCM', branches: [[name: "*/${git_branch}"]], extensions: [], userRemoteConfigs: [[credentialsId: "${git_auth}", url: "${git_url}"]]])
    }
    stage('compile'){
       //sh "mvn clean compile"
       //echo "done"
       sh 'mvn clean compile'
    }
}