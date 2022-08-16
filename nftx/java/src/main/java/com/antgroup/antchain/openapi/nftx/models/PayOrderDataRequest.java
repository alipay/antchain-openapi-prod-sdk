// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.nftx.models;

import com.aliyun.tea.*;

public class PayOrderDataRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 接入方测订单号，保证全局唯一
    @NameInMap("external_order_no")
    @Validation(required = true)
    public String externalOrderNo;

    // 订单金额，单位为分
    @NameInMap("amount_cent")
    @Validation(required = true)
    public Long amountCent;

    // ALIPAY 表示小程序支付，ALIPAY_APP表示App支付
    @NameInMap("pay_channel")
    @Validation(required = true)
    public String payChannel;

    // 订单标题，支付宝账单会展示
    @NameInMap("subject")
    @Validation(required = true)
    public String subject;

    public static PayOrderDataRequest build(java.util.Map<String, ?> map) throws Exception {
        PayOrderDataRequest self = new PayOrderDataRequest();
        return TeaModel.build(map, self);
    }

    public PayOrderDataRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PayOrderDataRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PayOrderDataRequest setExternalOrderNo(String externalOrderNo) {
        this.externalOrderNo = externalOrderNo;
        return this;
    }
    public String getExternalOrderNo() {
        return this.externalOrderNo;
    }

    public PayOrderDataRequest setAmountCent(Long amountCent) {
        this.amountCent = amountCent;
        return this;
    }
    public Long getAmountCent() {
        return this.amountCent;
    }

    public PayOrderDataRequest setPayChannel(String payChannel) {
        this.payChannel = payChannel;
        return this;
    }
    public String getPayChannel() {
        return this.payChannel;
    }

    public PayOrderDataRequest setSubject(String subject) {
        this.subject = subject;
        return this;
    }
    public String getSubject() {
        return this.subject;
    }

}
