// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.zolozfaceverify.models;

import com.aliyun.tea.*;

public class ExecFaceauthAlgorithmRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 业务ID
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // 渠道
    @NameInMap("channel")
    @Validation(required = true)
    public String channel;

    // base64图片
    @NameInMap("img_str")
    @Validation(required = true)
    public String imgStr;

    // Pano类型
    @NameInMap("img_type")
    @Validation(required = true)
    public String imgType;

    // 场景
    @NameInMap("scene")
    public String scene;

    public static ExecFaceauthAlgorithmRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecFaceauthAlgorithmRequest self = new ExecFaceauthAlgorithmRequest();
        return TeaModel.build(map, self);
    }

    public ExecFaceauthAlgorithmRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecFaceauthAlgorithmRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ExecFaceauthAlgorithmRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public ExecFaceauthAlgorithmRequest setChannel(String channel) {
        this.channel = channel;
        return this;
    }
    public String getChannel() {
        return this.channel;
    }

    public ExecFaceauthAlgorithmRequest setImgStr(String imgStr) {
        this.imgStr = imgStr;
        return this;
    }
    public String getImgStr() {
        return this.imgStr;
    }

    public ExecFaceauthAlgorithmRequest setImgType(String imgType) {
        this.imgType = imgType;
        return this;
    }
    public String getImgType() {
        return this.imgType;
    }

    public ExecFaceauthAlgorithmRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

}
