<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DUANKA\Models;

use AlibabaCloud\Tea\Model;

class BaseResult extends Model
{
    // success
    /**
     * @example success
     *
     * @var bool
     */
    public $success;

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

    // tabledto
    /**
     * @example tabledto
     *
     * @var TableDTO
     */
    public $data;
    protected $_name = [
        'success'   => 'success',
        'errorCode' => 'error_code',
        'message'   => 'message',
        'data'      => 'data',
    ];

    public function validate()
    {
        Model::validateRequired('success', $this->success, true);
        Model::validateRequired('errorCode', $this->errorCode, true);
        Model::validateRequired('message', $this->message, true);
        Model::validateRequired('data', $this->data, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->success) {
            $res['success'] = $this->success;
        }
        if (null !== $this->errorCode) {
            $res['error_code'] = $this->errorCode;
        }
        if (null !== $this->message) {
            $res['message'] = $this->message;
        }
        if (null !== $this->data) {
            $res['data'] = null !== $this->data ? $this->data->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BaseResult
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['success'])) {
            $model->success = $map['success'];
        }
        if (isset($map['error_code'])) {
            $model->errorCode = $map['error_code'];
        }
        if (isset($map['message'])) {
            $model->message = $map['message'];
        }
        if (isset($map['data'])) {
            $model->data = TableDTO::fromMap($map['data']);
        }

        return $model;
    }
}
