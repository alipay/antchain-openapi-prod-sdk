// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class QueryIotbasicDeviceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户ID
    @NameInMap("tenant_id")
    public String tenantId;

    // 设备SN
    @NameInMap("device_sn")
    public String deviceSn;

    // 设备品类code
    @NameInMap("category_code")
    public String categoryCode;

    // 设备型号
    @NameInMap("device_model")
    public String deviceModel;

    // 厂商名称
    @NameInMap("corp_name")
    public String corpName;

    // 安装位置
    @NameInMap("location")
    public String location;

    // 设备状态，在线/离线、故障
    @NameInMap("device_status")
    public String deviceStatus;

    // 指定显示返回结果中的第几页。
    // 
    @NameInMap("current_page")
    @Validation(required = true, minimum = 1)
    public Long currentPage;

    // 指定返回结果中每页显示的产品数量，最大值是200。
    // 
    // 
    @NameInMap("page_size")
    @Validation(required = true, maximum = 200, minimum = 1)
    public Long pageSize;

    public static QueryIotbasicDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryIotbasicDeviceRequest self = new QueryIotbasicDeviceRequest();
        return TeaModel.build(map, self);
    }

    public QueryIotbasicDeviceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryIotbasicDeviceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryIotbasicDeviceRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public QueryIotbasicDeviceRequest setDeviceSn(String deviceSn) {
        this.deviceSn = deviceSn;
        return this;
    }
    public String getDeviceSn() {
        return this.deviceSn;
    }

    public QueryIotbasicDeviceRequest setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
        return this;
    }
    public String getCategoryCode() {
        return this.categoryCode;
    }

    public QueryIotbasicDeviceRequest setDeviceModel(String deviceModel) {
        this.deviceModel = deviceModel;
        return this;
    }
    public String getDeviceModel() {
        return this.deviceModel;
    }

    public QueryIotbasicDeviceRequest setCorpName(String corpName) {
        this.corpName = corpName;
        return this;
    }
    public String getCorpName() {
        return this.corpName;
    }

    public QueryIotbasicDeviceRequest setLocation(String location) {
        this.location = location;
        return this;
    }
    public String getLocation() {
        return this.location;
    }

    public QueryIotbasicDeviceRequest setDeviceStatus(String deviceStatus) {
        this.deviceStatus = deviceStatus;
        return this;
    }
    public String getDeviceStatus() {
        return this.deviceStatus;
    }

    public QueryIotbasicDeviceRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QueryIotbasicDeviceRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
