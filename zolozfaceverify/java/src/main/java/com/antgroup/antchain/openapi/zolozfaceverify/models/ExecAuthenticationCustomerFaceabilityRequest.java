// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.zolozfaceverify.models;

import com.aliyun.tea.*;

public class ExecAuthenticationCustomerFaceabilityRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // extract(提取特征)、sex(检测性别)、rect(人脸矩形框识别)
    @NameInMap("ability")
    @Validation(required = true)
    public String ability;

    // 算法版本
    @NameInMap("alg_ver")
    @Validation(required = true)
    public String algVer;

    // 图片encode base64 String
    @NameInMap("auth_img")
    @Validation(required = true)
    public String authImg;

    // 业务接入方生成，唯一ID
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // 场景码
    @NameInMap("scene_code")
    @Validation(required = true)
    public String sceneCode;

    public static ExecAuthenticationCustomerFaceabilityRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecAuthenticationCustomerFaceabilityRequest self = new ExecAuthenticationCustomerFaceabilityRequest();
        return TeaModel.build(map, self);
    }

    public ExecAuthenticationCustomerFaceabilityRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecAuthenticationCustomerFaceabilityRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ExecAuthenticationCustomerFaceabilityRequest setAbility(String ability) {
        this.ability = ability;
        return this;
    }
    public String getAbility() {
        return this.ability;
    }

    public ExecAuthenticationCustomerFaceabilityRequest setAlgVer(String algVer) {
        this.algVer = algVer;
        return this;
    }
    public String getAlgVer() {
        return this.algVer;
    }

    public ExecAuthenticationCustomerFaceabilityRequest setAuthImg(String authImg) {
        this.authImg = authImg;
        return this;
    }
    public String getAuthImg() {
        return this.authImg;
    }

    public ExecAuthenticationCustomerFaceabilityRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public ExecAuthenticationCustomerFaceabilityRequest setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

}
