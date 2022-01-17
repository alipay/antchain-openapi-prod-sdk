// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class AuthAppInfoVO extends TeaModel {
    // api数
    @NameInMap("api_count")
    public Long apiCount;

    // 应用类型
    @NameInMap("app_type")
    public String appType;

    // auth_app_info_id
    @NameInMap("auth_app_info_id")
    public String authAppInfoId;

    // authAppType
    @NameInMap("auth_app_type")
    public String authAppType;

    // 是否可以删除
    @NameInMap("can_delete")
    public Boolean canDelete;

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

    // subAppCompany
    @NameInMap("sub_app_company")
    public String subAppCompany;

    // subAppDesc
    @NameInMap("sub_app_desc")
    public String subAppDesc;

    // 订阅方appid
    @NameInMap("sub_app_id")
    public String subAppId;

    // sub_app_info
    @NameInMap("sub_app_info")
    public AppInfoVO subAppInfo;

    // subTenantId
    @NameInMap("sub_tenant_id")
    public String subTenantId;

    // subWorkspaceId
    @NameInMap("sub_workspace_id")
    public String subWorkspaceId;

    // api标识
    @NameInMap("api_id")
    public String apiId;

    // 应用名称
    @NameInMap("app_name")
    public String appName;

    // workspace_id
    @NameInMap("workspace_id")
    public String workspaceId;

    // tenant_id
    @NameInMap("tenant_id")
    public String tenantId;

    public static AuthAppInfoVO build(java.util.Map<String, ?> map) throws Exception {
        AuthAppInfoVO self = new AuthAppInfoVO();
        return TeaModel.build(map, self);
    }

    public AuthAppInfoVO setApiCount(Long apiCount) {
        this.apiCount = apiCount;
        return this;
    }
    public Long getApiCount() {
        return this.apiCount;
    }

    public AuthAppInfoVO setAppType(String appType) {
        this.appType = appType;
        return this;
    }
    public String getAppType() {
        return this.appType;
    }

    public AuthAppInfoVO setAuthAppInfoId(String authAppInfoId) {
        this.authAppInfoId = authAppInfoId;
        return this;
    }
    public String getAuthAppInfoId() {
        return this.authAppInfoId;
    }

    public AuthAppInfoVO setAuthAppType(String authAppType) {
        this.authAppType = authAppType;
        return this;
    }
    public String getAuthAppType() {
        return this.authAppType;
    }

    public AuthAppInfoVO setCanDelete(Boolean canDelete) {
        this.canDelete = canDelete;
        return this;
    }
    public Boolean getCanDelete() {
        return this.canDelete;
    }

    public AuthAppInfoVO setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public AuthAppInfoVO setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public AuthAppInfoVO setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public AuthAppInfoVO setSubAppCompany(String subAppCompany) {
        this.subAppCompany = subAppCompany;
        return this;
    }
    public String getSubAppCompany() {
        return this.subAppCompany;
    }

    public AuthAppInfoVO setSubAppDesc(String subAppDesc) {
        this.subAppDesc = subAppDesc;
        return this;
    }
    public String getSubAppDesc() {
        return this.subAppDesc;
    }

    public AuthAppInfoVO setSubAppId(String subAppId) {
        this.subAppId = subAppId;
        return this;
    }
    public String getSubAppId() {
        return this.subAppId;
    }

    public AuthAppInfoVO setSubAppInfo(AppInfoVO subAppInfo) {
        this.subAppInfo = subAppInfo;
        return this;
    }
    public AppInfoVO getSubAppInfo() {
        return this.subAppInfo;
    }

    public AuthAppInfoVO setSubTenantId(String subTenantId) {
        this.subTenantId = subTenantId;
        return this;
    }
    public String getSubTenantId() {
        return this.subTenantId;
    }

    public AuthAppInfoVO setSubWorkspaceId(String subWorkspaceId) {
        this.subWorkspaceId = subWorkspaceId;
        return this;
    }
    public String getSubWorkspaceId() {
        return this.subWorkspaceId;
    }

    public AuthAppInfoVO setApiId(String apiId) {
        this.apiId = apiId;
        return this;
    }
    public String getApiId() {
        return this.apiId;
    }

    public AuthAppInfoVO setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public AuthAppInfoVO setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public AuthAppInfoVO setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
