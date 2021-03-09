// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class ExistAppgroupRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // name
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // parentId
    @NameInMap("parent_id")
    public String parentId;

    public static ExistAppgroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ExistAppgroupRequest self = new ExistAppgroupRequest();
        return TeaModel.build(map, self);
    }

    public ExistAppgroupRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExistAppgroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ExistAppgroupRequest setParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }
    public String getParentId() {
        return this.parentId;
    }

}
