// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.op.models;

import com.aliyun.tea.*;

public class ApiMetaRequest extends TeaModel {
    // 产品码
    @NameInMap("provider_name")
    @Validation(required = true)
    public String providerName;

    // 套件版本号
    @NameInMap("suite_version")
    @Validation(required = true)
    public String suiteVersion;

    // api分组名称
    @NameInMap("group_name")
    @Validation(required = true)
    public String groupName;

    // api名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 新名字
    @NameInMap("new_name")
    public String newName;

    // api拥有者
    @NameInMap("owner")
    @Validation(required = true)
    public String owner;

    // api简介
    @NameInMap("summary")
    @Validation(required = true)
    public String summary;

    // 是否是内部api
    @NameInMap("internal")
    @Validation(required = true)
    public Boolean internal;

    // api版本
    @NameInMap("api_version")
    @Validation(required = true)
    public String apiVersion;

    // api描述
    @NameInMap("description")
    public String description;

    // 是否是第三方代理
    @NameInMap("third_part_auth")
    public Boolean thirdPartAuth;

    // api状态
    @NameInMap("status_enum")
    @Validation(required = true)
    public StatusEnum statusEnum;

    // 扩展参数
    @NameInMap("ext_attribute")
    public String extAttribute;

    public static ApiMetaRequest build(java.util.Map<String, ?> map) throws Exception {
        ApiMetaRequest self = new ApiMetaRequest();
        return TeaModel.build(map, self);
    }

    public ApiMetaRequest setProviderName(String providerName) {
        this.providerName = providerName;
        return this;
    }
    public String getProviderName() {
        return this.providerName;
    }

    public ApiMetaRequest setSuiteVersion(String suiteVersion) {
        this.suiteVersion = suiteVersion;
        return this;
    }
    public String getSuiteVersion() {
        return this.suiteVersion;
    }

    public ApiMetaRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public ApiMetaRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ApiMetaRequest setNewName(String newName) {
        this.newName = newName;
        return this;
    }
    public String getNewName() {
        return this.newName;
    }

    public ApiMetaRequest setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public ApiMetaRequest setSummary(String summary) {
        this.summary = summary;
        return this;
    }
    public String getSummary() {
        return this.summary;
    }

    public ApiMetaRequest setInternal(Boolean internal) {
        this.internal = internal;
        return this;
    }
    public Boolean getInternal() {
        return this.internal;
    }

    public ApiMetaRequest setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }
    public String getApiVersion() {
        return this.apiVersion;
    }

    public ApiMetaRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ApiMetaRequest setThirdPartAuth(Boolean thirdPartAuth) {
        this.thirdPartAuth = thirdPartAuth;
        return this;
    }
    public Boolean getThirdPartAuth() {
        return this.thirdPartAuth;
    }

    public ApiMetaRequest setStatusEnum(StatusEnum statusEnum) {
        this.statusEnum = statusEnum;
        return this;
    }
    public StatusEnum getStatusEnum() {
        return this.statusEnum;
    }

    public ApiMetaRequest setExtAttribute(String extAttribute) {
        this.extAttribute = extAttribute;
        return this;
    }
    public String getExtAttribute() {
        return this.extAttribute;
    }

}
