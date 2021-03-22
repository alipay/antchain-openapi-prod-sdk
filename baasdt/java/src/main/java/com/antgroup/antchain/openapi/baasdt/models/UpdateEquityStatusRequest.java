// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class UpdateEquityStatusRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 链ID
    @NameInMap("chain_id")
    @Validation(required = true)
    public String chainId;

    // 要代理操作的租户ID
    @NameInMap("delegated_tenant_id")
    public String delegatedTenantId;

    // 权益商品ID
    @NameInMap("equity_id")
    @Validation(required = true)
    public String equityId;

    // 外部交易ID
    @NameInMap("out_tx_id")
    @Validation(required = true)
    public String outTxId;

    // 权益状态：0可用，1下线，2冻结
    @NameInMap("status")
    @Validation(required = true)
    public Long status;

    public static UpdateEquityStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateEquityStatusRequest self = new UpdateEquityStatusRequest();
        return TeaModel.build(map, self);
    }

    public UpdateEquityStatusRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateEquityStatusRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateEquityStatusRequest setChainId(String chainId) {
        this.chainId = chainId;
        return this;
    }
    public String getChainId() {
        return this.chainId;
    }

    public UpdateEquityStatusRequest setDelegatedTenantId(String delegatedTenantId) {
        this.delegatedTenantId = delegatedTenantId;
        return this;
    }
    public String getDelegatedTenantId() {
        return this.delegatedTenantId;
    }

    public UpdateEquityStatusRequest setEquityId(String equityId) {
        this.equityId = equityId;
        return this;
    }
    public String getEquityId() {
        return this.equityId;
    }

    public UpdateEquityStatusRequest setOutTxId(String outTxId) {
        this.outTxId = outTxId;
        return this;
    }
    public String getOutTxId() {
        return this.outTxId;
    }

    public UpdateEquityStatusRequest setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

}
