// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.collabinv.models;

import com.aliyun.tea.*;

public class ExecModelSampletaskRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户编码
    @NameInMap("tenant_code")
    @Validation(required = true)
    public String tenantCode;

    // 样本批次号，唯一，建议：租户code+时间戳
    @NameInMap("sample_code")
    @Validation(required = true)
    public String sampleCode;

    // 特征集编码或模型编码，依据类型使用
    @NameInMap("task_code")
    @Validation(required = true)
    public String taskCode;

    // 任务类型：特征集 FEATURESET、模型分 MODEL
    @NameInMap("task_type")
    @Validation(required = true)
    public String taskType;

    // 本次事件序号编码
    @NameInMap("sample_task_code")
    @Validation(required = true)
    public String sampleTaskCode;

    public static ExecModelSampletaskRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecModelSampletaskRequest self = new ExecModelSampletaskRequest();
        return TeaModel.build(map, self);
    }

    public ExecModelSampletaskRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecModelSampletaskRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ExecModelSampletaskRequest setTenantCode(String tenantCode) {
        this.tenantCode = tenantCode;
        return this;
    }
    public String getTenantCode() {
        return this.tenantCode;
    }

    public ExecModelSampletaskRequest setSampleCode(String sampleCode) {
        this.sampleCode = sampleCode;
        return this;
    }
    public String getSampleCode() {
        return this.sampleCode;
    }

    public ExecModelSampletaskRequest setTaskCode(String taskCode) {
        this.taskCode = taskCode;
        return this;
    }
    public String getTaskCode() {
        return this.taskCode;
    }

    public ExecModelSampletaskRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

    public ExecModelSampletaskRequest setSampleTaskCode(String sampleTaskCode) {
        this.sampleTaskCode = sampleTaskCode;
        return this;
    }
    public String getSampleTaskCode() {
        return this.sampleTaskCode;
    }

}
