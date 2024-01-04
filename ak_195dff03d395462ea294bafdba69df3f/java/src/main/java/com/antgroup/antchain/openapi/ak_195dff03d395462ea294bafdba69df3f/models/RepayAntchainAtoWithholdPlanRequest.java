// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_195dff03d395462ea294bafdba69df3f.models;

import com.aliyun.tea.*;

public class RepayAntchainAtoWithholdPlanRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 订单id 长度不可超过50
    @NameInMap("order_id")
    @Validation(required = true, maxLength = 50)
    public String orderId;

    // 第几期
    @NameInMap("period_num")
    @Validation(required = true, minimum = 1)
    public Long periodNum;

    // 扣款时间
    @NameInMap("gmt_pay")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtPay;

    // 清偿清欠金额，单位为分
    @NameInMap("pay_off_amount")
    @Validation(required = true)
    public Long payOffAmount;

    // 清偿清欠方式
    // WECHAT:微信;
    // BANK:银行
    // ALIPAY:支付宝
    @NameInMap("pay_off_type")
    @Validation(required = true, maxLength = 64)
    public String payOffType;

    // 清偿清欠单号,通过其他方式清偿的第三方单号;例如银行流水号或微信流水号
    @NameInMap("pay_off_no")
    @Validation(required = true, maxLength = 64)
    public String payOffNo;

    // 清偿清欠银行名称,方式为银行时必填
    @NameInMap("pay_off_bank_name")
    @Validation(maxLength = 64)
    public String payOffBankName;

    public static RepayAntchainAtoWithholdPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        RepayAntchainAtoWithholdPlanRequest self = new RepayAntchainAtoWithholdPlanRequest();
        return TeaModel.build(map, self);
    }

    public RepayAntchainAtoWithholdPlanRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public RepayAntchainAtoWithholdPlanRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public RepayAntchainAtoWithholdPlanRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public RepayAntchainAtoWithholdPlanRequest setPeriodNum(Long periodNum) {
        this.periodNum = periodNum;
        return this;
    }
    public Long getPeriodNum() {
        return this.periodNum;
    }

    public RepayAntchainAtoWithholdPlanRequest setGmtPay(String gmtPay) {
        this.gmtPay = gmtPay;
        return this;
    }
    public String getGmtPay() {
        return this.gmtPay;
    }

    public RepayAntchainAtoWithholdPlanRequest setPayOffAmount(Long payOffAmount) {
        this.payOffAmount = payOffAmount;
        return this;
    }
    public Long getPayOffAmount() {
        return this.payOffAmount;
    }

    public RepayAntchainAtoWithholdPlanRequest setPayOffType(String payOffType) {
        this.payOffType = payOffType;
        return this;
    }
    public String getPayOffType() {
        return this.payOffType;
    }

    public RepayAntchainAtoWithholdPlanRequest setPayOffNo(String payOffNo) {
        this.payOffNo = payOffNo;
        return this;
    }
    public String getPayOffNo() {
        return this.payOffNo;
    }

    public RepayAntchainAtoWithholdPlanRequest setPayOffBankName(String payOffBankName) {
        this.payOffBankName = payOffBankName;
        return this;
    }
    public String getPayOffBankName() {
        return this.payOffBankName;
    }

}
