// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.defincashier.models;

import com.aliyun.tea.*;

public class PaymentCreateCheckResult extends TeaModel {
    // 检查是否通过。PASS(检查通过);NOT_PASS(检查不通过)
    @NameInMap("result")
    @Validation(required = true)
    public String result;

    // 业务错误码(为空表示成功，否则为业务错误码)
    @NameInMap("sub_code")
    public String subCode;

    // 业务错误描述
    @NameInMap("sub_msg")
    public String subMsg;

    public static PaymentCreateCheckResult build(java.util.Map<String, ?> map) throws Exception {
        PaymentCreateCheckResult self = new PaymentCreateCheckResult();
        return TeaModel.build(map, self);
    }

    public PaymentCreateCheckResult setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

    public PaymentCreateCheckResult setSubCode(String subCode) {
        this.subCode = subCode;
        return this;
    }
    public String getSubCode() {
        return this.subCode;
    }

    public PaymentCreateCheckResult setSubMsg(String subMsg) {
        this.subMsg = subMsg;
        return this;
    }
    public String getSubMsg() {
        return this.subMsg;
    }

}
