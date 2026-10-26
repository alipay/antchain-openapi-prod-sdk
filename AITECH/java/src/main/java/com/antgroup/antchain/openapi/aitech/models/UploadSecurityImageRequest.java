// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.aitech.models;

import com.aliyun.tea.*;

public class UploadSecurityImageRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 直传或 PDF 逐页转图片
    @NameInMap("file_url")
    @Validation(required = true)
    public String fileUrl;

    // 归一化后须 image 前缀，否则拒绝
    @NameInMap("scene_code")
    @Validation(required = true)
    public String sceneCode;

    // 租户标识
    @NameInMap("business_id")
    @Validation(required = true)
    public String businessId;

    // 企业标识
    @NameInMap("enterprise")
    public String enterprise;

    // 访问控制维度
    @NameInMap("account_id")
    public String accountId;

    public static UploadSecurityImageRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadSecurityImageRequest self = new UploadSecurityImageRequest();
        return TeaModel.build(map, self);
    }

    public UploadSecurityImageRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UploadSecurityImageRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UploadSecurityImageRequest setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }
    public String getFileUrl() {
        return this.fileUrl;
    }

    public UploadSecurityImageRequest setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

    public UploadSecurityImageRequest setBusinessId(String businessId) {
        this.businessId = businessId;
        return this;
    }
    public String getBusinessId() {
        return this.businessId;
    }

    public UploadSecurityImageRequest setEnterprise(String enterprise) {
        this.enterprise = enterprise;
        return this;
    }
    public String getEnterprise() {
        return this.enterprise;
    }

    public UploadSecurityImageRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

}
