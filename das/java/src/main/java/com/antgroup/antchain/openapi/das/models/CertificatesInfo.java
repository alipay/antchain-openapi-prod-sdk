// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.das.models;

import com.aliyun.tea.*;

public class CertificatesInfo extends TeaModel {
    // 证书名称
    /**
     * <strong>example:</strong>
     * <p>证书名称</p>
     */
    @NameInMap("certificate_name")
    @Validation(maxLength = 128)
    public String certificateName;

    public static CertificatesInfo build(java.util.Map<String, ?> map) throws Exception {
        CertificatesInfo self = new CertificatesInfo();
        return TeaModel.build(map, self);
    }

    public CertificatesInfo setCertificateName(String certificateName) {
        this.certificateName = certificateName;
        return this;
    }
    public String getCertificateName() {
        return this.certificateName;
    }

}
