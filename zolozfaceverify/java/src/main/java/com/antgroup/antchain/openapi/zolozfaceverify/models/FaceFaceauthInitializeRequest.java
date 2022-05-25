// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.zolozfaceverify.models;

import com.aliyun.tea.*;

public class FaceFaceauthInitializeRequest extends TeaModel {
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
    public String externParam;

    // 用户身份信息
    @NameInMap("identity_param")
    @Validation(required = true)
    public String identityParam;

    // metainfo环境参数
    @NameInMap("metainfo")
    @Validation(required = true)
    public String metainfo;

    // 操作类型
    @NameInMap("operation_type")
    public String operationType;

    // 比对源图片
    @NameInMap("ref_img")
    public String refImg;

    // 比对源图片oss中转
    @NameInMap("ref_img_oss_obj")
    @Validation(required = true)
    public String refImgOssObj;

    public static FaceFaceauthInitializeRequest build(java.util.Map<String, ?> map) throws Exception {
        FaceFaceauthInitializeRequest self = new FaceFaceauthInitializeRequest();
        return TeaModel.build(map, self);
    }

    public FaceFaceauthInitializeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public FaceFaceauthInitializeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public FaceFaceauthInitializeRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public FaceFaceauthInitializeRequest setExternParam(String externParam) {
        this.externParam = externParam;
        return this;
    }
    public String getExternParam() {
        return this.externParam;
    }

    public FaceFaceauthInitializeRequest setIdentityParam(String identityParam) {
        this.identityParam = identityParam;
        return this;
    }
    public String getIdentityParam() {
        return this.identityParam;
    }

    public FaceFaceauthInitializeRequest setMetainfo(String metainfo) {
        this.metainfo = metainfo;
        return this;
    }
    public String getMetainfo() {
        return this.metainfo;
    }

    public FaceFaceauthInitializeRequest setOperationType(String operationType) {
        this.operationType = operationType;
        return this;
    }
    public String getOperationType() {
        return this.operationType;
    }

    public FaceFaceauthInitializeRequest setRefImg(String refImg) {
        this.refImg = refImg;
        return this;
    }
    public String getRefImg() {
        return this.refImg;
    }

    public FaceFaceauthInitializeRequest setRefImgOssObj(String refImgOssObj) {
        this.refImgOssObj = refImgOssObj;
        return this;
    }
    public String getRefImgOssObj() {
        return this.refImgOssObj;
    }

}
