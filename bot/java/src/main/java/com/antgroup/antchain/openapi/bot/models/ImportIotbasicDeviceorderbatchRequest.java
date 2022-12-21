// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class ImportIotbasicDeviceorderbatchRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 业务类型
    @NameInMap("biz_scene")
    @Validation(required = true)
    public String bizScene;

    // 订单同步批量请求体
    @NameInMap("order_batch_sync_req")
    @Validation(required = true)
    public java.util.List<DeviceorderRequest> orderBatchSyncReq;

    public static ImportIotbasicDeviceorderbatchRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportIotbasicDeviceorderbatchRequest self = new ImportIotbasicDeviceorderbatchRequest();
        return TeaModel.build(map, self);
    }

    public ImportIotbasicDeviceorderbatchRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ImportIotbasicDeviceorderbatchRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ImportIotbasicDeviceorderbatchRequest setBizScene(String bizScene) {
        this.bizScene = bizScene;
        return this;
    }
    public String getBizScene() {
        return this.bizScene;
    }

    public ImportIotbasicDeviceorderbatchRequest setOrderBatchSyncReq(java.util.List<DeviceorderRequest> orderBatchSyncReq) {
        this.orderBatchSyncReq = orderBatchSyncReq;
        return this;
    }
    public java.util.List<DeviceorderRequest> getOrderBatchSyncReq() {
        return this.orderBatchSyncReq;
    }

}
