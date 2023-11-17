// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_be9ae52241c747408ac24bec8f036d74.models;

import com.aliyun.tea.*;

public class AuthAntchainPdcpProjectDatasetRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 数据集名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 数据集配置参数，若授权的数据集归属于云上的节点，则参考结构体AuthSaasDatasetConfig，若授权的数据集归属于线下的节点，则参考结构体AuthFateDatasetConfig
    @NameInMap("config")
    @Validation(required = true)
    public String config;

    // 项目ID
    @NameInMap("project_id")
    @Validation(required = true)
    public String projectId;

    // 项目内可见范围类型，ALL_TENANT全部机构可见，SPECIFIC_TENANT部分机构可见。调用授权数据集 和 数据源请求时 若不填该参数，则默认ALL_TENANT
    @NameInMap("visible_type")
    public String visibleType;

    public static AuthAntchainPdcpProjectDatasetRequest build(java.util.Map<String, ?> map) throws Exception {
        AuthAntchainPdcpProjectDatasetRequest self = new AuthAntchainPdcpProjectDatasetRequest();
        return TeaModel.build(map, self);
    }

    public AuthAntchainPdcpProjectDatasetRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AuthAntchainPdcpProjectDatasetRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public AuthAntchainPdcpProjectDatasetRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AuthAntchainPdcpProjectDatasetRequest setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public AuthAntchainPdcpProjectDatasetRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public AuthAntchainPdcpProjectDatasetRequest setVisibleType(String visibleType) {
        this.visibleType = visibleType;
        return this;
    }
    public String getVisibleType() {
        return this.visibleType;
    }

}
