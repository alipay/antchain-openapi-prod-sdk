// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.zolozfaceverify.models;

import com.aliyun.tea.*;

public class IdentityFaceauthServermodeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 活体照片，base64编码
    @NameInMap("auth_img")
    public String authImg;

    // BLOB：使用客户端透传的BLOB数据
    // IMAGE：正常图片模式
    @NameInMap("auth_img_type")
    public String authImgType;

    // 租户请求的唯一标志，该标识作为对账的关键信息，商户要保证其唯一性
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // 预留扩展业务参数
    @NameInMap("extern_param")
    public String externParam;

    // 用户身份信息
    @NameInMap("identity_param")
    public String identityParam;

    // 操作类型，NORMAL正常模式，CUSTOM用户自定义比对源
    @NameInMap("operation_type")
    public String operationType;

    // 比对源照片，base64编码
    @NameInMap("ref_img")
    public String refImg;

    // 活体照片oss中转方式上传
    @NameInMap("auth_img_oss_obj")
    public String authImgOssObj;

    // 比对源照片oss中转方式上传
    @NameInMap("ref_img_oss_obj")
    public String refImgOssObj;

    public static IdentityFaceauthServermodeRequest build(java.util.Map<String, ?> map) throws Exception {
        IdentityFaceauthServermodeRequest self = new IdentityFaceauthServermodeRequest();
        return TeaModel.build(map, self);
    }

    public IdentityFaceauthServermodeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public IdentityFaceauthServermodeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public IdentityFaceauthServermodeRequest setAuthImg(String authImg) {
        this.authImg = authImg;
        return this;
    }
    public String getAuthImg() {
        return this.authImg;
    }

    public IdentityFaceauthServermodeRequest setAuthImgType(String authImgType) {
        this.authImgType = authImgType;
        return this;
    }
    public String getAuthImgType() {
        return this.authImgType;
    }

    public IdentityFaceauthServermodeRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public IdentityFaceauthServermodeRequest setExternParam(String externParam) {
        this.externParam = externParam;
        return this;
    }
    public String getExternParam() {
        return this.externParam;
    }

    public IdentityFaceauthServermodeRequest setIdentityParam(String identityParam) {
        this.identityParam = identityParam;
        return this;
    }
    public String getIdentityParam() {
        return this.identityParam;
    }

    public IdentityFaceauthServermodeRequest setOperationType(String operationType) {
        this.operationType = operationType;
        return this;
    }
    public String getOperationType() {
        return this.operationType;
    }

    public IdentityFaceauthServermodeRequest setRefImg(String refImg) {
        this.refImg = refImg;
        return this;
    }
    public String getRefImg() {
        return this.refImg;
    }

    public IdentityFaceauthServermodeRequest setAuthImgOssObj(String authImgOssObj) {
        this.authImgOssObj = authImgOssObj;
        return this;
    }
    public String getAuthImgOssObj() {
        return this.authImgOssObj;
    }

    public IdentityFaceauthServermodeRequest setRefImgOssObj(String refImgOssObj) {
        this.refImgOssObj = refImgOssObj;
        return this;
    }
    public String getRefImgOssObj() {
        return this.refImgOssObj;
    }

}
