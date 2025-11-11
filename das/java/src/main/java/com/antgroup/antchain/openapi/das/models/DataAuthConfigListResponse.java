// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.das.models;

import com.aliyun.tea.*;

public class DataAuthConfigListResponse extends TeaModel {
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

    // 数据产品服务简称列表
    /**
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("product_abbr_list")
    @Validation(required = true)
    public java.util.List<String> productAbbrList;

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

    public static DataAuthConfigListResponse build(java.util.Map<String, ?> map) throws Exception {
        DataAuthConfigListResponse self = new DataAuthConfigListResponse();
        return TeaModel.build(map, self);
    }

    public DataAuthConfigListResponse setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

    public DataAuthConfigListResponse setSourceSpaceId(String sourceSpaceId) {
        this.sourceSpaceId = sourceSpaceId;
        return this;
    }
    public String getSourceSpaceId() {
        return this.sourceSpaceId;
    }

    public DataAuthConfigListResponse setAuthEnterpriseCode(String authEnterpriseCode) {
        this.authEnterpriseCode = authEnterpriseCode;
        return this;
    }
    public String getAuthEnterpriseCode() {
        return this.authEnterpriseCode;
    }

    public DataAuthConfigListResponse setTargetName(String targetName) {
        this.targetName = targetName;
        return this;
    }
    public String getTargetName() {
        return this.targetName;
    }

    public DataAuthConfigListResponse setAuthAppName(String authAppName) {
        this.authAppName = authAppName;
        return this;
    }
    public String getAuthAppName() {
        return this.authAppName;
    }

    public DataAuthConfigListResponse setProductAbbrList(java.util.List<String> productAbbrList) {
        this.productAbbrList = productAbbrList;
        return this;
    }
    public java.util.List<String> getProductAbbrList() {
        return this.productAbbrList;
    }

    public DataAuthConfigListResponse setAuthCount(Long authCount) {
        this.authCount = authCount;
        return this;
    }
    public Long getAuthCount() {
        return this.authCount;
    }

    public DataAuthConfigListResponse setAuthStatus(Boolean authStatus) {
        this.authStatus = authStatus;
        return this;
    }
    public Boolean getAuthStatus() {
        return this.authStatus;
    }

}
