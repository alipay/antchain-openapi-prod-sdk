// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class SendExchangeAftersaleRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 链id
    @NameInMap("chain_id")
    @Validation(required = true)
    public String chainId;

    // 要代理操作的租户ID
    @NameInMap("delegated_tenant_id")
    public String delegatedTenantId;

    // 商品id
    @NameInMap("equity_id")
    @Validation(required = true)
    public String equityId;

    // 发货商品的信息，敏感信息需加密，使用收货方公钥加密的权益信息。实际数据结构根据商品类型和描述输入，可参考https://tech.antfin.com/docs/2/163896。比如在手机直充时可以返回 {  "voucher": "充值凭证，如有",  "memo": ""}信息。
    @NameInMap("memo")
    public String memo;

    // 原始订单交易ID。由采购商在创建对换单时传入，不可更新。
    @NameInMap("origin_tx_id")
    @Validation(required = true)
    public String originTxId;

    // 外部交易id
    @NameInMap("out_tx_id")
    @Validation(required = true)
    public String outTxId;

    public static SendExchangeAftersaleRequest build(java.util.Map<String, ?> map) throws Exception {
        SendExchangeAftersaleRequest self = new SendExchangeAftersaleRequest();
        return TeaModel.build(map, self);
    }

    public SendExchangeAftersaleRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SendExchangeAftersaleRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SendExchangeAftersaleRequest setChainId(String chainId) {
        this.chainId = chainId;
        return this;
    }
    public String getChainId() {
        return this.chainId;
    }

    public SendExchangeAftersaleRequest setDelegatedTenantId(String delegatedTenantId) {
        this.delegatedTenantId = delegatedTenantId;
        return this;
    }
    public String getDelegatedTenantId() {
        return this.delegatedTenantId;
    }

    public SendExchangeAftersaleRequest setEquityId(String equityId) {
        this.equityId = equityId;
        return this;
    }
    public String getEquityId() {
        return this.equityId;
    }

    public SendExchangeAftersaleRequest setMemo(String memo) {
        this.memo = memo;
        return this;
    }
    public String getMemo() {
        return this.memo;
    }

    public SendExchangeAftersaleRequest setOriginTxId(String originTxId) {
        this.originTxId = originTxId;
        return this;
    }
    public String getOriginTxId() {
        return this.originTxId;
    }

    public SendExchangeAftersaleRequest setOutTxId(String outTxId) {
        this.outTxId = outTxId;
        return this;
    }
    public String getOutTxId() {
        return this.outTxId;
    }

}
