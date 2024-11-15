<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ACOPM\Models;

use AlibabaCloud\Tea\Model;

class QueryBusinessruleMatchRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 请求的reqMsgId
    /**
     * @var string
     */
    public $requestMsgId;
    protected $_name = [
        'authToken'    => 'auth_token',
        'requestMsgId' => 'request_msg_id',
    ];

    public function validate()
    {
        Model::validateRequired('requestMsgId', $this->requestMsgId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->requestMsgId) {
            $res['request_msg_id'] = $this->requestMsgId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryBusinessruleMatchRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['request_msg_id'])) {
            $model->requestMsgId = $map['request_msg_id'];
        }

        return $model;
    }
}
