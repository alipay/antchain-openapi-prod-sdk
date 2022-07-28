// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class CreateRecordscreenRequest extends TeaModel {
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

    // 预校验网址和预打开网页（不能大于10条），如果automatic为true 则必填
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

    // 当所选地域无机器资源时，是否使用其它地域 目前取值只有默认值：FORBID
    @NameInMap("cross_region")
    public String crossRegion;

    // ip地域取值 目前取值只有默认值：ANY
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

    // 法人证件类型（非必传，默认IDENTITY_CARD）
    @NameInMap("legal_person_type")
    public String legalPersonType;

    // 企业用户取证人姓名(如果certType为BUSINESS_LICENSE 则必传)
    @NameInMap("agent_name")
    public String agentName;

    // 企业用户取证人身份证号(如果certType为BUSINESS_LICENSE 则必传)
    @NameInMap("agent_no")
    public String agentNo;

    // 取证人电话号码，生成公证处证书需要，公证处需要作登记 格式范例：(86-573)2651630 或 (86)13738258505
    @NameInMap("phone_num")
    public String phoneNum;

    // 是否自动化取证
    @NameInMap("automatic")
    public Boolean automatic;

    // 取证目标类型： 微信公众号：WEIXIN_MP 其它：OTHER
    // 
    @NameInMap("target_type")
    public String targetType;

    // 是否支持UAC通行 默认false
    @NameInMap("support_uac")
    public Boolean supportUac;

    // 取证脚本集Id
    @NameInMap("scripts_package_id")
    public String scriptsPackageId;

    // 代理信息
    @NameInMap("proxy_info")
    public ProxyData proxyInfo;

    // 保证请求幂等性。从您的客户端生成一个参数值，确保不同请求间该参数值唯一。clientToken只支持ASCII字符，且不能超过64个字符。更多详情，请参见如何保证幂等性。
    @NameInMap("client_token")
    @Validation(required = true)
    public String clientToken;

    // 其他取证网址
    @NameInMap("inventory")
    public String inventory;

    // 音视频取证信息
    @NameInMap("audio_video_infos")
    public java.util.List<EvidenceUrlInfo> audioVideoInfos;

    // 放弃取证信息
    @NameInMap("screen_cancel_info")
    public ScreenCancelInfo screenCancelInfo;

    public static CreateRecordscreenRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRecordscreenRequest self = new CreateRecordscreenRequest();
        return TeaModel.build(map, self);
    }

    public CreateRecordscreenRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateRecordscreenRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateRecordscreenRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateRecordscreenRequest setMemo(String memo) {
        this.memo = memo;
        return this;
    }
    public String getMemo() {
        return this.memo;
    }

    public CreateRecordscreenRequest setUrl(java.util.List<String> url) {
        this.url = url;
        return this;
    }
    public java.util.List<String> getUrl() {
        return this.url;
    }

    public CreateRecordscreenRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CreateRecordscreenRequest setArea(String area) {
        this.area = area;
        return this;
    }
    public String getArea() {
        return this.area;
    }

    public CreateRecordscreenRequest setScreenCode(String screenCode) {
        this.screenCode = screenCode;
        return this;
    }
    public String getScreenCode() {
        return this.screenCode;
    }

    public CreateRecordscreenRequest setMaxTimeInMin(Long maxTimeInMin) {
        this.maxTimeInMin = maxTimeInMin;
        return this;
    }
    public Long getMaxTimeInMin() {
        return this.maxTimeInMin;
    }

    public CreateRecordscreenRequest setWaitInMin(Long waitInMin) {
        this.waitInMin = waitInMin;
        return this;
    }
    public Long getWaitInMin() {
        return this.waitInMin;
    }

    public CreateRecordscreenRequest setCrossRegion(String crossRegion) {
        this.crossRegion = crossRegion;
        return this;
    }
    public String getCrossRegion() {
        return this.crossRegion;
    }

    public CreateRecordscreenRequest setIpType(String ipType) {
        this.ipType = ipType;
        return this;
    }
    public String getIpType() {
        return this.ipType;
    }

    public CreateRecordscreenRequest setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
        return this;
    }
    public String getCallbackUrl() {
        return this.callbackUrl;
    }

    public CreateRecordscreenRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

    public CreateRecordscreenRequest setCertName(String certName) {
        this.certName = certName;
        return this;
    }
    public String getCertName() {
        return this.certName;
    }

    public CreateRecordscreenRequest setCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }
    public String getCertNo() {
        return this.certNo;
    }

    public CreateRecordscreenRequest setCertType(String certType) {
        this.certType = certType;
        return this;
    }
    public String getCertType() {
        return this.certType;
    }

    public CreateRecordscreenRequest setLegalPersonName(String legalPersonName) {
        this.legalPersonName = legalPersonName;
        return this;
    }
    public String getLegalPersonName() {
        return this.legalPersonName;
    }

    public CreateRecordscreenRequest setLegalPersonNo(String legalPersonNo) {
        this.legalPersonNo = legalPersonNo;
        return this;
    }
    public String getLegalPersonNo() {
        return this.legalPersonNo;
    }

    public CreateRecordscreenRequest setLegalPersonType(String legalPersonType) {
        this.legalPersonType = legalPersonType;
        return this;
    }
    public String getLegalPersonType() {
        return this.legalPersonType;
    }

    public CreateRecordscreenRequest setAgentName(String agentName) {
        this.agentName = agentName;
        return this;
    }
    public String getAgentName() {
        return this.agentName;
    }

    public CreateRecordscreenRequest setAgentNo(String agentNo) {
        this.agentNo = agentNo;
        return this;
    }
    public String getAgentNo() {
        return this.agentNo;
    }

    public CreateRecordscreenRequest setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
        return this;
    }
    public String getPhoneNum() {
        return this.phoneNum;
    }

    public CreateRecordscreenRequest setAutomatic(Boolean automatic) {
        this.automatic = automatic;
        return this;
    }
    public Boolean getAutomatic() {
        return this.automatic;
    }

    public CreateRecordscreenRequest setTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }
    public String getTargetType() {
        return this.targetType;
    }

    public CreateRecordscreenRequest setSupportUac(Boolean supportUac) {
        this.supportUac = supportUac;
        return this;
    }
    public Boolean getSupportUac() {
        return this.supportUac;
    }

    public CreateRecordscreenRequest setScriptsPackageId(String scriptsPackageId) {
        this.scriptsPackageId = scriptsPackageId;
        return this;
    }
    public String getScriptsPackageId() {
        return this.scriptsPackageId;
    }

    public CreateRecordscreenRequest setProxyInfo(ProxyData proxyInfo) {
        this.proxyInfo = proxyInfo;
        return this;
    }
    public ProxyData getProxyInfo() {
        return this.proxyInfo;
    }

    public CreateRecordscreenRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateRecordscreenRequest setInventory(String inventory) {
        this.inventory = inventory;
        return this;
    }
    public String getInventory() {
        return this.inventory;
    }

    public CreateRecordscreenRequest setAudioVideoInfos(java.util.List<EvidenceUrlInfo> audioVideoInfos) {
        this.audioVideoInfos = audioVideoInfos;
        return this;
    }
    public java.util.List<EvidenceUrlInfo> getAudioVideoInfos() {
        return this.audioVideoInfos;
    }

    public CreateRecordscreenRequest setScreenCancelInfo(ScreenCancelInfo screenCancelInfo) {
        this.screenCancelInfo = screenCancelInfo;
        return this;
    }
    public ScreenCancelInfo getScreenCancelInfo() {
        return this.screenCancelInfo;
    }

}
