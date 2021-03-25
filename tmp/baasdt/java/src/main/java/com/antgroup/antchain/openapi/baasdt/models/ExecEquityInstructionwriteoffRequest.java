// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class ExecEquityInstructionwriteoffRequest extends TeaModel {
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

    // 权益商品ID
    @NameInMap("equity_id")
    @Validation(required = true)
    public String equityId;

    // 附言
    @NameInMap("memo")
    public String memo;

    // 兑换交易ID
    @NameInMap("origin_tx_id")
    @Validation(required = true)
    public String originTxId;

    // 外部交易ID
    @NameInMap("out_tx_id")
    @Validation(required = true)
    public String outTxId;

    public static ExecEquityInstructionwriteoffRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecEquityInstructionwriteoffRequest self = new ExecEquityInstructionwriteoffRequest();
        return TeaModel.build(map, self);
    }

    public ExecEquityInstructionwriteoffRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecEquityInstructionwriteoffRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ExecEquityInstructionwriteoffRequest setChainId(String chainId) {
        this.chainId = chainId;
        return this;
    }
    public String getChainId() {
        return this.chainId;
    }

    public ExecEquityInstructionwriteoffRequest setEquityId(String equityId) {
        this.equityId = equityId;
        return this;
    }
    public String getEquityId() {
        return this.equityId;
    }

    public ExecEquityInstructionwriteoffRequest setMemo(String memo) {
        this.memo = memo;
        return this;
    }
    public String getMemo() {
        return this.memo;
    }

    public ExecEquityInstructionwriteoffRequest setOriginTxId(String originTxId) {
        this.originTxId = originTxId;
        return this;
    }
    public String getOriginTxId() {
        return this.originTxId;
    }

    public ExecEquityInstructionwriteoffRequest setOutTxId(String outTxId) {
        this.outTxId = outTxId;
        return this;
    }
    public String getOutTxId() {
        return this.outTxId;
    }

}
