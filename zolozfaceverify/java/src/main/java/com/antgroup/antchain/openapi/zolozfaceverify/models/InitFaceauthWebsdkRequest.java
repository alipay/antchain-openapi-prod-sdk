// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.zolozfaceverify.models;

import com.aliyun.tea.*;

public class InitFaceauthWebsdkRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
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
    public String identityParam;

    // metainfo环境参数
    @NameInMap("metainfo")
    public String metainfo;

    // 操作类型
    @NameInMap("operation_type")
    public String operationType;

    // 比对源图片
    @NameInMap("ref_img")
    public String refImg;

    public static InitFaceauthWebsdkRequest build(java.util.Map<String, ?> map) throws Exception {
        InitFaceauthWebsdkRequest self = new InitFaceauthWebsdkRequest();
        return TeaModel.build(map, self);
    }

    public InitFaceauthWebsdkRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public InitFaceauthWebsdkRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public InitFaceauthWebsdkRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public InitFaceauthWebsdkRequest setExternParam(String externParam) {
        this.externParam = externParam;
        return this;
    }
    public String getExternParam() {
        return this.externParam;
    }

    public InitFaceauthWebsdkRequest setIdentityParam(String identityParam) {
        this.identityParam = identityParam;
        return this;
    }
    public String getIdentityParam() {
        return this.identityParam;
    }

    public InitFaceauthWebsdkRequest setMetainfo(String metainfo) {
        this.metainfo = metainfo;
        return this;
    }
    public String getMetainfo() {
        return this.metainfo;
    }

    public InitFaceauthWebsdkRequest setOperationType(String operationType) {
        this.operationType = operationType;
        return this;
    }
    public String getOperationType() {
        return this.operationType;
    }

    public InitFaceauthWebsdkRequest setRefImg(String refImg) {
        this.refImg = refImg;
        return this;
    }
    public String getRefImg() {
        return this.refImg;
    }

}
