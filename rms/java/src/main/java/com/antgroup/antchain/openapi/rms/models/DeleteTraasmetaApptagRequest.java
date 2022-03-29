// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class DeleteTraasmetaApptagRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // uuid
    @NameInMap("uuid")
    @Validation(required = true)
    public String uuid;

    public static DeleteTraasmetaApptagRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteTraasmetaApptagRequest self = new DeleteTraasmetaApptagRequest();
        return TeaModel.build(map, self);
    }

    public DeleteTraasmetaApptagRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteTraasmetaApptagRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}
