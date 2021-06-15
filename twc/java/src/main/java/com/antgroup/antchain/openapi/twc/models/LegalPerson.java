// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class LegalPerson extends TeaModel {
    // 被申请人姓名
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 法人统一社会信用编码
    @NameInMap("id_number")
    @Validation(required = true)
    public String idNumber;

    // 法定代表人姓名
    @NameInMap("representative_name")
    public String representativeName;

    // 联系方式
    @NameInMap("legal_phone_number")
    public String legalPhoneNumber;

    // 住所地（同营业执照地址）
    @NameInMap("legal_address")
    public String legalAddress;

    // 企业经营地址
    @NameInMap("legal_business_address")
    public String legalBusinessAddress;

    // 营业执照照片
    // fileKey 列表（先调用接口获取上传url和fileKey）
    @NameInMap("legal_id_number_file")
    public java.util.List<String> legalIdNumberFile;

    public static LegalPerson build(java.util.Map<String, ?> map) throws Exception {
        LegalPerson self = new LegalPerson();
        return TeaModel.build(map, self);
    }

    public LegalPerson setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public LegalPerson setIdNumber(String idNumber) {
        this.idNumber = idNumber;
        return this;
    }
    public String getIdNumber() {
        return this.idNumber;
    }

    public LegalPerson setRepresentativeName(String representativeName) {
        this.representativeName = representativeName;
        return this;
    }
    public String getRepresentativeName() {
        return this.representativeName;
    }

    public LegalPerson setLegalPhoneNumber(String legalPhoneNumber) {
        this.legalPhoneNumber = legalPhoneNumber;
        return this;
    }
    public String getLegalPhoneNumber() {
        return this.legalPhoneNumber;
    }

    public LegalPerson setLegalAddress(String legalAddress) {
        this.legalAddress = legalAddress;
        return this;
    }
    public String getLegalAddress() {
        return this.legalAddress;
    }

    public LegalPerson setLegalBusinessAddress(String legalBusinessAddress) {
        this.legalBusinessAddress = legalBusinessAddress;
        return this;
    }
    public String getLegalBusinessAddress() {
        return this.legalBusinessAddress;
    }

    public LegalPerson setLegalIdNumberFile(java.util.List<String> legalIdNumberFile) {
        this.legalIdNumberFile = legalIdNumberFile;
        return this;
    }
    public java.util.List<String> getLegalIdNumberFile() {
        return this.legalIdNumberFile;
    }

}
