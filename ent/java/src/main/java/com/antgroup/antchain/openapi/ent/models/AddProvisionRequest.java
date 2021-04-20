// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ent.models;

import com.aliyun.tea.*;

public class AddProvisionRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 业务单号
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // 链 ID
    @NameInMap("chain_id")
    @Validation(required = true)
    public String chainId;

    // 合约 ID
    @NameInMap("contract_id")
    @Validation(required = true)
    public String contractId;

    // 调用方，例如租户 ID
    @NameInMap("source")
    @Validation(required = true)
    public String source;

    // 金额，单位为分
    @NameInMap("value")
    @Validation(required = true)
    public Long value;

    public static AddProvisionRequest build(java.util.Map<String, ?> map) throws Exception {
        AddProvisionRequest self = new AddProvisionRequest();
        return TeaModel.build(map, self);
    }

    public AddProvisionRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AddProvisionRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public AddProvisionRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public AddProvisionRequest setChainId(String chainId) {
        this.chainId = chainId;
        return this;
    }
    public String getChainId() {
        return this.chainId;
    }

    public AddProvisionRequest setContractId(String contractId) {
        this.contractId = contractId;
        return this;
    }
    public String getContractId() {
        return this.contractId;
    }

    public AddProvisionRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public AddProvisionRequest setValue(Long value) {
        this.value = value;
        return this;
    }
    public Long getValue() {
        return this.value;
    }

}
