// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class ApiGroupVO extends TeaModel {
    // api数
    @NameInMap("api_count")
    public Long apiCount;

    // 分组标识(全局唯一)
    @NameInMap("api_group_id")
    public String apiGroupId;

    // 用户授权开关
    @NameInMap("auth_user_switch")
    public String authUserSwitch;

    // 是否可以删除
    @NameInMap("can_delete")
    public Boolean canDelete;

    // 描述
    @NameInMap("description")
    public String description;

    // 域名
    @NameInMap("domain_name")
    public String domainName;

    // 创建时间
    @NameInMap("gmt_create")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtCreate;

    // 更改时间
    @NameInMap("gmt_modified")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtModified;

    // 分组名
    @NameInMap("group_name")
    public String groupName;

    // need_api_auth_user
    @NameInMap("need_api_auth_user")
    public Boolean needApiAuthUser;

    // 创建人
    @NameInMap("operator")
    public String operator;

    // 租户标识
    @NameInMap("tenant_id")
    public String tenantId;

    // 工作空间标识
    @NameInMap("workspace_id")
    public String workspaceId;

    // 是否可操作
    @NameInMap("operation_permission")
    public Boolean operationPermission;

    // DEFAULT|CUSTOM
    @NameInMap("domain_type")
    public String domainType;

    // 自定义域名
    @NameInMap("domain_list")
    public java.util.List<ApiGroupDomainVO> domainList;

    public static ApiGroupVO build(java.util.Map<String, ?> map) throws Exception {
        ApiGroupVO self = new ApiGroupVO();
        return TeaModel.build(map, self);
    }

    public ApiGroupVO setApiCount(Long apiCount) {
        this.apiCount = apiCount;
        return this;
    }
    public Long getApiCount() {
        return this.apiCount;
    }

    public ApiGroupVO setApiGroupId(String apiGroupId) {
        this.apiGroupId = apiGroupId;
        return this;
    }
    public String getApiGroupId() {
        return this.apiGroupId;
    }

    public ApiGroupVO setAuthUserSwitch(String authUserSwitch) {
        this.authUserSwitch = authUserSwitch;
        return this;
    }
    public String getAuthUserSwitch() {
        return this.authUserSwitch;
    }

    public ApiGroupVO setCanDelete(Boolean canDelete) {
        this.canDelete = canDelete;
        return this;
    }
    public Boolean getCanDelete() {
        return this.canDelete;
    }

    public ApiGroupVO setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ApiGroupVO setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public ApiGroupVO setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public ApiGroupVO setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public ApiGroupVO setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public ApiGroupVO setNeedApiAuthUser(Boolean needApiAuthUser) {
        this.needApiAuthUser = needApiAuthUser;
        return this;
    }
    public Boolean getNeedApiAuthUser() {
        return this.needApiAuthUser;
    }

    public ApiGroupVO setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public ApiGroupVO setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public ApiGroupVO setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public ApiGroupVO setOperationPermission(Boolean operationPermission) {
        this.operationPermission = operationPermission;
        return this;
    }
    public Boolean getOperationPermission() {
        return this.operationPermission;
    }

    public ApiGroupVO setDomainType(String domainType) {
        this.domainType = domainType;
        return this;
    }
    public String getDomainType() {
        return this.domainType;
    }

    public ApiGroupVO setDomainList(java.util.List<ApiGroupDomainVO> domainList) {
        this.domainList = domainList;
        return this;
    }
    public java.util.List<ApiGroupDomainVO> getDomainList() {
        return this.domainList;
    }

}
