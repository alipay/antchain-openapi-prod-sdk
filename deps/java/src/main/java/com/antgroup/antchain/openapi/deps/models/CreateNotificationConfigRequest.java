// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class CreateNotificationConfigRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("tenant")
    public String tenant;

    // cloud web url
    @NameInMap("cloud_web_url")
    @Validation(required = true)
    public String cloudWebUrl;

    // 是否开启，默认关闭
    @NameInMap("enabled")
    public Boolean enabled;

    // modified_version
    @NameInMap("modified_version")
    @Validation(required = true)
    public Long modifiedVersion;

    // 接受者
    @NameInMap("receivers")
    @Validation(required = true)
    public java.util.List<String> receivers;

    // 类型
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // workspace
    @NameInMap("workspace")
    @Validation(required = true)
    public String workspace;

    public static CreateNotificationConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateNotificationConfigRequest self = new CreateNotificationConfigRequest();
        return TeaModel.build(map, self);
    }

    public CreateNotificationConfigRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateNotificationConfigRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public CreateNotificationConfigRequest setCloudWebUrl(String cloudWebUrl) {
        this.cloudWebUrl = cloudWebUrl;
        return this;
    }
    public String getCloudWebUrl() {
        return this.cloudWebUrl;
    }

    public CreateNotificationConfigRequest setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public CreateNotificationConfigRequest setModifiedVersion(Long modifiedVersion) {
        this.modifiedVersion = modifiedVersion;
        return this;
    }
    public Long getModifiedVersion() {
        return this.modifiedVersion;
    }

    public CreateNotificationConfigRequest setReceivers(java.util.List<String> receivers) {
        this.receivers = receivers;
        return this;
    }
    public java.util.List<String> getReceivers() {
        return this.receivers;
    }

    public CreateNotificationConfigRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CreateNotificationConfigRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
