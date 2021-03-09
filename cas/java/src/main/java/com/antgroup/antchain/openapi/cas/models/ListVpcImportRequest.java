// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class ListVpcImportRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // region name
    @NameInMap("region")
    @Validation(required = true)
    public String region;

    // workspace name
    @NameInMap("workspace")
    @Validation(required = true)
    public String workspace;

    public static ListVpcImportRequest build(java.util.Map<String, ?> map) throws Exception {
        ListVpcImportRequest self = new ListVpcImportRequest();
        return TeaModel.build(map, self);
    }

    public ListVpcImportRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListVpcImportRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public ListVpcImportRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
