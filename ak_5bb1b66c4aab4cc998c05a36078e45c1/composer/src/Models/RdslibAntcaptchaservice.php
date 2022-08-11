<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_5bb1b66c4aab4cc998c05a36078e45c1\Models;

use AlibabaCloud\Tea\Model;

class RdslibAntcaptchaservice extends Model
{
    // 是否请求成功
    /**
     * @example true, false
     *
     * @var bool
     */
    public $success;

    // 相应信息
    /**
     * @example 123
     *
     * @var string
     */
    public $message;

    // 返回数据
    /**
     * @example test
     *
     * @var string
     */
    public $data;
    protected $_name = [
        'success' => 'success',
        'message' => 'message',
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
        if (null !== $this->message) {
            $res['message'] = $this->message;
        }
        if (null !== $this->data) {
            $res['data'] = $this->data;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RdslibAntcaptchaservice
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['success'])) {
            $model->success = $map['success'];
        }
        if (isset($map['message'])) {
            $model->message = $map['message'];
        }
        if (isset($map['data'])) {
            $model->data = $map['data'];
        }

        return $model;
    }
}
