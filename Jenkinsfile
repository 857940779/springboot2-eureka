//git凭证Id
def git_auth = "5dcb0253-4860-4c65-8985-efaf7137755f"
//git的项目地址
def git_url = "https://github.com/857940779/springboot2-eureka.git"
//git拉取的分支
def git_branch="master"

node{
    stage('拉取代码'){
         checkout([$class: 'GitSCM', branches: [[name: "*/${git_branch}"]], extensions: [], userRemoteConfigs: [[credentialsId: "${git_auth}", url: "${git_url}"]]])
    }
    stage('编译'){
       sh "mvn clean compile"
       echo "done"
    }
}