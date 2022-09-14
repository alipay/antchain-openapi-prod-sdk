// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class CheckChainSensitiveWordsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 用途KEY
    @NameInMap("chain_purpose_key")
    @Validation(required = true)
    public String chainPurposeKey;

    // 敏感词检查条目内容
    @NameInMap("chain_purpose_item")
    @Validation(required = true)
    public String chainPurposeItem;

    public static CheckChainSensitiveWordsRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckChainSensitiveWordsRequest self = new CheckChainSensitiveWordsRequest();
        return TeaModel.build(map, self);
    }

    public CheckChainSensitiveWordsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CheckChainSensitiveWordsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CheckChainSensitiveWordsRequest setChainPurposeKey(String chainPurposeKey) {
        this.chainPurposeKey = chainPurposeKey;
        return this;
    }
    public String getChainPurposeKey() {
        return this.chainPurposeKey;
    }

    public CheckChainSensitiveWordsRequest setChainPurposeItem(String chainPurposeItem) {
        this.chainPurposeItem = chainPurposeItem;
        return this;
    }
    public String getChainPurposeItem() {
        return this.chainPurposeItem;
    }

}
