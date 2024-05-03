/**
 *This file is the sample code against we run our unit test.
 *It is placed src/test/files in order to not be part of the maven compilation.
 **/
class ShouldGoBillPughSingletonImplementationRule {

    private static final ShouldGoBillPughSingletonImplementationRule instance;

    private class ShouldGoBillPughSingletonImplementationRule() {
    }

    public static ShouldGoBillPughSingletonImplementationRule getInstance() {
        if (instance == null) {
            instance = new ShouldGoBillPughSingletonImplementationRule();
        }
        return instance;
    }

}
