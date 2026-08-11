// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class QueryElectrocarDeviceotamoduleversionRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 设备定位基准：TUID / TRUST_DEVICE_ID / TRUST_PRODUCT_DEVICE
    @NameInMap("locator_type")
    @Validation(required = true)
    public String locatorType;

    // EKYT 全局唯一设备 ID
    @NameInMap("tuid")
    public String tuid;

    // 可信设备唯一id
    @NameInMap("trust_device_id")
    public String trustDeviceId;

    // 可信唯一产品标识
    @NameInMap("trust_product_key")
    public String trustProductKey;

    // 设备名称
    @NameInMap("device_name")
    public String deviceName;

    public static QueryElectrocarDeviceotamoduleversionRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryElectrocarDeviceotamoduleversionRequest self = new QueryElectrocarDeviceotamoduleversionRequest();
        return TeaModel.build(map, self);
    }

    public QueryElectrocarDeviceotamoduleversionRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryElectrocarDeviceotamoduleversionRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryElectrocarDeviceotamoduleversionRequest setLocatorType(String locatorType) {
        this.locatorType = locatorType;
        return this;
    }
    public String getLocatorType() {
        return this.locatorType;
    }

    public QueryElectrocarDeviceotamoduleversionRequest setTuid(String tuid) {
        this.tuid = tuid;
        return this;
    }
    public String getTuid() {
        return this.tuid;
    }

    public QueryElectrocarDeviceotamoduleversionRequest setTrustDeviceId(String trustDeviceId) {
        this.trustDeviceId = trustDeviceId;
        return this;
    }
    public String getTrustDeviceId() {
        return this.trustDeviceId;
    }

    public QueryElectrocarDeviceotamoduleversionRequest setTrustProductKey(String trustProductKey) {
        this.trustProductKey = trustProductKey;
        return this;
    }
    public String getTrustProductKey() {
        return this.trustProductKey;
    }

    public QueryElectrocarDeviceotamoduleversionRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

}
