// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class ContractSignThirdSignerModel extends TeaModel {
    // 三方机构签章位标签
    /**
     * <strong>example:</strong>
     * <p>bingfang</p>
     */
    @NameInMap("tag")
    @Validation(required = true)
    public String tag;

    // 落章顺序
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("sign_order")
    public Long signOrder;

    // 三方机构名称
    /**
     * <strong>example:</strong>
     * <p>测试三方企业</p>
     */
    @NameInMap("org_name")
    @Validation(required = true)
    public String orgName;

    // 机构证件类型
    /**
     * <strong>example:</strong>
     * <p>CRED_ORG_USCC</p>
     */
    @NameInMap("org_id_type")
    @Validation(required = true)
    public String orgIdType;

    // 三方机构证件号
    /**
     * <strong>example:</strong>
     * <p>91301010101010101A</p>
     */
    @NameInMap("org_id_number")
    @Validation(required = true)
    public String orgIdNumber;

    // 三方机构法人姓名
    /**
     * <strong>example:</strong>
     * <p>李先生</p>
     */
    @NameInMap("org_legal_name")
    public String orgLegalName;

    // 三方机构法人证件号
    /**
     * <strong>example:</strong>
     * <p>91301010101010101A</p>
     */
    @NameInMap("org_legal_id_number")
    public String orgLegalIdNumber;

    // 三方机构印章 ID
    /**
     * <strong>example:</strong>
     * <p>21214212134123413413</p>
     */
    @NameInMap("seal_id")
    public String sealId;

    public static ContractSignThirdSignerModel build(java.util.Map<String, ?> map) throws Exception {
        ContractSignThirdSignerModel self = new ContractSignThirdSignerModel();
        return TeaModel.build(map, self);
    }

    public ContractSignThirdSignerModel setTag(String tag) {
        this.tag = tag;
        return this;
    }
    public String getTag() {
        return this.tag;
    }

    public ContractSignThirdSignerModel setSignOrder(Long signOrder) {
        this.signOrder = signOrder;
        return this;
    }
    public Long getSignOrder() {
        return this.signOrder;
    }

    public ContractSignThirdSignerModel setOrgName(String orgName) {
        this.orgName = orgName;
        return this;
    }
    public String getOrgName() {
        return this.orgName;
    }

    public ContractSignThirdSignerModel setOrgIdType(String orgIdType) {
        this.orgIdType = orgIdType;
        return this;
    }
    public String getOrgIdType() {
        return this.orgIdType;
    }

    public ContractSignThirdSignerModel setOrgIdNumber(String orgIdNumber) {
        this.orgIdNumber = orgIdNumber;
        return this;
    }
    public String getOrgIdNumber() {
        return this.orgIdNumber;
    }

    public ContractSignThirdSignerModel setOrgLegalName(String orgLegalName) {
        this.orgLegalName = orgLegalName;
        return this;
    }
    public String getOrgLegalName() {
        return this.orgLegalName;
    }

    public ContractSignThirdSignerModel setOrgLegalIdNumber(String orgLegalIdNumber) {
        this.orgLegalIdNumber = orgLegalIdNumber;
        return this;
    }
    public String getOrgLegalIdNumber() {
        return this.orgLegalIdNumber;
    }

    public ContractSignThirdSignerModel setSealId(String sealId) {
        this.sealId = sealId;
        return this;
    }
    public String getSealId() {
        return this.sealId;
    }

}
