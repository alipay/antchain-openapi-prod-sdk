// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class RetryMachinegroupRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 分组 ID
    @NameInMap("id")
    public String id;

    // retry info
    @NameInMap("retry_info")
    public RetryInfo retryInfo;

    // workspace
    @NameInMap("workspace")
    public String workspace;

    public static RetryMachinegroupRequest build(java.util.Map<String, ?> map) throws Exception {
        RetryMachinegroupRequest self = new RetryMachinegroupRequest();
        return TeaModel.build(map, self);
    }

    public RetryMachinegroupRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public RetryMachinegroupRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public RetryMachinegroupRequest setRetryInfo(RetryInfo retryInfo) {
        this.retryInfo = retryInfo;
        return this;
    }
    public RetryInfo getRetryInfo() {
        return this.retryInfo;
    }

    public RetryMachinegroupRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
