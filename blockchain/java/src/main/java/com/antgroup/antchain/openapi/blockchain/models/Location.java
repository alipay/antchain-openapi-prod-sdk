// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class Location extends TeaModel {
    // 所在城市
    /**
     * <strong>example:</strong>
     * <p>杭州</p>
     */
    @NameInMap("city")
    public String city;

    // 操作IMEI
    /**
     * <strong>example:</strong>
     * <p>359426002899056</p>
     */
    @NameInMap("imei")
    public String imei;

    // 操作IMSI
    /**
     * <strong>example:</strong>
     * <p>460001357924680</p>
     */
    @NameInMap("imsi")
    public String imsi;

    // 操作IP地址
    /**
     * <strong>example:</strong>
     * <p>0.0.0.0</p>
     */
    @NameInMap("ip")
    public String ip;

    // 纬度
    /**
     * <strong>example:</strong>
     * <p>66.33</p>
     */
    @NameInMap("latitude")
    public String latitude;

    // 经度
    /**
     * <strong>example:</strong>
     * <p>23.26</p>
     */
    @NameInMap("longitude")
    public String longitude;

    // 扩展属性
    /**
     * <strong>example:</strong>
     * <p>{&quot;key&quot;:&quot;value&quot;}</p>
     */
    @NameInMap("propertities")
    public String propertities;

    // 操作Wi-Fi物理地址
    /**
     * <strong>example:</strong>
     * <p>00-01-6C-06-A6-29</p>
     */
    @NameInMap("wifi_mac")
    public String wifiMac;

    public static Location build(java.util.Map<String, ?> map) throws Exception {
        Location self = new Location();
        return TeaModel.build(map, self);
    }

    public Location setCity(String city) {
        this.city = city;
        return this;
    }
    public String getCity() {
        return this.city;
    }

    public Location setImei(String imei) {
        this.imei = imei;
        return this;
    }
    public String getImei() {
        return this.imei;
    }

    public Location setImsi(String imsi) {
        this.imsi = imsi;
        return this;
    }
    public String getImsi() {
        return this.imsi;
    }

    public Location setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public Location setLatitude(String latitude) {
        this.latitude = latitude;
        return this;
    }
    public String getLatitude() {
        return this.latitude;
    }

    public Location setLongitude(String longitude) {
        this.longitude = longitude;
        return this;
    }
    public String getLongitude() {
        return this.longitude;
    }

    public Location setPropertities(String propertities) {
        this.propertities = propertities;
        return this;
    }
    public String getPropertities() {
        return this.propertities;
    }

    public Location setWifiMac(String wifiMac) {
        this.wifiMac = wifiMac;
        return this;
    }
    public String getWifiMac() {
        return this.wifiMac;
    }

}
