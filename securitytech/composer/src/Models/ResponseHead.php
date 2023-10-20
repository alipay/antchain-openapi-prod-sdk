<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

class ResponseHead extends Model
{
    // 请求唯一标识
    /**
     * @example 91440300892305861T
     *
     * @var string
     */
    public $requestId;
    protected $_name = [
        'requestId' => 'request_id',
    ];

    public function validate()
    {
        Model::validateRequired('requestId', $this->requestId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->requestId) {
            $res['request_id'] = $this->requestId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ResponseHead
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['request_id'])) {
            $model->requestId = $map['request_id'];
        }

        return $model;
    }
}
