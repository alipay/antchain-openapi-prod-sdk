// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class EcLoanAppls extends TeaModel {
    // 客户ID
    /**
     * <strong>example:</strong>
     * <p>232</p>
     */
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    // 申请单号 系统的申请单号
    /**
     * <strong>example:</strong>
     * <p>1232</p>
     */
    @NameInMap("order_no")
    @Validation(required = true)
    public String orderNo;

    // 提款单状态
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("order_status")
    @Validation(required = true)
    public String orderStatus;

    // 借据号
    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("loan_no")
    @Validation(required = true)
    public String loanNo;

    public static EcLoanAppls build(java.util.Map<String, ?> map) throws Exception {
        EcLoanAppls self = new EcLoanAppls();
        return TeaModel.build(map, self);
    }

    public EcLoanAppls setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public EcLoanAppls setOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }
    public String getOrderNo() {
        return this.orderNo;
    }

    public EcLoanAppls setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
        return this;
    }
    public String getOrderStatus() {
        return this.orderStatus;
    }

    public EcLoanAppls setLoanNo(String loanNo) {
        this.loanNo = loanNo;
        return this;
    }
    public String getLoanNo() {
        return this.loanNo;
    }

}
