// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class ConfirmIpSuperviseapproveRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 基础字段
    @NameInMap("base_request")
    @Validation(required = true)
    public BaseRequestInfo baseRequest;

    // 监修报审关联的订单id
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 当前期望的审批阶段（用于校验）
    @NameInMap("stage")
    @Validation(required = true)
    public Long stage;

    // 是否审批通过
    @NameInMap("is_approval")
    @Validation(required = true)
    public Boolean isApproval;

    // 审批备注
    @NameInMap("approval_comments")
    public String approvalComments;

    // 审批额外信息
    @NameInMap("approval_ext_info")
    public String approvalExtInfo;

    public static ConfirmIpSuperviseapproveRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfirmIpSuperviseapproveRequest self = new ConfirmIpSuperviseapproveRequest();
        return TeaModel.build(map, self);
    }

    public ConfirmIpSuperviseapproveRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ConfirmIpSuperviseapproveRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ConfirmIpSuperviseapproveRequest setBaseRequest(BaseRequestInfo baseRequest) {
        this.baseRequest = baseRequest;
        return this;
    }
    public BaseRequestInfo getBaseRequest() {
        return this.baseRequest;
    }

    public ConfirmIpSuperviseapproveRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public ConfirmIpSuperviseapproveRequest setStage(Long stage) {
        this.stage = stage;
        return this;
    }
    public Long getStage() {
        return this.stage;
    }

    public ConfirmIpSuperviseapproveRequest setIsApproval(Boolean isApproval) {
        this.isApproval = isApproval;
        return this;
    }
    public Boolean getIsApproval() {
        return this.isApproval;
    }

    public ConfirmIpSuperviseapproveRequest setApprovalComments(String approvalComments) {
        this.approvalComments = approvalComments;
        return this;
    }
    public String getApprovalComments() {
        return this.approvalComments;
    }

    public ConfirmIpSuperviseapproveRequest setApprovalExtInfo(String approvalExtInfo) {
        this.approvalExtInfo = approvalExtInfo;
        return this;
    }
    public String getApprovalExtInfo() {
        return this.approvalExtInfo;
    }

}
