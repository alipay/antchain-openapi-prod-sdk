<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TRADE\Models;

use AlibabaCloud\Tea\Model;

class PayOptions extends Model
{
    // 系统自动会根据账号类型、当前OU进行付费渠道判定；如果传入的付款渠道不满足，则报错
    /**
     * @example CUSTOMER_FUND
     *
     * @var string
     */
    public $payChannel;

    // 支付方式，例如：直付通
    /**
     * @example ZFT
     *
     * @var string
     */
    public $paymentMethod;
    protected $_name = [
        'payChannel'    => 'pay_channel',
        'paymentMethod' => 'payment_method',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->payChannel) {
            $res['pay_channel'] = $this->payChannel;
        }
        if (null !== $this->paymentMethod) {
            $res['payment_method'] = $this->paymentMethod;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PayOptions
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['pay_channel'])) {
            $model->payChannel = $map['pay_channel'];
        }
        if (isset($map['payment_method'])) {
            $model->paymentMethod = $map['payment_method'];
        }

        return $model;
    }
}
