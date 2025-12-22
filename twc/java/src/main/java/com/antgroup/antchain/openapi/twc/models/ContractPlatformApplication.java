// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class ContractPlatformApplication extends TeaModel {
    // 证件号
    /**
     * <strong>example:</strong>
     * <p>311111111111111111</p>
     */
    @NameInMap("id_number")
    @Validation(required = true)
    public String idNumber;

    // 证件类型
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
     * <p>张三</p>
     */
    @NameInMap("org_legal_name")
    public String orgLegalName;

    // 企业法人证件号
    /**
     * <strong>example:</strong>
     * <p>311111111111111111</p>
     */
    @NameInMap("org_legal_id_number")
    public String orgLegalIdNumber;

    // 机构名称
    /**
     * <strong>example:</strong>
     * <p>测试企业</p>
     */
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 平台方账号id
    /**
     * <strong>example:</strong>
     * <p>5c66842caf754a6dada4124b66666666</p>
     */
    @NameInMap("platform_id")
    @Validation(required = true)
    public String platformId;

    public static ContractPlatformApplication build(java.util.Map<String, ?> map) throws Exception {
        ContractPlatformApplication self = new ContractPlatformApplication();
        return TeaModel.build(map, self);
    }

    public ContractPlatformApplication setIdNumber(String idNumber) {
        this.idNumber = idNumber;
        return this;
    }
    public String getIdNumber() {
        return this.idNumber;
    }

    public ContractPlatformApplication setIdType(String idType) {
        this.idType = idType;
        return this;
    }
    public String getIdType() {
        return this.idType;
    }

    public ContractPlatformApplication setOrgLegalName(String orgLegalName) {
        this.orgLegalName = orgLegalName;
        return this;
    }
    public String getOrgLegalName() {
        return this.orgLegalName;
    }

    public ContractPlatformApplication setOrgLegalIdNumber(String orgLegalIdNumber) {
        this.orgLegalIdNumber = orgLegalIdNumber;
        return this;
    }
    public String getOrgLegalIdNumber() {
        return this.orgLegalIdNumber;
    }

    public ContractPlatformApplication setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ContractPlatformApplication setPlatformId(String platformId) {
        this.platformId = platformId;
        return this;
    }
    public String getPlatformId() {
        return this.platformId;
    }

}
