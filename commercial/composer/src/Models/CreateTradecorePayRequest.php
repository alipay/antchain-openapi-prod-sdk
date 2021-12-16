<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\COMMERCIAL\Models;

use AlibabaCloud\Tea\Model;

class CreateTradecorePayRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 订单编号
    /**
     * @var string
     */
    public $orderNo;

    // 交易渠道编号
    /**
     * @var string
     */
    public $channelNo;
    protected $_name = [
        'authToken' => 'auth_token',
        'orderNo'   => 'order_no',
        'channelNo' => 'channel_no',
    ];

    public function validate()
    {
        Model::validateRequired('orderNo', $this->orderNo, true);
        Model::validateRequired('channelNo', $this->channelNo, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->orderNo) {
            $res['order_no'] = $this->orderNo;
        }
        if (null !== $this->channelNo) {
            $res['channel_no'] = $this->channelNo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateTradecorePayRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['order_no'])) {
            $model->orderNo = $map['order_no'];
        }
        if (isset($map['channel_no'])) {
            $model->channelNo = $map['channel_no'];
        }

        return $model;
    }
}
