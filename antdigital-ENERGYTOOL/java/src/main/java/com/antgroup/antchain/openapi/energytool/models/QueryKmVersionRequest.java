// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.energytool.models;

import com.aliyun.tea.*;

public class QueryKmVersionRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 树ID
    @NameInMap("tree_id")
    @Validation(required = true)
    public String treeId;

    public static QueryKmVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryKmVersionRequest self = new QueryKmVersionRequest();
        return TeaModel.build(map, self);
    }

    public QueryKmVersionRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryKmVersionRequest setTreeId(String treeId) {
        this.treeId = treeId;
        return this;
    }
    public String getTreeId() {
        return this.treeId;
    }

}
