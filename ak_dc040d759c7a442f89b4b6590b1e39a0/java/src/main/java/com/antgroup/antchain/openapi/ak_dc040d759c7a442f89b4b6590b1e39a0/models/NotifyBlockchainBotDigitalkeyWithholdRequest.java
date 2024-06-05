// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_dc040d759c7a442f89b4b6590b1e39a0.models;

import com.aliyun.tea.*;

public class NotifyBlockchainBotDigitalkeyWithholdRequest extends TeaModel {
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

    public static NotifyBlockchainBotDigitalkeyWithholdRequest build(java.util.Map<String, ?> map) throws Exception {
        NotifyBlockchainBotDigitalkeyWithholdRequest self = new NotifyBlockchainBotDigitalkeyWithholdRequest();
        return TeaModel.build(map, self);
    }

    public NotifyBlockchainBotDigitalkeyWithholdRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public NotifyBlockchainBotDigitalkeyWithholdRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public NotifyBlockchainBotDigitalkeyWithholdRequest setOutRequestNo(String outRequestNo) {
        this.outRequestNo = outRequestNo;
        return this;
    }
    public String getOutRequestNo() {
        return this.outRequestNo;
    }

    public NotifyBlockchainBotDigitalkeyWithholdRequest setTotalAmount(Long totalAmount) {
        this.totalAmount = totalAmount;
        return this;
    }
    public Long getTotalAmount() {
        return this.totalAmount;
    }

    public NotifyBlockchainBotDigitalkeyWithholdRequest setAgreementNo(String agreementNo) {
        this.agreementNo = agreementNo;
        return this;
    }
    public String getAgreementNo() {
        return this.agreementNo;
    }

}
