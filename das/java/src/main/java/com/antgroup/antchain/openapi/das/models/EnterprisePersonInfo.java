// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.das.models;

import com.aliyun.tea.*;

public class EnterprisePersonInfo extends TeaModel {
    // 查询人对应企业名
    /**
     * <strong>example:</strong>
     * <p>**公司</p>
     */
    @NameInMap("org_name")
    public String orgName;

    // 查询人持股信息
    @NameInMap("stockholder")
    public StockHolder stockholder;

    // 查询人所在公司基本信息
    @NameInMap("basic_info")
    public EnterpriseBasicInfo basicInfo;

    // 查询人与这家企业的关联:sh 股东;lp 法人;tm 高管
    @NameInMap("relationship")
    public java.util.List<String> relationship;

    public static EnterprisePersonInfo build(java.util.Map<String, ?> map) throws Exception {
        EnterprisePersonInfo self = new EnterprisePersonInfo();
        return TeaModel.build(map, self);
    }

    public EnterprisePersonInfo setOrgName(String orgName) {
        this.orgName = orgName;
        return this;
    }
    public String getOrgName() {
        return this.orgName;
    }

    public EnterprisePersonInfo setStockholder(StockHolder stockholder) {
        this.stockholder = stockholder;
        return this;
    }
    public StockHolder getStockholder() {
        return this.stockholder;
    }

    public EnterprisePersonInfo setBasicInfo(EnterpriseBasicInfo basicInfo) {
        this.basicInfo = basicInfo;
        return this;
    }
    public EnterpriseBasicInfo getBasicInfo() {
        return this.basicInfo;
    }

    public EnterprisePersonInfo setRelationship(java.util.List<String> relationship) {
        this.relationship = relationship;
        return this;
    }
    public java.util.List<String> getRelationship() {
        return this.relationship;
    }

}
