// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class ListVpcCidrblockRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // region
    @NameInMap("region")
    public String region;

    public static ListVpcCidrblockRequest build(java.util.Map<String, ?> map) throws Exception {
        ListVpcCidrblockRequest self = new ListVpcCidrblockRequest();
        return TeaModel.build(map, self);
    }

    public ListVpcCidrblockRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListVpcCidrblockRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

}
