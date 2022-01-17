// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class AppInfoVO extends TeaModel {
    // api_count
    @NameInMap("api_count")
    public Long apiCount;

    // app_id
    @NameInMap("app_id")
    public String appId;

    // app_name
    @NameInMap("app_name")
    public String appName;

    // appSecret
    @NameInMap("app_secret")
    public String appSecret;

    // app类型
    @NameInMap("app_type")
    public String appType;

    // authenticationConfig
    @NameInMap("authentication_config")
    public AuthenticationConfigVO authenticationConfig;

    // 是否可以删除
    @NameInMap("can_delete")
    public Boolean canDelete;

    // description
    @NameInMap("description")
    public String description;

    // encryptConfig
    @NameInMap("encrypt_config")
    public EncryptConfigVO encryptConfig;

    // 创建时间
    @NameInMap("gmt_create")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtCreate;

    // 更改时间
    @NameInMap("gmt_modified")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtModified;

    // operator
    @NameInMap("operator")
    public String operator;

    // tenant_id
    @NameInMap("tenant_id")
    public String tenantId;

    // workspace_id
    @NameInMap("workspace_id")
    public String workspaceId;

    public static AppInfoVO build(java.util.Map<String, ?> map) throws Exception {
        AppInfoVO self = new AppInfoVO();
        return TeaModel.build(map, self);
    }

    public AppInfoVO setApiCount(Long apiCount) {
        this.apiCount = apiCount;
        return this;
    }
    public Long getApiCount() {
        return this.apiCount;
    }

    public AppInfoVO setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public AppInfoVO setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public AppInfoVO setAppSecret(String appSecret) {
        this.appSecret = appSecret;
        return this;
    }
    public String getAppSecret() {
        return this.appSecret;
    }

    public AppInfoVO setAppType(String appType) {
        this.appType = appType;
        return this;
    }
    public String getAppType() {
        return this.appType;
    }

    public AppInfoVO setAuthenticationConfig(AuthenticationConfigVO authenticationConfig) {
        this.authenticationConfig = authenticationConfig;
        return this;
    }
    public AuthenticationConfigVO getAuthenticationConfig() {
        return this.authenticationConfig;
    }

    public AppInfoVO setCanDelete(Boolean canDelete) {
        this.canDelete = canDelete;
        return this;
    }
    public Boolean getCanDelete() {
        return this.canDelete;
    }

    public AppInfoVO setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public AppInfoVO setEncryptConfig(EncryptConfigVO encryptConfig) {
        this.encryptConfig = encryptConfig;
        return this;
    }
    public EncryptConfigVO getEncryptConfig() {
        return this.encryptConfig;
    }

    public AppInfoVO setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public AppInfoVO setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public AppInfoVO setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public AppInfoVO setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public AppInfoVO setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
