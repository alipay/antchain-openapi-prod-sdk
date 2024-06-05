// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_dc040d759c7a442f89b4b6590b1e39a0.models;

import com.aliyun.tea.*;

public class CancelBlockchainBotDigitalkeyWithholdRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 商户传入外部交易订单号
    @NameInMap("out_trade_no")
    @Validation(required = true)
    public String outTradeNo;

    public static CancelBlockchainBotDigitalkeyWithholdRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelBlockchainBotDigitalkeyWithholdRequest self = new CancelBlockchainBotDigitalkeyWithholdRequest();
        return TeaModel.build(map, self);
    }

    public CancelBlockchainBotDigitalkeyWithholdRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CancelBlockchainBotDigitalkeyWithholdRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CancelBlockchainBotDigitalkeyWithholdRequest setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
        return this;
    }
    public String getOutTradeNo() {
        return this.outTradeNo;
    }

}
