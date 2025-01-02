// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.intlcommoncenter.models;

import com.aliyun.tea.*;

public class OperateApprovalCallbackRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 审批流Id
    @NameInMap("process_id")
    @Validation(required = true)
    public String processId;

    // 审批状态(PASS\UNPASS\CANCEL)
    @NameInMap("audit_status")
    @Validation(required = true)
    public String auditStatus;

    public static OperateApprovalCallbackRequest build(java.util.Map<String, ?> map) throws Exception {
        OperateApprovalCallbackRequest self = new OperateApprovalCallbackRequest();
        return TeaModel.build(map, self);
    }

    public OperateApprovalCallbackRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public OperateApprovalCallbackRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public OperateApprovalCallbackRequest setProcessId(String processId) {
        this.processId = processId;
        return this;
    }
    public String getProcessId() {
        return this.processId;
    }

    public OperateApprovalCallbackRequest setAuditStatus(String auditStatus) {
        this.auditStatus = auditStatus;
        return this;
    }
    public String getAuditStatus() {
        return this.auditStatus;
    }

}
