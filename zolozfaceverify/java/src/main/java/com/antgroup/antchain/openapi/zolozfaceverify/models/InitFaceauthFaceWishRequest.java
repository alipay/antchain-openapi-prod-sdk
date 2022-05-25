// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.zolozfaceverify.models;

import com.aliyun.tea.*;

public class InitFaceauthFaceWishRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户请求的唯一标志，该标识作为对账的关键信息，商户要保证其唯一性
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // 身份，需要公钥加密
    @NameInMap("identity_param")
    @Validation(required = true)
    public String identityParam;

    // 客户端采集
    @NameInMap("metainfo")
    @Validation(required = true)
    public String metainfo;

    // 外部参数
    @NameInMap("extern_param")
    public String externParam;

    // 操作类型
    @NameInMap("operation_type")
    public String operationType;

    // 比对源图片oss中转
    @NameInMap("ref_img_oss_obj")
    public String refImgOssObj;

    public static InitFaceauthFaceWishRequest build(java.util.Map<String, ?> map) throws Exception {
        InitFaceauthFaceWishRequest self = new InitFaceauthFaceWishRequest();
        return TeaModel.build(map, self);
    }

    public InitFaceauthFaceWishRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public InitFaceauthFaceWishRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public InitFaceauthFaceWishRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public InitFaceauthFaceWishRequest setIdentityParam(String identityParam) {
        this.identityParam = identityParam;
        return this;
    }
    public String getIdentityParam() {
        return this.identityParam;
    }

    public InitFaceauthFaceWishRequest setMetainfo(String metainfo) {
        this.metainfo = metainfo;
        return this;
    }
    public String getMetainfo() {
        return this.metainfo;
    }

    public InitFaceauthFaceWishRequest setExternParam(String externParam) {
        this.externParam = externParam;
        return this;
    }
    public String getExternParam() {
        return this.externParam;
    }

    public InitFaceauthFaceWishRequest setOperationType(String operationType) {
        this.operationType = operationType;
        return this;
    }
    public String getOperationType() {
        return this.operationType;
    }

    public InitFaceauthFaceWishRequest setRefImgOssObj(String refImgOssObj) {
        this.refImgOssObj = refImgOssObj;
        return this;
    }
    public String getRefImgOssObj() {
        return this.refImgOssObj;
    }

}
