// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class DeleteLoadbalanceMountRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // id
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // computer_ids
    @NameInMap("computer_ids")
    @Validation(required = true)
    public java.util.List<String> computerIds;

    public static DeleteLoadbalanceMountRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLoadbalanceMountRequest self = new DeleteLoadbalanceMountRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLoadbalanceMountRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteLoadbalanceMountRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DeleteLoadbalanceMountRequest setComputerIds(java.util.List<String> computerIds) {
        this.computerIds = computerIds;
        return this;
    }
    public java.util.List<String> getComputerIds() {
        return this.computerIds;
    }

}
