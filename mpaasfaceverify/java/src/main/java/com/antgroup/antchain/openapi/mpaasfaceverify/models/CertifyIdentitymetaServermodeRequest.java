// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mpaasfaceverify.models;

import com.aliyun.tea.*;

public class CertifyIdentitymetaServermodeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户请求的唯一标志，该标识作为对账的关键信息，商户要保...
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // 用户身份信息
    // 
    @NameInMap("identity_param")
    @Validation(required = true)
    public String identityParam;

    // 计费规则码
    // 
    @NameInMap("charge_code")
    @Validation(required = true)
    public String chargeCode;

    // operation_type
    @NameInMap("operation_type")
    public String operationType;

    // 预留扩展业务参数
    // 
    @NameInMap("extern_param")
    @Validation(required = true)
    public String externParam;

    public static CertifyIdentitymetaServermodeRequest build(java.util.Map<String, ?> map) throws Exception {
        CertifyIdentitymetaServermodeRequest self = new CertifyIdentitymetaServermodeRequest();
        return TeaModel.build(map, self);
    }

    public CertifyIdentitymetaServermodeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CertifyIdentitymetaServermodeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CertifyIdentitymetaServermodeRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public CertifyIdentitymetaServermodeRequest setIdentityParam(String identityParam) {
        this.identityParam = identityParam;
        return this;
    }
    public String getIdentityParam() {
        return this.identityParam;
    }

    public CertifyIdentitymetaServermodeRequest setChargeCode(String chargeCode) {
        this.chargeCode = chargeCode;
        return this;
    }
    public String getChargeCode() {
        return this.chargeCode;
    }

    public CertifyIdentitymetaServermodeRequest setOperationType(String operationType) {
        this.operationType = operationType;
        return this;
    }
    public String getOperationType() {
        return this.operationType;
    }

    public CertifyIdentitymetaServermodeRequest setExternParam(String externParam) {
        this.externParam = externParam;
        return this;
    }
    public String getExternParam() {
        return this.externParam;
    }

}
