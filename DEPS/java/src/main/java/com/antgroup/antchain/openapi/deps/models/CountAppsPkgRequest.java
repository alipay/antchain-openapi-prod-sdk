// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class CountAppsPkgRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 应用 id 列表
    @NameInMap("app_ids")
    public java.util.List<String> appIds;

    // workspace
    @NameInMap("workspace")
    public String workspace;

    public static CountAppsPkgRequest build(java.util.Map<String, ?> map) throws Exception {
        CountAppsPkgRequest self = new CountAppsPkgRequest();
        return TeaModel.build(map, self);
    }

    public CountAppsPkgRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CountAppsPkgRequest setAppIds(java.util.List<String> appIds) {
        this.appIds = appIds;
        return this;
    }
    public java.util.List<String> getAppIds() {
        return this.appIds;
    }

    public CountAppsPkgRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
