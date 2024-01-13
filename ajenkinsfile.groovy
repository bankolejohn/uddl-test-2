pipeline {
    agent any

    environment {
        MAVEN_HOME = tool 'maven'
    }

    stages {
        stage('Build First Repo') {
            steps {
                script {
                    // Checkout source code
                    checkout scm

                    // Build Maven project
                    sh "${MAVEN_HOME}/bin/mvn clean install"

                    // Archive artifacts
                    archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
                }
            }
        }
    }
}
