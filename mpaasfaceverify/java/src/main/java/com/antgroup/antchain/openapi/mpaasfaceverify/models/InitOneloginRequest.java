// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mpaasfaceverify.models;

import com.aliyun.tea.*;

public class InitOneloginRequest extends TeaModel {
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
    public String externParam;

    public static InitOneloginRequest build(java.util.Map<String, ?> map) throws Exception {
        InitOneloginRequest self = new InitOneloginRequest();
        return TeaModel.build(map, self);
    }

    public InitOneloginRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public InitOneloginRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public InitOneloginRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public InitOneloginRequest setChargeCode(String chargeCode) {
        this.chargeCode = chargeCode;
        return this;
    }
    public String getChargeCode() {
        return this.chargeCode;
    }

    public InitOneloginRequest setExternParam(String externParam) {
        this.externParam = externParam;
        return this;
    }
    public String getExternParam() {
        return this.externParam;
    }

}
