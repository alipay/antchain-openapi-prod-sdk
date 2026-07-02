// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class OperateIotbasicProjectspaceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 项目空间id
    @NameInMap("id")
    public Long id;

    // 项目名称
    @NameInMap("project_name")
    public String projectName;

    // 项目编码（device_base表字段biz_scene）
    @NameInMap("project_code")
    public String projectCode;

    // 项目描述
    @NameInMap("project_desc")
    public String projectDesc;

    // 项目负责人（PD）
    @NameInMap("project_leader")
    public String projectLeader;

    // 上链ID（数据上到哪个业务链）
    @NameInMap("upchain_id")
    public String upchainId;

    // 上链方式（通过IOT可信平台，banRest）
    @NameInMap("upchain_type")
    public String upchainType;

    // 上链参数（账号，秘钥），json字符串格式
    @NameInMap("upchain_params")
    public String upchainParams;

    // 是否上链
    @NameInMap("is_upchain")
    public Boolean isUpchain;

    // 操作类型
    @NameInMap("action")
    @Validation(required = true)
    public String action;

    // 操作人id
    @NameInMap("operator_id")
    @Validation(required = true)
    public String operatorId;

    // 参数签名校验
    @NameInMap("param_sign")
    @Validation(required = true)
    public String paramSign;

    public static OperateIotbasicProjectspaceRequest build(java.util.Map<String, ?> map) throws Exception {
        OperateIotbasicProjectspaceRequest self = new OperateIotbasicProjectspaceRequest();
        return TeaModel.build(map, self);
    }

    public OperateIotbasicProjectspaceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public OperateIotbasicProjectspaceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public OperateIotbasicProjectspaceRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public OperateIotbasicProjectspaceRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public OperateIotbasicProjectspaceRequest setProjectCode(String projectCode) {
        this.projectCode = projectCode;
        return this;
    }
    public String getProjectCode() {
        return this.projectCode;
    }

    public OperateIotbasicProjectspaceRequest setProjectDesc(String projectDesc) {
        this.projectDesc = projectDesc;
        return this;
    }
    public String getProjectDesc() {
        return this.projectDesc;
    }

    public OperateIotbasicProjectspaceRequest setProjectLeader(String projectLeader) {
        this.projectLeader = projectLeader;
        return this;
    }
    public String getProjectLeader() {
        return this.projectLeader;
    }

    public OperateIotbasicProjectspaceRequest setUpchainId(String upchainId) {
        this.upchainId = upchainId;
        return this;
    }
    public String getUpchainId() {
        return this.upchainId;
    }

    public OperateIotbasicProjectspaceRequest setUpchainType(String upchainType) {
        this.upchainType = upchainType;
        return this;
    }
    public String getUpchainType() {
        return this.upchainType;
    }

    public OperateIotbasicProjectspaceRequest setUpchainParams(String upchainParams) {
        this.upchainParams = upchainParams;
        return this;
    }
    public String getUpchainParams() {
        return this.upchainParams;
    }

    public OperateIotbasicProjectspaceRequest setIsUpchain(Boolean isUpchain) {
        this.isUpchain = isUpchain;
        return this;
    }
    public Boolean getIsUpchain() {
        return this.isUpchain;
    }

    public OperateIotbasicProjectspaceRequest setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public OperateIotbasicProjectspaceRequest setOperatorId(String operatorId) {
        this.operatorId = operatorId;
        return this;
    }
    public String getOperatorId() {
        return this.operatorId;
    }

    public OperateIotbasicProjectspaceRequest setParamSign(String paramSign) {
        this.paramSign = paramSign;
        return this;
    }
    public String getParamSign() {
        return this.paramSign;
    }

}
