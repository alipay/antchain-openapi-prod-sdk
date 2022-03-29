// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class DeleteTraasmetaTenantRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // uuid
    @NameInMap("uuid")
    @Validation(required = true)
    public String uuid;

    public static DeleteTraasmetaTenantRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteTraasmetaTenantRequest self = new DeleteTraasmetaTenantRequest();
        return TeaModel.build(map, self);
    }

    public DeleteTraasmetaTenantRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteTraasmetaTenantRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}
