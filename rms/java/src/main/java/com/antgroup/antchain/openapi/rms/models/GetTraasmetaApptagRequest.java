// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class GetTraasmetaApptagRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // uuid
    @NameInMap("uuid")
    public String uuid;

    // app_name
    @NameInMap("app_name")
    public String appName;

    // tenant_uuid
    @NameInMap("tenant_uuid")
    public String tenantUuid;

    // tenant_name
    @NameInMap("tenant_name")
    public String tenantName;

    // tag_key
    @NameInMap("tag_key")
    public String tagKey;

    public static GetTraasmetaApptagRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTraasmetaApptagRequest self = new GetTraasmetaApptagRequest();
        return TeaModel.build(map, self);
    }

    public GetTraasmetaApptagRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetTraasmetaApptagRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

    public GetTraasmetaApptagRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public GetTraasmetaApptagRequest setTenantUuid(String tenantUuid) {
        this.tenantUuid = tenantUuid;
        return this;
    }
    public String getTenantUuid() {
        return this.tenantUuid;
    }

    public GetTraasmetaApptagRequest setTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }
    public String getTenantName() {
        return this.tenantName;
    }

    public GetTraasmetaApptagRequest setTagKey(String tagKey) {
        this.tagKey = tagKey;
        return this;
    }
    public String getTagKey() {
        return this.tagKey;
    }

}
