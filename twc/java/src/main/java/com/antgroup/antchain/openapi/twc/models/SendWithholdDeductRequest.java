// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class SendWithholdDeductRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 委托支付订单总金额，单位为元，精确到小数点后两位
    @NameInMap("amount")
    @Validation(required = true)
    public String amount;

    // JSON格式，传递业务扩展参数
    @NameInMap("business_params")
    public String businessParams;

    // 商户签约号，代扣协议中标示用户的唯一签约号（确保在商户系统中唯一）
    @NameInMap("external_agreement_no")
    @Validation(required = true)
    public String externalAgreementNo;

    // 订单标题信息
    @NameInMap("order_title")
    public String orderTitle;

    // 外部订单号,请求方保证唯一性
    @NameInMap("out_biz_no")
    @Validation(required = true)
    public String outBizNo;

    // 备注
    @NameInMap("remark")
    public String remark;

    // 第三方的用户id
    @NameInMap("third_party_id")
    @Validation(required = true)
    public String thirdPartyId;

    public static SendWithholdDeductRequest build(java.util.Map<String, ?> map) throws Exception {
        SendWithholdDeductRequest self = new SendWithholdDeductRequest();
        return TeaModel.build(map, self);
    }

    public SendWithholdDeductRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SendWithholdDeductRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SendWithholdDeductRequest setAmount(String amount) {
        this.amount = amount;
        return this;
    }
    public String getAmount() {
        return this.amount;
    }

    public SendWithholdDeductRequest setBusinessParams(String businessParams) {
        this.businessParams = businessParams;
        return this;
    }
    public String getBusinessParams() {
        return this.businessParams;
    }

    public SendWithholdDeductRequest setExternalAgreementNo(String externalAgreementNo) {
        this.externalAgreementNo = externalAgreementNo;
        return this;
    }
    public String getExternalAgreementNo() {
        return this.externalAgreementNo;
    }

    public SendWithholdDeductRequest setOrderTitle(String orderTitle) {
        this.orderTitle = orderTitle;
        return this;
    }
    public String getOrderTitle() {
        return this.orderTitle;
    }

    public SendWithholdDeductRequest setOutBizNo(String outBizNo) {
        this.outBizNo = outBizNo;
        return this;
    }
    public String getOutBizNo() {
        return this.outBizNo;
    }

    public SendWithholdDeductRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public SendWithholdDeductRequest setThirdPartyId(String thirdPartyId) {
        this.thirdPartyId = thirdPartyId;
        return this;
    }
    public String getThirdPartyId() {
        return this.thirdPartyId;
    }

}
