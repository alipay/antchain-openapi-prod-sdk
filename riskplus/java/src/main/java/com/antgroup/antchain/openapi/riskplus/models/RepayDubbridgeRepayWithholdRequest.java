// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class RepayDubbridgeRepayWithholdRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 授信申请订单号
    @NameInMap("original_order_no")
    @Validation(required = true)
    public String originalOrderNo;

    // 还款类型1:当期结清，2：正常还款3：全部结清
    @NameInMap("repay_type")
    @Validation(required = true)
    public String repayType;

    // 订单号
    @NameInMap("order_no")
    @Validation(required = true)
    public String orderNo;

    // 校验还款金额
    @NameInMap("valid_repay_amount")
    public String validRepayAmount;

    // 银行卡号
    @NameInMap("bank_card_no")
    public String bankCardNo;

    public static RepayDubbridgeRepayWithholdRequest build(java.util.Map<String, ?> map) throws Exception {
        RepayDubbridgeRepayWithholdRequest self = new RepayDubbridgeRepayWithholdRequest();
        return TeaModel.build(map, self);
    }

    public RepayDubbridgeRepayWithholdRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public RepayDubbridgeRepayWithholdRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public RepayDubbridgeRepayWithholdRequest setOriginalOrderNo(String originalOrderNo) {
        this.originalOrderNo = originalOrderNo;
        return this;
    }
    public String getOriginalOrderNo() {
        return this.originalOrderNo;
    }

    public RepayDubbridgeRepayWithholdRequest setRepayType(String repayType) {
        this.repayType = repayType;
        return this;
    }
    public String getRepayType() {
        return this.repayType;
    }

    public RepayDubbridgeRepayWithholdRequest setOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }
    public String getOrderNo() {
        return this.orderNo;
    }

    public RepayDubbridgeRepayWithholdRequest setValidRepayAmount(String validRepayAmount) {
        this.validRepayAmount = validRepayAmount;
        return this;
    }
    public String getValidRepayAmount() {
        return this.validRepayAmount;
    }

    public RepayDubbridgeRepayWithholdRequest setBankCardNo(String bankCardNo) {
        this.bankCardNo = bankCardNo;
        return this;
    }
    public String getBankCardNo() {
        return this.bankCardNo;
    }

}
