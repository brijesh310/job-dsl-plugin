package javaposse.jobdsl.dsl.jobs

import javaposse.jobdsl.dsl.Job
import javaposse.jobdsl.dsl.JobManagement

class MultiJob extends Job {

    static final String TEMPLATE = '''
        <?xml version='1.0' encoding='UTF-8'?>
        <com.tikal.jenkins.plugins.multijob.MultiJobProject plugin="jenkins-multijob-plugin@1.8">
          <actions/>
          <description/>
          <keepDependencies>false</keepDependencies>
          <properties/>
          <scm class="hudson.scm.NullSCM"/>
          <canRoam>true</canRoam>
          <disabled>false</disabled>
          <blockBuildWhenDownstreamBuilding>false</blockBuildWhenDownstreamBuilding>
          <blockBuildWhenUpstreamBuilding>false</blockBuildWhenUpstreamBuilding>
          <triggers class="vector"/>
          <concurrentBuild>false</concurrentBuild>
          <builders/>
          <publishers/>
          <buildWrappers/>
        </com.tikal.jenkins.plugins.multijob.MultiJobProject>
    '''.stripIndent().trim()

    final String template = TEMPLATE

    MultiJob(JobManagement jobManagement) {
        super(jobManagement)
    }
}
