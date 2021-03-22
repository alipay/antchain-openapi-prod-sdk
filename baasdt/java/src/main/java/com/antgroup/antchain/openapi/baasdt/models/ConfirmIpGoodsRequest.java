// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class ConfirmIpGoodsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 基础信息
    @NameInMap("base_request")
    @Validation(required = true)
    public BaseRequestInfo baseRequest;

    // ip id
    @NameInMap("ip_id")
    @Validation(required = true)
    public String ipId;

    // 是否审批通过
    @NameInMap("is_approval")
    @Validation(required = true)
    public Boolean isApproval;

    // 审批意见
    @NameInMap("approval_comments")
    @Validation(required = true)
    public String approvalComments;

    public static ConfirmIpGoodsRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfirmIpGoodsRequest self = new ConfirmIpGoodsRequest();
        return TeaModel.build(map, self);
    }

    public ConfirmIpGoodsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ConfirmIpGoodsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ConfirmIpGoodsRequest setBaseRequest(BaseRequestInfo baseRequest) {
        this.baseRequest = baseRequest;
        return this;
    }
    public BaseRequestInfo getBaseRequest() {
        return this.baseRequest;
    }

    public ConfirmIpGoodsRequest setIpId(String ipId) {
        this.ipId = ipId;
        return this;
    }
    public String getIpId() {
        return this.ipId;
    }

    public ConfirmIpGoodsRequest setIsApproval(Boolean isApproval) {
        this.isApproval = isApproval;
        return this;
    }
    public Boolean getIsApproval() {
        return this.isApproval;
    }

    public ConfirmIpGoodsRequest setApprovalComments(String approvalComments) {
        this.approvalComments = approvalComments;
        return this;
    }
    public String getApprovalComments() {
        return this.approvalComments;
    }

}
