// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cafecmdb.models;

import com.aliyun.tea.*;

public class UpdateAttributegroupRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // id
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // display_name
    @NameInMap("display_name")
    @Validation(required = true)
    public String displayName;

    public static UpdateAttributegroupRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAttributegroupRequest self = new UpdateAttributegroupRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAttributegroupRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateAttributegroupRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UpdateAttributegroupRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

}
