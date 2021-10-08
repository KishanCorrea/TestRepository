pipeline {
    agent any

    stages {
        stage('SCM Checkout') {
            steps {
                git credentialsId: 'Github', url: 'https://github.com/KishanCorrea/TestRepository.git'
                echo 'Building..'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing Stage..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying Stage....'
            }
        }
    }
}
