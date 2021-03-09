// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class ListResourceComputertypefamilyRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // region name
    @NameInMap("region")
    @Validation(required = true)
    public String region;

    public static ListResourceComputertypefamilyRequest build(java.util.Map<String, ?> map) throws Exception {
        ListResourceComputertypefamilyRequest self = new ListResourceComputertypefamilyRequest();
        return TeaModel.build(map, self);
    }

    public ListResourceComputertypefamilyRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListResourceComputertypefamilyRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

}
