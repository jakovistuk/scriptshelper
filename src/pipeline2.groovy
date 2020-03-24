pipeline {
    agent none
    stages {
        stage('Test init') {
            steps {
                script {

                    openshift.addShutdownHook {}
                    openshift.setLockName(${var-name-that-ideally-includes-job-name-and-run-number})
                }
            }
        }
        stage('Run tests') {
            parallel {
                stage('Test run 1') {
                    steps {
                        script {
                            openshift.withCluster('22') {
                            }
                            //openshift.


                        }
                    }
                }

                stage('Test run 2') {
                    steps {
                        script {
                            openshift.withCluster("re") {

                            }
                        }
                    }
                }
            }
        }
    }
}