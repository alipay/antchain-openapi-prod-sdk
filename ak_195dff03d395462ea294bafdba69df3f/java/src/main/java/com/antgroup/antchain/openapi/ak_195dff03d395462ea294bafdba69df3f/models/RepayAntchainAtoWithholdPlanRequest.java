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

    // 第几期，单期取消必填
    @NameInMap("period_num")
    public Long periodNum;

    // 取消订单某一期代扣计划中以其他方式还款金额，单位为分，单期取消必填
    @NameInMap("gmt_pay")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtPay;

    // 取消订单某一期代扣计划中以其他方式还款金额，单位为分
    @NameInMap("pay_off_amount")
    public Long payOffAmount;

    // 变更其他方式还款
    // WECHAT:微信;
    // BANK:银行
    // ALIPAY:支付宝
    @NameInMap("pay_off_type")
    @Validation(maxLength = 64)
    public String payOffType;

    // 通过其他方式还款单号;例如银行流水号或微信流水号
    @NameInMap("pay_off_no")
    @Validation(maxLength = 64)
    public String payOffNo;

    // 其他方式还款银行名称，还款方式为银行时必填
    @NameInMap("pay_off_bank_name")
    @Validation(maxLength = 64)
    public String payOffBankName;

    // 操作，默认为单期取消；
    // 多期取消：MULTI_CANCEL
    // 单期取消：SINGLE_CANCEL
    @NameInMap("operation")
    @Validation(maxLength = 64)
    public String operation;

    // 取消列表，多期取消必填
    @NameInMap("cancel_list")
    public java.util.List<SingleCancelModel> cancelList;

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

    public RepayAntchainAtoWithholdPlanRequest setOperation(String operation) {
        this.operation = operation;
        return this;
    }
    public String getOperation() {
        return this.operation;
    }

    public RepayAntchainAtoWithholdPlanRequest setCancelList(java.util.List<SingleCancelModel> cancelList) {
        this.cancelList = cancelList;
        return this;
    }
    public java.util.List<SingleCancelModel> getCancelList() {
        return this.cancelList;
    }

}
