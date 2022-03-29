// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.op.models;

import com.aliyun.tea.*;

public class CreateApiserviceProductRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 产品码
    @NameInMap("prod_code")
    @Validation(required = true)
    public String prodCode;

    // 产品类型
    @NameInMap("type")
    public String type;

    // 产品英文名
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 产品中文名
    @NameInMap("chinese_name")
    @Validation(required = true)
    public String chineseName;

    // 产品版本
    @NameInMap("prod_version")
    public String prodVersion;

    // 产品所有者
    @NameInMap("primary_owner_id")
    @Validation(required = true)
    public String primaryOwnerId;

    // 产品描述
    @NameInMap("description")
    @Validation(required = true)
    public String description;

    // api提供方类型
    @NameInMap("provider_type")
    public String providerType;

    // 产品前缀
    @NameInMap("api_name_prefix")
    public String apiNamePrefix;

    public static CreateApiserviceProductRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateApiserviceProductRequest self = new CreateApiserviceProductRequest();
        return TeaModel.build(map, self);
    }

    public CreateApiserviceProductRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateApiserviceProductRequest setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

    public CreateApiserviceProductRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CreateApiserviceProductRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateApiserviceProductRequest setChineseName(String chineseName) {
        this.chineseName = chineseName;
        return this;
    }
    public String getChineseName() {
        return this.chineseName;
    }

    public CreateApiserviceProductRequest setProdVersion(String prodVersion) {
        this.prodVersion = prodVersion;
        return this;
    }
    public String getProdVersion() {
        return this.prodVersion;
    }

    public CreateApiserviceProductRequest setPrimaryOwnerId(String primaryOwnerId) {
        this.primaryOwnerId = primaryOwnerId;
        return this;
    }
    public String getPrimaryOwnerId() {
        return this.primaryOwnerId;
    }

    public CreateApiserviceProductRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateApiserviceProductRequest setProviderType(String providerType) {
        this.providerType = providerType;
        return this;
    }
    public String getProviderType() {
        return this.providerType;
    }

    public CreateApiserviceProductRequest setApiNamePrefix(String apiNamePrefix) {
        this.apiNamePrefix = apiNamePrefix;
        return this;
    }
    public String getApiNamePrefix() {
        return this.apiNamePrefix;
    }

}
