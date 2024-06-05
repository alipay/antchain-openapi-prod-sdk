// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class NotifyDigitalkeyWithholdRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 商户请求号。 由商家自定义，64个字符以内，仅支持字母、数字、下划线且需保证在商户端不重复
    @NameInMap("out_request_no")
    @Validation(required = true)
    public String outRequestNo;

    // 订单总金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000]
    @NameInMap("total_amount")
    @Validation(required = true)
    public Long totalAmount;

    // 代扣协议号, 对应于签约时，支付宝返回的协议
    @NameInMap("agreement_no")
    @Validation(required = true)
    public String agreementNo;

    public static NotifyDigitalkeyWithholdRequest build(java.util.Map<String, ?> map) throws Exception {
        NotifyDigitalkeyWithholdRequest self = new NotifyDigitalkeyWithholdRequest();
        return TeaModel.build(map, self);
    }

    public NotifyDigitalkeyWithholdRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public NotifyDigitalkeyWithholdRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public NotifyDigitalkeyWithholdRequest setOutRequestNo(String outRequestNo) {
        this.outRequestNo = outRequestNo;
        return this;
    }
    public String getOutRequestNo() {
        return this.outRequestNo;
    }

    public NotifyDigitalkeyWithholdRequest setTotalAmount(Long totalAmount) {
        this.totalAmount = totalAmount;
        return this;
    }
    public Long getTotalAmount() {
        return this.totalAmount;
    }

    public NotifyDigitalkeyWithholdRequest setAgreementNo(String agreementNo) {
        this.agreementNo = agreementNo;
        return this;
    }
    public String getAgreementNo() {
        return this.agreementNo;
    }

}
