#!/usr/bin/env groovy

def call() {
	node{
		echo "Jenkinsfile found and the branch name is ${env.BRANCH_NAME}"
		echo "Build Number is ${env.BUILD_ID}"
		echo "Job Name is ${env.JOB_NAME}"
	}
}
