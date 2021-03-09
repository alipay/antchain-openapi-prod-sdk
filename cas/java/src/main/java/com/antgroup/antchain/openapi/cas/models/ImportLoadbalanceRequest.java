// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class ImportLoadbalanceRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // loadbalance iaas ids
    @NameInMap("loadbalance_ids")
    @Validation(required = true)
    public java.util.List<String> loadbalanceIds;

    // 工作空间
    @NameInMap("workspace")
    @Validation(required = true)
    public String workspace;

    public static ImportLoadbalanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportLoadbalanceRequest self = new ImportLoadbalanceRequest();
        return TeaModel.build(map, self);
    }

    public ImportLoadbalanceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ImportLoadbalanceRequest setLoadbalanceIds(java.util.List<String> loadbalanceIds) {
        this.loadbalanceIds = loadbalanceIds;
        return this;
    }
    public java.util.List<String> getLoadbalanceIds() {
        return this.loadbalanceIds;
    }

    public ImportLoadbalanceRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
