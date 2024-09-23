// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class ApplyDubbridgeUsecreditRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 授信申请订单号
    @NameInMap("original_order_no")
    @Validation(required = true)
    public String originalOrderNo;

    // 用信金额
    @NameInMap("loan_amount")
    @Validation(required = true)
    public Long loanAmount;

    // 期数
    @NameInMap("period")
    @Validation(required = true)
    public Long period;

    // 资产方用户唯一标识
    @NameInMap("open_id")
    @Validation(required = true)
    public String openId;

    // 订单号
    @NameInMap("order_no")
    @Validation(required = true)
    public String orderNo;

    // 还款方式:1：等额本息，2：等额本金
    @NameInMap("repay_type")
    @Validation(required = true)
    public String repayType;

    // 1：手机数码 2：旅游 3：装修 4：教育 5：婚庆 6：租房 7：家具家居 8：健康医疗 9：其他消费 10：家用电器
    @NameInMap("loan_way")
    @Validation(required = true)
    public String loanWay;

    // 还款日
    @NameInMap("repay_date")
    public String repayDate;

    // 渠道类型
    @NameInMap("channel_type")
    public String channelType;

    // 客户类型
    @NameInMap("custom_type")
    public String customType;

    // 风险数据对象（json字符串）
    @NameInMap("risk_data")
    public String riskData;

    // 资金源编码
    @NameInMap("loan_inst_code")
    public String loanInstCode;

    // 银行卡号
    @NameInMap("bank_card_no")
    public String bankCardNo;

    // 影像件信息
    @NameInMap("materials")
    public java.util.List<Material> materials;

    // 优惠券id
    @NameInMap("coupon_id")
    public String couponId;

    public static ApplyDubbridgeUsecreditRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyDubbridgeUsecreditRequest self = new ApplyDubbridgeUsecreditRequest();
        return TeaModel.build(map, self);
    }

    public ApplyDubbridgeUsecreditRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ApplyDubbridgeUsecreditRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ApplyDubbridgeUsecreditRequest setOriginalOrderNo(String originalOrderNo) {
        this.originalOrderNo = originalOrderNo;
        return this;
    }
    public String getOriginalOrderNo() {
        return this.originalOrderNo;
    }

    public ApplyDubbridgeUsecreditRequest setLoanAmount(Long loanAmount) {
        this.loanAmount = loanAmount;
        return this;
    }
    public Long getLoanAmount() {
        return this.loanAmount;
    }

    public ApplyDubbridgeUsecreditRequest setPeriod(Long period) {
        this.period = period;
        return this;
    }
    public Long getPeriod() {
        return this.period;
    }

    public ApplyDubbridgeUsecreditRequest setOpenId(String openId) {
        this.openId = openId;
        return this;
    }
    public String getOpenId() {
        return this.openId;
    }

    public ApplyDubbridgeUsecreditRequest setOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }
    public String getOrderNo() {
        return this.orderNo;
    }

    public ApplyDubbridgeUsecreditRequest setRepayType(String repayType) {
        this.repayType = repayType;
        return this;
    }
    public String getRepayType() {
        return this.repayType;
    }

    public ApplyDubbridgeUsecreditRequest setLoanWay(String loanWay) {
        this.loanWay = loanWay;
        return this;
    }
    public String getLoanWay() {
        return this.loanWay;
    }

    public ApplyDubbridgeUsecreditRequest setRepayDate(String repayDate) {
        this.repayDate = repayDate;
        return this;
    }
    public String getRepayDate() {
        return this.repayDate;
    }

    public ApplyDubbridgeUsecreditRequest setChannelType(String channelType) {
        this.channelType = channelType;
        return this;
    }
    public String getChannelType() {
        return this.channelType;
    }

    public ApplyDubbridgeUsecreditRequest setCustomType(String customType) {
        this.customType = customType;
        return this;
    }
    public String getCustomType() {
        return this.customType;
    }

    public ApplyDubbridgeUsecreditRequest setRiskData(String riskData) {
        this.riskData = riskData;
        return this;
    }
    public String getRiskData() {
        return this.riskData;
    }

    public ApplyDubbridgeUsecreditRequest setLoanInstCode(String loanInstCode) {
        this.loanInstCode = loanInstCode;
        return this;
    }
    public String getLoanInstCode() {
        return this.loanInstCode;
    }

    public ApplyDubbridgeUsecreditRequest setBankCardNo(String bankCardNo) {
        this.bankCardNo = bankCardNo;
        return this;
    }
    public String getBankCardNo() {
        return this.bankCardNo;
    }

    public ApplyDubbridgeUsecreditRequest setMaterials(java.util.List<Material> materials) {
        this.materials = materials;
        return this;
    }
    public java.util.List<Material> getMaterials() {
        return this.materials;
    }

    public ApplyDubbridgeUsecreditRequest setCouponId(String couponId) {
        this.couponId = couponId;
        return this;
    }
    public String getCouponId() {
        return this.couponId;
    }

}
