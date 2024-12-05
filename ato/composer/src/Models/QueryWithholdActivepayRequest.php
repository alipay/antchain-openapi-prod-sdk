<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class QueryWithholdActivepayRequest extends Model
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

    // 支付渠道，非必填。可选值：JSAPI-JSAPI支付，APP-APP支付。默认值：JSAPI
    /**
     * @var string
     */
    public $payChannel;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'orderId'           => 'order_id',
        'periodNum'         => 'period_num',
        'tradeNo'           => 'trade_no',
        'payType'           => 'pay_type',
        'payChannel'        => 'pay_channel',
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

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryWithholdActivepayRequest
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

        return $model;
    }
}
