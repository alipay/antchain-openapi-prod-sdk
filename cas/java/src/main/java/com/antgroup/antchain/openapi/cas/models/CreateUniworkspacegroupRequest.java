// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class CreateUniworkspacegroupRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 工作空间组名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 显示名字，可以中文
    @NameInMap("display_name")
    @Validation(required = true)
    public String displayName;

    // 租户ID
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // namespace
    @NameInMap("namespace")
    public String namespace;

    // json格式的字符串，工作空间组属性 
    @NameInMap("properties")
    public String properties;

    // release_mode
    @NameInMap("release_mode")
    public String releaseMode;

    // 工作空间的名称
    @NameInMap("workspaces")
    @Validation(required = true)
    public java.util.List<String> workspaces;

    // workspaces_create_param
    @NameInMap("workspaces_create_param")
    @Validation(required = true)
    public java.util.List<String> workspacesCreateParam;

    // cell_group_create_params
    @NameInMap("cell_group_create_params")
    public java.util.List<String> cellGroupCreateParams;

    // cell_create_params
    @NameInMap("cell_create_params")
    public java.util.List<String> cellCreateParams;

    // 域名前缀
    @NameInMap("domain_suffix")
    public String domainSuffix;

    // VPC创建参数
    @NameInMap("vpc_create_params")
    @Validation(required = true)
    public java.util.List<String> vpcCreateParams;

    // 导入的VPCIDs
    @NameInMap("import_vpcs")
    public java.util.List<String> importVpcs;

    public static CreateUniworkspacegroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateUniworkspacegroupRequest self = new CreateUniworkspacegroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateUniworkspacegroupRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateUniworkspacegroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateUniworkspacegroupRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public CreateUniworkspacegroupRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public CreateUniworkspacegroupRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public CreateUniworkspacegroupRequest setProperties(String properties) {
        this.properties = properties;
        return this;
    }
    public String getProperties() {
        return this.properties;
    }

    public CreateUniworkspacegroupRequest setReleaseMode(String releaseMode) {
        this.releaseMode = releaseMode;
        return this;
    }
    public String getReleaseMode() {
        return this.releaseMode;
    }

    public CreateUniworkspacegroupRequest setWorkspaces(java.util.List<String> workspaces) {
        this.workspaces = workspaces;
        return this;
    }
    public java.util.List<String> getWorkspaces() {
        return this.workspaces;
    }

    public CreateUniworkspacegroupRequest setWorkspacesCreateParam(java.util.List<String> workspacesCreateParam) {
        this.workspacesCreateParam = workspacesCreateParam;
        return this;
    }
    public java.util.List<String> getWorkspacesCreateParam() {
        return this.workspacesCreateParam;
    }

    public CreateUniworkspacegroupRequest setCellGroupCreateParams(java.util.List<String> cellGroupCreateParams) {
        this.cellGroupCreateParams = cellGroupCreateParams;
        return this;
    }
    public java.util.List<String> getCellGroupCreateParams() {
        return this.cellGroupCreateParams;
    }

    public CreateUniworkspacegroupRequest setCellCreateParams(java.util.List<String> cellCreateParams) {
        this.cellCreateParams = cellCreateParams;
        return this;
    }
    public java.util.List<String> getCellCreateParams() {
        return this.cellCreateParams;
    }

    public CreateUniworkspacegroupRequest setDomainSuffix(String domainSuffix) {
        this.domainSuffix = domainSuffix;
        return this;
    }
    public String getDomainSuffix() {
        return this.domainSuffix;
    }

    public CreateUniworkspacegroupRequest setVpcCreateParams(java.util.List<String> vpcCreateParams) {
        this.vpcCreateParams = vpcCreateParams;
        return this;
    }
    public java.util.List<String> getVpcCreateParams() {
        return this.vpcCreateParams;
    }

    public CreateUniworkspacegroupRequest setImportVpcs(java.util.List<String> importVpcs) {
        this.importVpcs = importVpcs;
        return this;
    }
    public java.util.List<String> getImportVpcs() {
        return this.importVpcs;
    }

}
