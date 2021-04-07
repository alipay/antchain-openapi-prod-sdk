// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class ImportSecuritygroupRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // sg-zm042uh9f8gb1lfcsng6 的 iaas 层 id
    @NameInMap("securitygroup_id")
    @Validation(required = true)
    public String securitygroupId;

    // securityGroup 名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 工作空间
    @NameInMap("workspace")
    @Validation(required = true)
    public String workspace;

    public static ImportSecuritygroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportSecuritygroupRequest self = new ImportSecuritygroupRequest();
        return TeaModel.build(map, self);
    }

    public ImportSecuritygroupRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ImportSecuritygroupRequest setSecuritygroupId(String securitygroupId) {
        this.securitygroupId = securitygroupId;
        return this;
    }
    public String getSecuritygroupId() {
        return this.securitygroupId;
    }

    public ImportSecuritygroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ImportSecuritygroupRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
