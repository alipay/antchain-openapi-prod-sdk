<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models;

use AlibabaCloud\Tea\Model;

class QueryAntchainAtoWithholdActivepayRequest extends Model
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

    // 第几期,当支付类型为PERFORMANCE或为空必填
    /**
     * @var int
     */
    public $periodNum;

    // 支付宝支付订单号，当传递此单号时，只会返回当前单据
    /**
     * @var string
     */
    public $tradeNo;

    // 支付类型
    /**
     * @var string
     */
    public $payType;

    // 无用字段，无需关注
    /**
     * @var string
     */
    public $payChannel;

    // 多期支付的期数，当使用多期合并支付类型时必传。
    /**
     * @var int
     */
    public $multiPeriodNum;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'orderId'           => 'order_id',
        'periodNum'         => 'period_num',
        'tradeNo'           => 'trade_no',
        'payType'           => 'pay_type',
        'payChannel'        => 'pay_channel',
        'multiPeriodNum'    => 'multi_period_num',
    ];

    public function validate()
    {
        Model::validateRequired('orderId', $this->orderId, true);
        Model::validateMaxLength('orderId', $this->orderId, 50);
        Model::validateMaxLength('tradeNo', $this->tradeNo, 64);
        Model::validateMaxLength('payType', $this->payType, 64);
        Model::validateMaxLength('payChannel', $this->payChannel, 64);
        Model::validateMinLength('orderId', $this->orderId, 1);
        Model::validateMinLength('payType', $this->payType, 1);
        Model::validateMinimum('periodNum', $this->periodNum, 1);
        Model::validateMinimum('multiPeriodNum', $this->multiPeriodNum, 1);
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
        if (null !== $this->payChannel) {
            $res['pay_channel'] = $this->payChannel;
        }
        if (null !== $this->multiPeriodNum) {
            $res['multi_period_num'] = $this->multiPeriodNum;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryAntchainAtoWithholdActivepayRequest
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
        if (isset($map['pay_channel'])) {
            $model->payChannel = $map['pay_channel'];
        }
        if (isset($map['multi_period_num'])) {
            $model->multiPeriodNum = $map['multi_period_num'];
        }

        return $model;
    }
}
