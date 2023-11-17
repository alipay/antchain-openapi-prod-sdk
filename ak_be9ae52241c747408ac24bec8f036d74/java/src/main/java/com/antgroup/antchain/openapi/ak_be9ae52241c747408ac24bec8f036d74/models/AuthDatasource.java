// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_be9ae52241c747408ac24bec8f036d74.models;

import com.aliyun.tea.*;

public class AuthDatasource extends TeaModel {
    // 授权数据源ID
    @NameInMap("auth_datasource_id")
    @Validation(required = true)
    public String authDatasourceId;

    // 创建数据源授权时间(毫秒)
    @NameInMap("gmt_create")
    @Validation(required = true)
    public Long gmtCreate;

    // 更新数据源授权时间(毫秒)
    @NameInMap("gmt_modified")
    @Validation(required = true)
    public Long gmtModified;

    // 数据源名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 对应本地数据源的配置参数
    @NameInMap("config")
    @Validation(required = true)
    public String config;

    //  数据源来源
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

    public static AuthDatasource build(java.util.Map<String, ?> map) throws Exception {
        AuthDatasource self = new AuthDatasource();
        return TeaModel.build(map, self);
    }

    public AuthDatasource setAuthDatasourceId(String authDatasourceId) {
        this.authDatasourceId = authDatasourceId;
        return this;
    }
    public String getAuthDatasourceId() {
        return this.authDatasourceId;
    }

    public AuthDatasource setGmtCreate(Long gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public Long getGmtCreate() {
        return this.gmtCreate;
    }

    public AuthDatasource setGmtModified(Long gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public Long getGmtModified() {
        return this.gmtModified;
    }

    public AuthDatasource setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AuthDatasource setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public AuthDatasource setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public AuthDatasource setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public AuthDatasource setVisibleType(String visibleType) {
        this.visibleType = visibleType;
        return this;
    }
    public String getVisibleType() {
        return this.visibleType;
    }

}
