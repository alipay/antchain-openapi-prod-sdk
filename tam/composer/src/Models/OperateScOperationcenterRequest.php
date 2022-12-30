<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TAM\Models;

use AlibabaCloud\Tea\Model;

class OperateScOperationcenterRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 手机号/邮箱
    /**
     * @var string
     */
    public $receiver;
    protected $_name = [
        'authToken' => 'auth_token',
        'receiver'  => 'receiver',
    ];

    public function validate()
    {
        Model::validateRequired('receiver', $this->receiver, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->receiver) {
            $res['receiver'] = $this->receiver;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return OperateScOperationcenterRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['receiver'])) {
            $model->receiver = $map['receiver'];
        }

        return $model;
    }
}
