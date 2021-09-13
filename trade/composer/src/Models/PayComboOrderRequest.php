<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TRADE\Models;

use AlibabaCloud\Tea\Model;

class PayComboOrderRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 套餐订单号
    /**
     * @var string
     */
    public $comboOrderId;

    // 支付渠道，客资：FINANCIAL_FUND；财资：CUSTOMER_FUND；支付通：ALIPAY
    /**
     * @var string
     */
    public $payChannel;

    // 支付模式，PAGE：页面确认支付；AUTO：系统自动扣款
    // 支付通模式只支持PAGE
    /**
     * @var string
     */
    public $payMode;

    // 支付回跳地址，当pay_mode=PAGE时，必传
    /**
     * @var string
     */
    public $payReturnUrl;
    protected $_name = [
        'authToken'    => 'auth_token',
        'comboOrderId' => 'combo_order_id',
        'payChannel'   => 'pay_channel',
        'payMode'      => 'pay_mode',
        'payReturnUrl' => 'pay_return_url',
    ];

    public function validate()
    {
        Model::validateRequired('comboOrderId', $this->comboOrderId, true);
        Model::validateRequired('payChannel', $this->payChannel, true);
        Model::validateRequired('payMode', $this->payMode, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->comboOrderId) {
            $res['combo_order_id'] = $this->comboOrderId;
        }
        if (null !== $this->payChannel) {
            $res['pay_channel'] = $this->payChannel;
        }
        if (null !== $this->payMode) {
            $res['pay_mode'] = $this->payMode;
        }
        if (null !== $this->payReturnUrl) {
            $res['pay_return_url'] = $this->payReturnUrl;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PayComboOrderRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['combo_order_id'])) {
            $model->comboOrderId = $map['combo_order_id'];
        }
        if (isset($map['pay_channel'])) {
            $model->payChannel = $map['pay_channel'];
        }
        if (isset($map['pay_mode'])) {
            $model->payMode = $map['pay_mode'];
        }
        if (isset($map['pay_return_url'])) {
            $model->payReturnUrl = $map['pay_return_url'];
        }

        return $model;
    }
}
