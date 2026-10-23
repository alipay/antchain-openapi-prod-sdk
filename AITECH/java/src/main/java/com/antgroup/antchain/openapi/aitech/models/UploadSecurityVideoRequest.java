// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.aitech.models;

import com.aliyun.tea.*;

public class UploadSecurityVideoRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 视频文件 URL（大小/格式由 VideoCheckApplicationService 校验）
    @NameInMap("file_url")
    @Validation(required = true)
    public String fileUrl;

    // 须 video 前缀
    @NameInMap("scene_code")
    @Validation(required = true)
    public String sceneCode;

    // 租户标识
    @NameInMap("business_id")
    @Validation(required = true)
    public String businessId;

    public static UploadSecurityVideoRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadSecurityVideoRequest self = new UploadSecurityVideoRequest();
        return TeaModel.build(map, self);
    }

    public UploadSecurityVideoRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UploadSecurityVideoRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UploadSecurityVideoRequest setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }
    public String getFileUrl() {
        return this.fileUrl;
    }

    public UploadSecurityVideoRequest setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

    public UploadSecurityVideoRequest setBusinessId(String businessId) {
        this.businessId = businessId;
        return this;
    }
    public String getBusinessId() {
        return this.businessId;
    }

}
