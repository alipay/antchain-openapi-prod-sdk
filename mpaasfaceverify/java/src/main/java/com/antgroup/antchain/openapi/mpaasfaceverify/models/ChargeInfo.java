// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mpaasfaceverify.models;

import com.aliyun.tea.*;

public class ChargeInfo extends TeaModel {
    // 认证单据号
    @NameInMap("certify_id")
    @Validation(required = true)
    public String certifyId;

    // 计费类型，当前枚举支持：
    // FAIL_NOT_CHARGE：认证失败，该单据不计费
    // CHARGE：认证成功，该单据计费
    @NameInMap("charge_type")
    @Validation(required = true)
    public String chargeType;

    // 错误码
    @NameInMap("error_code")
    public String errorCode;

    public static ChargeInfo build(java.util.Map<String, ?> map) throws Exception {
        ChargeInfo self = new ChargeInfo();
        return TeaModel.build(map, self);
    }

    public ChargeInfo setCertifyId(String certifyId) {
        this.certifyId = certifyId;
        return this;
    }
    public String getCertifyId() {
        return this.certifyId;
    }

    public ChargeInfo setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public ChargeInfo setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

}
