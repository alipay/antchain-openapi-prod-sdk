// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class ConfirmIpUpdateapprovalRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 基础字段
    @NameInMap("base_request")
    @Validation(required = true)
    public BaseRequestInfo baseRequest;

    // ip的id
    @NameInMap("ip_id")
    @Validation(required = true)
    public String ipId;

    // 是否审批通过
    @NameInMap("is_approval")
    @Validation(required = true)
    public Boolean isApproval;

    // 审批信息
    @NameInMap("approval_comments")
    public String approvalComments;

    public static ConfirmIpUpdateapprovalRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfirmIpUpdateapprovalRequest self = new ConfirmIpUpdateapprovalRequest();
        return TeaModel.build(map, self);
    }

    public ConfirmIpUpdateapprovalRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ConfirmIpUpdateapprovalRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ConfirmIpUpdateapprovalRequest setBaseRequest(BaseRequestInfo baseRequest) {
        this.baseRequest = baseRequest;
        return this;
    }
    public BaseRequestInfo getBaseRequest() {
        return this.baseRequest;
    }

    public ConfirmIpUpdateapprovalRequest setIpId(String ipId) {
        this.ipId = ipId;
        return this;
    }
    public String getIpId() {
        return this.ipId;
    }

    public ConfirmIpUpdateapprovalRequest setIsApproval(Boolean isApproval) {
        this.isApproval = isApproval;
        return this;
    }
    public Boolean getIsApproval() {
        return this.isApproval;
    }

    public ConfirmIpUpdateapprovalRequest setApprovalComments(String approvalComments) {
        this.approvalComments = approvalComments;
        return this;
    }
    public String getApprovalComments() {
        return this.approvalComments;
    }

}
