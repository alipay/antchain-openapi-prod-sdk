<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_9705ae7650f74f47b1e8158151cc122f\Models;

use AlibabaCloud\Tea\Model;

class CallbackBlockchainBccrDciPayresultRequest extends Model
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

    // 与中心约定的任务ID，同一个作品可能会发起多次登记
    /**
     * @var string
     */
    public $taskId;

    // 平台Id
    /**
     * @var string
     */
    public $appId;

    // 订单ID
    /**
     * @var string
     */
    public $orderId;

    // 支付方式 (ALIPAY,0,支付宝)
    /**
     * @var string
     */
    public $payMent;

    // 订单金额
    /**
     * @var string
     */
    public $money;

    // 结果描述，如：支付成功
    /**
     * @var string
     */
    public $resultContent;

    // 状态，2001代表支付成功
    /**
     * @var string
     */
    public $code;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'taskId'            => 'task_id',
        'appId'             => 'app_id',
        'orderId'           => 'order_id',
        'payMent'           => 'pay_ment',
        'money'             => 'money',
        'resultContent'     => 'result_content',
        'code'              => 'code',
    ];

    public function validate()
    {
        Model::validateRequired('taskId', $this->taskId, true);
        Model::validateRequired('appId', $this->appId, true);
        Model::validateRequired('orderId', $this->orderId, true);
        Model::validateRequired('payMent', $this->payMent, true);
        Model::validateRequired('money', $this->money, true);
        Model::validateRequired('resultContent', $this->resultContent, true);
        Model::validateRequired('code', $this->code, true);
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
        if (null !== $this->taskId) {
            $res['task_id'] = $this->taskId;
        }
        if (null !== $this->appId) {
            $res['app_id'] = $this->appId;
        }
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }
        if (null !== $this->payMent) {
            $res['pay_ment'] = $this->payMent;
        }
        if (null !== $this->money) {
            $res['money'] = $this->money;
        }
        if (null !== $this->resultContent) {
            $res['result_content'] = $this->resultContent;
        }
        if (null !== $this->code) {
            $res['code'] = $this->code;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CallbackBlockchainBccrDciPayresultRequest
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
        if (isset($map['task_id'])) {
            $model->taskId = $map['task_id'];
        }
        if (isset($map['app_id'])) {
            $model->appId = $map['app_id'];
        }
        if (isset($map['order_id'])) {
            $model->orderId = $map['order_id'];
        }
        if (isset($map['pay_ment'])) {
            $model->payMent = $map['pay_ment'];
        }
        if (isset($map['money'])) {
            $model->money = $map['money'];
        }
        if (isset($map['result_content'])) {
            $model->resultContent = $map['result_content'];
        }
        if (isset($map['code'])) {
            $model->code = $map['code'];
        }

        return $model;
    }
}
