<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models;

use AlibabaCloud\Tea\Model;

class CancelAntchainAtoWithholdActivepayRequest extends Model
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

    // 订单id 长度不可超过50
    /**
     * @var string
     */
    public $orderId;

    // 第几期
    /**
     * @var int
     */
    public $periodNum;

    // 支付宝支付订单号，当传递此单号时，只会取消指定单据号，不传递时取消当前代扣
    /**
     * @var string
     */
    public $tradeNo;

    // 支付类型，默认履约
    /**
     * @var string
     */
    public $payType;

    // 支付申请号，在多期支付场景必填
    /**
     * @var int
     */
    public $payApplyNo;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'orderId'           => 'order_id',
        'periodNum'         => 'period_num',
        'tradeNo'           => 'trade_no',
        'payType'           => 'pay_type',
        'payApplyNo'        => 'pay_apply_no',
    ];

    public function validate()
    {
        Model::validateRequired('orderId', $this->orderId, true);
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
        if (null !== $this->periodNum) {
            $res['period_num'] = $this->periodNum;
        }
        if (null !== $this->tradeNo) {
            $res['trade_no'] = $this->tradeNo;
        }
        if (null !== $this->payType) {
            $res['pay_type'] = $this->payType;
        }
        if (null !== $this->payApplyNo) {
            $res['pay_apply_no'] = $this->payApplyNo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CancelAntchainAtoWithholdActivepayRequest
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
        if (isset($map['period_num'])) {
            $model->periodNum = $map['period_num'];
        }
        if (isset($map['trade_no'])) {
            $model->tradeNo = $map['trade_no'];
        }
        if (isset($map['pay_type'])) {
            $model->payType = $map['pay_type'];
        }
        if (isset($map['pay_apply_no'])) {
            $model->payApplyNo = $map['pay_apply_no'];
        }

        return $model;
    }
}
