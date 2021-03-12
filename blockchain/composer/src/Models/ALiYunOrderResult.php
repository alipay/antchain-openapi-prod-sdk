<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class ALiYunOrderResult extends Model
{
    // request_id
    /**
     * @example request_id
     *
     * @var string
     */
    public $requestId;

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
        'requestId' => 'request_id',
        'data'      => 'data',
        'success'   => 'success',
        'code'      => 'code',
        'message'   => 'message',
        'synchro'   => 'synchro',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->requestId) {
            $res['request_id'] = $this->requestId;
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
     * @return ALiYunOrderResult
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['request_id'])) {
            $model->requestId = $map['request_id'];
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
