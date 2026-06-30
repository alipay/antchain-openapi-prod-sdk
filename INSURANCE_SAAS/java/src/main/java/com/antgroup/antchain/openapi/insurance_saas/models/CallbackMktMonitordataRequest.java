// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.insurance_saas.models;

import com.aliyun.tea.*;

public class CallbackMktMonitordataRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 回传请求对应id
    @NameInMap("request_id")
    @Validation(required = true)
    public String requestId;

    // 监测数据回传数据类型，仅支持: POLICY_DATA（保单信息）, CANCELLATION_DATA（退保信息）, RENEWAL_DATA（续费信息）
    @NameInMap("data_type")
    @Validation(required = true)
    public String dataType;

    // 监测数据回传内容
    @NameInMap("data_content")
    @Validation(required = true)
    public String dataContent;

    // 与待传营销数据相关联的项目id 结合数科网关租户id进行鉴权
    @NameInMap("project_id")
    @Validation(required = true)
    public String projectId;

    public static CallbackMktMonitordataRequest build(java.util.Map<String, ?> map) throws Exception {
        CallbackMktMonitordataRequest self = new CallbackMktMonitordataRequest();
        return TeaModel.build(map, self);
    }

    public CallbackMktMonitordataRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CallbackMktMonitordataRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CallbackMktMonitordataRequest setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

    public CallbackMktMonitordataRequest setDataContent(String dataContent) {
        this.dataContent = dataContent;
        return this;
    }
    public String getDataContent() {
        return this.dataContent;
    }

    public CallbackMktMonitordataRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

}
