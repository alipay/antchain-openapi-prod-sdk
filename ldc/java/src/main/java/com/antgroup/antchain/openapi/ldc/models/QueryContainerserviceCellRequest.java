// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class QueryContainerserviceCellRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // container service name
    @NameInMap("container_service_name")
    @Validation(required = true)
    public String containerServiceName;

    public static QueryContainerserviceCellRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryContainerserviceCellRequest self = new QueryContainerserviceCellRequest();
        return TeaModel.build(map, self);
    }

    public QueryContainerserviceCellRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryContainerserviceCellRequest setContainerServiceName(String containerServiceName) {
        this.containerServiceName = containerServiceName;
        return this;
    }
    public String getContainerServiceName() {
        return this.containerServiceName;
    }

}
