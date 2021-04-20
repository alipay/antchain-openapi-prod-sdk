// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ent.models;

import com.aliyun.tea.*;

public class ReclaimProvisionExtraprovisionRequest extends TeaModel {
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

    public static ReclaimProvisionExtraprovisionRequest build(java.util.Map<String, ?> map) throws Exception {
        ReclaimProvisionExtraprovisionRequest self = new ReclaimProvisionExtraprovisionRequest();
        return TeaModel.build(map, self);
    }

    public ReclaimProvisionExtraprovisionRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ReclaimProvisionExtraprovisionRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ReclaimProvisionExtraprovisionRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public ReclaimProvisionExtraprovisionRequest setChainId(String chainId) {
        this.chainId = chainId;
        return this;
    }
    public String getChainId() {
        return this.chainId;
    }

    public ReclaimProvisionExtraprovisionRequest setContractId(String contractId) {
        this.contractId = contractId;
        return this;
    }
    public String getContractId() {
        return this.contractId;
    }

    public ReclaimProvisionExtraprovisionRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

}
