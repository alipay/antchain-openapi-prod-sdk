<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SAAS_SECURITY\Models;

use AlibabaCloud\Tea\Model;

class RdsAnalyzeResponse extends Model
{
    // 请求是否成功
    /**
     * @example true
     *
     * @var bool
     */
    public $success;

    // 返回信息
    /**
     * @example error
     *
     * @var string
     */
    public $message;

    // 返回数据
    /**
     * @example 123
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
        Model::validateRequired('message', $this->message, true);
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
     * @return RdsAnalyzeResponse
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
