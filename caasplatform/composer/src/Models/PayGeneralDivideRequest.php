<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAASPLATFORM\Models;

use AlibabaCloud\Tea\Model;

class PayGeneralDivideRequest extends Model
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

    // 合约实例id
    /**
     * @var string
     */
    public $serviceId;

    // 订单编号 ( 编号不能重复)
    /**
     * @var string
     */
    public $orderId;

    // 发起人
    /**
     * @var string
     */
    public $from;

    // 付款人
    /**
     * @var string
     */
    public $payer;

    // 支付方式
    /**
     * @var string
     */
    public $payType;

    // 支付时间
    /**
     * @var string
     */
    public $payTime;

    // 支付状态
    /**
     * @var string
     */
    public $status;

    // 收款人
    /**
     * @var string
     */
    public $to;

    // 订单金额（保留3位小数）
    /**
     * @var string
     */
    public $amount;

    // 分账规则id （根据规则进行分账）
    /**
     * @var string
     */
    public $ruleId;

    // 扩展json
    /**
     * @var string
     */
    public $data;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'serviceId'         => 'service_id',
        'orderId'           => 'order_id',
        'from'              => 'from',
        'payer'             => 'payer',
        'payType'           => 'pay_type',
        'payTime'           => 'pay_time',
        'status'            => 'status',
        'to'                => 'to',
        'amount'            => 'amount',
        'ruleId'            => 'rule_id',
        'data'              => 'data',
    ];

    public function validate()
    {
        Model::validateRequired('serviceId', $this->serviceId, true);
        Model::validateRequired('orderId', $this->orderId, true);
        Model::validateRequired('from', $this->from, true);
        Model::validateRequired('payer', $this->payer, true);
        Model::validateRequired('payType', $this->payType, true);
        Model::validateRequired('payTime', $this->payTime, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('to', $this->to, true);
        Model::validateRequired('amount', $this->amount, true);
        Model::validateRequired('ruleId', $this->ruleId, true);
        Model::validateMaxLength('orderId', $this->orderId, 256);
        Model::validateMaxLength('from', $this->from, 100);
        Model::validateMaxLength('payer', $this->payer, 100);
        Model::validateMaxLength('payType', $this->payType, 100);
        Model::validateMaxLength('payTime', $this->payTime, 100);
        Model::validateMaxLength('status', $this->status, 100);
        Model::validateMaxLength('to', $this->to, 100);
        Model::validateMaxLength('data', $this->data, 2000);
        Model::validateMinLength('orderId', $this->orderId, 0);
        Model::validateMinLength('from', $this->from, 0);
        Model::validateMinLength('payer', $this->payer, 0);
        Model::validateMinLength('payType', $this->payType, 0);
        Model::validateMinLength('payTime', $this->payTime, 0);
        Model::validateMinLength('status', $this->status, 0);
        Model::validateMinLength('to', $this->to, 0);
        Model::validateMinLength('data', $this->data, 0);
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
        if (null !== $this->serviceId) {
            $res['service_id'] = $this->serviceId;
        }
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }
        if (null !== $this->from) {
            $res['from'] = $this->from;
        }
        if (null !== $this->payer) {
            $res['payer'] = $this->payer;
        }
        if (null !== $this->payType) {
            $res['pay_type'] = $this->payType;
        }
        if (null !== $this->payTime) {
            $res['pay_time'] = $this->payTime;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->to) {
            $res['to'] = $this->to;
        }
        if (null !== $this->amount) {
            $res['amount'] = $this->amount;
        }
        if (null !== $this->ruleId) {
            $res['rule_id'] = $this->ruleId;
        }
        if (null !== $this->data) {
            $res['data'] = $this->data;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PayGeneralDivideRequest
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
        if (isset($map['service_id'])) {
            $model->serviceId = $map['service_id'];
        }
        if (isset($map['order_id'])) {
            $model->orderId = $map['order_id'];
        }
        if (isset($map['from'])) {
            $model->from = $map['from'];
        }
        if (isset($map['payer'])) {
            $model->payer = $map['payer'];
        }
        if (isset($map['pay_type'])) {
            $model->payType = $map['pay_type'];
        }
        if (isset($map['pay_time'])) {
            $model->payTime = $map['pay_time'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['to'])) {
            $model->to = $map['to'];
        }
        if (isset($map['amount'])) {
            $model->amount = $map['amount'];
        }
        if (isset($map['rule_id'])) {
            $model->ruleId = $map['rule_id'];
        }
        if (isset($map['data'])) {
            $model->data = $map['data'];
        }

        return $model;
    }
}
