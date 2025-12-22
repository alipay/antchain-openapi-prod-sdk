// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class PleaderObject extends TeaModel {
    // 法人或自然人标识，法人为1，自然人为0
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("party_type")
    @Validation(required = true)
    public Long partyType;

    // 自然人信息
    // 当partyType=1必填
    @NameInMap("natural_person")
    public NaturalPerson naturalPerson;

    // 法人信息
    // 当partyType=0必填
    @NameInMap("legal_person")
    public LegalPerson legalPerson;

    public static PleaderObject build(java.util.Map<String, ?> map) throws Exception {
        PleaderObject self = new PleaderObject();
        return TeaModel.build(map, self);
    }

    public PleaderObject setPartyType(Long partyType) {
        this.partyType = partyType;
        return this;
    }
    public Long getPartyType() {
        return this.partyType;
    }

    public PleaderObject setNaturalPerson(NaturalPerson naturalPerson) {
        this.naturalPerson = naturalPerson;
        return this;
    }
    public NaturalPerson getNaturalPerson() {
        return this.naturalPerson;
    }

    public PleaderObject setLegalPerson(LegalPerson legalPerson) {
        this.legalPerson = legalPerson;
        return this;
    }
    public LegalPerson getLegalPerson() {
        return this.legalPerson;
    }

}
