<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class CreateWitnessFlowRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 集群ID
    /**
     * @var string
     */
    public $productInstanceId;

    // 业务场景，最大255长度
    /**
     * @var string
     */
    public $businessScene;

    // 客户端名称，比如签章客户端，最长长度50
    /**
     * @var string
     */
    public $clientName;

    // 客户端版本
    /**
     * @var string
     */
    public $clientVersion;

    // 合同有效截止时间，时间戳
    /**
     * @var string
     */
    public $contractValidity;

    // 流程id
    /**
     * @var string
     */
    public $flowId;

    // 发起方账号id
    /**
     * @var string
     */
    public $initiatorAccountId;

    // 发起端，TIANYIN_H5 - H5端，TIANYIN_WEB - WEB端，TIANYIN_API - API
    /**
     * @var string
     */
    public $launchEndpoint;

    // 发起ip
    /**
     * @var string
     */
    public $launchIp;

    // 手机盾逻辑版本，0-不支持用印审批、需要扣费，1-支持用印审批、无需扣费，默认0
    /**
     * @var int
     */
    public $mobileShieldVersion;

    // 扣费方账号id
    /**
     * @var string
     */
    public $payerAccountId;

    // 签署截止时间，时间戳
    /**
     * @var string
     */
    public $signDeadline;

    // 签署顺序，SIGN_SEQUENCE-顺序签署，SIGN_NON_SEQUENCE-无序签署
    /**
     * @var string
     */
    public $signOrder;

    // 流程类型，0-签署流程，1-作废流程，默认0
    /**
     * @var int
     */
    public $type;

    // 发起请求的实例应用ID
    /**
     * @var string
     */
    public $appId;

    // 发起请求的鉴权token
    /**
     * @var string
     */
    public $token;
    protected $_name = [
        'authToken'           => 'auth_token',
        'productInstanceId'   => 'product_instance_id',
        'businessScene'       => 'business_scene',
        'clientName'          => 'client_name',
        'clientVersion'       => 'client_version',
        'contractValidity'    => 'contract_validity',
        'flowId'              => 'flow_id',
        'initiatorAccountId'  => 'initiator_account_id',
        'launchEndpoint'      => 'launch_endpoint',
        'launchIp'            => 'launch_ip',
        'mobileShieldVersion' => 'mobile_shield_version',
        'payerAccountId'      => 'payer_account_id',
        'signDeadline'        => 'sign_deadline',
        'signOrder'           => 'sign_order',
        'type'                => 'type',
        'appId'               => 'app_id',
        'token'               => 'token',
    ];

    public function validate()
    {
        Model::validateRequired('businessScene', $this->businessScene, true);
        Model::validateRequired('launchEndpoint', $this->launchEndpoint, true);
        Model::validateRequired('launchIp', $this->launchIp, true);
        Model::validateRequired('signOrder', $this->signOrder, true);
        Model::validateRequired('appId', $this->appId, true);
        Model::validateRequired('token', $this->token, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->businessScene) {
            $res['business_scene'] = $this->businessScene;
        }
        if (null !== $this->clientName) {
            $res['client_name'] = $this->clientName;
        }
        if (null !== $this->clientVersion) {
            $res['client_version'] = $this->clientVersion;
        }
        if (null !== $this->contractValidity) {
            $res['contract_validity'] = $this->contractValidity;
        }
        if (null !== $this->flowId) {
            $res['flow_id'] = $this->flowId;
        }
        if (null !== $this->initiatorAccountId) {
            $res['initiator_account_id'] = $this->initiatorAccountId;
        }
        if (null !== $this->launchEndpoint) {
            $res['launch_endpoint'] = $this->launchEndpoint;
        }
        if (null !== $this->launchIp) {
            $res['launch_ip'] = $this->launchIp;
        }
        if (null !== $this->mobileShieldVersion) {
            $res['mobile_shield_version'] = $this->mobileShieldVersion;
        }
        if (null !== $this->payerAccountId) {
            $res['payer_account_id'] = $this->payerAccountId;
        }
        if (null !== $this->signDeadline) {
            $res['sign_deadline'] = $this->signDeadline;
        }
        if (null !== $this->signOrder) {
            $res['sign_order'] = $this->signOrder;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->appId) {
            $res['app_id'] = $this->appId;
        }
        if (null !== $this->token) {
            $res['token'] = $this->token;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateWitnessFlowRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['business_scene'])) {
            $model->businessScene = $map['business_scene'];
        }
        if (isset($map['client_name'])) {
            $model->clientName = $map['client_name'];
        }
        if (isset($map['client_version'])) {
            $model->clientVersion = $map['client_version'];
        }
        if (isset($map['contract_validity'])) {
            $model->contractValidity = $map['contract_validity'];
        }
        if (isset($map['flow_id'])) {
            $model->flowId = $map['flow_id'];
        }
        if (isset($map['initiator_account_id'])) {
            $model->initiatorAccountId = $map['initiator_account_id'];
        }
        if (isset($map['launch_endpoint'])) {
            $model->launchEndpoint = $map['launch_endpoint'];
        }
        if (isset($map['launch_ip'])) {
            $model->launchIp = $map['launch_ip'];
        }
        if (isset($map['mobile_shield_version'])) {
            $model->mobileShieldVersion = $map['mobile_shield_version'];
        }
        if (isset($map['payer_account_id'])) {
            $model->payerAccountId = $map['payer_account_id'];
        }
        if (isset($map['sign_deadline'])) {
            $model->signDeadline = $map['sign_deadline'];
        }
        if (isset($map['sign_order'])) {
            $model->signOrder = $map['sign_order'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['app_id'])) {
            $model->appId = $map['app_id'];
        }
        if (isset($map['token'])) {
            $model->token = $map['token'];
        }

        return $model;
    }
}
