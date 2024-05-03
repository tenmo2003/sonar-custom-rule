class ShouldGoBillPughSingletonImplementationRule {

    private static final ShouldGoBillPughSingletonImplementationRule instance; // Noncompliant {{Singleton detected, you should implement singleton follow the Bill Pugh singleton approach}}

    private ShouldGoBillPughSingletonImplementationRule() {
    }

    public static ShouldGoBillPughSingletonImplementationRule getInstance() {
        if (instance == null) {
            instance = new ShouldGoBillPughSingletonImplementationRule();
        }
        return instance;
    }

}
