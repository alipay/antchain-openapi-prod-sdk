// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ApplyChainUseDeclarationRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 用途KEY
    @NameInMap("chain_purpose_key")
    @Validation(required = true)
    public String chainPurposeKey;

    // 选择其他类型时，用户输入（必填）
    @NameInMap("chain_purpose_extend")
    public String chainPurposeExtend;

    // 简短说明用途
    // 
    // 选择其他类型时，用户输入
    @NameInMap("chain_purpose_item")
    public String chainPurposeItem;

    public static ApplyChainUseDeclarationRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyChainUseDeclarationRequest self = new ApplyChainUseDeclarationRequest();
        return TeaModel.build(map, self);
    }

    public ApplyChainUseDeclarationRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ApplyChainUseDeclarationRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ApplyChainUseDeclarationRequest setChainPurposeKey(String chainPurposeKey) {
        this.chainPurposeKey = chainPurposeKey;
        return this;
    }
    public String getChainPurposeKey() {
        return this.chainPurposeKey;
    }

    public ApplyChainUseDeclarationRequest setChainPurposeExtend(String chainPurposeExtend) {
        this.chainPurposeExtend = chainPurposeExtend;
        return this;
    }
    public String getChainPurposeExtend() {
        return this.chainPurposeExtend;
    }

    public ApplyChainUseDeclarationRequest setChainPurposeItem(String chainPurposeItem) {
        this.chainPurposeItem = chainPurposeItem;
        return this;
    }
    public String getChainPurposeItem() {
        return this.chainPurposeItem;
    }

}
