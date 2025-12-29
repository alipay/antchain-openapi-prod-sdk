// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.das.models;

import com.aliyun.tea.*;

public class AuthConfigListResponse extends TeaModel {
    // 场景码
    /**
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("scene_code")
    @Validation(required = true)
    public String sceneCode;

    // 授权类型
    /**
     * <strong>example:</strong>
     * <p>CREATE_AUTH_PAGE.新建数智空间授权页面  USE_EXIST_PAGE.使用数智空间已有授权页 RECEIVE_CUSTOMER_CALLBACK.接收客户回传授权信息</p>
     */
    @NameInMap("auth_type")
    @Validation(required = true)
    public String authType;

    // 数据源连接器空间id
    /**
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("source_space_id")
    @Validation(required = true)
    public String sourceSpaceId;

    // 被授权方企业信用代码
    /**
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("auth_enterprise_code")
    @Validation(required = true)
    public String authEnterpriseCode;

    // 接入方企业名称
    /**
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("target_name")
    @Validation(required = true)
    public String targetName;

    // 被授权应用名称
    /**
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("auth_app_name")
    @Validation(required = true)
    public String authAppName;

    // 授权内容列表
    /**
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("auth_content_list")
    @Validation(required = true)
    public java.util.List<AuthContent> authContentList;

    // 国标产品标识码列表
    /**
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("product_identity_id_list")
    @Validation(required = true)
    public java.util.List<String> productIdentityIdList;

    // 授权次数
    /**
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("auth_count")
    @Validation(required = true)
    public Long authCount;

    // 授权状态
    /**
     * <strong>example:</strong>
     * <p>true, false</p>
     */
    @NameInMap("auth_status")
    @Validation(required = true)
    public Boolean authStatus;

    // 是否有协议
    /**
     * <strong>example:</strong>
     * <p>true, false</p>
     */
    @NameInMap("have_agreement")
    @Validation(required = true)
    public Boolean haveAgreement;

    public static AuthConfigListResponse build(java.util.Map<String, ?> map) throws Exception {
        AuthConfigListResponse self = new AuthConfigListResponse();
        return TeaModel.build(map, self);
    }

    public AuthConfigListResponse setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

    public AuthConfigListResponse setAuthType(String authType) {
        this.authType = authType;
        return this;
    }
    public String getAuthType() {
        return this.authType;
    }

    public AuthConfigListResponse setSourceSpaceId(String sourceSpaceId) {
        this.sourceSpaceId = sourceSpaceId;
        return this;
    }
    public String getSourceSpaceId() {
        return this.sourceSpaceId;
    }

    public AuthConfigListResponse setAuthEnterpriseCode(String authEnterpriseCode) {
        this.authEnterpriseCode = authEnterpriseCode;
        return this;
    }
    public String getAuthEnterpriseCode() {
        return this.authEnterpriseCode;
    }

    public AuthConfigListResponse setTargetName(String targetName) {
        this.targetName = targetName;
        return this;
    }
    public String getTargetName() {
        return this.targetName;
    }

    public AuthConfigListResponse setAuthAppName(String authAppName) {
        this.authAppName = authAppName;
        return this;
    }
    public String getAuthAppName() {
        return this.authAppName;
    }

    public AuthConfigListResponse setAuthContentList(java.util.List<AuthContent> authContentList) {
        this.authContentList = authContentList;
        return this;
    }
    public java.util.List<AuthContent> getAuthContentList() {
        return this.authContentList;
    }

    public AuthConfigListResponse setProductIdentityIdList(java.util.List<String> productIdentityIdList) {
        this.productIdentityIdList = productIdentityIdList;
        return this;
    }
    public java.util.List<String> getProductIdentityIdList() {
        return this.productIdentityIdList;
    }

    public AuthConfigListResponse setAuthCount(Long authCount) {
        this.authCount = authCount;
        return this;
    }
    public Long getAuthCount() {
        return this.authCount;
    }

    public AuthConfigListResponse setAuthStatus(Boolean authStatus) {
        this.authStatus = authStatus;
        return this;
    }
    public Boolean getAuthStatus() {
        return this.authStatus;
    }

    public AuthConfigListResponse setHaveAgreement(Boolean haveAgreement) {
        this.haveAgreement = haveAgreement;
        return this;
    }
    public Boolean getHaveAgreement() {
        return this.haveAgreement;
    }

}
