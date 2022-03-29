// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.op.models;

import com.aliyun.tea.*;

public class ApiMeta extends TeaModel {
    // api名字
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // api简介
    @NameInMap("summary")
    @Validation(required = true)
    public String summary;

    // api负责人
    @NameInMap("owner")
    @Validation(required = true)
    public String owner;

    // 为true时，不签约的情况下也可以调用
    @NameInMap("activation_disabled")
    @Validation(required = true)
    public Boolean activationDisabled;

    // 是否对外展示
    @NameInMap("internal")
    @Validation(required = true)
    public Boolean internal;

    // unique_id
    @NameInMap("default_unique_id")
    public String defaultUniqueId;

    // 调用路径
    @NameInMap("default_http_path")
    public String defaultHttpPath;

    // 允许使用的用户类型
    @NameInMap("allowed_user_type")
    public String allowedUserType;

    // 是否是第三方授权
    @NameInMap("third_party_auth")
    @Validation(required = true)
    public Boolean thirdPartyAuth;

    // 动作名称
    @NameInMap("action_name")
    @Validation(required = true)
    public String actionName;

    // 角色名称
    @NameInMap("role_name")
    public String roleName;

    // api描述
    @NameInMap("description")
    @Validation(required = true)
    public String description;

    // api状态
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 产品码
    @NameInMap("provider_id")
    @Validation(required = true)
    public String providerId;

    // 分组id
    @NameInMap("group_id")
    @Validation(required = true)
    public String groupId;

    // 套件id
    @NameInMap("api_suite_id")
    @Validation(required = true)
    public String apiSuiteId;

    // 扩展参数
    @NameInMap("ext_attribute")
    public String extAttribute;

    public static ApiMeta build(java.util.Map<String, ?> map) throws Exception {
        ApiMeta self = new ApiMeta();
        return TeaModel.build(map, self);
    }

    public ApiMeta setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ApiMeta setSummary(String summary) {
        this.summary = summary;
        return this;
    }
    public String getSummary() {
        return this.summary;
    }

    public ApiMeta setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public ApiMeta setActivationDisabled(Boolean activationDisabled) {
        this.activationDisabled = activationDisabled;
        return this;
    }
    public Boolean getActivationDisabled() {
        return this.activationDisabled;
    }

    public ApiMeta setInternal(Boolean internal) {
        this.internal = internal;
        return this;
    }
    public Boolean getInternal() {
        return this.internal;
    }

    public ApiMeta setDefaultUniqueId(String defaultUniqueId) {
        this.defaultUniqueId = defaultUniqueId;
        return this;
    }
    public String getDefaultUniqueId() {
        return this.defaultUniqueId;
    }

    public ApiMeta setDefaultHttpPath(String defaultHttpPath) {
        this.defaultHttpPath = defaultHttpPath;
        return this;
    }
    public String getDefaultHttpPath() {
        return this.defaultHttpPath;
    }

    public ApiMeta setAllowedUserType(String allowedUserType) {
        this.allowedUserType = allowedUserType;
        return this;
    }
    public String getAllowedUserType() {
        return this.allowedUserType;
    }

    public ApiMeta setThirdPartyAuth(Boolean thirdPartyAuth) {
        this.thirdPartyAuth = thirdPartyAuth;
        return this;
    }
    public Boolean getThirdPartyAuth() {
        return this.thirdPartyAuth;
    }

    public ApiMeta setActionName(String actionName) {
        this.actionName = actionName;
        return this;
    }
    public String getActionName() {
        return this.actionName;
    }

    public ApiMeta setRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }
    public String getRoleName() {
        return this.roleName;
    }

    public ApiMeta setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ApiMeta setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ApiMeta setProviderId(String providerId) {
        this.providerId = providerId;
        return this;
    }
    public String getProviderId() {
        return this.providerId;
    }

    public ApiMeta setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public ApiMeta setApiSuiteId(String apiSuiteId) {
        this.apiSuiteId = apiSuiteId;
        return this;
    }
    public String getApiSuiteId() {
        return this.apiSuiteId;
    }

    public ApiMeta setExtAttribute(String extAttribute) {
        this.extAttribute = extAttribute;
        return this;
    }
    public String getExtAttribute() {
        return this.extAttribute;
    }

}
