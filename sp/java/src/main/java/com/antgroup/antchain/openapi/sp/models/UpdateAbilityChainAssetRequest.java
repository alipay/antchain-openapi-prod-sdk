// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.sp.models;

import com.aliyun.tea.*;

public class UpdateAbilityChainAssetRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    @NameInMap("product_access_code")
    public String productAccessCode;

    // 流水号
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // 链id，链上合约id
    @NameInMap("chain_id")
    @Validation(required = true)
    public String chainId;

    // 租户id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 链上用户id
    @NameInMap("chain_user_id")
    public String chainUserId;

    // 链上token金额，价值现金。单元：分
    @NameInMap("token_amount")
    @Validation(required = true)
    public Long tokenAmount;

    // token链上数量。与现金有一定的兑换率。
    @NameInMap("token_number")
    @Validation(required = true)
    public String tokenNumber;

    // 扩展字段，json格式
    @NameInMap("extend_params")
    public String extendParams;

    public static UpdateAbilityChainAssetRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAbilityChainAssetRequest self = new UpdateAbilityChainAssetRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAbilityChainAssetRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateAbilityChainAssetRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateAbilityChainAssetRequest setProductAccessCode(String productAccessCode) {
        this.productAccessCode = productAccessCode;
        return this;
    }
    public String getProductAccessCode() {
        return this.productAccessCode;
    }

    public UpdateAbilityChainAssetRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public UpdateAbilityChainAssetRequest setChainId(String chainId) {
        this.chainId = chainId;
        return this;
    }
    public String getChainId() {
        return this.chainId;
    }

    public UpdateAbilityChainAssetRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public UpdateAbilityChainAssetRequest setChainUserId(String chainUserId) {
        this.chainUserId = chainUserId;
        return this;
    }
    public String getChainUserId() {
        return this.chainUserId;
    }

    public UpdateAbilityChainAssetRequest setTokenAmount(Long tokenAmount) {
        this.tokenAmount = tokenAmount;
        return this;
    }
    public Long getTokenAmount() {
        return this.tokenAmount;
    }

    public UpdateAbilityChainAssetRequest setTokenNumber(String tokenNumber) {
        this.tokenNumber = tokenNumber;
        return this;
    }
    public String getTokenNumber() {
        return this.tokenNumber;
    }

    public UpdateAbilityChainAssetRequest setExtendParams(String extendParams) {
        this.extendParams = extendParams;
        return this;
    }
    public String getExtendParams() {
        return this.extendParams;
    }

}
