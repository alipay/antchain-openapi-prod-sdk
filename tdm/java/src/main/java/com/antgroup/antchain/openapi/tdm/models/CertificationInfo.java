// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tdm.models;

import com.aliyun.tea.*;

public class CertificationInfo extends TeaModel {
    // 是否授权
    @NameInMap("certification_flag")
    public Boolean certificationFlag;

    // 实人认证唯一标识
    @NameInMap("certify_id")
    public String certifyId;

    public static CertificationInfo build(java.util.Map<String, ?> map) throws Exception {
        CertificationInfo self = new CertificationInfo();
        return TeaModel.build(map, self);
    }

    public CertificationInfo setCertificationFlag(Boolean certificationFlag) {
        this.certificationFlag = certificationFlag;
        return this;
    }
    public Boolean getCertificationFlag() {
        return this.certificationFlag;
    }

    public CertificationInfo setCertifyId(String certifyId) {
        this.certifyId = certifyId;
        return this;
    }
    public String getCertifyId() {
        return this.certifyId;
    }

}
