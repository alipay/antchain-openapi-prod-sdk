// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class CancelDigitalkeyWithholdpayRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 商户传入外部交易订单号
    @NameInMap("out_trade_no")
    @Validation(required = true)
    public String outTradeNo;

    public static CancelDigitalkeyWithholdpayRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelDigitalkeyWithholdpayRequest self = new CancelDigitalkeyWithholdpayRequest();
        return TeaModel.build(map, self);
    }

    public CancelDigitalkeyWithholdpayRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CancelDigitalkeyWithholdpayRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CancelDigitalkeyWithholdpayRequest setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
        return this;
    }
    public String getOutTradeNo() {
        return this.outTradeNo;
    }

}
