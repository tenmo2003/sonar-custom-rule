package org.sonar.samples.java.checks;

import org.junit.jupiter.api.Test;
import org.sonar.java.checks.verifier.CheckVerifier;
import org.sonar.samples.java.utils.FilesUtils;

/**
 * @author anhvn
 */
class ShouldGoBillPughSingletonImplementationRuleTest {
    @Test
    void check() {
        CheckVerifier.newVerifier()
                .onFile("src/test/files/ShouldGoBillPughSingletonImplementationRule.java")
                .withCheck(new ShouldGoBillPughSingletonImplementationRule())
                .withClassPath(FilesUtils.getClassPath("target/test-jars"))
                .verifyIssues();
    }
}
