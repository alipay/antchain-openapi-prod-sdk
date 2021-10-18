// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acs_iot.models;

import com.aliyun.tea.*;

public class SendCollectorBychainidRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 设备链id
    @NameInMap("chain_device_id")
    @Validation(required = true)
    public String chainDeviceId;

    // [{"name","1"},{"name","1"}]
    @NameInMap("collect_content_list")
    @Validation(required = true)
    public java.util.List<CollectContent> collectContentList;

    // 随机数，防重放
    // 
    @NameInMap("nonce")
    @Validation(required = true)
    public String nonce;

    public static SendCollectorBychainidRequest build(java.util.Map<String, ?> map) throws Exception {
        SendCollectorBychainidRequest self = new SendCollectorBychainidRequest();
        return TeaModel.build(map, self);
    }

    public SendCollectorBychainidRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SendCollectorBychainidRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SendCollectorBychainidRequest setChainDeviceId(String chainDeviceId) {
        this.chainDeviceId = chainDeviceId;
        return this;
    }
    public String getChainDeviceId() {
        return this.chainDeviceId;
    }

    public SendCollectorBychainidRequest setCollectContentList(java.util.List<CollectContent> collectContentList) {
        this.collectContentList = collectContentList;
        return this;
    }
    public java.util.List<CollectContent> getCollectContentList() {
        return this.collectContentList;
    }

    public SendCollectorBychainidRequest setNonce(String nonce) {
        this.nonce = nonce;
        return this;
    }
    public String getNonce() {
        return this.nonce;
    }

}
