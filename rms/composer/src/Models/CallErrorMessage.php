<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class CallErrorMessage extends Model
{
    // error_code
    /**
     * @example error_code
     *
     * @var string
     */
    public $errorCode;

    // message
    /**
     * @example message
     *
     * @var string
     */
    public $message;

    // cause
    /**
     * @example cause
     *
     * @var string
     */
    public $cause;
    protected $_name = [
        'errorCode' => 'error_code',
        'message'   => 'message',
        'cause'     => 'cause',
    ];

    public function validate()
    {
        Model::validateRequired('errorCode', $this->errorCode, true);
        Model::validateRequired('message', $this->message, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->errorCode) {
            $res['error_code'] = $this->errorCode;
        }
        if (null !== $this->message) {
            $res['message'] = $this->message;
        }
        if (null !== $this->cause) {
            $res['cause'] = $this->cause;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CallErrorMessage
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['error_code'])) {
            $model->errorCode = $map['error_code'];
        }
        if (isset($map['message'])) {
            $model->message = $map['message'];
        }
        if (isset($map['cause'])) {
            $model->cause = $map['cause'];
        }

        return $model;
    }
}
