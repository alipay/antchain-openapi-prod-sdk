// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class ApplyDubheUsecreditRequest extends TeaModel {
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
    @NameInMap("order_on")
    @Validation(required = true)
    public String orderOn;

    // 还款方式
    @NameInMap("repay_type")
    @Validation(required = true)
    public String repayType;

    // 1：手机数码 2：旅游 3：装修 4：教育 5：婚庆 6：租房 7：家具家居 8：健康医疗 9：其他消费 10：家用电器
    @NameInMap("loan_way")
    @Validation(required = true)
    public String loanWay;

    // 1: APP
    // 2: 支付宝小程序
    // 3：微信小程序
    // 4：微信公众号
    // 5：PC网页
    // 默认1
    @NameInMap("channel_type")
    @Validation(required = true)
    public String channelType;

    // 1: 新增客户
    // 2：存量激活客户
    // 3：目标营销客户
    // 默认1
    @NameInMap("custom_type")
    @Validation(required = true)
    public String customType;

    // 指定还款日（仅无在贷借据时生效）
    @NameInMap("repay_date")
    @Validation(required = true)
    public String repayDate;

    public static ApplyDubheUsecreditRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyDubheUsecreditRequest self = new ApplyDubheUsecreditRequest();
        return TeaModel.build(map, self);
    }

    public ApplyDubheUsecreditRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ApplyDubheUsecreditRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ApplyDubheUsecreditRequest setOriginalOrderNo(String originalOrderNo) {
        this.originalOrderNo = originalOrderNo;
        return this;
    }
    public String getOriginalOrderNo() {
        return this.originalOrderNo;
    }

    public ApplyDubheUsecreditRequest setLoanAmount(Long loanAmount) {
        this.loanAmount = loanAmount;
        return this;
    }
    public Long getLoanAmount() {
        return this.loanAmount;
    }

    public ApplyDubheUsecreditRequest setPeriod(Long period) {
        this.period = period;
        return this;
    }
    public Long getPeriod() {
        return this.period;
    }

    public ApplyDubheUsecreditRequest setOpenId(String openId) {
        this.openId = openId;
        return this;
    }
    public String getOpenId() {
        return this.openId;
    }

    public ApplyDubheUsecreditRequest setOrderOn(String orderOn) {
        this.orderOn = orderOn;
        return this;
    }
    public String getOrderOn() {
        return this.orderOn;
    }

    public ApplyDubheUsecreditRequest setRepayType(String repayType) {
        this.repayType = repayType;
        return this;
    }
    public String getRepayType() {
        return this.repayType;
    }

    public ApplyDubheUsecreditRequest setLoanWay(String loanWay) {
        this.loanWay = loanWay;
        return this;
    }
    public String getLoanWay() {
        return this.loanWay;
    }

    public ApplyDubheUsecreditRequest setChannelType(String channelType) {
        this.channelType = channelType;
        return this;
    }
    public String getChannelType() {
        return this.channelType;
    }

    public ApplyDubheUsecreditRequest setCustomType(String customType) {
        this.customType = customType;
        return this;
    }
    public String getCustomType() {
        return this.customType;
    }

    public ApplyDubheUsecreditRequest setRepayDate(String repayDate) {
        this.repayDate = repayDate;
        return this;
    }
    public String getRepayDate() {
        return this.repayDate;
    }

}
