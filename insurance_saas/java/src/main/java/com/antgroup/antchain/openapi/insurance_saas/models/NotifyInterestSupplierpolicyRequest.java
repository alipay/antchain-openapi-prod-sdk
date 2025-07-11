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

    // 权益订单号
    @NameInMap("order_no")
    @Validation(required = true)
    public String orderNo;

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

    public NotifyInterestSupplierpolicyRequest setOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }
    public String getOrderNo() {
        return this.orderNo;
    }

    public NotifyInterestSupplierpolicyRequest setPolicyInfo(String policyInfo) {
        this.policyInfo = policyInfo;
        return this;
    }
    public String getPolicyInfo() {
        return this.policyInfo;
    }

}
