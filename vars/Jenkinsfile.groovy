#!/usr/bin/env groovy

def demo() {
	node{
		echo "Jenkinsfile found and the branch names is ${env.BRANCH_NAME}"
	}
}
