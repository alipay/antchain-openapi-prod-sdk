// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.op.models;

import com.aliyun.tea.*;

public class ApiGroup extends TeaModel {
    // 分组名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 分组描述
    @NameInMap("description")
    @Validation(required = true)
    public String description;

    // api类型
    @NameInMap("type")
    @Validation(required = true)
    public ApiGroupTypeEnum type;

    // 产品
    @NameInMap("provider_id")
    @Validation(required = true)
    public String providerId;

    // 套件id
    @NameInMap("api_suite_id")
    @Validation(required = true)
    public String apiSuiteId;

    public static ApiGroup build(java.util.Map<String, ?> map) throws Exception {
        ApiGroup self = new ApiGroup();
        return TeaModel.build(map, self);
    }

    public ApiGroup setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ApiGroup setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ApiGroup setType(ApiGroupTypeEnum type) {
        this.type = type;
        return this;
    }
    public ApiGroupTypeEnum getType() {
        return this.type;
    }

    public ApiGroup setProviderId(String providerId) {
        this.providerId = providerId;
        return this;
    }
    public String getProviderId() {
        return this.providerId;
    }

    public ApiGroup setApiSuiteId(String apiSuiteId) {
        this.apiSuiteId = apiSuiteId;
        return this;
    }
    public String getApiSuiteId() {
        return this.apiSuiteId;
    }

}
