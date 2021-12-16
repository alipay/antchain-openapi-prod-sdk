<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\COMMERCIAL\Models;

use AlibabaCloud\Tea\Model;

class ReceiveTradecorePayRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 支付宝回调参数，参数可能变化，返回字符串
    /**
     * @var string
     */
    public $notifyData;
    protected $_name = [
        'authToken'  => 'auth_token',
        'notifyData' => 'notify_data',
    ];

    public function validate()
    {
        Model::validateRequired('notifyData', $this->notifyData, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->notifyData) {
            $res['notify_data'] = $this->notifyData;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ReceiveTradecorePayRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['notify_data'])) {
            $model->notifyData = $map['notify_data'];
        }

        return $model;
    }
}
