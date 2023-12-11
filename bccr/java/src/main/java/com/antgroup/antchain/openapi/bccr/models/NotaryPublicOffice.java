// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class NotaryPublicOffice extends TeaModel {
    // 公证处code
    @NameInMap("code")
    @Validation(required = true)
    public String code;

    // 公证处名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 公证处所在省（直辖市）
    @NameInMap("province")
    @Validation(required = true)
    public String province;

    // 公证处所在市
    @NameInMap("city")
    @Validation(required = true)
    public String city;

    // 公证处完整名称
    @NameInMap("org_name")
    @Validation(required = true)
    public String orgName;

    // 公证处隶属
    @NameInMap("belong")
    @Validation(required = true)
    public String belong;

    // 公证处出证规则
    @NameInMap("notary_order_rule")
    public NotaryOrderRule notaryOrderRule;

    // 是否允许出证
    @NameInMap("allow_certification")
    public Boolean allowCertification;

    public static NotaryPublicOffice build(java.util.Map<String, ?> map) throws Exception {
        NotaryPublicOffice self = new NotaryPublicOffice();
        return TeaModel.build(map, self);
    }

    public NotaryPublicOffice setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public NotaryPublicOffice setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public NotaryPublicOffice setProvince(String province) {
        this.province = province;
        return this;
    }
    public String getProvince() {
        return this.province;
    }

    public NotaryPublicOffice setCity(String city) {
        this.city = city;
        return this;
    }
    public String getCity() {
        return this.city;
    }

    public NotaryPublicOffice setOrgName(String orgName) {
        this.orgName = orgName;
        return this;
    }
    public String getOrgName() {
        return this.orgName;
    }

    public NotaryPublicOffice setBelong(String belong) {
        this.belong = belong;
        return this;
    }
    public String getBelong() {
        return this.belong;
    }

    public NotaryPublicOffice setNotaryOrderRule(NotaryOrderRule notaryOrderRule) {
        this.notaryOrderRule = notaryOrderRule;
        return this;
    }
    public NotaryOrderRule getNotaryOrderRule() {
        return this.notaryOrderRule;
    }

    public NotaryPublicOffice setAllowCertification(Boolean allowCertification) {
        this.allowCertification = allowCertification;
        return this;
    }
    public Boolean getAllowCertification() {
        return this.allowCertification;
    }

}
