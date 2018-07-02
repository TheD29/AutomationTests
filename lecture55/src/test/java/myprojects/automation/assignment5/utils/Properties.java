package myprojects.automation.assignment5.utils;

/**
 * Help class to get passed parameters from environment for further usage in the automation project
 */
public class Properties {
    private static final String DEFAULT_BASE_URL = "https://demo.instantcarloanapproval.ca";
    private static final String DEFAULT_BASE_ADMIN_URL = "https://demo.instantcarloanapproval.ca/loginadmin";

    private Properties() {

    }

    /**
     *
     * @return Website frontend.
     */
    public static String getBaseUrl() {
        return System.getProperty(EnvironmentVariable.BASE_URL.toString(), DEFAULT_BASE_URL);
    }

    /**
     *
     * @return Website backend (ULR of the Admin Panel.)
     */
    public static String getBaseAdminUrl() {
        return System.getProperty(EnvironmentVariable.BASE_ADMIN_URL.toString(), DEFAULT_BASE_ADMIN_URL);
    }

}

/**
 * All parameters that are passed to automation project
 */
enum EnvironmentVariable {
    BASE_URL("env.url"),
    BASE_ADMIN_URL("env.admin.url");

    private String value;
    EnvironmentVariable(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}