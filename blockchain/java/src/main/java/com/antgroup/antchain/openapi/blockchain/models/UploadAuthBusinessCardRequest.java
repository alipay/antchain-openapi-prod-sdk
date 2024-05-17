// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class UploadAuthBusinessCardRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 用户id
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    // 运营场景码
    @NameInMap("scene_code")
    @Validation(required = true)
    public String sceneCode;

    // 上传证件类型
    @NameInMap("file_type")
    @Validation(required = true)
    public String fileType;

    public static UploadAuthBusinessCardRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadAuthBusinessCardRequest self = new UploadAuthBusinessCardRequest();
        return TeaModel.build(map, self);
    }

    public UploadAuthBusinessCardRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UploadAuthBusinessCardRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UploadAuthBusinessCardRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public UploadAuthBusinessCardRequest setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

    public UploadAuthBusinessCardRequest setFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }
    public String getFileType() {
        return this.fileType;
    }

}
