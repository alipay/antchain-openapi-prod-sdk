// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class FindcreateQuotaInstanceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // single_dim_groups
    @NameInMap("single_dim_groups")
    @Validation(required = true)
    public java.util.List<SingleDimGroup> singleDimGroups;

    public static FindcreateQuotaInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        FindcreateQuotaInstanceRequest self = new FindcreateQuotaInstanceRequest();
        return TeaModel.build(map, self);
    }

    public FindcreateQuotaInstanceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public FindcreateQuotaInstanceRequest setSingleDimGroups(java.util.List<SingleDimGroup> singleDimGroups) {
        this.singleDimGroups = singleDimGroups;
        return this;
    }
    public java.util.List<SingleDimGroup> getSingleDimGroups() {
        return this.singleDimGroups;
    }

}
