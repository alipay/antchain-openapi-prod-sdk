<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DUANKA\Models;

use AlibabaCloud\Tea\Model;

class PublishStatus extends Model
{
    // status
    /**
     * @example status
     *
     * @var string
     */
    public $status;

    // errorCode
    /**
     * @example errorCode
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

    // errorData
    /**
     * @example errorData
     *
     * @var string
     */
    public $errorData;
    protected $_name = [
        'status'    => 'status',
        'errorCode' => 'error_code',
        'message'   => 'message',
        'errorData' => 'error_data',
    ];

    public function validate()
    {
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('errorCode', $this->errorCode, true);
        Model::validateRequired('message', $this->message, true);
        Model::validateRequired('errorData', $this->errorData, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->errorCode) {
            $res['error_code'] = $this->errorCode;
        }
        if (null !== $this->message) {
            $res['message'] = $this->message;
        }
        if (null !== $this->errorData) {
            $res['error_data'] = $this->errorData;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PublishStatus
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['error_code'])) {
            $model->errorCode = $map['error_code'];
        }
        if (isset($map['message'])) {
            $model->message = $map['message'];
        }
        if (isset($map['error_data'])) {
            $model->errorData = $map['error_data'];
        }

        return $model;
    }
}
