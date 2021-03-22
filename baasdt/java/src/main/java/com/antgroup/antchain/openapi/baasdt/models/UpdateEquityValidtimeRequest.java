// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class UpdateEquityValidtimeRequest extends TeaModel {
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

    // 要代理的租户ID
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

    // 权益商品使用有效期右闭区间
    @NameInMap("use_valid_not_after")
    public String useValidNotAfter;

    // 权益商品使用有效期左闭区间
    @NameInMap("use_valid_not_before")
    public String useValidNotBefore;

    // 权益商品兑换有效期右闭区间
    @NameInMap("valid_not_after")
    public String validNotAfter;

    // 权益商品兑换有效期左闭区间
    @NameInMap("valid_not_before")
    public String validNotBefore;

    public static UpdateEquityValidtimeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateEquityValidtimeRequest self = new UpdateEquityValidtimeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateEquityValidtimeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateEquityValidtimeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateEquityValidtimeRequest setChainId(String chainId) {
        this.chainId = chainId;
        return this;
    }
    public String getChainId() {
        return this.chainId;
    }

    public UpdateEquityValidtimeRequest setDelegatedTenantId(String delegatedTenantId) {
        this.delegatedTenantId = delegatedTenantId;
        return this;
    }
    public String getDelegatedTenantId() {
        return this.delegatedTenantId;
    }

    public UpdateEquityValidtimeRequest setEquityId(String equityId) {
        this.equityId = equityId;
        return this;
    }
    public String getEquityId() {
        return this.equityId;
    }

    public UpdateEquityValidtimeRequest setOutTxId(String outTxId) {
        this.outTxId = outTxId;
        return this;
    }
    public String getOutTxId() {
        return this.outTxId;
    }

    public UpdateEquityValidtimeRequest setUseValidNotAfter(String useValidNotAfter) {
        this.useValidNotAfter = useValidNotAfter;
        return this;
    }
    public String getUseValidNotAfter() {
        return this.useValidNotAfter;
    }

    public UpdateEquityValidtimeRequest setUseValidNotBefore(String useValidNotBefore) {
        this.useValidNotBefore = useValidNotBefore;
        return this;
    }
    public String getUseValidNotBefore() {
        return this.useValidNotBefore;
    }

    public UpdateEquityValidtimeRequest setValidNotAfter(String validNotAfter) {
        this.validNotAfter = validNotAfter;
        return this;
    }
    public String getValidNotAfter() {
        return this.validNotAfter;
    }

    public UpdateEquityValidtimeRequest setValidNotBefore(String validNotBefore) {
        this.validNotBefore = validNotBefore;
        return this;
    }
    public String getValidNotBefore() {
        return this.validNotBefore;
    }

}
