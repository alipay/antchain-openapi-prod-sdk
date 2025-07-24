// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.insurance_saas.models;

import com.aliyun.tea.*;

public class NotifyInterestSupplierpolicyRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 请求流水号，每次推送需要唯一
    @NameInMap("request_no")
    @Validation(required = true)
    public String requestNo;

    // 我方权益申请流水号
    @NameInMap("interest_no")
    @Validation(required = true)
    public String interestNo;

    // 保单信息 json字符串
    @NameInMap("policy_info")
    @Validation(required = true)
    public String policyInfo;

    public static NotifyInterestSupplierpolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        NotifyInterestSupplierpolicyRequest self = new NotifyInterestSupplierpolicyRequest();
        return TeaModel.build(map, self);
    }

    public NotifyInterestSupplierpolicyRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public NotifyInterestSupplierpolicyRequest setRequestNo(String requestNo) {
        this.requestNo = requestNo;
        return this;
    }
    public String getRequestNo() {
        return this.requestNo;
    }

    public NotifyInterestSupplierpolicyRequest setInterestNo(String interestNo) {
        this.interestNo = interestNo;
        return this;
    }
    public String getInterestNo() {
        return this.interestNo;
    }

    public NotifyInterestSupplierpolicyRequest setPolicyInfo(String policyInfo) {
        this.policyInfo = policyInfo;
        return this;
    }
    public String getPolicyInfo() {
        return this.policyInfo;
    }

}
