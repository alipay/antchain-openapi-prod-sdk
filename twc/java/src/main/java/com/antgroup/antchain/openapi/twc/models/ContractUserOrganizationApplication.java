// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class ContractUserOrganizationApplication extends TeaModel {
    // 证件号，该字段只有为空才允许修改
    /**
     * <strong>example:</strong>
     * <p>12330100470104939U</p>
     */
    @NameInMap("id_number")
    public String idNumber;

    // 证件类型 ，默认CRED_ORG_USCC
    /**
     * <strong>example:</strong>
     * <p>CRED_ORG_USCC</p>
     */
    @NameInMap("id_type")
    public String idType;

    // 企业法定代表人名称
    /**
     * <strong>example:</strong>
     * <p>测试法人</p>
     */
    @NameInMap("legal_person")
    public String legalPerson;

    // 企业法定代表人证件号
    /**
     * <strong>example:</strong>
     * <p>311111111111111111</p>
     */
    @NameInMap("legal_person_id")
    public String legalPersonId;

    // 机构名称
    /**
     * <strong>example:</strong>
     * <p>测试企业</p>
     */
    @NameInMap("name")
    public String name;

    // 机构账号id
    /**
     * <strong>example:</strong>
     * <p>ORGJC1CN1591666666666</p>
     */
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
