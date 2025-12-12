// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.insurance_saas.models;

import com.aliyun.tea.*;

public class CallbackMarketingPolicycancelRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 请求 id
    @NameInMap("request_id")
    @Validation(required = true)
    public String requestId;

    // 保单号（可脱敏处理）
    @NameInMap("policy_no")
    @Validation(required = true)
    public String policyNo;

    // 退保时间（yyyy-MM-dd  HH:mm:ss）
    @NameInMap("cancel_time")
    @Validation(required = true)
    public String cancelTime;

    // 保险止期（yyyy-MM-dd  HH:mm:ss）
    @NameInMap("end_time")
    @Validation(required = true)
    public String endTime;

    public static CallbackMarketingPolicycancelRequest build(java.util.Map<String, ?> map) throws Exception {
        CallbackMarketingPolicycancelRequest self = new CallbackMarketingPolicycancelRequest();
        return TeaModel.build(map, self);
    }

    public CallbackMarketingPolicycancelRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CallbackMarketingPolicycancelRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CallbackMarketingPolicycancelRequest setPolicyNo(String policyNo) {
        this.policyNo = policyNo;
        return this;
    }
    public String getPolicyNo() {
        return this.policyNo;
    }

    public CallbackMarketingPolicycancelRequest setCancelTime(String cancelTime) {
        this.cancelTime = cancelTime;
        return this;
    }
    public String getCancelTime() {
        return this.cancelTime;
    }

    public CallbackMarketingPolicycancelRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

}
