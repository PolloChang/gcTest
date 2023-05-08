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
 -verbose:gc -Xloggc:/home/jameschang/test-gc-log/DomainIntegerBTest-gc-cms.log -XX:+PrintGCDetails -XX:+PrintHeapAtGC -XX:+DisableExplicitGC
 * G1 GC
 -XX:+UseG1GC -Xms30M -Xmx30M
 -XX:MaxGCPauseMillis=95
 -verbose:gc -Xloggc:/home/jameschang/test-gc-log/DomainIntegerBTest-gc-g1.log -XX:+PrintGCDetails -XX:+PrintHeapAtGC -XX:+DisableExplicitGC
 */
class DomainIntegerBTest {
    @Test
    void eachFor(){
        DomainIntegerB domainI
        int eachNumber = 50000000

        (1..eachNumber).each{
            domainI = new DomainIntegerB()
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
