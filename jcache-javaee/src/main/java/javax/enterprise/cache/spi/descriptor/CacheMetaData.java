package javax.enterprise.cache.spi.descriptor;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author airhacks.com
 */
public class CacheMetaData {

    private String name;
    private boolean storeByValue;
    private boolean managementEnabled;
    private boolean statisticsEnabled;
    private Map<String, String> configurationProperties;

    public CacheMetaData() {
        this.configurationProperties = new HashMap<>();
    }

    public CacheMetaData(String name, boolean storeByValue,
            boolean managementEnabled, boolean statisticsEnabled) {
        this();
        this.name = name;
        this.storeByValue = storeByValue;
        this.managementEnabled = managementEnabled;
        this.statisticsEnabled = statisticsEnabled;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isStoreByValue() {
        return storeByValue;
    }

    public void setStoreByValue(boolean storeByValue) {
        this.storeByValue = storeByValue;
    }

    public boolean isManagementEnabled() {
        return managementEnabled;
    }

    public void setManagementEnabled(boolean managementEnabled) {
        this.managementEnabled = managementEnabled;
    }

    public boolean isStatisticsEnabled() {
        return statisticsEnabled;
    }

    public void setStatisticsEnabled(boolean statisticsEnabled) {
        this.statisticsEnabled = statisticsEnabled;
    }

    public Map<String, String> getConfigurationProperties() {
        return configurationProperties;
    }

    public void setConfigurationProperties(Map<String, String> configurationProperties) {
        this.configurationProperties = configurationProperties;
    }

    public void addProperty(String key, String value) {
        this.configurationProperties.put(key, value);
    }

    boolean getPropertyAsBoolean(String key) {
        String value = this.configurationProperties.getOrDefault(key, "false");
        return Boolean.parseBoolean(value);
    }

}
