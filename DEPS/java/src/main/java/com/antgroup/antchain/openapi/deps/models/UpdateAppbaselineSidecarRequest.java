// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class UpdateAppbaselineSidecarRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("tenant")
    public String tenant;

    // 应用sidecar基线id
    @NameInMap("appbaseline_id")
    @Validation(required = true)
    public String appbaselineId;

    // 是否开启sidecar
    @NameInMap("enable")
    @Validation(required = true)
    public Boolean enable;

    // sidecar版本号
    @NameInMap("sidecar_version")
    @Validation(required = true)
    public String sidecarVersion;

    public static UpdateAppbaselineSidecarRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAppbaselineSidecarRequest self = new UpdateAppbaselineSidecarRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAppbaselineSidecarRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateAppbaselineSidecarRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public UpdateAppbaselineSidecarRequest setAppbaselineId(String appbaselineId) {
        this.appbaselineId = appbaselineId;
        return this;
    }
    public String getAppbaselineId() {
        return this.appbaselineId;
    }

    public UpdateAppbaselineSidecarRequest setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public UpdateAppbaselineSidecarRequest setSidecarVersion(String sidecarVersion) {
        this.sidecarVersion = sidecarVersion;
        return this;
    }
    public String getSidecarVersion() {
        return this.sidecarVersion;
    }

}
