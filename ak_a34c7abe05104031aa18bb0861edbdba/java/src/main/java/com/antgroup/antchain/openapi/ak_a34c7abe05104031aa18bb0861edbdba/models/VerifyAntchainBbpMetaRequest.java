// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_a34c7abe05104031aa18bb0861edbdba.models;

import com.aliyun.tea.*;

public class VerifyAntchainBbpMetaRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 预留业务code
    @NameInMap("biz_code")
    public String bizCode;

    // 企业名称
    @NameInMap("ep_cert_name")
    @Validation(required = true)
    public String epCertName;

    // 企业证件号码
    @NameInMap("ep_cert_no")
    @Validation(required = true)
    public String epCertNo;

    // 企业证件号码类型，枚举值参考：com.alipay.fc.common.lang.enums.CertTypeEnum
    @NameInMap("ep_cert_no_type")
    @Validation(required = true)
    public String epCertNoType;

    // 法人姓名
    @NameInMap("legal_person_cert_name")
    public String legalPersonCertName;

    // 法人证件号码
    @NameInMap("legal_person_cert_no")
    public String legalPersonCertNo;

    // 法人证件号码类型，枚举值参考：com.alipay.fc.common.lang.enums.CertTypeEnum
    @NameInMap("legal_person_cert_no_type")
    public String legalPersonCertNoType;

    // 系统名称
    @NameInMap("owner_name")
    public String ownerName;

    // 系统租户ID
    @NameInMap("owner_uid")
    public String ownerUid;

    // 业务唯一ID
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // 业务渠道，需提前申请产品码
    @NameInMap("channel")
    @Validation(required = true)
    public String channel;

    // 认证类型：ENTERPRISE-企业, PERSON-个人
    @NameInMap("certify_enum")
    @Validation(required = true)
    public String certifyEnum;

    // 客户支付宝ID
    @NameInMap("alipay_uid")
    public String alipayUid;

    // 个人姓名，用于个人认证
    @NameInMap("person_name")
    public String personName;

    // 个人证件号码
    @NameInMap("person_cert_no")
    public String personCertNo;

    // 个人证件类型，枚举值参考：com.alipay.fc.common.lang.enums.CertTypeEnum
    @NameInMap("person_cert_type")
    public String personCertType;

    // 扩展信息
    @NameInMap("extension_info")
    public NameValuePair extensionInfo;

    // 要素认证结果
    @NameInMap("result")
    public CustomerAuthResult result;

    public static VerifyAntchainBbpMetaRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifyAntchainBbpMetaRequest self = new VerifyAntchainBbpMetaRequest();
        return TeaModel.build(map, self);
    }

    public VerifyAntchainBbpMetaRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public VerifyAntchainBbpMetaRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public VerifyAntchainBbpMetaRequest setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
    }

    public VerifyAntchainBbpMetaRequest setEpCertName(String epCertName) {
        this.epCertName = epCertName;
        return this;
    }
    public String getEpCertName() {
        return this.epCertName;
    }

    public VerifyAntchainBbpMetaRequest setEpCertNo(String epCertNo) {
        this.epCertNo = epCertNo;
        return this;
    }
    public String getEpCertNo() {
        return this.epCertNo;
    }

    public VerifyAntchainBbpMetaRequest setEpCertNoType(String epCertNoType) {
        this.epCertNoType = epCertNoType;
        return this;
    }
    public String getEpCertNoType() {
        return this.epCertNoType;
    }

    public VerifyAntchainBbpMetaRequest setLegalPersonCertName(String legalPersonCertName) {
        this.legalPersonCertName = legalPersonCertName;
        return this;
    }
    public String getLegalPersonCertName() {
        return this.legalPersonCertName;
    }

    public VerifyAntchainBbpMetaRequest setLegalPersonCertNo(String legalPersonCertNo) {
        this.legalPersonCertNo = legalPersonCertNo;
        return this;
    }
    public String getLegalPersonCertNo() {
        return this.legalPersonCertNo;
    }

    public VerifyAntchainBbpMetaRequest setLegalPersonCertNoType(String legalPersonCertNoType) {
        this.legalPersonCertNoType = legalPersonCertNoType;
        return this;
    }
    public String getLegalPersonCertNoType() {
        return this.legalPersonCertNoType;
    }

    public VerifyAntchainBbpMetaRequest setOwnerName(String ownerName) {
        this.ownerName = ownerName;
        return this;
    }
    public String getOwnerName() {
        return this.ownerName;
    }

    public VerifyAntchainBbpMetaRequest setOwnerUid(String ownerUid) {
        this.ownerUid = ownerUid;
        return this;
    }
    public String getOwnerUid() {
        return this.ownerUid;
    }

    public VerifyAntchainBbpMetaRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public VerifyAntchainBbpMetaRequest setChannel(String channel) {
        this.channel = channel;
        return this;
    }
    public String getChannel() {
        return this.channel;
    }

    public VerifyAntchainBbpMetaRequest setCertifyEnum(String certifyEnum) {
        this.certifyEnum = certifyEnum;
        return this;
    }
    public String getCertifyEnum() {
        return this.certifyEnum;
    }

    public VerifyAntchainBbpMetaRequest setAlipayUid(String alipayUid) {
        this.alipayUid = alipayUid;
        return this;
    }
    public String getAlipayUid() {
        return this.alipayUid;
    }

    public VerifyAntchainBbpMetaRequest setPersonName(String personName) {
        this.personName = personName;
        return this;
    }
    public String getPersonName() {
        return this.personName;
    }

    public VerifyAntchainBbpMetaRequest setPersonCertNo(String personCertNo) {
        this.personCertNo = personCertNo;
        return this;
    }
    public String getPersonCertNo() {
        return this.personCertNo;
    }

    public VerifyAntchainBbpMetaRequest setPersonCertType(String personCertType) {
        this.personCertType = personCertType;
        return this;
    }
    public String getPersonCertType() {
        return this.personCertType;
    }

    public VerifyAntchainBbpMetaRequest setExtensionInfo(NameValuePair extensionInfo) {
        this.extensionInfo = extensionInfo;
        return this;
    }
    public NameValuePair getExtensionInfo() {
        return this.extensionInfo;
    }

    public VerifyAntchainBbpMetaRequest setResult(CustomerAuthResult result) {
        this.result = result;
        return this;
    }
    public CustomerAuthResult getResult() {
        return this.result;
    }

}
