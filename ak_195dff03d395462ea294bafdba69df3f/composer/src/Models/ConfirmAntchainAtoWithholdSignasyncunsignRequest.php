<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models;

use AlibabaCloud\Tea\Model;

class ConfirmAntchainAtoWithholdSignasyncunsignRequest extends Model
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

    // 订单id
    /**
     * @var string
     */
    public $orderId;

    // 操作动作
    // 同意：AGREE
    // 拒绝：REFUSE
    /**
     * @var string
     */
    public $operate;

    // 拒绝原因码,商户拒绝时必填。
    // USER_OWE_MONEY：用户账户存在欠费订单
    // USER_IN_SERVICE：用户有进行的订单
    /**
     * @var string
     */
    public $refuseReasonCode;

    // 用户欠款金额，单位为分
    // refuse_reason_code=USER_OWE_MONEY时必填
    /**
     * @var int
     */
    public $userOweMoney;

    // 用户进行中的服务
    // refuse_reason_code=USER_IN_SERVICE时必填
    /**
     * @var string
     */
    public $userInService;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'orderId'           => 'order_id',
        'operate'           => 'operate',
        'refuseReasonCode'  => 'refuse_reason_code',
        'userOweMoney'      => 'user_owe_money',
        'userInService'     => 'user_in_service',
    ];

    public function validate()
    {
        Model::validateRequired('orderId', $this->orderId, true);
        Model::validateRequired('operate', $this->operate, true);
        Model::validateMaxLength('orderId', $this->orderId, 50);
        Model::validateMaxLength('operate', $this->operate, 16);
        Model::validateMaxLength('refuseReasonCode', $this->refuseReasonCode, 16);
        Model::validateMaxLength('userInService', $this->userInService, 128);
        Model::validateMinLength('orderId', $this->orderId, 1);
        Model::validateMinLength('operate', $this->operate, 1);
        Model::validateMinLength('refuseReasonCode', $this->refuseReasonCode, 1);
        Model::validateMinLength('userInService', $this->userInService, 1);
        Model::validateMinimum('userOweMoney', $this->userOweMoney, 1);
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
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }
        if (null !== $this->operate) {
            $res['operate'] = $this->operate;
        }
        if (null !== $this->refuseReasonCode) {
            $res['refuse_reason_code'] = $this->refuseReasonCode;
        }
        if (null !== $this->userOweMoney) {
            $res['user_owe_money'] = $this->userOweMoney;
        }
        if (null !== $this->userInService) {
            $res['user_in_service'] = $this->userInService;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ConfirmAntchainAtoWithholdSignasyncunsignRequest
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
        if (isset($map['order_id'])) {
            $model->orderId = $map['order_id'];
        }
        if (isset($map['operate'])) {
            $model->operate = $map['operate'];
        }
        if (isset($map['refuse_reason_code'])) {
            $model->refuseReasonCode = $map['refuse_reason_code'];
        }
        if (isset($map['user_owe_money'])) {
            $model->userOweMoney = $map['user_owe_money'];
        }
        if (isset($map['user_in_service'])) {
            $model->userInService = $map['user_in_service'];
        }

        return $model;
    }
}
