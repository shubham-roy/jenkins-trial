pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
            }
        }
        stage('WebHooking') {
            steps {
                script{
                    def helper = load "helper.groovy"
                    helper.makeRequest()
                }
            }
        }
    }
}