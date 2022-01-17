<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\APIGATEWAY\Models;

use AlibabaCloud\Tea\Model;

class ActionResult extends Model
{
    // 错误码
    /**
     * @example code1
     *
     * @var string
     */
    public $code;

    // 报错信息
    /**
     * @example error_message1
     *
     * @var string
     */
    public $errorMessage;

    // id
    /**
     * @example id1
     *
     * @var string
     */
    public $id;

    // 是否挂载成功
    /**
     * @example true, false
     *
     * @var bool
     */
    public $success;
    protected $_name = [
        'code'         => 'code',
        'errorMessage' => 'error_message',
        'id'           => 'id',
        'success'      => 'success',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->code) {
            $res['code'] = $this->code;
        }
        if (null !== $this->errorMessage) {
            $res['error_message'] = $this->errorMessage;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->success) {
            $res['success'] = $this->success;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ActionResult
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['code'])) {
            $model->code = $map['code'];
        }
        if (isset($map['error_message'])) {
            $model->errorMessage = $map['error_message'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['success'])) {
            $model->success = $map['success'];
        }

        return $model;
    }
}
