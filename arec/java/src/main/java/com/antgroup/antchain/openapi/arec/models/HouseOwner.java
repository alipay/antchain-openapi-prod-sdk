// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.arec.models;

import com.aliyun.tea.*;

public class HouseOwner extends TeaModel {
    // 姓名
    @NameInMap("name")
    public String name;

    // 证件类型
    @NameInMap("cert_type")
    public String certType;

    // 证件号
    @NameInMap("cert_no")
    public String certNo;

    // 手机号
    @NameInMap("mobile")
    public String mobile;

    // 身份证正面照片存储路径
    @NameInMap("cert_front_pic_oss_key")
    public String certFrontPicOssKey;

    // 身份证反面照片存储路径
    @NameInMap("cert_back_pic_oss_key")
    public String certBackPicOssKey;

    // 权利人主体类型，PERSON=个人
    @NameInMap("obligee_type")
    public String obligeeType;

    // 权利人类型
    @NameInMap("obligee_role")
    public String obligeeRole;

    // 共有情况
    @NameInMap("ownership_status")
    public String ownershipStatus;

    // 权证类型
    @NameInMap("house_cert_type")
    public String houseCertType;

    // 权证号
    @NameInMap("house_cert_no")
    public String houseCertNo;

    // 权利比例
    @NameInMap("rights_rate")
    public String rightsRate;

    // 房产链内部客户编号
    @NameInMap("cm_no")
    public String cmNo;

    // 房产链内部房产编号
    @NameInMap("house_no")
    public String houseNo;

    public static HouseOwner build(java.util.Map<String, ?> map) throws Exception {
        HouseOwner self = new HouseOwner();
        return TeaModel.build(map, self);
    }

    public HouseOwner setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public HouseOwner setCertType(String certType) {
        this.certType = certType;
        return this;
    }
    public String getCertType() {
        return this.certType;
    }

    public HouseOwner setCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }
    public String getCertNo() {
        return this.certNo;
    }

    public HouseOwner setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public HouseOwner setCertFrontPicOssKey(String certFrontPicOssKey) {
        this.certFrontPicOssKey = certFrontPicOssKey;
        return this;
    }
    public String getCertFrontPicOssKey() {
        return this.certFrontPicOssKey;
    }

    public HouseOwner setCertBackPicOssKey(String certBackPicOssKey) {
        this.certBackPicOssKey = certBackPicOssKey;
        return this;
    }
    public String getCertBackPicOssKey() {
        return this.certBackPicOssKey;
    }

    public HouseOwner setObligeeType(String obligeeType) {
        this.obligeeType = obligeeType;
        return this;
    }
    public String getObligeeType() {
        return this.obligeeType;
    }

    public HouseOwner setObligeeRole(String obligeeRole) {
        this.obligeeRole = obligeeRole;
        return this;
    }
    public String getObligeeRole() {
        return this.obligeeRole;
    }

    public HouseOwner setOwnershipStatus(String ownershipStatus) {
        this.ownershipStatus = ownershipStatus;
        return this;
    }
    public String getOwnershipStatus() {
        return this.ownershipStatus;
    }

    public HouseOwner setHouseCertType(String houseCertType) {
        this.houseCertType = houseCertType;
        return this;
    }
    public String getHouseCertType() {
        return this.houseCertType;
    }

    public HouseOwner setHouseCertNo(String houseCertNo) {
        this.houseCertNo = houseCertNo;
        return this;
    }
    public String getHouseCertNo() {
        return this.houseCertNo;
    }

    public HouseOwner setRightsRate(String rightsRate) {
        this.rightsRate = rightsRate;
        return this;
    }
    public String getRightsRate() {
        return this.rightsRate;
    }

    public HouseOwner setCmNo(String cmNo) {
        this.cmNo = cmNo;
        return this;
    }
    public String getCmNo() {
        return this.cmNo;
    }

    public HouseOwner setHouseNo(String houseNo) {
        this.houseNo = houseNo;
        return this;
    }
    public String getHouseNo() {
        return this.houseNo;
    }

}
