// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mpaasfaceverify.models;

import com.aliyun.tea.*;

public class CertifyServermodeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户请求的唯一标志，该标识作为对账的关键信息，商户要保证其唯一性
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // 预留扩展业务参数
    @NameInMap("extern_param")
    @Validation(required = true)
    public String externParam;

    // 用户身份信息
    @NameInMap("identity_param")
    @Validation(required = true)
    public String identityParam;

    // 待认证图片，默认base64格式
    @NameInMap("auth_img")
    @Validation(required = true)
    public String authImg;

    // 待认证图片类型，不传默认为base64后的图片，可以扩展Blob/video等类型
    @NameInMap("auth_img_type")
    public String authImgType;

    // 操作类型，operation_type为custom时表示自定义模式，需要用户上传比对源图片
    @NameInMap("operation_type")
    public String operationType;

    // 比对源图片
    @NameInMap("ref_img")
    public String refImg;

    public static CertifyServermodeRequest build(java.util.Map<String, ?> map) throws Exception {
        CertifyServermodeRequest self = new CertifyServermodeRequest();
        return TeaModel.build(map, self);
    }

    public CertifyServermodeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CertifyServermodeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CertifyServermodeRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public CertifyServermodeRequest setExternParam(String externParam) {
        this.externParam = externParam;
        return this;
    }
    public String getExternParam() {
        return this.externParam;
    }

    public CertifyServermodeRequest setIdentityParam(String identityParam) {
        this.identityParam = identityParam;
        return this;
    }
    public String getIdentityParam() {
        return this.identityParam;
    }

    public CertifyServermodeRequest setAuthImg(String authImg) {
        this.authImg = authImg;
        return this;
    }
    public String getAuthImg() {
        return this.authImg;
    }

    public CertifyServermodeRequest setAuthImgType(String authImgType) {
        this.authImgType = authImgType;
        return this;
    }
    public String getAuthImgType() {
        return this.authImgType;
    }

    public CertifyServermodeRequest setOperationType(String operationType) {
        this.operationType = operationType;
        return this;
    }
    public String getOperationType() {
        return this.operationType;
    }

    public CertifyServermodeRequest setRefImg(String refImg) {
        this.refImg = refImg;
        return this;
    }
    public String getRefImg() {
        return this.refImg;
    }

}
