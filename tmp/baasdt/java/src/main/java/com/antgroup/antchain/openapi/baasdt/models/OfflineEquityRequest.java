// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class OfflineEquityRequest extends TeaModel {
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

    // 外部交易ID
    @NameInMap("out_tx_id")
    @Validation(required = true)
    public String outTxId;

    public static OfflineEquityRequest build(java.util.Map<String, ?> map) throws Exception {
        OfflineEquityRequest self = new OfflineEquityRequest();
        return TeaModel.build(map, self);
    }

    public OfflineEquityRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public OfflineEquityRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public OfflineEquityRequest setChainId(String chainId) {
        this.chainId = chainId;
        return this;
    }
    public String getChainId() {
        return this.chainId;
    }

    public OfflineEquityRequest setEquityId(String equityId) {
        this.equityId = equityId;
        return this;
    }
    public String getEquityId() {
        return this.equityId;
    }

    public OfflineEquityRequest setOutTxId(String outTxId) {
        this.outTxId = outTxId;
        return this;
    }
    public String getOutTxId() {
        return this.outTxId;
    }

}
