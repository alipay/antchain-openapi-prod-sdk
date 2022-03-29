// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class DeleteTraasmetaHostmachineRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // uuid
    @NameInMap("uuid")
    @Validation(required = true)
    public String uuid;

    public static DeleteTraasmetaHostmachineRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteTraasmetaHostmachineRequest self = new DeleteTraasmetaHostmachineRequest();
        return TeaModel.build(map, self);
    }

    public DeleteTraasmetaHostmachineRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteTraasmetaHostmachineRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}
