<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_5bb1b66c4aab4cc998c05a36078e45c1\Models;

use AlibabaCloud\Tea\Model;

class SecurityUniformResponse extends Model
{
    // 是否成功
    /**
     * @example true, false
     *
     * @var bool
     */
    public $success;

    // 123
    /**
     * @example 12
     *
     * @var string
     */
    public $code;

    // 123
    /**
     * @example 123
     *
     * @var string
     */
    public $message;

    // 123
    /**
     * @example 123
     *
     * @var string
     */
    public $token;

    // 123
    /**
     * @example 123
     *
     * @var string
     */
    public $bizId;

    // 123
    /**
     * @example 123
     *
     * @var string
     */
    public $data;
    protected $_name = [
        'success' => 'success',
        'code'    => 'code',
        'message' => 'message',
        'token'   => 'token',
        'bizId'   => 'biz_id',
        'data'    => 'data',
    ];

    public function validate()
    {
        Model::validateRequired('success', $this->success, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->success) {
            $res['success'] = $this->success;
        }
        if (null !== $this->code) {
            $res['code'] = $this->code;
        }
        if (null !== $this->message) {
            $res['message'] = $this->message;
        }
        if (null !== $this->token) {
            $res['token'] = $this->token;
        }
        if (null !== $this->bizId) {
            $res['biz_id'] = $this->bizId;
        }
        if (null !== $this->data) {
            $res['data'] = $this->data;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SecurityUniformResponse
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['success'])) {
            $model->success = $map['success'];
        }
        if (isset($map['code'])) {
            $model->code = $map['code'];
        }
        if (isset($map['message'])) {
            $model->message = $map['message'];
        }
        if (isset($map['token'])) {
            $model->token = $map['token'];
        }
        if (isset($map['biz_id'])) {
            $model->bizId = $map['biz_id'];
        }
        if (isset($map['data'])) {
            $model->data = $map['data'];
        }

        return $model;
    }
}
