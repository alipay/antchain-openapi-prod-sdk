// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class CreateRecodescreenRequest extends TeaModel {
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

    // 预校验网址和预打开网页（不能大于10条）
    @NameInMap("url")
    public java.util.List<String> url;

    // 取证类型 具体见附录 RecordScreenType
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 取证服务器地域 具体见附录 RecordScreenArea
    @NameInMap("area")
    @Validation(required = true)
    public String area;

    // 定制录屏桌面识别码，目前取值只有默认值：DEFAULT
    @NameInMap("screen_code")
    public String screenCode;

    // 最大录屏时间，maxTimeInMin不能小于6min，不能大于300min
    @NameInMap("max_time_in_min")
    @Validation(required = true)
    public Long maxTimeInMin;

    // 服务器进入ready状态，指定时间未开始进入abort状态的等待时间，单位为分钟，默认1min，waitInMin不能小于1，不能大于10min
    @NameInMap("wait_in_min")
    public Long waitInMin;

    // 当所选地域无机器资源时，是否使用其它地域
    // 
    // 目前取值只有默认值：FORBID
    @NameInMap("cross_region")
    public String crossRegion;

    // ip地域取值
    // 
    // 目前取值只有默认值：ANY
    @NameInMap("ip_type")
    public String ipType;

    // 回调地址
    @NameInMap("callback_url")
    public String callbackUrl;

    // 公证处Id
    @NameInMap("org_id")
    public String orgId;

    // 取证人证件名称
    @NameInMap("cert_name")
    @Validation(required = true)
    public String certName;

    // 	
    // 取证人证件号码
    @NameInMap("cert_no")
    @Validation(required = true)
    public String certNo;

    // 取证人证件类型 具体见附录CertType
    @NameInMap("cert_type")
    @Validation(required = true)
    public String certType;

    // 企业法人代表姓名(如果certType为BUSINESS_LICENSE 则必传)
    @NameInMap("legal_person_name")
    public String legalPersonName;

    // 企业法人代表身份证号(如果certType为BUSINESS_LICENSE 则必传)
    @NameInMap("legal_person_no")
    public String legalPersonNo;

    // 企业用户取证人姓名(如果certType为BUSINESS_LICENSE 则必传)
    @NameInMap("agent")
    public String agent;

    // 企业用户取证人身份证号(如果certType为BUSINESS_LICENSE 则必传)
    @NameInMap("agent_no")
    public String agentNo;

    // 取证人电话号码，生成公证处证书需要，公证处需要作登记 格式范例：(86-573)2651630   或  (86)13738258505
    @NameInMap("phone_num")
    public String phoneNum;

    // 代理信息
    @NameInMap("proxy_info")
    public ProxyData proxyInfo;

    // 保证请求幂等性。从您的客户端生成一个参数值，确保不同请求间该参数值唯一。clientToken只支持ASCII字符，且不能超过64个字符。更多详情，请参见如何保证幂等性。
    @NameInMap("client_token")
    @Validation(required = true)
    public String clientToken;

    public static CreateRecodescreenRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRecodescreenRequest self = new CreateRecodescreenRequest();
        return TeaModel.build(map, self);
    }

    public CreateRecodescreenRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateRecodescreenRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateRecodescreenRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateRecodescreenRequest setMemo(String memo) {
        this.memo = memo;
        return this;
    }
    public String getMemo() {
        return this.memo;
    }

    public CreateRecodescreenRequest setUrl(java.util.List<String> url) {
        this.url = url;
        return this;
    }
    public java.util.List<String> getUrl() {
        return this.url;
    }

    public CreateRecodescreenRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CreateRecodescreenRequest setArea(String area) {
        this.area = area;
        return this;
    }
    public String getArea() {
        return this.area;
    }

    public CreateRecodescreenRequest setScreenCode(String screenCode) {
        this.screenCode = screenCode;
        return this;
    }
    public String getScreenCode() {
        return this.screenCode;
    }

    public CreateRecodescreenRequest setMaxTimeInMin(Long maxTimeInMin) {
        this.maxTimeInMin = maxTimeInMin;
        return this;
    }
    public Long getMaxTimeInMin() {
        return this.maxTimeInMin;
    }

    public CreateRecodescreenRequest setWaitInMin(Long waitInMin) {
        this.waitInMin = waitInMin;
        return this;
    }
    public Long getWaitInMin() {
        return this.waitInMin;
    }

    public CreateRecodescreenRequest setCrossRegion(String crossRegion) {
        this.crossRegion = crossRegion;
        return this;
    }
    public String getCrossRegion() {
        return this.crossRegion;
    }

    public CreateRecodescreenRequest setIpType(String ipType) {
        this.ipType = ipType;
        return this;
    }
    public String getIpType() {
        return this.ipType;
    }

    public CreateRecodescreenRequest setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
        return this;
    }
    public String getCallbackUrl() {
        return this.callbackUrl;
    }

    public CreateRecodescreenRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

    public CreateRecodescreenRequest setCertName(String certName) {
        this.certName = certName;
        return this;
    }
    public String getCertName() {
        return this.certName;
    }

    public CreateRecodescreenRequest setCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }
    public String getCertNo() {
        return this.certNo;
    }

    public CreateRecodescreenRequest setCertType(String certType) {
        this.certType = certType;
        return this;
    }
    public String getCertType() {
        return this.certType;
    }

    public CreateRecodescreenRequest setLegalPersonName(String legalPersonName) {
        this.legalPersonName = legalPersonName;
        return this;
    }
    public String getLegalPersonName() {
        return this.legalPersonName;
    }

    public CreateRecodescreenRequest setLegalPersonNo(String legalPersonNo) {
        this.legalPersonNo = legalPersonNo;
        return this;
    }
    public String getLegalPersonNo() {
        return this.legalPersonNo;
    }

    public CreateRecodescreenRequest setAgent(String agent) {
        this.agent = agent;
        return this;
    }
    public String getAgent() {
        return this.agent;
    }

    public CreateRecodescreenRequest setAgentNo(String agentNo) {
        this.agentNo = agentNo;
        return this;
    }
    public String getAgentNo() {
        return this.agentNo;
    }

    public CreateRecodescreenRequest setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
        return this;
    }
    public String getPhoneNum() {
        return this.phoneNum;
    }

    public CreateRecodescreenRequest setProxyInfo(ProxyData proxyInfo) {
        this.proxyInfo = proxyInfo;
        return this;
    }
    public ProxyData getProxyInfo() {
        return this.proxyInfo;
    }

    public CreateRecodescreenRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
