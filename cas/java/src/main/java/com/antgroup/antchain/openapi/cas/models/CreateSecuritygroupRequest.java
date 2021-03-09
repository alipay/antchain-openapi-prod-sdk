// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class CreateSecuritygroupRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 描述
    @NameInMap("description")
    public String description;

    // 安全域/组 名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 所在区域
    @NameInMap("region")
    @Validation(required = true)
    public String region;

    // 工作空间名称
    @NameInMap("workspace")
    @Validation(required = true)
    public String workspace;

    // SECURITY_GROUP | SECURITY_ZONE
    // 默认为安全组
    @NameInMap("type")
    public String type;

    public static CreateSecuritygroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSecuritygroupRequest self = new CreateSecuritygroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateSecuritygroupRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateSecuritygroupRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateSecuritygroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateSecuritygroupRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public CreateSecuritygroupRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

    public CreateSecuritygroupRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
