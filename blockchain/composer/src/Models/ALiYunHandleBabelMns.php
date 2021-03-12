<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class ALiYunHandleBabelMns extends Model
{
    // message
    /**
     * @example message
     *
     * @var string
     */
    public $message;

    // request_id
    /**
     * @example request_id
     *
     * @var string
     */
    public $requestId;

    // success
    /**
     * @example true, false
     *
     * @var bool
     */
    public $success;
    protected $_name = [
        'message'   => 'message',
        'requestId' => 'request_id',
        'success'   => 'success',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->message) {
            $res['message'] = $this->message;
        }
        if (null !== $this->requestId) {
            $res['request_id'] = $this->requestId;
        }
        if (null !== $this->success) {
            $res['success'] = $this->success;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ALiYunHandleBabelMns
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['message'])) {
            $model->message = $map['message'];
        }
        if (isset($map['request_id'])) {
            $model->requestId = $map['request_id'];
        }
        if (isset($map['success'])) {
            $model->success = $map['success'];
        }

        return $model;
    }
}
