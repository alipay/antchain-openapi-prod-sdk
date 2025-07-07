// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryAuthCaritemsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 唯一场景码
    @NameInMap("scene_code")
    @Validation(required = true)
    public String sceneCode;

    // 来源码
    @NameInMap("source_code")
    @Validation(required = true)
    public String sourceCode;

    // 唯一用户标识
    @NameInMap("user_id")
    public String userId;

    // 车牌号
    @NameInMap("license_no")
    @Validation(required = true)
    public String licenseNo;

    // 车型
    @NameInMap("model_code")
    public String modelCode;

    public static QueryAuthCaritemsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAuthCaritemsRequest self = new QueryAuthCaritemsRequest();
        return TeaModel.build(map, self);
    }

    public QueryAuthCaritemsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAuthCaritemsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAuthCaritemsRequest setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

    public QueryAuthCaritemsRequest setSourceCode(String sourceCode) {
        this.sourceCode = sourceCode;
        return this;
    }
    public String getSourceCode() {
        return this.sourceCode;
    }

    public QueryAuthCaritemsRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public QueryAuthCaritemsRequest setLicenseNo(String licenseNo) {
        this.licenseNo = licenseNo;
        return this;
    }
    public String getLicenseNo() {
        return this.licenseNo;
    }

    public QueryAuthCaritemsRequest setModelCode(String modelCode) {
        this.modelCode = modelCode;
        return this;
    }
    public String getModelCode() {
        return this.modelCode;
    }

}
