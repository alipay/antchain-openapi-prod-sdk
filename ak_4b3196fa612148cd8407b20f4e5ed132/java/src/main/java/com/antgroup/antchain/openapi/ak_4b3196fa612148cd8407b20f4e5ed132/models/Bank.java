// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_4b3196fa612148cd8407b20f4e5ed132.models;

import com.aliyun.tea.*;

public class Bank extends TeaModel {
    // 地址
    @NameInMap("address")
    public String address;

    // 银行编号
    @NameInMap("bank_no")
    public String bankNo;

    // 法人证件号
    @NameInMap("legal_person_cert_no")
    public String legalPersonCertNo;

    // 法人手机号
    @NameInMap("legal_person_mobile")
    public String legalPersonMobile;

    // 法人姓名
    @NameInMap("legal_person_name")
    public String legalPersonName;

    // 行内级别，比如：SUB_BRANCH=支行
    @NameInMap("level")
    public String level;

    // 蚂蚁智能合同的机构id
    @NameInMap("myc_org_id")
    public String mycOrgId;

    // 银行名称
    @NameInMap("name")
    public String name;

    // OSS存储跟路径
    @NameInMap("oss_base_fold")
    public String ossBaseFold;

    // 银行证件号
    @NameInMap("cert_no")
    public String certNo;

    // 上级行号，比如支行对应的分行
    @NameInMap("parent_bank_no")
    public String parentBankNo;

    // 蚂蚁链隐私数据网络的身份id
    @NameInMap("pdn_did")
    public String pdnDid;

    // 公钥
    @NameInMap("pub_key")
    public String pubKey;

    // 租户ID
    @NameInMap("tenant_id")
    public String tenantId;

    // 法人证件类型，比如：ID_CARD=身份证
    @NameInMap("legal_person_cert_type")
    public String legalPersonCertType;

    // 授权合同签署后小程序端的回跳地址
    @NameInMap("auth_callback_url")
    public String authCallbackUrl;

    // 抵押登记相关合同签署后小程序端的回跳地址
    @NameInMap("mg_callback_url")
    public String mgCallbackUrl;

    // 银行接收房产链通知接口地址
    @NameInMap("bk_callback_url")
    public String bkCallbackUrl;

    // 银行证件类型
    @NameInMap("cert_type")
    public String certType;

    public static Bank build(java.util.Map<String, ?> map) throws Exception {
        Bank self = new Bank();
        return TeaModel.build(map, self);
    }

    public Bank setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public Bank setBankNo(String bankNo) {
        this.bankNo = bankNo;
        return this;
    }
    public String getBankNo() {
        return this.bankNo;
    }

    public Bank setLegalPersonCertNo(String legalPersonCertNo) {
        this.legalPersonCertNo = legalPersonCertNo;
        return this;
    }
    public String getLegalPersonCertNo() {
        return this.legalPersonCertNo;
    }

    public Bank setLegalPersonMobile(String legalPersonMobile) {
        this.legalPersonMobile = legalPersonMobile;
        return this;
    }
    public String getLegalPersonMobile() {
        return this.legalPersonMobile;
    }

    public Bank setLegalPersonName(String legalPersonName) {
        this.legalPersonName = legalPersonName;
        return this;
    }
    public String getLegalPersonName() {
        return this.legalPersonName;
    }

    public Bank setLevel(String level) {
        this.level = level;
        return this;
    }
    public String getLevel() {
        return this.level;
    }

    public Bank setMycOrgId(String mycOrgId) {
        this.mycOrgId = mycOrgId;
        return this;
    }
    public String getMycOrgId() {
        return this.mycOrgId;
    }

    public Bank setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Bank setOssBaseFold(String ossBaseFold) {
        this.ossBaseFold = ossBaseFold;
        return this;
    }
    public String getOssBaseFold() {
        return this.ossBaseFold;
    }

    public Bank setCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }
    public String getCertNo() {
        return this.certNo;
    }

    public Bank setParentBankNo(String parentBankNo) {
        this.parentBankNo = parentBankNo;
        return this;
    }
    public String getParentBankNo() {
        return this.parentBankNo;
    }

    public Bank setPdnDid(String pdnDid) {
        this.pdnDid = pdnDid;
        return this;
    }
    public String getPdnDid() {
        return this.pdnDid;
    }

    public Bank setPubKey(String pubKey) {
        this.pubKey = pubKey;
        return this;
    }
    public String getPubKey() {
        return this.pubKey;
    }

    public Bank setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public Bank setLegalPersonCertType(String legalPersonCertType) {
        this.legalPersonCertType = legalPersonCertType;
        return this;
    }
    public String getLegalPersonCertType() {
        return this.legalPersonCertType;
    }

    public Bank setAuthCallbackUrl(String authCallbackUrl) {
        this.authCallbackUrl = authCallbackUrl;
        return this;
    }
    public String getAuthCallbackUrl() {
        return this.authCallbackUrl;
    }

    public Bank setMgCallbackUrl(String mgCallbackUrl) {
        this.mgCallbackUrl = mgCallbackUrl;
        return this;
    }
    public String getMgCallbackUrl() {
        return this.mgCallbackUrl;
    }

    public Bank setBkCallbackUrl(String bkCallbackUrl) {
        this.bkCallbackUrl = bkCallbackUrl;
        return this;
    }
    public String getBkCallbackUrl() {
        return this.bkCallbackUrl;
    }

    public Bank setCertType(String certType) {
        this.certType = certType;
        return this;
    }
    public String getCertType() {
        return this.certType;
    }

}
