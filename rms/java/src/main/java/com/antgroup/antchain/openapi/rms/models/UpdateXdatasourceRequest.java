// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class UpdateXdatasourceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    //  
    @NameInMap("workspace_name")
    public String workspaceName;

    //  
    @NameInMap("data")
    @Validation(required = true)
    public XDatasourceCRULResponseCURequest data;

    public static UpdateXdatasourceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateXdatasourceRequest self = new UpdateXdatasourceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateXdatasourceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateXdatasourceRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public UpdateXdatasourceRequest setData(XDatasourceCRULResponseCURequest data) {
        this.data = data;
        return this;
    }
    public XDatasourceCRULResponseCURequest getData() {
        return this.data;
    }

}
