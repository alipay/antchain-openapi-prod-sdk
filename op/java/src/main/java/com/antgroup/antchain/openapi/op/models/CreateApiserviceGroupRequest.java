// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.op.models;

import com.aliyun.tea.*;

public class CreateApiserviceGroupRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 所属产品
    @NameInMap("provider_name")
    @Validation(required = true)
    public String providerName;

    // 套件版本
    @NameInMap("suite_version")
    @Validation(required = true)
    public String suiteVersion;

    // 分组描述
    @NameInMap("description")
    @Validation(required = true)
    public String description;

    // 分组名称
    @NameInMap("group_name")
    @Validation(required = true)
    public String groupName;

    // 分组类型
    @NameInMap("api_group_type")
    public String apiGroupType;

    public static CreateApiserviceGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateApiserviceGroupRequest self = new CreateApiserviceGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateApiserviceGroupRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateApiserviceGroupRequest setProviderName(String providerName) {
        this.providerName = providerName;
        return this;
    }
    public String getProviderName() {
        return this.providerName;
    }

    public CreateApiserviceGroupRequest setSuiteVersion(String suiteVersion) {
        this.suiteVersion = suiteVersion;
        return this;
    }
    public String getSuiteVersion() {
        return this.suiteVersion;
    }

    public CreateApiserviceGroupRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateApiserviceGroupRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public CreateApiserviceGroupRequest setApiGroupType(String apiGroupType) {
        this.apiGroupType = apiGroupType;
        return this;
    }
    public String getApiGroupType() {
        return this.apiGroupType;
    }

}
