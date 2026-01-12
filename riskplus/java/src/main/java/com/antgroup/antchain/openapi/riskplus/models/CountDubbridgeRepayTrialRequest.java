// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class CountDubbridgeRepayTrialRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 用信申请订单号
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

    // 试算逾期期次列表
    @NameInMap("period_list")
    public java.util.List<Long> periodList;

    // 贴息比例
    @NameInMap("interest_subsidy_ratio")
    public String interestSubsidyRatio;

    // 参考定价
    @NameInMap("reference_ratio")
    public String referenceRatio;

    public static CountDubbridgeRepayTrialRequest build(java.util.Map<String, ?> map) throws Exception {
        CountDubbridgeRepayTrialRequest self = new CountDubbridgeRepayTrialRequest();
        return TeaModel.build(map, self);
    }

    public CountDubbridgeRepayTrialRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CountDubbridgeRepayTrialRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CountDubbridgeRepayTrialRequest setOriginalOrderNo(String originalOrderNo) {
        this.originalOrderNo = originalOrderNo;
        return this;
    }
    public String getOriginalOrderNo() {
        return this.originalOrderNo;
    }

    public CountDubbridgeRepayTrialRequest setRepayType(String repayType) {
        this.repayType = repayType;
        return this;
    }
    public String getRepayType() {
        return this.repayType;
    }

    public CountDubbridgeRepayTrialRequest setOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }
    public String getOrderNo() {
        return this.orderNo;
    }

    public CountDubbridgeRepayTrialRequest setPeriodList(java.util.List<Long> periodList) {
        this.periodList = periodList;
        return this;
    }
    public java.util.List<Long> getPeriodList() {
        return this.periodList;
    }

    public CountDubbridgeRepayTrialRequest setInterestSubsidyRatio(String interestSubsidyRatio) {
        this.interestSubsidyRatio = interestSubsidyRatio;
        return this;
    }
    public String getInterestSubsidyRatio() {
        return this.interestSubsidyRatio;
    }

    public CountDubbridgeRepayTrialRequest setReferenceRatio(String referenceRatio) {
        this.referenceRatio = referenceRatio;
        return this;
    }
    public String getReferenceRatio() {
        return this.referenceRatio;
    }

}
