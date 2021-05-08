// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tdm.models;

import com.aliyun.tea.*;

public class CertificationRequest extends TeaModel {
    // 认证模式
    @NameInMap("biz_code")
    @Validation(required = true)
    public String bizCode;

    public static CertificationRequest build(java.util.Map<String, ?> map) throws Exception {
        CertificationRequest self = new CertificationRequest();
        return TeaModel.build(map, self);
    }

    public CertificationRequest setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
    }

}
