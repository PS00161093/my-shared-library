#!/usr/bin/env groovy

node{
	echo "Jenkinsfile found and the branch names is ${env.BRANCH_NAME}"
}