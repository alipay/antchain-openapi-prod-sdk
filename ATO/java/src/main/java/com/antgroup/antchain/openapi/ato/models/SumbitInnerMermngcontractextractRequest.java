// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class SumbitInnerMermngcontractextractRequest extends TeaModel {
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

    // code
    @NameInMap("task_code")
    @Validation(required = true)
    public String taskCode;

    // 业务id
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // 文件url
    @NameInMap("file_url")
    @Validation(required = true)
    public String fileUrl;

    // 额外参数
    @NameInMap("biz_params")
    public String bizParams;

    public static SumbitInnerMermngcontractextractRequest build(java.util.Map<String, ?> map) throws Exception {
        SumbitInnerMermngcontractextractRequest self = new SumbitInnerMermngcontractextractRequest();
        return TeaModel.build(map, self);
    }

    public SumbitInnerMermngcontractextractRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SumbitInnerMermngcontractextractRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SumbitInnerMermngcontractextractRequest setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public SumbitInnerMermngcontractextractRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public SumbitInnerMermngcontractextractRequest setTaskCode(String taskCode) {
        this.taskCode = taskCode;
        return this;
    }
    public String getTaskCode() {
        return this.taskCode;
    }

    public SumbitInnerMermngcontractextractRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public SumbitInnerMermngcontractextractRequest setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }
    public String getFileUrl() {
        return this.fileUrl;
    }

    public SumbitInnerMermngcontractextractRequest setBizParams(String bizParams) {
        this.bizParams = bizParams;
        return this;
    }
    public String getBizParams() {
        return this.bizParams;
    }

}
