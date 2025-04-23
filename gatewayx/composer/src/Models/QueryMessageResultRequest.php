<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\GATEWAYX\Models;

use AlibabaCloud\Tea\Model;

class QueryMessageResultRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 消息id
    /**
     * @var string
     */
    public $msgId;
    protected $_name = [
        'authToken' => 'auth_token',
        'msgId'     => 'msg_id',
    ];

    public function validate()
    {
        Model::validateRequired('msgId', $this->msgId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->msgId) {
            $res['msg_id'] = $this->msgId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryMessageResultRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['msg_id'])) {
            $model->msgId = $map['msg_id'];
        }

        return $model;
    }
}
