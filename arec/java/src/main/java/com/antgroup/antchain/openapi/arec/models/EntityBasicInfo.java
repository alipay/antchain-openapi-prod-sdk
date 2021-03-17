// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.arec.models;

import com.aliyun.tea.*;

public class EntityBasicInfo extends TeaModel {
    // 名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 证件类型，可选值：ID_CARD,BUSINESS_LICENSE,UNIFIED_SOCIAL_CODE
    @NameInMap("cert_type")
    @Validation(required = true)
    public String certType;

    // 证件号码
    @NameInMap("cert_no")
    @Validation(required = true)
    public String certNo;

    public static EntityBasicInfo build(java.util.Map<String, ?> map) throws Exception {
        EntityBasicInfo self = new EntityBasicInfo();
        return TeaModel.build(map, self);
    }

    public EntityBasicInfo setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public EntityBasicInfo setCertType(String certType) {
        this.certType = certType;
        return this;
    }
    public String getCertType() {
        return this.certType;
    }

    public EntityBasicInfo setCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }
    public String getCertNo() {
        return this.certNo;
    }

}
