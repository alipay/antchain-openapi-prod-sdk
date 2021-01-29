// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class UpdateNotificationConfigRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("tenant")
    public String tenant;

    // cloud web url
    @NameInMap("cloud_web_url")
    @Validation(required = true)
    public String cloudWebUrl;

    // 是否开启
    @NameInMap("enabled")
    public Boolean enabled;

    // id
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // modified_version
    @NameInMap("modified_version")
    @Validation(required = true)
    public Long modifiedVersion;

    // 接受者
    @NameInMap("receivers")
    public java.util.List<String> receivers;

    // 类型
    @NameInMap("type")
    public String type;

    // workspace
    @NameInMap("workspace")
    @Validation(required = true)
    public String workspace;

    public static UpdateNotificationConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateNotificationConfigRequest self = new UpdateNotificationConfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateNotificationConfigRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateNotificationConfigRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public UpdateNotificationConfigRequest setCloudWebUrl(String cloudWebUrl) {
        this.cloudWebUrl = cloudWebUrl;
        return this;
    }
    public String getCloudWebUrl() {
        return this.cloudWebUrl;
    }

    public UpdateNotificationConfigRequest setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public UpdateNotificationConfigRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UpdateNotificationConfigRequest setModifiedVersion(Long modifiedVersion) {
        this.modifiedVersion = modifiedVersion;
        return this;
    }
    public Long getModifiedVersion() {
        return this.modifiedVersion;
    }

    public UpdateNotificationConfigRequest setReceivers(java.util.List<String> receivers) {
        this.receivers = receivers;
        return this;
    }
    public java.util.List<String> getReceivers() {
        return this.receivers;
    }

    public UpdateNotificationConfigRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public UpdateNotificationConfigRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
