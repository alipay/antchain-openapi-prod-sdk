// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class PushCollectotBychainidRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 链上设备Id
    @NameInMap("chain_device_id")
    @Validation(required = true)
    public String chainDeviceId;

    // 收集数据
    @NameInMap("collect_content_list")
    @Validation(required = true)
    public java.util.List<CollectContent> collectContentList;

    // 随机数，防重放
    @NameInMap("nonce")
    @Validation(required = true)
    public String nonce;

    // 数据模型Id
    @NameInMap("data_model_id")
    public String dataModelId;

    public static PushCollectotBychainidRequest build(java.util.Map<String, ?> map) throws Exception {
        PushCollectotBychainidRequest self = new PushCollectotBychainidRequest();
        return TeaModel.build(map, self);
    }

    public PushCollectotBychainidRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PushCollectotBychainidRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PushCollectotBychainidRequest setChainDeviceId(String chainDeviceId) {
        this.chainDeviceId = chainDeviceId;
        return this;
    }
    public String getChainDeviceId() {
        return this.chainDeviceId;
    }

    public PushCollectotBychainidRequest setCollectContentList(java.util.List<CollectContent> collectContentList) {
        this.collectContentList = collectContentList;
        return this;
    }
    public java.util.List<CollectContent> getCollectContentList() {
        return this.collectContentList;
    }

    public PushCollectotBychainidRequest setNonce(String nonce) {
        this.nonce = nonce;
        return this;
    }
    public String getNonce() {
        return this.nonce;
    }

    public PushCollectotBychainidRequest setDataModelId(String dataModelId) {
        this.dataModelId = dataModelId;
        return this;
    }
    public String getDataModelId() {
        return this.dataModelId;
    }

}
