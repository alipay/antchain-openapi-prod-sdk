// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtx.models;

import com.aliyun.tea.*;

public class GetTransactionChartRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // aaaa
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // aaa
    @NameInMap("tx_id")
    @Validation(required = true)
    public String txId;

    public static GetTransactionChartRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTransactionChartRequest self = new GetTransactionChartRequest();
        return TeaModel.build(map, self);
    }

    public GetTransactionChartRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetTransactionChartRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetTransactionChartRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetTransactionChartRequest setTxId(String txId) {
        this.txId = txId;
        return this;
    }
    public String getTxId() {
        return this.txId;
    }

}
