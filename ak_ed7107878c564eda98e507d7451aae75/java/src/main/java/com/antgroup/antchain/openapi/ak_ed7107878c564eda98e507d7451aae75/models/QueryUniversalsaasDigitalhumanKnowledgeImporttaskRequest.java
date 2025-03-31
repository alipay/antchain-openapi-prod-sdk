// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_ed7107878c564eda98e507d7451aae75.models;

import com.aliyun.tea.*;

public class QueryUniversalsaasDigitalhumanKnowledgeImporttaskRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户编码
    @NameInMap("tenant_code")
    @Validation(required = true)
    public String tenantCode;

    // 导入任务id
    @NameInMap("task_id")
    @Validation(required = true)
    public Long taskId;

    public static QueryUniversalsaasDigitalhumanKnowledgeImporttaskRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryUniversalsaasDigitalhumanKnowledgeImporttaskRequest self = new QueryUniversalsaasDigitalhumanKnowledgeImporttaskRequest();
        return TeaModel.build(map, self);
    }

    public QueryUniversalsaasDigitalhumanKnowledgeImporttaskRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryUniversalsaasDigitalhumanKnowledgeImporttaskRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryUniversalsaasDigitalhumanKnowledgeImporttaskRequest setTenantCode(String tenantCode) {
        this.tenantCode = tenantCode;
        return this;
    }
    public String getTenantCode() {
        return this.tenantCode;
    }

    public QueryUniversalsaasDigitalhumanKnowledgeImporttaskRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
