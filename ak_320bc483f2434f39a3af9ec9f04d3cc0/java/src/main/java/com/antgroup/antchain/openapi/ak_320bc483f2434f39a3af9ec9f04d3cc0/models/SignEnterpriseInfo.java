// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_320bc483f2434f39a3af9ec9f04d3cc0.models;

import com.aliyun.tea.*;

public class SignEnterpriseInfo extends TeaModel {
    // 公司名称
    @NameInMap("organization_name")
    @Validation(required = true)
    public String organizationName;

    // 社会统一信用代码
    @NameInMap("uscc")
    @Validation(required = true)
    public String uscc;

    // 法人姓名
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 法人身份证号码
    @NameInMap("id_number")
    @Validation(required = true)
    public String idNumber;

    // 签署模式0、自动签署1、手动签署（用户只能手动）
    // 
    @NameInMap("sign_type")
    @Validation(required = true)
    public Long signType;

    // 签署区列表
    @NameInMap("sign_area_list")
    @Validation(required = true)
    public java.util.List<SignatoryInfo> signAreaList;

    public static SignEnterpriseInfo build(java.util.Map<String, ?> map) throws Exception {
        SignEnterpriseInfo self = new SignEnterpriseInfo();
        return TeaModel.build(map, self);
    }

    public SignEnterpriseInfo setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
        return this;
    }
    public String getOrganizationName() {
        return this.organizationName;
    }

    public SignEnterpriseInfo setUscc(String uscc) {
        this.uscc = uscc;
        return this;
    }
    public String getUscc() {
        return this.uscc;
    }

    public SignEnterpriseInfo setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public SignEnterpriseInfo setIdNumber(String idNumber) {
        this.idNumber = idNumber;
        return this;
    }
    public String getIdNumber() {
        return this.idNumber;
    }

    public SignEnterpriseInfo setSignType(Long signType) {
        this.signType = signType;
        return this;
    }
    public Long getSignType() {
        return this.signType;
    }

    public SignEnterpriseInfo setSignAreaList(java.util.List<SignatoryInfo> signAreaList) {
        this.signAreaList = signAreaList;
        return this;
    }
    public java.util.List<SignatoryInfo> getSignAreaList() {
        return this.signAreaList;
    }

}
