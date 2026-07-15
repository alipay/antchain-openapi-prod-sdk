// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.org.models;

import com.aliyun.tea.*;

public class QueryAntdigitalMediasmsOutcallCallbackRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 对应外呼任务创建接口返回的task_id
    @NameInMap("batch_task_id")
    @Validation(required = true)
    public String batchTaskId;

    // 手机号列表
    @NameInMap("phone_list")
    public java.util.List<String> phoneList;

    // 租户ID
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    public static QueryAntdigitalMediasmsOutcallCallbackRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAntdigitalMediasmsOutcallCallbackRequest self = new QueryAntdigitalMediasmsOutcallCallbackRequest();
        return TeaModel.build(map, self);
    }

    public QueryAntdigitalMediasmsOutcallCallbackRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAntdigitalMediasmsOutcallCallbackRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAntdigitalMediasmsOutcallCallbackRequest setBatchTaskId(String batchTaskId) {
        this.batchTaskId = batchTaskId;
        return this;
    }
    public String getBatchTaskId() {
        return this.batchTaskId;
    }

    public QueryAntdigitalMediasmsOutcallCallbackRequest setPhoneList(java.util.List<String> phoneList) {
        this.phoneList = phoneList;
        return this;
    }
    public java.util.List<String> getPhoneList() {
        return this.phoneList;
    }

    public QueryAntdigitalMediasmsOutcallCallbackRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
