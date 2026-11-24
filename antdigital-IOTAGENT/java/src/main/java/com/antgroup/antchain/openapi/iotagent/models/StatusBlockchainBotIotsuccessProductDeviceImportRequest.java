// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iotagent.models;

import com.aliyun.tea.*;

public class StatusBlockchainBotIotsuccessProductDeviceImportRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 认证租户内产品标识
    @NameInMap("product_key")
    @Validation(required = true)
    public String productKey;

    // 要查询的设备MAC列表，不查询新建task
    @NameInMap("uid_list")
    @Validation(required = true)
    public java.util.List<String> uidList;

    public static StatusBlockchainBotIotsuccessProductDeviceImportRequest build(java.util.Map<String, ?> map) throws Exception {
        StatusBlockchainBotIotsuccessProductDeviceImportRequest self = new StatusBlockchainBotIotsuccessProductDeviceImportRequest();
        return TeaModel.build(map, self);
    }

    public StatusBlockchainBotIotsuccessProductDeviceImportRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public StatusBlockchainBotIotsuccessProductDeviceImportRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public StatusBlockchainBotIotsuccessProductDeviceImportRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public StatusBlockchainBotIotsuccessProductDeviceImportRequest setUidList(java.util.List<String> uidList) {
        this.uidList = uidList;
        return this;
    }
    public java.util.List<String> getUidList() {
        return this.uidList;
    }

}
