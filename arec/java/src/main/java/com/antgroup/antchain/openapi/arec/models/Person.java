// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.arec.models;

import com.aliyun.tea.*;

public class Person extends TeaModel {
    // 身份证地址
    @NameInMap("address")
    public String address;

    // 居民身份证号
    @NameInMap("cert_no")
    public String certNo;

    // 证件类型,比如：ID_CARD=身份证
    @NameInMap("cert_type")
    public String certType;

    // 客户编号
    @NameInMap("cm_no")
    public String cmNo;

    // 电子邮箱
    @NameInMap("email")
    public String email;

    // 证件反面照片oss存储路径
    @NameInMap("cert_back_pic_oss_key")
    public String certBackPicOssKey;

    // 证件正面照片OSS存储路径
    @NameInMap("cert_front_pic_oss_key")
    public String certFrontPicOssKey;

    // 手机号
    @NameInMap("mobile")
    public String mobile;

    // 客户姓名
    @NameInMap("name")
    public String name;

    // 身份证所在地邮编
    @NameInMap("post_code")
    public String postCode;

    public static Person build(java.util.Map<String, ?> map) throws Exception {
        Person self = new Person();
        return TeaModel.build(map, self);
    }

    public Person setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public Person setCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }
    public String getCertNo() {
        return this.certNo;
    }

    public Person setCertType(String certType) {
        this.certType = certType;
        return this;
    }
    public String getCertType() {
        return this.certType;
    }

    public Person setCmNo(String cmNo) {
        this.cmNo = cmNo;
        return this;
    }
    public String getCmNo() {
        return this.cmNo;
    }

    public Person setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public Person setCertBackPicOssKey(String certBackPicOssKey) {
        this.certBackPicOssKey = certBackPicOssKey;
        return this;
    }
    public String getCertBackPicOssKey() {
        return this.certBackPicOssKey;
    }

    public Person setCertFrontPicOssKey(String certFrontPicOssKey) {
        this.certFrontPicOssKey = certFrontPicOssKey;
        return this;
    }
    public String getCertFrontPicOssKey() {
        return this.certFrontPicOssKey;
    }

    public Person setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public Person setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Person setPostCode(String postCode) {
        this.postCode = postCode;
        return this;
    }
    public String getPostCode() {
        return this.postCode;
    }

}
