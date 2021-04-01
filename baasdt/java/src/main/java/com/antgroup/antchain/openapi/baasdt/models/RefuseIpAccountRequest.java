// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class RefuseIpAccountRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 基础参数
    @NameInMap("base_request")
    @Validation(required = true)
    public BaseRequestInfo baseRequest;

    // 版权方的链上账户Id
    @NameInMap("account_id")
    @Validation(required = true)
    public String accountId;

    // 拒绝原因
    @NameInMap("reject_reason")
    @Validation(required = true)
    public String rejectReason;

    public static RefuseIpAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        RefuseIpAccountRequest self = new RefuseIpAccountRequest();
        return TeaModel.build(map, self);
    }

    public RefuseIpAccountRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public RefuseIpAccountRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public RefuseIpAccountRequest setBaseRequest(BaseRequestInfo baseRequest) {
        this.baseRequest = baseRequest;
        return this;
    }
    public BaseRequestInfo getBaseRequest() {
        return this.baseRequest;
    }

    public RefuseIpAccountRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public RefuseIpAccountRequest setRejectReason(String rejectReason) {
        this.rejectReason = rejectReason;
        return this;
    }
    public String getRejectReason() {
        return this.rejectReason;
    }

}
