// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class CreateXdatasourceRequest extends TeaModel {
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

    public static CreateXdatasourceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateXdatasourceRequest self = new CreateXdatasourceRequest();
        return TeaModel.build(map, self);
    }

    public CreateXdatasourceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateXdatasourceRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public CreateXdatasourceRequest setData(XDatasourceCRULResponseCURequest data) {
        this.data = data;
        return this;
    }
    public XDatasourceCRULResponseCURequest getData() {
        return this.data;
    }

}
