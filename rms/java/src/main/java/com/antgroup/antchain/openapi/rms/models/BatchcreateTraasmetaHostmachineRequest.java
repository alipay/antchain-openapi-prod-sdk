// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class BatchcreateTraasmetaHostmachineRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // hosts
    @NameInMap("hosts")
    @Validation(required = true)
    public java.util.List<TraasHostMachineDto> hosts;

    public static BatchcreateTraasmetaHostmachineRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchcreateTraasmetaHostmachineRequest self = new BatchcreateTraasmetaHostmachineRequest();
        return TeaModel.build(map, self);
    }

    public BatchcreateTraasmetaHostmachineRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BatchcreateTraasmetaHostmachineRequest setHosts(java.util.List<TraasHostMachineDto> hosts) {
        this.hosts = hosts;
        return this;
    }
    public java.util.List<TraasHostMachineDto> getHosts() {
        return this.hosts;
    }

}
