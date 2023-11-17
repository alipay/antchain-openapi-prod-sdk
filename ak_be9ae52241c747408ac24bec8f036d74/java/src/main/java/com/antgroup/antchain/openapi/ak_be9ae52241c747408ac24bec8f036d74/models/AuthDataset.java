// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_be9ae52241c747408ac24bec8f036d74.models;

import com.aliyun.tea.*;

public class AuthDataset extends TeaModel {
    // 授权数据集ID
    @NameInMap("auth_dataset_id")
    @Validation(required = true)
    public String authDatasetId;

    // 创建授权时间(毫秒)
    @NameInMap("gmt_create")
    @Validation(required = true)
    public Long gmtCreate;

    // 更新授权时间(毫秒)
    @NameInMap("gmt_modified")
    @Validation(required = true)
    public Long gmtModified;

    // 数据集名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 数据集配置参数
    @NameInMap("config")
    @Validation(required = true)
    public String config;

    // SAAS：该数据集为云上saas节点登记，数据的元信息存储于fdf中
    // FATE：该数据集为线下fate节点登记，数据参数仅有tablename&namespace
    @NameInMap("source")
    @Validation(required = true)
    public String source;

    // 项目ID
    @NameInMap("project_id")
    @Validation(required = true)
    public String projectId;

    // 项目内可见范围类型，ALL_TENANT全部机构可见，SPECIFIC_TENANT部分机构可见。调用授权数据集 和 数据源请求时 若不填该参数，则默认ALL_TENANT
    @NameInMap("visible_type")
    @Validation(required = true)
    public String visibleType;

    public static AuthDataset build(java.util.Map<String, ?> map) throws Exception {
        AuthDataset self = new AuthDataset();
        return TeaModel.build(map, self);
    }

    public AuthDataset setAuthDatasetId(String authDatasetId) {
        this.authDatasetId = authDatasetId;
        return this;
    }
    public String getAuthDatasetId() {
        return this.authDatasetId;
    }

    public AuthDataset setGmtCreate(Long gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public Long getGmtCreate() {
        return this.gmtCreate;
    }

    public AuthDataset setGmtModified(Long gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public Long getGmtModified() {
        return this.gmtModified;
    }

    public AuthDataset setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AuthDataset setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public AuthDataset setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public AuthDataset setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public AuthDataset setVisibleType(String visibleType) {
        this.visibleType = visibleType;
        return this;
    }
    public String getVisibleType() {
        return this.visibleType;
    }

}
