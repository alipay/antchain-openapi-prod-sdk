// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.webtrwatrade.models;

import com.aliyun.tea.*;

public class AssetProjectKey extends TeaModel {
    // 项目ID
    @NameInMap("project_id")
    @Validation(required = true)
    public String projectId;

    // 项目名称
    @NameInMap("project_name")
    @Validation(required = true)
    public String projectName;

    // 密钥类型(MINT:发行密钥；BURN：赎回密钥；TRANSFER：转账密钥；MANAGER：管理密钥)
    @NameInMap("key_type")
    @Validation(required = true)
    public String keyType;

    // 密钥ID
    @NameInMap("key_id")
    @Validation(required = true)
    public String keyId;

    // 密钥名称
    @NameInMap("key_name")
    @Validation(required = true)
    public String keyName;

    // 密钥地址
    @NameInMap("key_address")
    @Validation(required = true)
    public String keyAddress;

    // 关联时间戳
    @NameInMap("correlation_time")
    @Validation(required = true)
    public Long correlationTime;

    public static AssetProjectKey build(java.util.Map<String, ?> map) throws Exception {
        AssetProjectKey self = new AssetProjectKey();
        return TeaModel.build(map, self);
    }

    public AssetProjectKey setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public AssetProjectKey setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public AssetProjectKey setKeyType(String keyType) {
        this.keyType = keyType;
        return this;
    }
    public String getKeyType() {
        return this.keyType;
    }

    public AssetProjectKey setKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }
    public String getKeyId() {
        return this.keyId;
    }

    public AssetProjectKey setKeyName(String keyName) {
        this.keyName = keyName;
        return this;
    }
    public String getKeyName() {
        return this.keyName;
    }

    public AssetProjectKey setKeyAddress(String keyAddress) {
        this.keyAddress = keyAddress;
        return this;
    }
    public String getKeyAddress() {
        return this.keyAddress;
    }

    public AssetProjectKey setCorrelationTime(Long correlationTime) {
        this.correlationTime = correlationTime;
        return this;
    }
    public Long getCorrelationTime() {
        return this.correlationTime;
    }

}
