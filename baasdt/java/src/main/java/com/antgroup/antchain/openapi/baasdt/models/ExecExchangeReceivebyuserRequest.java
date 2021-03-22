// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class ExecExchangeReceivebyuserRequest extends TeaModel {
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

    // 收货时的信息，若敏感信息需加密。实际数据结构根据商品类型和描述输入，可参考https://tech.antfin.com/docs/2/163896
    @NameInMap("memo")
    @Validation(required = true)
    public String memo;

    // 原始订单交易ID。由采购商在创建对换单时传入，不可更新。
    @NameInMap("origin_tx_id")
    @Validation(required = true)
    public String originTxId;

    // 外部交易ID
    @NameInMap("out_tx_id")
    @Validation(required = true)
    public String outTxId;

    // 用户ID
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    public static ExecExchangeReceivebyuserRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecExchangeReceivebyuserRequest self = new ExecExchangeReceivebyuserRequest();
        return TeaModel.build(map, self);
    }

    public ExecExchangeReceivebyuserRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecExchangeReceivebyuserRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ExecExchangeReceivebyuserRequest setChainId(String chainId) {
        this.chainId = chainId;
        return this;
    }
    public String getChainId() {
        return this.chainId;
    }

    public ExecExchangeReceivebyuserRequest setDelegatedTenantId(String delegatedTenantId) {
        this.delegatedTenantId = delegatedTenantId;
        return this;
    }
    public String getDelegatedTenantId() {
        return this.delegatedTenantId;
    }

    public ExecExchangeReceivebyuserRequest setMemo(String memo) {
        this.memo = memo;
        return this;
    }
    public String getMemo() {
        return this.memo;
    }

    public ExecExchangeReceivebyuserRequest setOriginTxId(String originTxId) {
        this.originTxId = originTxId;
        return this;
    }
    public String getOriginTxId() {
        return this.originTxId;
    }

    public ExecExchangeReceivebyuserRequest setOutTxId(String outTxId) {
        this.outTxId = outTxId;
        return this;
    }
    public String getOutTxId() {
        return this.outTxId;
    }

    public ExecExchangeReceivebyuserRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
