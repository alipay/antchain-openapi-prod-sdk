// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class CompanyTwoMetaInfo extends TeaModel {
    // 企业证件名称
    /**
     * <strong>example:</strong>
     * <p>XX公司</p>
     */
    @NameInMap("cert_name")
    @Validation(required = true)
    public String certName;

    // 企业证件号码
    /**
     * <strong>example:</strong>
     * <p>9111011421316034XK</p>
     */
    @NameInMap("cert_no")
    @Validation(required = true)
    public String certNo;

    // 证件类型, 默认社会统一信用代码  NATIONAL_LEGAL_MERGE:统一社会信用代码，NATIONAL_LEGAL：营业执照号码
    /**
     * <strong>example:</strong>
     * <p>NATIONAL_LEGAL_MERGE</p>
     */
    @NameInMap("cert_type")
    public String certType;

    public static CompanyTwoMetaInfo build(java.util.Map<String, ?> map) throws Exception {
        CompanyTwoMetaInfo self = new CompanyTwoMetaInfo();
        return TeaModel.build(map, self);
    }

    public CompanyTwoMetaInfo setCertName(String certName) {
        this.certName = certName;
        return this;
    }
    public String getCertName() {
        return this.certName;
    }

    public CompanyTwoMetaInfo setCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }
    public String getCertNo() {
        return this.certNo;
    }

    public CompanyTwoMetaInfo setCertType(String certType) {
        this.certType = certType;
        return this;
    }
    public String getCertType() {
        return this.certType;
    }

}
