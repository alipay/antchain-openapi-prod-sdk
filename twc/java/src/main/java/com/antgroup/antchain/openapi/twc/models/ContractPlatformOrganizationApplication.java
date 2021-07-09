// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class ContractPlatformOrganizationApplication extends TeaModel {
    // 证件号
    @NameInMap("id_number")
    public String idNumber;

    // 证件类型
    @NameInMap("id_type")
    public String idType;

    // 企业法人名称
    @NameInMap("org_legal_name")
    public String orgLegalName;

    // 企业法人证件号
    @NameInMap("org_legal_id_number")
    public String orgLegalIdNumber;

    // 机构名称
    @NameInMap("name")
    public String name;

    public static ContractPlatformOrganizationApplication build(java.util.Map<String, ?> map) throws Exception {
        ContractPlatformOrganizationApplication self = new ContractPlatformOrganizationApplication();
        return TeaModel.build(map, self);
    }

    public ContractPlatformOrganizationApplication setIdNumber(String idNumber) {
        this.idNumber = idNumber;
        return this;
    }
    public String getIdNumber() {
        return this.idNumber;
    }

    public ContractPlatformOrganizationApplication setIdType(String idType) {
        this.idType = idType;
        return this;
    }
    public String getIdType() {
        return this.idType;
    }

    public ContractPlatformOrganizationApplication setOrgLegalName(String orgLegalName) {
        this.orgLegalName = orgLegalName;
        return this;
    }
    public String getOrgLegalName() {
        return this.orgLegalName;
    }

    public ContractPlatformOrganizationApplication setOrgLegalIdNumber(String orgLegalIdNumber) {
        this.orgLegalIdNumber = orgLegalIdNumber;
        return this;
    }
    public String getOrgLegalIdNumber() {
        return this.orgLegalIdNumber;
    }

    public ContractPlatformOrganizationApplication setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
