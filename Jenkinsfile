pipeline {
    agent any
    environment {
        DOCKER_HUB_CREDENTIALS = credentials('docker-hub-credentials')
    }
    stages {
        stage('Checkout') {
            steps {
                cleanWs()
                checkout([$class: 'GitSCM', 
                    branches: [[name: '*/main']], 
                    userRemoteConfigs: [[url: 'https://github.com/nakdongegg/ssam.git', credentialsId: 'docker-hub-credentials']]
                ])
            }
        }
        stage('Build') {
            steps {
                dir('BACK/Ssam') {
                    sh 'chmod +x gradlew'
                    sh './gradlew build'
                }
            }
        }
        stage('Docker Build & Push') {
            steps {
                script {
                    def appImage = docker.build("asz2325/springboot-app:${env.BUILD_NUMBER}", "./BACK/Ssam")
                    docker.withRegistry('https://registry.hub.docker.com', 'docker-hub-credentials') {
                        appImage.push()
                        appImage.push('latest')
                    }
                }
            }
        }
        stage('Deploy') {
            steps {
                sh 'docker-compose -f docker-compose.yml up -d --build springboot-app'
            }
        }
    }
    post {
        always {
            sh 'docker logout'
        }
    }
}
