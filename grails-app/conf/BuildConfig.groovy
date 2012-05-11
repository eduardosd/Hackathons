grails.servlet.version = "2.5" // Change depending on target container compliance (2.5 or 3.0)
grails.project.class.dir = "target/classes"
grails.project.test.class.dir = "target/test-classes"
grails.project.test.reports.dir = "target/test-reports"
grails.project.target.level = 1.6
grails.project.source.level = 1.6
//grails.project.war.file = "target/${appName}-${appVersion}.war"

grails.project.dependency.resolution = {
    // inherit Grails' default dependencies
    inherits("global") {
        // uncomment to disable ehcache
        // excludes 'ehcache'
    }
    log "error" // log level of Ivy resolver, either 'error', 'warn', 'info', 'debug' or 'verbose'
    checksums true // Whether to verify checksums on resolve

    repositories {
        inherits true // Whether to inherit repository definitions from plugins
        grailsPlugins()
        grailsHome()
        grailsCentral()
        mavenCentral()

        // uncomment these to enable remote dependency resolution from public Maven repositories
        //mavenCentral()
        //mavenLocal()
        //mavenRepo "http://snapshots.repository.codehaus.org"
        //mavenRepo "http://repository.codehaus.org"
        //mavenRepo "http://download.java.net/maven/2/"
        //mavenRepo "http://repository.jboss.com/maven2/"
    }
		dependencies {
			// specify dependencies here under either 'build', 'compile', 'runtime', 'test' or 'provided' scopes eg.

			// runtime 'mysql:mysql-connector-java:5.1.16'
			runtime 'junit:junit:4.7'
				runtime 'javax.activation:activation:1.1.1'
				runtime 'javax.mail:mail:1.4.3'
				runtime 'org.twitter4j:twitter4j-core:2.2.5'
				runtime 'postgresql:postgresql:8.4-702.jdbc3'
		}

    plugins {
        runtime ":hibernate:$grailsVersion"
        runtime ":jquery:1.7.1"
        runtime ":resources:1.1.5"
				compile ":webxml:1.4.1"
				compile ':heroku:1.0.1'
				compile ':cloud-support:1.0.8'

        build ":tomcat:$grailsVersion"
    }
}