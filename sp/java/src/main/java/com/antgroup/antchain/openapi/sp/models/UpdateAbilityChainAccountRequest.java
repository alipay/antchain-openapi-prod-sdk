// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.sp.models;

import com.aliyun.tea.*;

public class UpdateAbilityChainAccountRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    @NameInMap("product_access_code")
    public String productAccessCode;

    // 业务流水，请求幂等号
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // 链id，每个合约独立的标识
    @NameInMap("chain_id")
    @Validation(required = true)
    public String chainId;

    // 租户名。目前理解 chain_id + tenant_id + chain_user_id 能唯一标识某个合约上的某个账号
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 链上账号。链上唯一账号。某些特定场景（比如某个租户可以在一个合约上不同平台方参与分润），会需要合约账户id
    @NameInMap("chain_user_id")
    public String chainUserId;

    // decrease 减少 increase 增加
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 金额，单位：分。
    @NameInMap("value")
    @Validation(required = true)
    public Long value;

    // 扩展字段，json格式
    @NameInMap("extend_params")
    public String extendParams;

    public static UpdateAbilityChainAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAbilityChainAccountRequest self = new UpdateAbilityChainAccountRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAbilityChainAccountRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateAbilityChainAccountRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateAbilityChainAccountRequest setProductAccessCode(String productAccessCode) {
        this.productAccessCode = productAccessCode;
        return this;
    }
    public String getProductAccessCode() {
        return this.productAccessCode;
    }

    public UpdateAbilityChainAccountRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public UpdateAbilityChainAccountRequest setChainId(String chainId) {
        this.chainId = chainId;
        return this;
    }
    public String getChainId() {
        return this.chainId;
    }

    public UpdateAbilityChainAccountRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public UpdateAbilityChainAccountRequest setChainUserId(String chainUserId) {
        this.chainUserId = chainUserId;
        return this;
    }
    public String getChainUserId() {
        return this.chainUserId;
    }

    public UpdateAbilityChainAccountRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public UpdateAbilityChainAccountRequest setValue(Long value) {
        this.value = value;
        return this;
    }
    public Long getValue() {
        return this.value;
    }

    public UpdateAbilityChainAccountRequest setExtendParams(String extendParams) {
        this.extendParams = extendParams;
        return this;
    }
    public String getExtendParams() {
        return this.extendParams;
    }

}
