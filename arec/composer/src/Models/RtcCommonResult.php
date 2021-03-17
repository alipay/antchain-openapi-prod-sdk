<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\AREC\Models;

use AlibabaCloud\Tea\Model;

class RtcCommonResult extends Model
{
    // 响应状态，包括值：S-成功，F-失败，已知的异常，U-未知，未知的异常或状态
    /**
     * @example S
     *
     * @var string
     */
    public $status;

    // 结果码
    /**
     * @example SUCCESS
     *
     * @var string
     */
    public $code;

    // 返回消息
    /**
     * @example SUCCESS
     *
     * @var string
     */
    public $message;
    protected $_name = [
        'status'  => 'status',
        'code'    => 'code',
        'message' => 'message',
    ];

    public function validate()
    {
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('code', $this->code, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->code) {
            $res['code'] = $this->code;
        }
        if (null !== $this->message) {
            $res['message'] = $this->message;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RtcCommonResult
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['code'])) {
            $model->code = $map['code'];
        }
        if (isset($map['message'])) {
            $model->message = $map['message'];
        }

        return $model;
    }
}
