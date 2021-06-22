// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class ProposerObject extends TeaModel {
    // 申请人姓名
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 统一社会信用代码
    @NameInMap("id_number")
    @Validation(required = true)
    public String idNumber;

    // 联系电话
    @NameInMap("phone_number")
    public String phoneNumber;

    // 电子邮箱地址
    @NameInMap("email")
    public String email;

    // 经营地址
    @NameInMap("business_address")
    public String businessAddress;

    // 营业执照照片
    // 文件信息 列表
    @NameInMap("id_number_file")
    public java.util.List<FileInfo> idNumberFile;

    // 法定代表人姓名
    @NameInMap("representative_name")
    public String representativeName;

    // 法定代表人性别
    // 0: 男 1: 女
    @NameInMap("representative_sex")
    public Long representativeSex;

    // 法定代表人身份证号码
    @NameInMap("representative_id_number")
    public String representativeIdNumber;

    // 法定代表人手机号码
    @NameInMap("representative_mobile_number")
    public String representativeMobileNumber;

    // 法定代表人代表身份证明
    // 文件信息列表
    @NameInMap("representative_id_number_file")
    public java.util.List<FileInfo> representativeIdNumberFile;

    // 法定代表人职务
    @NameInMap("representative_post")
    public String representativePost;

    // 法定代表人职务证明
    // 文件信息列表
    @NameInMap("representative_post_file")
    public java.util.List<FileInfo> representativePostFile;

    // 签章管理员姓名
    @NameInMap("signature_manager_name")
    public String signatureManagerName;

    // 签章管理员身份证号码
    @NameInMap("signature_manager_id_card")
    public String signatureManagerIdCard;

    // 签章管理员手机号码
    @NameInMap("signature_manager_phone")
    public String signatureManagerPhone;

    public static ProposerObject build(java.util.Map<String, ?> map) throws Exception {
        ProposerObject self = new ProposerObject();
        return TeaModel.build(map, self);
    }

    public ProposerObject setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ProposerObject setIdNumber(String idNumber) {
        this.idNumber = idNumber;
        return this;
    }
    public String getIdNumber() {
        return this.idNumber;
    }

    public ProposerObject setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public ProposerObject setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public ProposerObject setBusinessAddress(String businessAddress) {
        this.businessAddress = businessAddress;
        return this;
    }
    public String getBusinessAddress() {
        return this.businessAddress;
    }

    public ProposerObject setIdNumberFile(java.util.List<FileInfo> idNumberFile) {
        this.idNumberFile = idNumberFile;
        return this;
    }
    public java.util.List<FileInfo> getIdNumberFile() {
        return this.idNumberFile;
    }

    public ProposerObject setRepresentativeName(String representativeName) {
        this.representativeName = representativeName;
        return this;
    }
    public String getRepresentativeName() {
        return this.representativeName;
    }

    public ProposerObject setRepresentativeSex(Long representativeSex) {
        this.representativeSex = representativeSex;
        return this;
    }
    public Long getRepresentativeSex() {
        return this.representativeSex;
    }

    public ProposerObject setRepresentativeIdNumber(String representativeIdNumber) {
        this.representativeIdNumber = representativeIdNumber;
        return this;
    }
    public String getRepresentativeIdNumber() {
        return this.representativeIdNumber;
    }

    public ProposerObject setRepresentativeMobileNumber(String representativeMobileNumber) {
        this.representativeMobileNumber = representativeMobileNumber;
        return this;
    }
    public String getRepresentativeMobileNumber() {
        return this.representativeMobileNumber;
    }

    public ProposerObject setRepresentativeIdNumberFile(java.util.List<FileInfo> representativeIdNumberFile) {
        this.representativeIdNumberFile = representativeIdNumberFile;
        return this;
    }
    public java.util.List<FileInfo> getRepresentativeIdNumberFile() {
        return this.representativeIdNumberFile;
    }

    public ProposerObject setRepresentativePost(String representativePost) {
        this.representativePost = representativePost;
        return this;
    }
    public String getRepresentativePost() {
        return this.representativePost;
    }

    public ProposerObject setRepresentativePostFile(java.util.List<FileInfo> representativePostFile) {
        this.representativePostFile = representativePostFile;
        return this;
    }
    public java.util.List<FileInfo> getRepresentativePostFile() {
        return this.representativePostFile;
    }

    public ProposerObject setSignatureManagerName(String signatureManagerName) {
        this.signatureManagerName = signatureManagerName;
        return this;
    }
    public String getSignatureManagerName() {
        return this.signatureManagerName;
    }

    public ProposerObject setSignatureManagerIdCard(String signatureManagerIdCard) {
        this.signatureManagerIdCard = signatureManagerIdCard;
        return this;
    }
    public String getSignatureManagerIdCard() {
        return this.signatureManagerIdCard;
    }

    public ProposerObject setSignatureManagerPhone(String signatureManagerPhone) {
        this.signatureManagerPhone = signatureManagerPhone;
        return this;
    }
    public String getSignatureManagerPhone() {
        return this.signatureManagerPhone;
    }

}
