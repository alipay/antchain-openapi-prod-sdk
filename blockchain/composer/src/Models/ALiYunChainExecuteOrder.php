<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class ALiYunChainExecuteOrder extends Model
{
    // user_request_id
    /**
     * @example user_request_id
     *
     * @var string
     */
    public $userRequestId;

    // data
    /**
     * @example data
     *
     * @var string
     */
    public $data;

    // success
    /**
     * @example true, false
     *
     * @var bool
     */
    public $success;

    // code
    /**
     * @example code
     *
     * @var string
     */
    public $code;

    // message
    /**
     * @example message
     *
     * @var string
     */
    public $message;

    // synchro
    /**
     * @example true, false
     *
     * @var bool
     */
    public $synchro;
    protected $_name = [
        'userRequestId' => 'user_request_id',
        'data'          => 'data',
        'success'       => 'success',
        'code'          => 'code',
        'message'       => 'message',
        'synchro'       => 'synchro',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->userRequestId) {
            $res['user_request_id'] = $this->userRequestId;
        }
        if (null !== $this->data) {
            $res['data'] = $this->data;
        }
        if (null !== $this->success) {
            $res['success'] = $this->success;
        }
        if (null !== $this->code) {
            $res['code'] = $this->code;
        }
        if (null !== $this->message) {
            $res['message'] = $this->message;
        }
        if (null !== $this->synchro) {
            $res['synchro'] = $this->synchro;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ALiYunChainExecuteOrder
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['user_request_id'])) {
            $model->userRequestId = $map['user_request_id'];
        }
        if (isset($map['data'])) {
            $model->data = $map['data'];
        }
        if (isset($map['success'])) {
            $model->success = $map['success'];
        }
        if (isset($map['code'])) {
            $model->code = $map['code'];
        }
        if (isset($map['message'])) {
            $model->message = $map['message'];
        }
        if (isset($map['synchro'])) {
            $model->synchro = $map['synchro'];
        }

        return $model;
    }
}
