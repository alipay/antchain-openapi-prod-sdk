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
    protected $_name = [
        'payChannel' => 'pay_channel',
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

        return $model;
    }
}
