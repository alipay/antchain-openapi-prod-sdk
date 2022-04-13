// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class UpdateFlowSiteRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 工作空间组
    @NameInMap("workspace_group")
    @Validation(required = true)
    public String workspaceGroup;

    // 操作人
    @NameInMap("operator")
    @Validation(required = true)
    public String operator;

    // 站点 ID
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // 站点名
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 描述
    @NameInMap("description")
    public String description;

    // 站点类型，可选值（MAIN， ISOMERISM）
    @NameInMap("site_type")
    @Validation(required = true)
    public String siteType;

    // 接口类型（RPC，REST）
    @NameInMap("interface_type")
    @Validation(required = true)
    public String interfaceType;

    // 推送接口url
    @NameInMap("interface_urls")
    @Validation(required = true)
    public java.util.List<String> interfaceUrls;

    // opssla uniqueId
    @NameInMap("unique_id")
    public String uniqueId;

    public static UpdateFlowSiteRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateFlowSiteRequest self = new UpdateFlowSiteRequest();
        return TeaModel.build(map, self);
    }

    public UpdateFlowSiteRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateFlowSiteRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

    public UpdateFlowSiteRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public UpdateFlowSiteRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateFlowSiteRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateFlowSiteRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateFlowSiteRequest setSiteType(String siteType) {
        this.siteType = siteType;
        return this;
    }
    public String getSiteType() {
        return this.siteType;
    }

    public UpdateFlowSiteRequest setInterfaceType(String interfaceType) {
        this.interfaceType = interfaceType;
        return this;
    }
    public String getInterfaceType() {
        return this.interfaceType;
    }

    public UpdateFlowSiteRequest setInterfaceUrls(java.util.List<String> interfaceUrls) {
        this.interfaceUrls = interfaceUrls;
        return this;
    }
    public java.util.List<String> getInterfaceUrls() {
        return this.interfaceUrls;
    }

    public UpdateFlowSiteRequest setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
        return this;
    }
    public String getUniqueId() {
        return this.uniqueId;
    }

}
