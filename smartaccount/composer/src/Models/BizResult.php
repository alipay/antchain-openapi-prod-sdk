<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SMARTACCOUNT\Models;

use AlibabaCloud\Tea\Model;

class BizResult extends Model
{
    // 是否成功
    /**
     * @example true, false
     *
     * @var bool
     */
    public $success;

    // 错误码
    /**
     * @example SYSTEM_ERROR
     *
     * @var string
     */
    public $errorCode;

    // 是否重试
    /**
     * @example true, false
     *
     * @var bool
     */
    public $needRetry;

    // 失败错误信息
    /**
     * @example 成功
     *
     * @var string
     */
    public $errorViewMsg;

    // 成功返回信息，与function相匹配
    /**
     * @example {}
     *
     * @var string
     */
    public $encodedResultObj;
    protected $_name = [
        'success'          => 'success',
        'errorCode'        => 'error_code',
        'needRetry'        => 'need_retry',
        'errorViewMsg'     => 'error_view_msg',
        'encodedResultObj' => 'encoded_result_obj',
    ];

    public function validate()
    {
        Model::validateRequired('success', $this->success, true);
        Model::validateRequired('needRetry', $this->needRetry, true);
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
        if (null !== $this->needRetry) {
            $res['need_retry'] = $this->needRetry;
        }
        if (null !== $this->errorViewMsg) {
            $res['error_view_msg'] = $this->errorViewMsg;
        }
        if (null !== $this->encodedResultObj) {
            $res['encoded_result_obj'] = $this->encodedResultObj;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BizResult
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
        if (isset($map['need_retry'])) {
            $model->needRetry = $map['need_retry'];
        }
        if (isset($map['error_view_msg'])) {
            $model->errorViewMsg = $map['error_view_msg'];
        }
        if (isset($map['encoded_result_obj'])) {
            $model->encodedResultObj = $map['encoded_result_obj'];
        }

        return $model;
    }
}
