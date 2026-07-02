// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class QueryOnlinepressuretestRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 项目ID
    @NameInMap("project_id")
    @Validation(required = true)
    public String projectId;

    public static QueryOnlinepressuretestRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryOnlinepressuretestRequest self = new QueryOnlinepressuretestRequest();
        return TeaModel.build(map, self);
    }

    public QueryOnlinepressuretestRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryOnlinepressuretestRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryOnlinepressuretestRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

}
