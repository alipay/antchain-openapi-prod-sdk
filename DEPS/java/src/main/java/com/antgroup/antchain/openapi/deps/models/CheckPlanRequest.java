// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class CheckPlanRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // data
    @NameInMap("data")
    public String data;

    // from_aliyun
    @NameInMap("from_aliyun")
    public Boolean fromAliyun;

    // workspace
    @NameInMap("workspace")
    public String workspace;

    public static CheckPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckPlanRequest self = new CheckPlanRequest();
        return TeaModel.build(map, self);
    }

    public CheckPlanRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CheckPlanRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public CheckPlanRequest setFromAliyun(Boolean fromAliyun) {
        this.fromAliyun = fromAliyun;
        return this;
    }
    public Boolean getFromAliyun() {
        return this.fromAliyun;
    }

    public CheckPlanRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
