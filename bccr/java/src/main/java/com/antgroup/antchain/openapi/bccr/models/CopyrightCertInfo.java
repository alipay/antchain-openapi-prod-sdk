// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class CopyrightCertInfo extends TeaModel {
    // 证件号码
    @NameInMap("cert_no")
    @Validation(required = true)
    public String certNo;

    // 证件名称
    @NameInMap("cert_name")
    @Validation(required = true)
    public String certName;

    // 证件类型
    @NameInMap("cert_type")
    @Validation(required = true)
    public String certType;

    public static CopyrightCertInfo build(java.util.Map<String, ?> map) throws Exception {
        CopyrightCertInfo self = new CopyrightCertInfo();
        return TeaModel.build(map, self);
    }

    public CopyrightCertInfo setCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }
    public String getCertNo() {
        return this.certNo;
    }

    public CopyrightCertInfo setCertName(String certName) {
        this.certName = certName;
        return this;
    }
    public String getCertName() {
        return this.certName;
    }

    public CopyrightCertInfo setCertType(String certType) {
        this.certType = certType;
        return this;
    }
    public String getCertType() {
        return this.certType;
    }

}
