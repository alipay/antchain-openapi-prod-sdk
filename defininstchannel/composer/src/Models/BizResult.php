<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DEFININSTCHANNEL\Models;

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

    // 错误描述
    /**
     * @example 系统错误
     *
     * @var string
     */
    public $errorMsg;

    // 错误描述
    /**
     * @example 系统繁忙
     *
     * @var string
     */
    public $errorViewMsg;

    // 成功返回信息
    /**
     * @example {"requestId":"test_a670774489f2","tradeId":"test_4dc9886cd251","bizResponse":"{"status":"S"}"}
     *
     * @var string
     */
    public $encodedResultObj;
    protected $_name = [
        'success'          => 'success',
        'errorCode'        => 'error_code',
        'needRetry'        => 'need_retry',
        'errorMsg'         => 'error_msg',
        'errorViewMsg'     => 'error_view_msg',
        'encodedResultObj' => 'encoded_result_obj',
    ];

    public function validate()
    {
        Model::validateRequired('success', $this->success, true);
        Model::validateRequired('errorCode', $this->errorCode, true);
        Model::validateRequired('needRetry', $this->needRetry, true);
        Model::validateRequired('errorMsg', $this->errorMsg, true);
        Model::validateRequired('errorViewMsg', $this->errorViewMsg, true);
        Model::validateRequired('encodedResultObj', $this->encodedResultObj, true);
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
        if (null !== $this->errorMsg) {
            $res['error_msg'] = $this->errorMsg;
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
        if (isset($map['error_msg'])) {
            $model->errorMsg = $map['error_msg'];
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
