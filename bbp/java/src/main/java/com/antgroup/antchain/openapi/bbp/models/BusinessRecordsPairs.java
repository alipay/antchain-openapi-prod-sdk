// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bbp.models;

import com.aliyun.tea.*;

public class BusinessRecordsPairs extends TeaModel {
    // 业务编码
    @NameInMap("business_code")
    @Validation(required = true)
    public String businessCode;

    // 业务公钥
    @NameInMap("public_key")
    @Validation(required = true)
    public String publicKey;

    public static BusinessRecordsPairs build(java.util.Map<String, ?> map) throws Exception {
        BusinessRecordsPairs self = new BusinessRecordsPairs();
        return TeaModel.build(map, self);
    }

    public BusinessRecordsPairs setBusinessCode(String businessCode) {
        this.businessCode = businessCode;
        return this;
    }
    public String getBusinessCode() {
        return this.businessCode;
    }

    public BusinessRecordsPairs setPublicKey(String publicKey) {
        this.publicKey = publicKey;
        return this;
    }
    public String getPublicKey() {
        return this.publicKey;
    }

}
