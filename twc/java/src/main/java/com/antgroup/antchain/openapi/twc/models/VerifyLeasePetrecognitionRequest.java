// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class VerifyLeasePetrecognitionRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 算法服务
    @NameInMap("scene_code")
    @Validation(required = true)
    public String sceneCode;

    // 算法功能
    @NameInMap("uri")
    @Validation(required = true)
    public String uri;

    // 来源系统
    @NameInMap("source")
    @Validation(required = true)
    public String source;

    // 宠物图片url
    @NameInMap("image_url")
    @Validation(required = true)
    public String imageUrl;

    // 额外参数
    @NameInMap("ext")
    @Validation(required = true)
    public String ext;

    public static VerifyLeasePetrecognitionRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifyLeasePetrecognitionRequest self = new VerifyLeasePetrecognitionRequest();
        return TeaModel.build(map, self);
    }

    public VerifyLeasePetrecognitionRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public VerifyLeasePetrecognitionRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public VerifyLeasePetrecognitionRequest setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

    public VerifyLeasePetrecognitionRequest setUri(String uri) {
        this.uri = uri;
        return this;
    }
    public String getUri() {
        return this.uri;
    }

    public VerifyLeasePetrecognitionRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public VerifyLeasePetrecognitionRequest setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

    public VerifyLeasePetrecognitionRequest setExt(String ext) {
        this.ext = ext;
        return this;
    }
    public String getExt() {
        return this.ext;
    }

}
