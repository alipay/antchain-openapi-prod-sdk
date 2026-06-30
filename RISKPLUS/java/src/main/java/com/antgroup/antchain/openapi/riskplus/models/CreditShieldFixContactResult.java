// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class CreditShieldFixContactResult extends TeaModel {
    // 1-查得，0-未查得
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("result")
    @Validation(required = true)
    public String result;

    // 查得手机号md5
    /**
     * <strong>example:</strong>
     * <p>[手机号md5]</p>
     */
    @NameInMap("phones")
    public java.util.List<String> phones;

    public static CreditShieldFixContactResult build(java.util.Map<String, ?> map) throws Exception {
        CreditShieldFixContactResult self = new CreditShieldFixContactResult();
        return TeaModel.build(map, self);
    }

    public CreditShieldFixContactResult setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

    public CreditShieldFixContactResult setPhones(java.util.List<String> phones) {
        this.phones = phones;
        return this;
    }
    public java.util.List<String> getPhones() {
        return this.phones;
    }

}
