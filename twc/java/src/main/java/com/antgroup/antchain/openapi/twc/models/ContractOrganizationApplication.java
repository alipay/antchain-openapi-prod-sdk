// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class ContractOrganizationApplication extends TeaModel {
    // 证件号
    /**
     * <strong>example:</strong>
     * <p>12330100470104939U</p>
     */
    @NameInMap("id_number")
    @Validation(required = true)
    public String idNumber;

    // 证件类型，默认CRED_ORG_USCC，详见机构证件类型说明 （https://antchain.antgroup.com/docs/2/424437#）
    /**
     * <strong>example:</strong>
     * <p>CRED_ORG_USCC</p>
     */
    @NameInMap("id_type")
    @Validation(required = true)
    public String idType;

    // 企业法人名称
    /**
     * <strong>example:</strong>
     * <p>测试法人</p>
     */
    @NameInMap("legal_person")
    public String legalPerson;

    // 企业法人证件号
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
    @Validation(required = true)
    public String name;

    // 机构唯一标识，可传入第三方平台的机构用户id等
    /**
     * <strong>example:</strong>
     * <p>B002</p>
     */
    @NameInMap("organization_id")
    public String organizationId;

    // 机构子类型：ENTERPRISE（企业）、SELF-EMPLOYED（个体工商户）、SUBSIDIARY（分公司）、OTHERORG（其他机构）。若填入这些类型，将会进行相应参数校验，例如：企业类型要求进行企业四要素校验，企业证件号必须是91开头，并且企业类型在签署时会需要授权后才可进行签署；个体工商户要求证件号必须是92开头，其余类型无其他校验。不填入此参数不会进行校验。
    /**
     * <strong>example:</strong>
     * <p>ENTERPRISE</p>
     */
    @NameInMap("org_type")
    public String orgType;

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

    public ContractOrganizationApplication setOrgType(String orgType) {
        this.orgType = orgType;
        return this;
    }
    public String getOrgType() {
        return this.orgType;
    }

}
