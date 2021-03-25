<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\IAM\Models;

use AlibabaCloud\Tea\Model;

class AliyunPopRequestInfo extends Model {
    protected $_name = [
        'accessKeyId' => 'access_key_id',
        'akMfaPresent' => 'ak_mfa_present',
        'akProxy' => 'ak_proxy',
        'apiName' => 'api_name',
        'appIp' => 'app_ip',
        'callerBid' => 'caller_bid',
        'callerParentId' => 'caller_parent_id',
        'callerType' => 'caller_type',
        'callerUid' => 'caller_uid',
        'proxyOriginalSecurityTransport' => 'proxy_original_security_transport',
        'proxyOriginalSourceIp' => 'proxy_original_source_ip',
        'proxyTrustTransportInfo' => 'proxy_trust_transport_info',
        'requestId' => 'request_id',
        'securityToken' => 'security_token',
        'securityTransport' => 'security_transport',
        'sourceIp' => 'source_ip',
        'stsTokenCallerBid' => 'sts_token_caller_bid',
        'stsTokenCallerUid' => 'sts_token_caller_uid',
        'stsTokenPrincipalId' => 'sts_token_principal_id',
        'stsTokenRoleId' => 'sts_token_role_id',
        'stsTokenUserId' => 'sts_token_user_id',
        'version' => 'version',
    ];
    public function validate() {
        Model::validateRequired('callerType', $this->callerType, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->accessKeyId) {
            $res['access_key_id'] = $this->accessKeyId;
        }
        if (null !== $this->akMfaPresent) {
            $res['ak_mfa_present'] = $this->akMfaPresent;
        }
        if (null !== $this->akProxy) {
            $res['ak_proxy'] = $this->akProxy;
        }
        if (null !== $this->apiName) {
            $res['api_name'] = $this->apiName;
        }
        if (null !== $this->appIp) {
            $res['app_ip'] = $this->appIp;
        }
        if (null !== $this->callerBid) {
            $res['caller_bid'] = $this->callerBid;
        }
        if (null !== $this->callerParentId) {
            $res['caller_parent_id'] = $this->callerParentId;
        }
        if (null !== $this->callerType) {
            $res['caller_type'] = $this->callerType;
        }
        if (null !== $this->callerUid) {
            $res['caller_uid'] = $this->callerUid;
        }
        if (null !== $this->proxyOriginalSecurityTransport) {
            $res['proxy_original_security_transport'] = $this->proxyOriginalSecurityTransport;
        }
        if (null !== $this->proxyOriginalSourceIp) {
            $res['proxy_original_source_ip'] = $this->proxyOriginalSourceIp;
        }
        if (null !== $this->proxyTrustTransportInfo) {
            $res['proxy_trust_transport_info'] = $this->proxyTrustTransportInfo;
        }
        if (null !== $this->requestId) {
            $res['request_id'] = $this->requestId;
        }
        if (null !== $this->securityToken) {
            $res['security_token'] = $this->securityToken;
        }
        if (null !== $this->securityTransport) {
            $res['security_transport'] = $this->securityTransport;
        }
        if (null !== $this->sourceIp) {
            $res['source_ip'] = $this->sourceIp;
        }
        if (null !== $this->stsTokenCallerBid) {
            $res['sts_token_caller_bid'] = $this->stsTokenCallerBid;
        }
        if (null !== $this->stsTokenCallerUid) {
            $res['sts_token_caller_uid'] = $this->stsTokenCallerUid;
        }
        if (null !== $this->stsTokenPrincipalId) {
            $res['sts_token_principal_id'] = $this->stsTokenPrincipalId;
        }
        if (null !== $this->stsTokenRoleId) {
            $res['sts_token_role_id'] = $this->stsTokenRoleId;
        }
        if (null !== $this->stsTokenUserId) {
            $res['sts_token_user_id'] = $this->stsTokenUserId;
        }
        if (null !== $this->version) {
            $res['version'] = $this->version;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return AliyunPopRequestInfo
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['access_key_id'])){
            $model->accessKeyId = $map['access_key_id'];
        }
        if(isset($map['ak_mfa_present'])){
            $model->akMfaPresent = $map['ak_mfa_present'];
        }
        if(isset($map['ak_proxy'])){
            $model->akProxy = $map['ak_proxy'];
        }
        if(isset($map['api_name'])){
            $model->apiName = $map['api_name'];
        }
        if(isset($map['app_ip'])){
            $model->appIp = $map['app_ip'];
        }
        if(isset($map['caller_bid'])){
            $model->callerBid = $map['caller_bid'];
        }
        if(isset($map['caller_parent_id'])){
            $model->callerParentId = $map['caller_parent_id'];
        }
        if(isset($map['caller_type'])){
            $model->callerType = $map['caller_type'];
        }
        if(isset($map['caller_uid'])){
            $model->callerUid = $map['caller_uid'];
        }
        if(isset($map['proxy_original_security_transport'])){
            $model->proxyOriginalSecurityTransport = $map['proxy_original_security_transport'];
        }
        if(isset($map['proxy_original_source_ip'])){
            $model->proxyOriginalSourceIp = $map['proxy_original_source_ip'];
        }
        if(isset($map['proxy_trust_transport_info'])){
            $model->proxyTrustTransportInfo = $map['proxy_trust_transport_info'];
        }
        if(isset($map['request_id'])){
            $model->requestId = $map['request_id'];
        }
        if(isset($map['security_token'])){
            $model->securityToken = $map['security_token'];
        }
        if(isset($map['security_transport'])){
            $model->securityTransport = $map['security_transport'];
        }
        if(isset($map['source_ip'])){
            $model->sourceIp = $map['source_ip'];
        }
        if(isset($map['sts_token_caller_bid'])){
            $model->stsTokenCallerBid = $map['sts_token_caller_bid'];
        }
        if(isset($map['sts_token_caller_uid'])){
            $model->stsTokenCallerUid = $map['sts_token_caller_uid'];
        }
        if(isset($map['sts_token_principal_id'])){
            $model->stsTokenPrincipalId = $map['sts_token_principal_id'];
        }
        if(isset($map['sts_token_role_id'])){
            $model->stsTokenRoleId = $map['sts_token_role_id'];
        }
        if(isset($map['sts_token_user_id'])){
            $model->stsTokenUserId = $map['sts_token_user_id'];
        }
        if(isset($map['version'])){
            $model->version = $map['version'];
        }
        return $model;
    }
    // AccessKey
    /**
     * @example AC2z7vhVegPXpkVM
     * @var string
     */
    public $accessKeyId;

    // 是否开启MFA
    /**
     * @example true, false
     * @var bool
     */
    public $akMfaPresent;

    // Ak系统中记录的客户端代理信息，比如来源于Ecs控制台的请求取之就是EcsConsole
    /**
     * @example EcsConsole
     * @var string
     */
    public $akProxy;

    // API名称
    /**
     * @example CreateUser
     * @var string
     */
    public $apiName;

    // 调用者IP
    // 
    /**
     * @example 127.0.0.1
     * @var string
     */
    public $appIp;

    // 调用者BID
    /**
     * @example 1234
     * @var string
     */
    public $callerBid;

    // 调用者主账号ID
    /**
     * @example 1234
     * @var string
     */
    public $callerParentId;

    // 调用者类型，支持partner, customer, sub, AssumedRoleUser
    /**
     * @example sub
     * @var string
     */
    public $callerType;

    // 调用者ID
    /**
     * @example 1234
     * @var string
     */
    public $callerUid;

    // 用户原始请求是否使用https
    /**
     * @example true, false
     * @var bool
     */
    public $proxyOriginalSecurityTransport;

    // 用户原始IP
    // 
    /**
     * @example 127.0.0.1
     * @var string
     */
    public $proxyOriginalSourceIp;

    // 提交给网关的原始IP等信息是否可信
    /**
     * @example true, false
     * @var bool
     */
    public $proxyTrustTransportInfo;

    // request_id
    /**
     * @example 1234
     * @var string
     */
    public $requestId;

    // STS token
    /**
     * @example sample token
     * @var string
     */
    public $securityToken;

    // security_transport
    /**
     * @example true, false
     * @var bool
     */
    public $securityTransport;

    // 来源IP
    /**
     * @example 127.0.0.1
     * @var string
     */
    public $sourceIp;

    // StsTokenAccountBID，创建子账号的主账号 的BID。使用StsToken调用POP时才有此参数
    /**
     * @example 1234
     * @var string
     */
    public $stsTokenCallerBid;

    // STS token调用者ID
    /**
     * @example 1234
     * @var string
     */
    public $stsTokenCallerUid;

    // 子账号id:sessioname。调用者阿里云principalId，使用StsToken调用POP时才有此参数
    /**
     * @example 1234
     * @var string
     */
    public $stsTokenPrincipalId;

    // 调用者阿里云roleId，使用StsToken调用POP时才有此参数
    // 
    /**
     * @example 1234
     * @var string
     */
    public $stsTokenRoleId;

    // STS token绑定用户ID
    /**
     * @example 1234
     * @var string
     */
    public $stsTokenUserId;

    // 版本
    /**
     * @example 1.0
     * @var string
     */
    public $version;

}
