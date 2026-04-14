// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtcall.models;

import com.aliyun.tea.*;

public class QueryAntcloudDtcallagentTaskRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 租户id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 实例编码
    @NameInMap("instance_code")
    @Validation(required = true)
    public String instanceCode;

    // 任务名称，支持模糊匹配
    @NameInMap("name")
    public String name;

    public static QueryAntcloudDtcallagentTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAntcloudDtcallagentTaskRequest self = new QueryAntcloudDtcallagentTaskRequest();
        return TeaModel.build(map, self);
    }

    public QueryAntcloudDtcallagentTaskRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAntcloudDtcallagentTaskRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public QueryAntcloudDtcallagentTaskRequest setInstanceCode(String instanceCode) {
        this.instanceCode = instanceCode;
        return this;
    }
    public String getInstanceCode() {
        return this.instanceCode;
    }

    public QueryAntcloudDtcallagentTaskRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
