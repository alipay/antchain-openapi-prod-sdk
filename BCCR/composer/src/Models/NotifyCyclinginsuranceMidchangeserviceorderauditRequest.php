<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;

class NotifyCyclinginsuranceMidchangeserviceorderauditRequest extends Model
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

    // 请求唯一Id
    /**
     * @var string
     */
    public $requestId;

    // 来源场景
    /**
     * @var string
     */
    public $scene;

    // 调用应用名
    /**
     * @var string
     */
    public $callerAppName;

    // 外部业务id，用于幂等
    /**
     * @var string
     */
    public $bizId;

    // 订单id
    /**
     * @var string
     */
    public $orderId;

    // 账号id
    /**
     * @var string
     */
    public $accountId;

    // 审核是否通过
    /**
     * @var bool
     */
    public $success;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'requestId'         => 'request_id',
        'scene'             => 'scene',
        'callerAppName'     => 'caller_app_name',
        'bizId'             => 'biz_id',
        'orderId'           => 'order_id',
        'accountId'         => 'account_id',
        'success'           => 'success',
    ];

    public function validate()
    {
        Model::validateRequired('requestId', $this->requestId, true);
        Model::validateRequired('scene', $this->scene, true);
        Model::validateRequired('callerAppName', $this->callerAppName, true);
        Model::validateRequired('bizId', $this->bizId, true);
        Model::validateRequired('orderId', $this->orderId, true);
        Model::validateRequired('accountId', $this->accountId, true);
        Model::validateRequired('success', $this->success, true);
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
        if (null !== $this->requestId) {
            $res['request_id'] = $this->requestId;
        }
        if (null !== $this->scene) {
            $res['scene'] = $this->scene;
        }
        if (null !== $this->callerAppName) {
            $res['caller_app_name'] = $this->callerAppName;
        }
        if (null !== $this->bizId) {
            $res['biz_id'] = $this->bizId;
        }
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }
        if (null !== $this->accountId) {
            $res['account_id'] = $this->accountId;
        }
        if (null !== $this->success) {
            $res['success'] = $this->success;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return NotifyCyclinginsuranceMidchangeserviceorderauditRequest
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
        if (isset($map['request_id'])) {
            $model->requestId = $map['request_id'];
        }
        if (isset($map['scene'])) {
            $model->scene = $map['scene'];
        }
        if (isset($map['caller_app_name'])) {
            $model->callerAppName = $map['caller_app_name'];
        }
        if (isset($map['biz_id'])) {
            $model->bizId = $map['biz_id'];
        }
        if (isset($map['order_id'])) {
            $model->orderId = $map['order_id'];
        }
        if (isset($map['account_id'])) {
            $model->accountId = $map['account_id'];
        }
        if (isset($map['success'])) {
            $model->success = $map['success'];
        }

        return $model;
    }
}
