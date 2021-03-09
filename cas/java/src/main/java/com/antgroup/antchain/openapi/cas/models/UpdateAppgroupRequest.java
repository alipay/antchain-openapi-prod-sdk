// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class UpdateAppgroupRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 更新内容
    @NameInMap("domain")
    @Validation(required = true)
    public AppDomainFlatten domain;

    // 应用分组id
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    public static UpdateAppgroupRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAppgroupRequest self = new UpdateAppgroupRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAppgroupRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateAppgroupRequest setDomain(AppDomainFlatten domain) {
        this.domain = domain;
        return this;
    }
    public AppDomainFlatten getDomain() {
        return this.domain;
    }

    public UpdateAppgroupRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
