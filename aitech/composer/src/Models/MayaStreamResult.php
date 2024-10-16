<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\AITECH\Models;

use AlibabaCloud\Tea\Model;

class MayaStreamResult extends Model
{
    // maya响应数据
    /**
     * @example
     *
     * @var MayaRedGptResponseDTO
     */
    public $data;

    // 是否成功
    /**
     * @example true, false
     *
     * @var bool
     */
    public $success;

    // 错误码
    /**
     * @example 10002
     *
     * @var string
     */
    public $errorCode;

    // 错误信息
    /**
     * @example maya平台调用失败
     *
     * @var string
     */
    public $errorMsg;
    protected $_name = [
        'data'      => 'data',
        'success'   => 'success',
        'errorCode' => 'error_code',
        'errorMsg'  => 'error_msg',
    ];

    public function validate()
    {
        Model::validateRequired('data', $this->data, true);
        Model::validateRequired('success', $this->success, true);
        Model::validateRequired('errorCode', $this->errorCode, true);
        Model::validateRequired('errorMsg', $this->errorMsg, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->data) {
            $res['data'] = null !== $this->data ? $this->data->toMap() : null;
        }
        if (null !== $this->success) {
            $res['success'] = $this->success;
        }
        if (null !== $this->errorCode) {
            $res['error_code'] = $this->errorCode;
        }
        if (null !== $this->errorMsg) {
            $res['error_msg'] = $this->errorMsg;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return MayaStreamResult
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['data'])) {
            $model->data = MayaRedGptResponseDTO::fromMap($map['data']);
        }
        if (isset($map['success'])) {
            $model->success = $map['success'];
        }
        if (isset($map['error_code'])) {
            $model->errorCode = $map['error_code'];
        }
        if (isset($map['error_msg'])) {
            $model->errorMsg = $map['error_msg'];
        }

        return $model;
    }
}
