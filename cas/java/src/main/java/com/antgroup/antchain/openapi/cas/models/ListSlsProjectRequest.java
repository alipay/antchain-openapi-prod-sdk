// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class ListSlsProjectRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 区域id
    @NameInMap("sls_region_id")
    public String slsRegionId;

    // 租户id
    @NameInMap("tenant_id")
    public String tenantId;

    public static ListSlsProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSlsProjectRequest self = new ListSlsProjectRequest();
        return TeaModel.build(map, self);
    }

    public ListSlsProjectRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListSlsProjectRequest setSlsRegionId(String slsRegionId) {
        this.slsRegionId = slsRegionId;
        return this;
    }
    public String getSlsRegionId() {
        return this.slsRegionId;
    }

    public ListSlsProjectRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
