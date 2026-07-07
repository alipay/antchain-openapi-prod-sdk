// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class GetPdcpBlockchainRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 请求ID
    @NameInMap("tx_msg_id")
    @Validation(required = true)
    public String txMsgId;

    public static GetPdcpBlockchainRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPdcpBlockchainRequest self = new GetPdcpBlockchainRequest();
        return TeaModel.build(map, self);
    }

    public GetPdcpBlockchainRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetPdcpBlockchainRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetPdcpBlockchainRequest setTxMsgId(String txMsgId) {
        this.txMsgId = txMsgId;
        return this;
    }
    public String getTxMsgId() {
        return this.txMsgId;
    }

}
