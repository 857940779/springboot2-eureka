//git tokenid on jenkins
def git_auth = "ad28bfe9-586c-45a2-861f-0467054059ca"
//git repo
def git_url = "git@github.com:857940779/springboot2-eureka.git"
//git pull branch
def git_branch="master"

node{
    stage('pull'){
         checkout([$class: 'GitSCM', branches: [[name: "*/${git_branch}"]], extensions: [], userRemoteConfigs: [[credentialsId: "${git_auth}", url: "${git_url}"]]])
    }
    stage('compile'){
       //sh "mvn clean compile"
       //echo "done"
       mvn clean compile
    }
}