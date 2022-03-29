// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class BatchqueryStackGeneratedconfigRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 工作空间
    @NameInMap("workspace_name")
    @Validation(required = true)
    public String workspaceName;

    // 应用名列表
    @NameInMap("app_names")
    public java.util.List<String> appNames;

    public static BatchqueryStackGeneratedconfigRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchqueryStackGeneratedconfigRequest self = new BatchqueryStackGeneratedconfigRequest();
        return TeaModel.build(map, self);
    }

    public BatchqueryStackGeneratedconfigRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BatchqueryStackGeneratedconfigRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public BatchqueryStackGeneratedconfigRequest setAppNames(java.util.List<String> appNames) {
        this.appNames = appNames;
        return this;
    }
    public java.util.List<String> getAppNames() {
        return this.appNames;
    }

}
