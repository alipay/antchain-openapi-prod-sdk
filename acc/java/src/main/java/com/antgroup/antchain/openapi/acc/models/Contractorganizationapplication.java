// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acc.models;

import com.aliyun.tea.*;

public class Contractorganizationapplication extends TeaModel {
    // 执照号码
    @NameInMap("id_number")
    @Validation(required = true)
    public String idNumber;

    // 执照类型
    @NameInMap("id_type")
    @Validation(required = true)
    public String idType;

    // 法人名称
    @NameInMap("legal_person")
    @Validation(required = true)
    public String legalPerson;

    // 法人证件号
    @NameInMap("legal_person_id")
    @Validation(required = true)
    public String legalPersonId;

    // 企业名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 组织id
    @NameInMap("organization_id")
    @Validation(required = true)
    public String organizationId;

    public static Contractorganizationapplication build(java.util.Map<String, ?> map) throws Exception {
        Contractorganizationapplication self = new Contractorganizationapplication();
        return TeaModel.build(map, self);
    }

    public Contractorganizationapplication setIdNumber(String idNumber) {
        this.idNumber = idNumber;
        return this;
    }
    public String getIdNumber() {
        return this.idNumber;
    }

    public Contractorganizationapplication setIdType(String idType) {
        this.idType = idType;
        return this;
    }
    public String getIdType() {
        return this.idType;
    }

    public Contractorganizationapplication setLegalPerson(String legalPerson) {
        this.legalPerson = legalPerson;
        return this;
    }
    public String getLegalPerson() {
        return this.legalPerson;
    }

    public Contractorganizationapplication setLegalPersonId(String legalPersonId) {
        this.legalPersonId = legalPersonId;
        return this;
    }
    public String getLegalPersonId() {
        return this.legalPersonId;
    }

    public Contractorganizationapplication setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Contractorganizationapplication setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

}
