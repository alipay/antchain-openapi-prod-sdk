// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class CorporateReqModel extends TeaModel {
    // 组织地址
    /**
     * <strong>example:</strong>
     * <p>xxxxx</p>
     */
    @NameInMap("address")
    public String address;

    // 运营地址
    /**
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("business_address")
    public String businessAddress;

    // 经营类目
    /**
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("business_scope")
    public String businessScope;

    // 注册时间，字符串类型
    /**
     * <strong>example:</strong>
     * <p>&quot;注册时间&quot;</p>
     */
    @NameInMap("certify_date")
    public String certifyDate;

    // 营业执照有效期，字符串
    /**
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("licence_expire_date")
    public String licenceExpireDate;

    // 国家
    /**
     * <strong>example:</strong>
     * <p>CN</p>
     */
    @NameInMap("nation")
    public String nation;

    // 组织类型
    /**
     * <strong>example:</strong>
     * <p>LimitedCompany</p>
     */
    @NameInMap("type")
    public String type;

    public static CorporateReqModel build(java.util.Map<String, ?> map) throws Exception {
        CorporateReqModel self = new CorporateReqModel();
        return TeaModel.build(map, self);
    }

    public CorporateReqModel setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public CorporateReqModel setBusinessAddress(String businessAddress) {
        this.businessAddress = businessAddress;
        return this;
    }
    public String getBusinessAddress() {
        return this.businessAddress;
    }

    public CorporateReqModel setBusinessScope(String businessScope) {
        this.businessScope = businessScope;
        return this;
    }
    public String getBusinessScope() {
        return this.businessScope;
    }

    public CorporateReqModel setCertifyDate(String certifyDate) {
        this.certifyDate = certifyDate;
        return this;
    }
    public String getCertifyDate() {
        return this.certifyDate;
    }

    public CorporateReqModel setLicenceExpireDate(String licenceExpireDate) {
        this.licenceExpireDate = licenceExpireDate;
        return this;
    }
    public String getLicenceExpireDate() {
        return this.licenceExpireDate;
    }

    public CorporateReqModel setNation(String nation) {
        this.nation = nation;
        return this;
    }
    public String getNation() {
        return this.nation;
    }

    public CorporateReqModel setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
