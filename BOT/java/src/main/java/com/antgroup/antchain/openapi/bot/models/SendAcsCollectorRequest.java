// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class SendAcsCollectorRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 链上设备Id
    // 
    @NameInMap("chain_device_id")
    @Validation(required = true)
    public String chainDeviceId;

    // 收集内容
    @NameInMap("collect_content_list")
    @Validation(required = true)
    public java.util.List<CollectContent> collectContentList;

    // 随机数，防重放
    @NameInMap("nonce")
    @Validation(required = true)
    public java.util.List<String> nonce;

    public static SendAcsCollectorRequest build(java.util.Map<String, ?> map) throws Exception {
        SendAcsCollectorRequest self = new SendAcsCollectorRequest();
        return TeaModel.build(map, self);
    }

    public SendAcsCollectorRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SendAcsCollectorRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SendAcsCollectorRequest setChainDeviceId(String chainDeviceId) {
        this.chainDeviceId = chainDeviceId;
        return this;
    }
    public String getChainDeviceId() {
        return this.chainDeviceId;
    }

    public SendAcsCollectorRequest setCollectContentList(java.util.List<CollectContent> collectContentList) {
        this.collectContentList = collectContentList;
        return this;
    }
    public java.util.List<CollectContent> getCollectContentList() {
        return this.collectContentList;
    }

    public SendAcsCollectorRequest setNonce(java.util.List<String> nonce) {
        this.nonce = nonce;
        return this;
    }
    public java.util.List<String> getNonce() {
        return this.nonce;
    }

}
