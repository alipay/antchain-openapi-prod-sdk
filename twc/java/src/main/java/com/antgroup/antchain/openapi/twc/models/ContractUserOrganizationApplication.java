// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class ContractUserOrganizationApplication extends TeaModel {
    // 证件号，该字段只有为空才允许修改
    @NameInMap("id_number")
    public String idNumber;

    // 证件类型 ，默认CRED_ORG_USCC
    @NameInMap("id_type")
    public String idType;

    // 企业法定代表人名称
    @NameInMap("legal_person")
    public String legalPerson;

    // 企业法定代表人证件号
    @NameInMap("legal_person_id")
    public String legalPersonId;

    // 机构名称
    @NameInMap("name")
    public String name;

    // 机构账号id
    @NameInMap("organization_id")
    @Validation(required = true)
    public String organizationId;

    public static ContractUserOrganizationApplication build(java.util.Map<String, ?> map) throws Exception {
        ContractUserOrganizationApplication self = new ContractUserOrganizationApplication();
        return TeaModel.build(map, self);
    }

    public ContractUserOrganizationApplication setIdNumber(String idNumber) {
        this.idNumber = idNumber;
        return this;
    }
    public String getIdNumber() {
        return this.idNumber;
    }

    public ContractUserOrganizationApplication setIdType(String idType) {
        this.idType = idType;
        return this;
    }
    public String getIdType() {
        return this.idType;
    }

    public ContractUserOrganizationApplication setLegalPerson(String legalPerson) {
        this.legalPerson = legalPerson;
        return this;
    }
    public String getLegalPerson() {
        return this.legalPerson;
    }

    public ContractUserOrganizationApplication setLegalPersonId(String legalPersonId) {
        this.legalPersonId = legalPersonId;
        return this;
    }
    public String getLegalPersonId() {
        return this.legalPersonId;
    }

    public ContractUserOrganizationApplication setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ContractUserOrganizationApplication setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

}
