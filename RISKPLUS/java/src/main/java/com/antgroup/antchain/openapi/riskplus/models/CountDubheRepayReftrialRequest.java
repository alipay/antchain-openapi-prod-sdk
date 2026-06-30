// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class CountDubheRepayReftrialRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 订单号
    @NameInMap("order_no")
    @Validation(required = true)
    public String orderNo;

    // 授信申请订单号
    @NameInMap("original_order_no")
    @Validation(required = true)
    public String originalOrderNo;

    // 产品编号
    @NameInMap("prod_no")
    @Validation(required = true)
    public String prodNo;

    // 借款金额
    @NameInMap("apply_amount")
    @Validation(required = true)
    public Long applyAmount;

    // 借款期数
    @NameInMap("apply_period")
    @Validation(required = true)
    public Long applyPeriod;

    // 还款方式
    @NameInMap("repay_type")
    @Validation(required = true)
    public String repayType;

    public static CountDubheRepayReftrialRequest build(java.util.Map<String, ?> map) throws Exception {
        CountDubheRepayReftrialRequest self = new CountDubheRepayReftrialRequest();
        return TeaModel.build(map, self);
    }

    public CountDubheRepayReftrialRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CountDubheRepayReftrialRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CountDubheRepayReftrialRequest setOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }
    public String getOrderNo() {
        return this.orderNo;
    }

    public CountDubheRepayReftrialRequest setOriginalOrderNo(String originalOrderNo) {
        this.originalOrderNo = originalOrderNo;
        return this;
    }
    public String getOriginalOrderNo() {
        return this.originalOrderNo;
    }

    public CountDubheRepayReftrialRequest setProdNo(String prodNo) {
        this.prodNo = prodNo;
        return this;
    }
    public String getProdNo() {
        return this.prodNo;
    }

    public CountDubheRepayReftrialRequest setApplyAmount(Long applyAmount) {
        this.applyAmount = applyAmount;
        return this;
    }
    public Long getApplyAmount() {
        return this.applyAmount;
    }

    public CountDubheRepayReftrialRequest setApplyPeriod(Long applyPeriod) {
        this.applyPeriod = applyPeriod;
        return this;
    }
    public Long getApplyPeriod() {
        return this.applyPeriod;
    }

    public CountDubheRepayReftrialRequest setRepayType(String repayType) {
        this.repayType = repayType;
        return this;
    }
    public String getRepayType() {
        return this.repayType;
    }

}
