// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class QueryIotbasicDeviceorderRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 开始时间
    @NameInMap("start_time")
    public String startTime;

    // 结束时间
    @NameInMap("end_time")
    public String endTime;

    // 所属业务
    @NameInMap("biz_scene")
    @Validation(required = true)
    public String bizScene;

    // 每页数据条数
    @NameInMap("page_size")
    @Validation(required = true, maximum = 100, minimum = 1)
    public Long pageSize;

    // 当前页数
    @NameInMap("current_page")
    @Validation(required = true)
    public Long currentPage;

    // 订单ID
    @NameInMap("order_id")
    public String orderId;

    // 设备did
    @NameInMap("device_did")
    public String deviceDid;

    public static QueryIotbasicDeviceorderRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryIotbasicDeviceorderRequest self = new QueryIotbasicDeviceorderRequest();
        return TeaModel.build(map, self);
    }

    public QueryIotbasicDeviceorderRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryIotbasicDeviceorderRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryIotbasicDeviceorderRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public QueryIotbasicDeviceorderRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public QueryIotbasicDeviceorderRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public QueryIotbasicDeviceorderRequest setBizScene(String bizScene) {
        this.bizScene = bizScene;
        return this;
    }
    public String getBizScene() {
        return this.bizScene;
    }

    public QueryIotbasicDeviceorderRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryIotbasicDeviceorderRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QueryIotbasicDeviceorderRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public QueryIotbasicDeviceorderRequest setDeviceDid(String deviceDid) {
        this.deviceDid = deviceDid;
        return this;
    }
    public String getDeviceDid() {
        return this.deviceDid;
    }

}
