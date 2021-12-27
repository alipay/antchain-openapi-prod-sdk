// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class WithdrawRpgwUserCommissionRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 提现业务单号
    @NameInMap("order_number")
    @Validation(required = true)
    public String orderNumber;

    // 任务单号
    @NameInMap("user_order_numbers")
    @Validation(required = true)
    public String userOrderNumbers;

    // 提现人id
    @NameInMap("withdrawer_id")
    @Validation(required = true)
    public String withdrawerId;

    // 提现人支付宝id
    @NameInMap("withdrawer_alipay_id")
    @Validation(required = true)
    public String withdrawerAlipayId;

    // 提现人姓名
    @NameInMap("withdrawer_name")
    @Validation(required = true)
    public String withdrawerName;

    // 提现人手机
    @NameInMap("withdrawer_phone_number")
    public String withdrawerPhoneNumber;

    // 提现人身份证
    @NameInMap("withdrawer_id_number")
    @Validation(required = true)
    public String withdrawerIdNumber;

    // 提现金额
    @NameInMap("withdraw_amount")
    @Validation(required = true)
    public String withdrawAmount;

    // 提现附言
    @NameInMap("order_title")
    @Validation(required = true)
    public String orderTitle;

    // 业务备注
    @NameInMap("remark")
    @Validation(required = true)
    public String remark;

    public static WithdrawRpgwUserCommissionRequest build(java.util.Map<String, ?> map) throws Exception {
        WithdrawRpgwUserCommissionRequest self = new WithdrawRpgwUserCommissionRequest();
        return TeaModel.build(map, self);
    }

    public WithdrawRpgwUserCommissionRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public WithdrawRpgwUserCommissionRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public WithdrawRpgwUserCommissionRequest setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
        return this;
    }
    public String getOrderNumber() {
        return this.orderNumber;
    }

    public WithdrawRpgwUserCommissionRequest setUserOrderNumbers(String userOrderNumbers) {
        this.userOrderNumbers = userOrderNumbers;
        return this;
    }
    public String getUserOrderNumbers() {
        return this.userOrderNumbers;
    }

    public WithdrawRpgwUserCommissionRequest setWithdrawerId(String withdrawerId) {
        this.withdrawerId = withdrawerId;
        return this;
    }
    public String getWithdrawerId() {
        return this.withdrawerId;
    }

    public WithdrawRpgwUserCommissionRequest setWithdrawerAlipayId(String withdrawerAlipayId) {
        this.withdrawerAlipayId = withdrawerAlipayId;
        return this;
    }
    public String getWithdrawerAlipayId() {
        return this.withdrawerAlipayId;
    }

    public WithdrawRpgwUserCommissionRequest setWithdrawerName(String withdrawerName) {
        this.withdrawerName = withdrawerName;
        return this;
    }
    public String getWithdrawerName() {
        return this.withdrawerName;
    }

    public WithdrawRpgwUserCommissionRequest setWithdrawerPhoneNumber(String withdrawerPhoneNumber) {
        this.withdrawerPhoneNumber = withdrawerPhoneNumber;
        return this;
    }
    public String getWithdrawerPhoneNumber() {
        return this.withdrawerPhoneNumber;
    }

    public WithdrawRpgwUserCommissionRequest setWithdrawerIdNumber(String withdrawerIdNumber) {
        this.withdrawerIdNumber = withdrawerIdNumber;
        return this;
    }
    public String getWithdrawerIdNumber() {
        return this.withdrawerIdNumber;
    }

    public WithdrawRpgwUserCommissionRequest setWithdrawAmount(String withdrawAmount) {
        this.withdrawAmount = withdrawAmount;
        return this;
    }
    public String getWithdrawAmount() {
        return this.withdrawAmount;
    }

    public WithdrawRpgwUserCommissionRequest setOrderTitle(String orderTitle) {
        this.orderTitle = orderTitle;
        return this;
    }
    public String getOrderTitle() {
        return this.orderTitle;
    }

    public WithdrawRpgwUserCommissionRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

}
