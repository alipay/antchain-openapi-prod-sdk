// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iam.models;

import com.aliyun.tea.*;

public class AliyunPopRequestInfo extends TeaModel {
    // AccessKey
    @NameInMap("access_key_id")
    public String accessKeyId;

    // 是否开启MFA
    @NameInMap("ak_mfa_present")
    public Boolean akMfaPresent;

    // Ak系统中记录的客户端代理信息，比如来源于Ecs控制台的请求取之就是EcsConsole
    @NameInMap("ak_proxy")
    public String akProxy;

    // API名称
    @NameInMap("api_name")
    public String apiName;

    // 调用者IP
    // 
    @NameInMap("app_ip")
    public String appIp;

    // 调用者BID
    @NameInMap("caller_bid")
    public String callerBid;

    // 调用者主账号ID
    @NameInMap("caller_parent_id")
    public String callerParentId;

    // 调用者类型，支持partner, customer, sub, AssumedRoleUser
    @NameInMap("caller_type")
    @Validation(required = true)
    public String callerType;

    // 调用者ID
    @NameInMap("caller_uid")
    public String callerUid;

    // 用户原始请求是否使用https
    @NameInMap("proxy_original_security_transport")
    public Boolean proxyOriginalSecurityTransport;

    // 用户原始IP
    // 
    @NameInMap("proxy_original_source_ip")
    public String proxyOriginalSourceIp;

    // 提交给网关的原始IP等信息是否可信
    @NameInMap("proxy_trust_transport_info")
    public Boolean proxyTrustTransportInfo;

    // request_id
    @NameInMap("request_id")
    public String requestId;

    // STS token
    @NameInMap("security_token")
    public String securityToken;

    // security_transport
    @NameInMap("security_transport")
    public Boolean securityTransport;

    // 来源IP
    @NameInMap("source_ip")
    public String sourceIp;

    // StsTokenAccountBID，创建子账号的主账号 的BID。使用StsToken调用POP时才有此参数
    @NameInMap("sts_token_caller_bid")
    public String stsTokenCallerBid;

    // STS token调用者ID
    @NameInMap("sts_token_caller_uid")
    public String stsTokenCallerUid;

    // 子账号id:sessioname。调用者阿里云principalId，使用StsToken调用POP时才有此参数
    @NameInMap("sts_token_principal_id")
    public String stsTokenPrincipalId;

    // 调用者阿里云roleId，使用StsToken调用POP时才有此参数
    // 
    @NameInMap("sts_token_role_id")
    public String stsTokenRoleId;

    // STS token绑定用户ID
    @NameInMap("sts_token_user_id")
    public String stsTokenUserId;

    // 版本
    @NameInMap("version")
    public String version;

    public static AliyunPopRequestInfo build(java.util.Map<String, ?> map) throws Exception {
        AliyunPopRequestInfo self = new AliyunPopRequestInfo();
        return TeaModel.build(map, self);
    }

    public AliyunPopRequestInfo setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
        return this;
    }
    public String getAccessKeyId() {
        return this.accessKeyId;
    }

    public AliyunPopRequestInfo setAkMfaPresent(Boolean akMfaPresent) {
        this.akMfaPresent = akMfaPresent;
        return this;
    }
    public Boolean getAkMfaPresent() {
        return this.akMfaPresent;
    }

    public AliyunPopRequestInfo setAkProxy(String akProxy) {
        this.akProxy = akProxy;
        return this;
    }
    public String getAkProxy() {
        return this.akProxy;
    }

    public AliyunPopRequestInfo setApiName(String apiName) {
        this.apiName = apiName;
        return this;
    }
    public String getApiName() {
        return this.apiName;
    }

    public AliyunPopRequestInfo setAppIp(String appIp) {
        this.appIp = appIp;
        return this;
    }
    public String getAppIp() {
        return this.appIp;
    }

    public AliyunPopRequestInfo setCallerBid(String callerBid) {
        this.callerBid = callerBid;
        return this;
    }
    public String getCallerBid() {
        return this.callerBid;
    }

    public AliyunPopRequestInfo setCallerParentId(String callerParentId) {
        this.callerParentId = callerParentId;
        return this;
    }
    public String getCallerParentId() {
        return this.callerParentId;
    }

    public AliyunPopRequestInfo setCallerType(String callerType) {
        this.callerType = callerType;
        return this;
    }
    public String getCallerType() {
        return this.callerType;
    }

    public AliyunPopRequestInfo setCallerUid(String callerUid) {
        this.callerUid = callerUid;
        return this;
    }
    public String getCallerUid() {
        return this.callerUid;
    }

    public AliyunPopRequestInfo setProxyOriginalSecurityTransport(Boolean proxyOriginalSecurityTransport) {
        this.proxyOriginalSecurityTransport = proxyOriginalSecurityTransport;
        return this;
    }
    public Boolean getProxyOriginalSecurityTransport() {
        return this.proxyOriginalSecurityTransport;
    }

    public AliyunPopRequestInfo setProxyOriginalSourceIp(String proxyOriginalSourceIp) {
        this.proxyOriginalSourceIp = proxyOriginalSourceIp;
        return this;
    }
    public String getProxyOriginalSourceIp() {
        return this.proxyOriginalSourceIp;
    }

    public AliyunPopRequestInfo setProxyTrustTransportInfo(Boolean proxyTrustTransportInfo) {
        this.proxyTrustTransportInfo = proxyTrustTransportInfo;
        return this;
    }
    public Boolean getProxyTrustTransportInfo() {
        return this.proxyTrustTransportInfo;
    }

    public AliyunPopRequestInfo setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AliyunPopRequestInfo setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public AliyunPopRequestInfo setSecurityTransport(Boolean securityTransport) {
        this.securityTransport = securityTransport;
        return this;
    }
    public Boolean getSecurityTransport() {
        return this.securityTransport;
    }

    public AliyunPopRequestInfo setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public AliyunPopRequestInfo setStsTokenCallerBid(String stsTokenCallerBid) {
        this.stsTokenCallerBid = stsTokenCallerBid;
        return this;
    }
    public String getStsTokenCallerBid() {
        return this.stsTokenCallerBid;
    }

    public AliyunPopRequestInfo setStsTokenCallerUid(String stsTokenCallerUid) {
        this.stsTokenCallerUid = stsTokenCallerUid;
        return this;
    }
    public String getStsTokenCallerUid() {
        return this.stsTokenCallerUid;
    }

    public AliyunPopRequestInfo setStsTokenPrincipalId(String stsTokenPrincipalId) {
        this.stsTokenPrincipalId = stsTokenPrincipalId;
        return this;
    }
    public String getStsTokenPrincipalId() {
        return this.stsTokenPrincipalId;
    }

    public AliyunPopRequestInfo setStsTokenRoleId(String stsTokenRoleId) {
        this.stsTokenRoleId = stsTokenRoleId;
        return this;
    }
    public String getStsTokenRoleId() {
        return this.stsTokenRoleId;
    }

    public AliyunPopRequestInfo setStsTokenUserId(String stsTokenUserId) {
        this.stsTokenUserId = stsTokenUserId;
        return this;
    }
    public String getStsTokenUserId() {
        return this.stsTokenUserId;
    }

    public AliyunPopRequestInfo setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
