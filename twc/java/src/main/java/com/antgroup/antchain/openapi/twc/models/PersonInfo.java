// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class PersonInfo extends TeaModel {
    // 个人证件名称
    /**
     * <strong>example:</strong>
     * <p>张三</p>
     */
    @NameInMap("cert_name")
    @Validation(required = true)
    public String certName;

    // 个人证件号码
    /**
     * <strong>example:</strong>
     * <p>512223********1245</p>
     */
    @NameInMap("cert_no")
    @Validation(required = true)
    public String certNo;

    // 证件类型, 默认身份证 RESIDENT：居民身份证号，PASSPORT：护照，MILITARY：军官证
    /**
     * <strong>example:</strong>
     * <p>RESIDENT</p>
     */
    @NameInMap("cert_type")
    public String certType;

    public static PersonInfo build(java.util.Map<String, ?> map) throws Exception {
        PersonInfo self = new PersonInfo();
        return TeaModel.build(map, self);
    }

    public PersonInfo setCertName(String certName) {
        this.certName = certName;
        return this;
    }
    public String getCertName() {
        return this.certName;
    }

    public PersonInfo setCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }
    public String getCertNo() {
        return this.certNo;
    }

    public PersonInfo setCertType(String certType) {
        this.certType = certType;
        return this;
    }
    public String getCertType() {
        return this.certType;
    }

}
