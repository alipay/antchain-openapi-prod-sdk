// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class UpdateTraasmetaTenantRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // uuid
    @NameInMap("uuid")
    @Validation(required = true)
    public String uuid;

    // display_name
    @NameInMap("display_name")
    @Validation(required = true)
    public String displayName;

    // outside_id
    @NameInMap("outside_id")
    @Validation(required = true)
    public String outsideId;

    public static UpdateTraasmetaTenantRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTraasmetaTenantRequest self = new UpdateTraasmetaTenantRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTraasmetaTenantRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateTraasmetaTenantRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

    public UpdateTraasmetaTenantRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public UpdateTraasmetaTenantRequest setOutsideId(String outsideId) {
        this.outsideId = outsideId;
        return this;
    }
    public String getOutsideId() {
        return this.outsideId;
    }

}
