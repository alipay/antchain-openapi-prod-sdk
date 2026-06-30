// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class CallbackMdipAuditRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 审批结果
    @NameInMap("audit_result")
    @Validation(required = true)
    public String auditResult;

    // 工单流水号
    @NameInMap("biz_code")
    @Validation(required = true)
    public String bizCode;

    // 额外信息
    @NameInMap("extend")
    public String extend;

    public static CallbackMdipAuditRequest build(java.util.Map<String, ?> map) throws Exception {
        CallbackMdipAuditRequest self = new CallbackMdipAuditRequest();
        return TeaModel.build(map, self);
    }

    public CallbackMdipAuditRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CallbackMdipAuditRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CallbackMdipAuditRequest setAuditResult(String auditResult) {
        this.auditResult = auditResult;
        return this;
    }
    public String getAuditResult() {
        return this.auditResult;
    }

    public CallbackMdipAuditRequest setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
    }

    public CallbackMdipAuditRequest setExtend(String extend) {
        this.extend = extend;
        return this;
    }
    public String getExtend() {
        return this.extend;
    }

}
