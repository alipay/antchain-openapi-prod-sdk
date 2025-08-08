// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.insurance_saas.models;

import com.aliyun.tea.*;

public class NotifyInterestScenesubjectRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 请求流水号，每次请求不一样
    @NameInMap("request_no")
    @Validation(required = true)
    public String requestNo;

    // 权益流水号
    @NameInMap("interest_no")
    @Validation(required = true)
    public String interestNo;

    // 产品编码
    @NameInMap("product_code")
    @Validation(required = true)
    public String productCode;

    // 申请审批额度，单位元
    @NameInMap("apply_limit_amount")
    public String applyLimitAmount;

    // 申请额度审批状态
    @NameInMap("apply_limit_status")
    @Validation(required = true)
    public String applyLimitStatus;

    // 权益标的信息,JSON字符串
    @NameInMap("interest_subject_info")
    public String interestSubjectInfo;

    public static NotifyInterestScenesubjectRequest build(java.util.Map<String, ?> map) throws Exception {
        NotifyInterestScenesubjectRequest self = new NotifyInterestScenesubjectRequest();
        return TeaModel.build(map, self);
    }

    public NotifyInterestScenesubjectRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public NotifyInterestScenesubjectRequest setRequestNo(String requestNo) {
        this.requestNo = requestNo;
        return this;
    }
    public String getRequestNo() {
        return this.requestNo;
    }

    public NotifyInterestScenesubjectRequest setInterestNo(String interestNo) {
        this.interestNo = interestNo;
        return this;
    }
    public String getInterestNo() {
        return this.interestNo;
    }

    public NotifyInterestScenesubjectRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public NotifyInterestScenesubjectRequest setApplyLimitAmount(String applyLimitAmount) {
        this.applyLimitAmount = applyLimitAmount;
        return this;
    }
    public String getApplyLimitAmount() {
        return this.applyLimitAmount;
    }

    public NotifyInterestScenesubjectRequest setApplyLimitStatus(String applyLimitStatus) {
        this.applyLimitStatus = applyLimitStatus;
        return this;
    }
    public String getApplyLimitStatus() {
        return this.applyLimitStatus;
    }

    public NotifyInterestScenesubjectRequest setInterestSubjectInfo(String interestSubjectInfo) {
        this.interestSubjectInfo = interestSubjectInfo;
        return this;
    }
    public String getInterestSubjectInfo() {
        return this.interestSubjectInfo;
    }

}
