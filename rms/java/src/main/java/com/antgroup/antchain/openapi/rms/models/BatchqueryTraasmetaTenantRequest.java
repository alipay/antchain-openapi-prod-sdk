// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class BatchqueryTraasmetaTenantRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // uuid数组
    @NameInMap("uuids")
    public java.util.List<String> uuids;

    // names
    @NameInMap("names")
    public java.util.List<String> names;

    public static BatchqueryTraasmetaTenantRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchqueryTraasmetaTenantRequest self = new BatchqueryTraasmetaTenantRequest();
        return TeaModel.build(map, self);
    }

    public BatchqueryTraasmetaTenantRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BatchqueryTraasmetaTenantRequest setUuids(java.util.List<String> uuids) {
        this.uuids = uuids;
        return this;
    }
    public java.util.List<String> getUuids() {
        return this.uuids;
    }

    public BatchqueryTraasmetaTenantRequest setNames(java.util.List<String> names) {
        this.names = names;
        return this;
    }
    public java.util.List<String> getNames() {
        return this.names;
    }

}
