// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acm.models;

import com.aliyun.tea.*;

public class GetAntpassportTenantRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 蚂蚁通行证uid
    @NameInMap("ant_uid")
    @Validation(required = true)
    public String antUid;

    public static GetAntpassportTenantRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAntpassportTenantRequest self = new GetAntpassportTenantRequest();
        return TeaModel.build(map, self);
    }

    public GetAntpassportTenantRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetAntpassportTenantRequest setAntUid(String antUid) {
        this.antUid = antUid;
        return this;
    }
    public String getAntUid() {
        return this.antUid;
    }

}
