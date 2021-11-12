<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class UpdateIpChannelRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 基础字段
    /**
     * @var BaseRequestInfo
     */
    public $baseRequest;

    // ip的链上id
    /**
     * @var string
     */
    public $ipId;

    // 渠道信息
    /**
     * @var string
     */
    public $channelName;

    // 商品授权 0普通授权/1独家授权,本期只支持0
    /**
     * @var int
     */
    public $authorizationModel;

    // 新授权模式，0普通授权，1独家授权，支持多选
    /**
     * @var int[]
     */
    public $newAuthorizationModel;

    // 授权类型，衍生品授权；营销授权；商标授权；数字虚拟授权；其他
    /**
     * @var string[]
     */
    public $authorizationType;

    // 计费模式 0:按量 1:按金额
    /**
     * @var int
     */
    public $payMode;

    // ip等级  0:经典IP/1:流量IP/3:设计IP
    /**
     * @var int
     */
    public $ipLevel;

    // 交易是否需要确认，为空则不更新
    /**
     * @var bool
     */
    public $tradeNeedConfirm;
    protected $_name = [
        'authToken'             => 'auth_token',
        'productInstanceId'     => 'product_instance_id',
        'baseRequest'           => 'base_request',
        'ipId'                  => 'ip_id',
        'channelName'           => 'channel_name',
        'authorizationModel'    => 'authorization_model',
        'newAuthorizationModel' => 'new_authorization_model',
        'authorizationType'     => 'authorization_type',
        'payMode'               => 'pay_mode',
        'ipLevel'               => 'ip_level',
        'tradeNeedConfirm'      => 'trade_need_confirm',
    ];

    public function validate()
    {
        Model::validateRequired('baseRequest', $this->baseRequest, true);
        Model::validateRequired('ipId', $this->ipId, true);
        Model::validateRequired('channelName', $this->channelName, true);
        Model::validateRequired('authorizationModel', $this->authorizationModel, true);
        Model::validateRequired('payMode', $this->payMode, true);
        Model::validateRequired('ipLevel', $this->ipLevel, true);
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
        if (null !== $this->baseRequest) {
            $res['base_request'] = null !== $this->baseRequest ? $this->baseRequest->toMap() : null;
        }
        if (null !== $this->ipId) {
            $res['ip_id'] = $this->ipId;
        }
        if (null !== $this->channelName) {
            $res['channel_name'] = $this->channelName;
        }
        if (null !== $this->authorizationModel) {
            $res['authorization_model'] = $this->authorizationModel;
        }
        if (null !== $this->newAuthorizationModel) {
            $res['new_authorization_model'] = $this->newAuthorizationModel;
        }
        if (null !== $this->authorizationType) {
            $res['authorization_type'] = $this->authorizationType;
        }
        if (null !== $this->payMode) {
            $res['pay_mode'] = $this->payMode;
        }
        if (null !== $this->ipLevel) {
            $res['ip_level'] = $this->ipLevel;
        }
        if (null !== $this->tradeNeedConfirm) {
            $res['trade_need_confirm'] = $this->tradeNeedConfirm;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateIpChannelRequest
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
        if (isset($map['base_request'])) {
            $model->baseRequest = BaseRequestInfo::fromMap($map['base_request']);
        }
        if (isset($map['ip_id'])) {
            $model->ipId = $map['ip_id'];
        }
        if (isset($map['channel_name'])) {
            $model->channelName = $map['channel_name'];
        }
        if (isset($map['authorization_model'])) {
            $model->authorizationModel = $map['authorization_model'];
        }
        if (isset($map['new_authorization_model'])) {
            if (!empty($map['new_authorization_model'])) {
                $model->newAuthorizationModel = $map['new_authorization_model'];
            }
        }
        if (isset($map['authorization_type'])) {
            if (!empty($map['authorization_type'])) {
                $model->authorizationType = $map['authorization_type'];
            }
        }
        if (isset($map['pay_mode'])) {
            $model->payMode = $map['pay_mode'];
        }
        if (isset($map['ip_level'])) {
            $model->ipLevel = $map['ip_level'];
        }
        if (isset($map['trade_need_confirm'])) {
            $model->tradeNeedConfirm = $map['trade_need_confirm'];
        }

        return $model;
    }
}
