// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mpaasfaceverify.models;

import com.aliyun.tea.*;

public class InitCertifyRecordRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户请求的唯一标志，该标识作为对账的关键信息，商户要保证其唯一性
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // 	
    // 预留扩展业务参数
    @NameInMap("extern_param")
    @Validation(required = true)
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
    @Validation(required = true)
    public String operationType;

    // 比对源图片
    @NameInMap("ref_img")
    @Validation(required = true)
    public String refImg;

    public static InitCertifyRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        InitCertifyRecordRequest self = new InitCertifyRecordRequest();
        return TeaModel.build(map, self);
    }

    public InitCertifyRecordRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public InitCertifyRecordRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public InitCertifyRecordRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public InitCertifyRecordRequest setExternParam(String externParam) {
        this.externParam = externParam;
        return this;
    }
    public String getExternParam() {
        return this.externParam;
    }

    public InitCertifyRecordRequest setIdentityParam(String identityParam) {
        this.identityParam = identityParam;
        return this;
    }
    public String getIdentityParam() {
        return this.identityParam;
    }

    public InitCertifyRecordRequest setMetainfo(String metainfo) {
        this.metainfo = metainfo;
        return this;
    }
    public String getMetainfo() {
        return this.metainfo;
    }

    public InitCertifyRecordRequest setOperationType(String operationType) {
        this.operationType = operationType;
        return this;
    }
    public String getOperationType() {
        return this.operationType;
    }

    public InitCertifyRecordRequest setRefImg(String refImg) {
        this.refImg = refImg;
        return this;
    }
    public String getRefImg() {
        return this.refImg;
    }

}
