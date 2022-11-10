// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class BatchcreateIotbasicDeviceorderbatchRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 业务类型
    @NameInMap("biz_scene")
    @Validation(required = true)
    public String bizScene;

    // 租户id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 订单同步批量请求体
    @NameInMap("order_batch_sync_req")
    @Validation(required = true)
    public java.util.List<DeviceorderRequest> orderBatchSyncReq;

    public static BatchcreateIotbasicDeviceorderbatchRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchcreateIotbasicDeviceorderbatchRequest self = new BatchcreateIotbasicDeviceorderbatchRequest();
        return TeaModel.build(map, self);
    }

    public BatchcreateIotbasicDeviceorderbatchRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BatchcreateIotbasicDeviceorderbatchRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public BatchcreateIotbasicDeviceorderbatchRequest setBizScene(String bizScene) {
        this.bizScene = bizScene;
        return this;
    }
    public String getBizScene() {
        return this.bizScene;
    }

    public BatchcreateIotbasicDeviceorderbatchRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public BatchcreateIotbasicDeviceorderbatchRequest setOrderBatchSyncReq(java.util.List<DeviceorderRequest> orderBatchSyncReq) {
        this.orderBatchSyncReq = orderBatchSyncReq;
        return this;
    }
    public java.util.List<DeviceorderRequest> getOrderBatchSyncReq() {
        return this.orderBatchSyncReq;
    }

}
