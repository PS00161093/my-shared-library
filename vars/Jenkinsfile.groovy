#!/usr/bin/env groovy

def call() {
	node{
		echo "Jenkinsfile found and the branch names is ${env.BRANCH_NAME}"
	}
}
