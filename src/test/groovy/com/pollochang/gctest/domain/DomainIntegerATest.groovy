package com.pollochang.gctest.domain

import org.junit.jupiter.api.Test

/**
 * CMS GC:
 -server
 -Xms30M -Xmx30M -Xmn10M -Xss256k -XX:MaxPermSize=2m
 -XX:+UseConcMarkSweepGC
 -XX:+CMSScavengeBeforeRemark -XX:+ScavengeBeforeFullGC
 -XX:CMSInitiatingOccupancyFraction=92 -XX:+UseCMSInitiatingOccupancyOnly
 -XX:+CMSParallelRemarkEnabled
 -verbose:gc -Xloggc:/home/jameschang/test-gc-log/DomainIntegerATest-gc-cms.log -XX:+PrintGCDetails -XX:+PrintHeapAtGC -XX:+DisableExplicitGC
 * G1 GC
 -XX:+UseG1GC
 -Xms30M -Xmx30M
 -Xms60M -Xmx60M
 -XX:MaxGCPauseMillis=95
 -verbose:gc -Xloggc:/home/jameschang/test-gc-log/DomainIntegerATest-gc-g1.log -XX:+PrintGCDetails -XX:+PrintHeapAtGC -XX:+DisableExplicitGC
 -verbose:gc -Xlog:gc=debug:file=/home/jameschang/test-gc-log/DomainIntegerATest-gc-g1.log -XX:+PrintGCDetails -XX:+DisableExplicitGC # JDK11
 */
class DomainIntegerATest {
    @Test
    void eachFor(){
        DomainIntegerA domainI
        int eachNumber = 50000000

        (1..eachNumber).each{
            domainI = new DomainIntegerA()
            domainI.setNum1(100)
            domainI.setNum2(100)
            domainI.setNum3(100)
            domainI.setNum4(100)
            domainI.setNum5(100)
            domainI.setNum6(100)
            domainI.setNum7(100)
            domainI.setNum8(100)
            domainI.setNum9(100)
            domainI.setNum10(100)
        }

    }
}
