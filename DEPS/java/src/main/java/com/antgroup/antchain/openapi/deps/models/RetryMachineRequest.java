// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class RetryMachineRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 发布机器 ID
    @NameInMap("id")
    public String id;

    // retry_info
    @NameInMap("retry_info")
    public RetryInfo retryInfo;

    // workspace
    @NameInMap("workspace")
    public String workspace;

    public static RetryMachineRequest build(java.util.Map<String, ?> map) throws Exception {
        RetryMachineRequest self = new RetryMachineRequest();
        return TeaModel.build(map, self);
    }

    public RetryMachineRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public RetryMachineRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public RetryMachineRequest setRetryInfo(RetryInfo retryInfo) {
        this.retryInfo = retryInfo;
        return this;
    }
    public RetryInfo getRetryInfo() {
        return this.retryInfo;
    }

    public RetryMachineRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
