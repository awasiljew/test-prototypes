package awasiljew.springtestapp.model;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 *
 * @author adam
 */
public class Shop {

    private String name;
    private String staffName[];

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the staffName
     */
    public String[] getStaffName() {
        return staffName;
    }

    /**
     * @param staffName the staffName to set
     */
    public void setStaffName(String[] staffName) {
        this.staffName = staffName;
    }
}
