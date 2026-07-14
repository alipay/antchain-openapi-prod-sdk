// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class QueryElectrocarDevicepageRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 当前页码
    @NameInMap("current")
    @Validation(required = true)
    public Long current;

    // 每页显示条数
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    // 可信物联产品唯一标识
    @NameInMap("trust_product_key")
    @Validation(required = true)
    public String trustProductKey;

    // 设备名称/设备备注名称/可信物联唯一设备标识
    @NameInMap("device_query_str")
    public String deviceQueryStr;

    // 设备状态过滤: ONLINE/OFFLINE/UNACTIVE
    @NameInMap("device_status")
    public String deviceStatus;

    // OTA模块名称
    @NameInMap("module_name")
    public String moduleName;

    // OTA模块版本号（可选，配合moduleName使用）
    @NameInMap("version")
    public String version;

    public static QueryElectrocarDevicepageRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryElectrocarDevicepageRequest self = new QueryElectrocarDevicepageRequest();
        return TeaModel.build(map, self);
    }

    public QueryElectrocarDevicepageRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryElectrocarDevicepageRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryElectrocarDevicepageRequest setCurrent(Long current) {
        this.current = current;
        return this;
    }
    public Long getCurrent() {
        return this.current;
    }

    public QueryElectrocarDevicepageRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryElectrocarDevicepageRequest setTrustProductKey(String trustProductKey) {
        this.trustProductKey = trustProductKey;
        return this;
    }
    public String getTrustProductKey() {
        return this.trustProductKey;
    }

    public QueryElectrocarDevicepageRequest setDeviceQueryStr(String deviceQueryStr) {
        this.deviceQueryStr = deviceQueryStr;
        return this;
    }
    public String getDeviceQueryStr() {
        return this.deviceQueryStr;
    }

    public QueryElectrocarDevicepageRequest setDeviceStatus(String deviceStatus) {
        this.deviceStatus = deviceStatus;
        return this;
    }
    public String getDeviceStatus() {
        return this.deviceStatus;
    }

    public QueryElectrocarDevicepageRequest setModuleName(String moduleName) {
        this.moduleName = moduleName;
        return this;
    }
    public String getModuleName() {
        return this.moduleName;
    }

    public QueryElectrocarDevicepageRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
