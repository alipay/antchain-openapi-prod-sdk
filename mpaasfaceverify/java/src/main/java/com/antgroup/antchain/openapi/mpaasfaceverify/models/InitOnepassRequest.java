// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mpaasfaceverify.models;

import com.aliyun.tea.*;

public class InitOnepassRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户请求的唯一标志，该标识作为对账的关键信息，商户要保证其唯一性
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // 手机号
    @NameInMap("phone")
    @Validation(required = true)
    public String phone;

    // 计费规则码
    @NameInMap("charge_code")
    @Validation(required = true)
    public String chargeCode;

    // 操作类型
    @NameInMap("operation_type")
    @Validation(required = true)
    public String operationType;

    // 预留扩展业务参数
    @NameInMap("extern_param")
    public String externParam;

    public static InitOnepassRequest build(java.util.Map<String, ?> map) throws Exception {
        InitOnepassRequest self = new InitOnepassRequest();
        return TeaModel.build(map, self);
    }

    public InitOnepassRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public InitOnepassRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public InitOnepassRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public InitOnepassRequest setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

    public InitOnepassRequest setChargeCode(String chargeCode) {
        this.chargeCode = chargeCode;
        return this;
    }
    public String getChargeCode() {
        return this.chargeCode;
    }

    public InitOnepassRequest setOperationType(String operationType) {
        this.operationType = operationType;
        return this;
    }
    public String getOperationType() {
        return this.operationType;
    }

    public InitOnepassRequest setExternParam(String externParam) {
        this.externParam = externParam;
        return this;
    }
    public String getExternParam() {
        return this.externParam;
    }

}
