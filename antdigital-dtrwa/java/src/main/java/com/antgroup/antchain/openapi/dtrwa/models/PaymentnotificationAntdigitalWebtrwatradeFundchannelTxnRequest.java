// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtrwa.models;

import com.aliyun.tea.*;

public class PaymentnotificationAntdigitalWebtrwatradeFundchannelTxnRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // jetco生成的ID,由第一个指示代理分配的唯一标识，用于明确标识在整个银行间链中传递的、不变的交易
    @NameInMap("e2e_id")
    @Validation(required = true)
    public String e2eId;

    // 支付状态
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    public static PaymentnotificationAntdigitalWebtrwatradeFundchannelTxnRequest build(java.util.Map<String, ?> map) throws Exception {
        PaymentnotificationAntdigitalWebtrwatradeFundchannelTxnRequest self = new PaymentnotificationAntdigitalWebtrwatradeFundchannelTxnRequest();
        return TeaModel.build(map, self);
    }

    public PaymentnotificationAntdigitalWebtrwatradeFundchannelTxnRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PaymentnotificationAntdigitalWebtrwatradeFundchannelTxnRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PaymentnotificationAntdigitalWebtrwatradeFundchannelTxnRequest setE2eId(String e2eId) {
        this.e2eId = e2eId;
        return this;
    }
    public String getE2eId() {
        return this.e2eId;
    }

    public PaymentnotificationAntdigitalWebtrwatradeFundchannelTxnRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
