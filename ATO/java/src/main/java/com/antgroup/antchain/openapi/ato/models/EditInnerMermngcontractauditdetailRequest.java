// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class EditInnerMermngcontractauditdetailRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // traceid
    @NameInMap("trace_id")
    @Validation(required = true)
    public String traceId;

    // 商户租户id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 审核id
    @NameInMap("audit_id")
    @Validation(required = true)
    public String auditId;

    // 审核详情id
    @NameInMap("audit_detail_id")
    @Validation(required = true)
    public String auditDetailId;

    // ADOPT采纳    
    // CANCEL撤回   
    // EDIT编辑
    @NameInMap("operate_type")
    @Validation(required = true)
    public String operateType;

    // REVISE 修订   
    // ANNOTATION 批注
    @NameInMap("content_type")
    @Validation(required = true)
    public String contentType;

    // 编辑修订内容/采纳修订内容/采纳批注内容
    @NameInMap("content")
    @Validation(required = true)
    public String content;

    public static EditInnerMermngcontractauditdetailRequest build(java.util.Map<String, ?> map) throws Exception {
        EditInnerMermngcontractauditdetailRequest self = new EditInnerMermngcontractauditdetailRequest();
        return TeaModel.build(map, self);
    }

    public EditInnerMermngcontractauditdetailRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public EditInnerMermngcontractauditdetailRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public EditInnerMermngcontractauditdetailRequest setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public EditInnerMermngcontractauditdetailRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public EditInnerMermngcontractauditdetailRequest setAuditId(String auditId) {
        this.auditId = auditId;
        return this;
    }
    public String getAuditId() {
        return this.auditId;
    }

    public EditInnerMermngcontractauditdetailRequest setAuditDetailId(String auditDetailId) {
        this.auditDetailId = auditDetailId;
        return this;
    }
    public String getAuditDetailId() {
        return this.auditDetailId;
    }

    public EditInnerMermngcontractauditdetailRequest setOperateType(String operateType) {
        this.operateType = operateType;
        return this;
    }
    public String getOperateType() {
        return this.operateType;
    }

    public EditInnerMermngcontractauditdetailRequest setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public String getContentType() {
        return this.contentType;
    }

    public EditInnerMermngcontractauditdetailRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

}
