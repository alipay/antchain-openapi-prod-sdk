// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class CreateScreenshotRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 取证名称（最长128个字符）
    @NameInMap("name")
    @Validation(required = true, maxLength = 128, minLength = 1)
    public String name;

    // 取证备注（最长512个字符）
    @NameInMap("memo")
    @Validation(maxLength = 512)
    public String memo;

    // 取证地址（最长2048个字符）
    @NameInMap("url")
    @Validation(required = true, maxLength = 2048, minLength = 8)
    public String url;

    // 公证处Id
    @NameInMap("org_id")
    public String orgId;

    // 取证人证件名称
    @NameInMap("cert_name")
    @Validation(required = true)
    public String certName;

    // 取证人证件号码
    @NameInMap("cert_no")
    @Validation(required = true)
    public String certNo;

    // 取证人证件类型
    @NameInMap("cert_type")
    @Validation(required = true)
    public String certType;

    // 法人代表姓名(如果certType为BUSINESS_LICENSE 则必传)
    @NameInMap("legal_person_name")
    public String legalPersonName;

    // 法人代表身份证号(如果certType为BUSINESS_LICENSE 则必传)
    @NameInMap("legal_person_no")
    public String legalPersonNo;

    // 法人证件类型
    @NameInMap("legal_person_type")
    public String legalPersonType;

    // 企业用户取证人姓名(如果certType为BUSINESS_LICENSE 则必传)
    @NameInMap("agent_name")
    public String agentName;

    // 企业用户取证人身份证号(如果certType为BUSINESS_LICENSE 则必传)
    @NameInMap("agent_no")
    public String agentNo;

    // 取证人电话号码，生成公证处证书需要，公证处需要作登记 格式范例：(86-573)2651630   或  (86)13738258505
    @NameInMap("phone_num")
    public String phoneNum;

    // 代理信息
    @NameInMap("proxy_info")
    public ProxyData proxyInfo;

    // 保证请求幂等性。从您的客户端生成一个参数值，确保不同请求间该参数值唯一。clientToken只支持ASCII字符，且不能超过64个字符
    @NameInMap("client_token")
    @Validation(required = true, maxLength = 64)
    public String clientToken;

    public static CreateScreenshotRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateScreenshotRequest self = new CreateScreenshotRequest();
        return TeaModel.build(map, self);
    }

    public CreateScreenshotRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateScreenshotRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateScreenshotRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateScreenshotRequest setMemo(String memo) {
        this.memo = memo;
        return this;
    }
    public String getMemo() {
        return this.memo;
    }

    public CreateScreenshotRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public CreateScreenshotRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

    public CreateScreenshotRequest setCertName(String certName) {
        this.certName = certName;
        return this;
    }
    public String getCertName() {
        return this.certName;
    }

    public CreateScreenshotRequest setCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }
    public String getCertNo() {
        return this.certNo;
    }

    public CreateScreenshotRequest setCertType(String certType) {
        this.certType = certType;
        return this;
    }
    public String getCertType() {
        return this.certType;
    }

    public CreateScreenshotRequest setLegalPersonName(String legalPersonName) {
        this.legalPersonName = legalPersonName;
        return this;
    }
    public String getLegalPersonName() {
        return this.legalPersonName;
    }

    public CreateScreenshotRequest setLegalPersonNo(String legalPersonNo) {
        this.legalPersonNo = legalPersonNo;
        return this;
    }
    public String getLegalPersonNo() {
        return this.legalPersonNo;
    }

    public CreateScreenshotRequest setLegalPersonType(String legalPersonType) {
        this.legalPersonType = legalPersonType;
        return this;
    }
    public String getLegalPersonType() {
        return this.legalPersonType;
    }

    public CreateScreenshotRequest setAgentName(String agentName) {
        this.agentName = agentName;
        return this;
    }
    public String getAgentName() {
        return this.agentName;
    }

    public CreateScreenshotRequest setAgentNo(String agentNo) {
        this.agentNo = agentNo;
        return this;
    }
    public String getAgentNo() {
        return this.agentNo;
    }

    public CreateScreenshotRequest setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
        return this;
    }
    public String getPhoneNum() {
        return this.phoneNum;
    }

    public CreateScreenshotRequest setProxyInfo(ProxyData proxyInfo) {
        this.proxyInfo = proxyInfo;
        return this;
    }
    public ProxyData getProxyInfo() {
        return this.proxyInfo;
    }

    public CreateScreenshotRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
