// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mpaasfaceverify.models;

import com.aliyun.tea.*;

public class InitCertifyrecordRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户请求的唯一标志，该标识作为对账的关键信息，商户要保证其唯一性
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // 计费规则码
    @NameInMap("charge_code")
    @Validation(required = true)
    public String chargeCode;

    // 预留扩展业务参数
    @NameInMap("extern_param")
    @Validation(required = true)
    public String externParam;

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

    public static InitCertifyrecordRequest build(java.util.Map<String, ?> map) throws Exception {
        InitCertifyrecordRequest self = new InitCertifyrecordRequest();
        return TeaModel.build(map, self);
    }

    public InitCertifyrecordRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public InitCertifyrecordRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public InitCertifyrecordRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public InitCertifyrecordRequest setChargeCode(String chargeCode) {
        this.chargeCode = chargeCode;
        return this;
    }
    public String getChargeCode() {
        return this.chargeCode;
    }

    public InitCertifyrecordRequest setExternParam(String externParam) {
        this.externParam = externParam;
        return this;
    }
    public String getExternParam() {
        return this.externParam;
    }

    public InitCertifyrecordRequest setMetainfo(String metainfo) {
        this.metainfo = metainfo;
        return this;
    }
    public String getMetainfo() {
        return this.metainfo;
    }

    public InitCertifyrecordRequest setOperationType(String operationType) {
        this.operationType = operationType;
        return this;
    }
    public String getOperationType() {
        return this.operationType;
    }

    public InitCertifyrecordRequest setRefImg(String refImg) {
        this.refImg = refImg;
        return this;
    }
    public String getRefImg() {
        return this.refImg;
    }

}
