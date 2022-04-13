// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class CreateFlowSiteRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 描述
    @NameInMap("description")
    public String description;

    // 推送接口类型，可选值（RPC，REST）
    @NameInMap("interface_type")
    @Validation(required = true)
    public String interfaceType;

    // 推送接口 url
    @NameInMap("interface_urls")
    @Validation(required = true)
    public java.util.List<String> interfaceUrls;

    // 站点名
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 操作人
    @NameInMap("operator")
    @Validation(required = true)
    public String operator;

    // 站点类型，可选值 MAIN（主站点）， ISOMERISM（异构机房）
    @NameInMap("site_type")
    @Validation(required = true)
    public String siteType;

    // opssla uniqueId
    @NameInMap("unique_id")
    public String uniqueId;

    // 工作空间组
    @NameInMap("workspace_group")
    @Validation(required = true)
    public String workspaceGroup;

    public static CreateFlowSiteRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFlowSiteRequest self = new CreateFlowSiteRequest();
        return TeaModel.build(map, self);
    }

    public CreateFlowSiteRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateFlowSiteRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateFlowSiteRequest setInterfaceType(String interfaceType) {
        this.interfaceType = interfaceType;
        return this;
    }
    public String getInterfaceType() {
        return this.interfaceType;
    }

    public CreateFlowSiteRequest setInterfaceUrls(java.util.List<String> interfaceUrls) {
        this.interfaceUrls = interfaceUrls;
        return this;
    }
    public java.util.List<String> getInterfaceUrls() {
        return this.interfaceUrls;
    }

    public CreateFlowSiteRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateFlowSiteRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public CreateFlowSiteRequest setSiteType(String siteType) {
        this.siteType = siteType;
        return this;
    }
    public String getSiteType() {
        return this.siteType;
    }

    public CreateFlowSiteRequest setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
        return this;
    }
    public String getUniqueId() {
        return this.uniqueId;
    }

    public CreateFlowSiteRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

}
