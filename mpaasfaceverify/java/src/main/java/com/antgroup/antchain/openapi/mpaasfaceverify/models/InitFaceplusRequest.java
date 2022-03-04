// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mpaasfaceverify.models;

import com.aliyun.tea.*;

public class InitFaceplusRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 业务唯一单号
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

    // 比对源图片
    @NameInMap("ref_img")
    public String refImg;

    public static InitFaceplusRequest build(java.util.Map<String, ?> map) throws Exception {
        InitFaceplusRequest self = new InitFaceplusRequest();
        return TeaModel.build(map, self);
    }

    public InitFaceplusRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public InitFaceplusRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public InitFaceplusRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public InitFaceplusRequest setIdentityParam(String identityParam) {
        this.identityParam = identityParam;
        return this;
    }
    public String getIdentityParam() {
        return this.identityParam;
    }

    public InitFaceplusRequest setMetainfo(String metainfo) {
        this.metainfo = metainfo;
        return this;
    }
    public String getMetainfo() {
        return this.metainfo;
    }

    public InitFaceplusRequest setExternParam(String externParam) {
        this.externParam = externParam;
        return this;
    }
    public String getExternParam() {
        return this.externParam;
    }

    public InitFaceplusRequest setOperationType(String operationType) {
        this.operationType = operationType;
        return this;
    }
    public String getOperationType() {
        return this.operationType;
    }

    public InitFaceplusRequest setRefImg(String refImg) {
        this.refImg = refImg;
        return this;
    }
    public String getRefImg() {
        return this.refImg;
    }

}
