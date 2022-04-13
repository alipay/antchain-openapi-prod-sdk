// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class CreateSidecarOperationRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 环境信息，对应workspace_group名称
    @NameInMap("env")
    @Validation(required = true)
    public String env;

    // sidecar运维动作：
    // 接入 open
    // 升级 upgrade
    @NameInMap("service_key")
    @Validation(required = true)
    public String serviceKey;

    // sidecar运维请求体
    @NameInMap("execute_task_request")
    @Validation(required = true)
    public SidecarOperationTask executeTaskRequest;

    public static CreateSidecarOperationRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSidecarOperationRequest self = new CreateSidecarOperationRequest();
        return TeaModel.build(map, self);
    }

    public CreateSidecarOperationRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateSidecarOperationRequest setEnv(String env) {
        this.env = env;
        return this;
    }
    public String getEnv() {
        return this.env;
    }

    public CreateSidecarOperationRequest setServiceKey(String serviceKey) {
        this.serviceKey = serviceKey;
        return this;
    }
    public String getServiceKey() {
        return this.serviceKey;
    }

    public CreateSidecarOperationRequest setExecuteTaskRequest(SidecarOperationTask executeTaskRequest) {
        this.executeTaskRequest = executeTaskRequest;
        return this;
    }
    public SidecarOperationTask getExecuteTaskRequest() {
        return this.executeTaskRequest;
    }

}
