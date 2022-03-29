// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class BatchcreateTraasmetaAppserverRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // app_servers
    @NameInMap("app_servers")
    @Validation(required = true)
    public java.util.List<TraasAppServerDto> appServers;

    public static BatchcreateTraasmetaAppserverRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchcreateTraasmetaAppserverRequest self = new BatchcreateTraasmetaAppserverRequest();
        return TeaModel.build(map, self);
    }

    public BatchcreateTraasmetaAppserverRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BatchcreateTraasmetaAppserverRequest setAppServers(java.util.List<TraasAppServerDto> appServers) {
        this.appServers = appServers;
        return this;
    }
    public java.util.List<TraasAppServerDto> getAppServers() {
        return this.appServers;
    }

}
