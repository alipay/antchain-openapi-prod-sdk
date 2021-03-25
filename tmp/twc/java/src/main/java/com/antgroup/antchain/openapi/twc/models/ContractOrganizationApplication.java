// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class ContractOrganizationApplication extends TeaModel {
    // 证件号
    @NameInMap("id_number")
    @Validation(required = true)
    public String idNumber;

    // 证件类型，默认CRED_ORG_USCC，详见机构证件类型说明 （https://tech.antfin.com/docs/2/155166）
    @NameInMap("id_type")
    @Validation(required = true)
    public String idType;

    // 企业法人名称
    @NameInMap("legal_person")
    public String legalPerson;

    // 企业法人证件号
    @NameInMap("legal_person_id")
    public String legalPersonId;

    // 机构名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 机构唯一标识，可传入第三方平台的机构用户id等
    @NameInMap("organization_id")
    public String organizationId;

    public static ContractOrganizationApplication build(java.util.Map<String, ?> map) throws Exception {
        ContractOrganizationApplication self = new ContractOrganizationApplication();
        return TeaModel.build(map, self);
    }

    public ContractOrganizationApplication setIdNumber(String idNumber) {
        this.idNumber = idNumber;
        return this;
    }
    public String getIdNumber() {
        return this.idNumber;
    }

    public ContractOrganizationApplication setIdType(String idType) {
        this.idType = idType;
        return this;
    }
    public String getIdType() {
        return this.idType;
    }

    public ContractOrganizationApplication setLegalPerson(String legalPerson) {
        this.legalPerson = legalPerson;
        return this;
    }
    public String getLegalPerson() {
        return this.legalPerson;
    }

    public ContractOrganizationApplication setLegalPersonId(String legalPersonId) {
        this.legalPersonId = legalPersonId;
        return this;
    }
    public String getLegalPersonId() {
        return this.legalPersonId;
    }

    public ContractOrganizationApplication setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ContractOrganizationApplication setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

}
