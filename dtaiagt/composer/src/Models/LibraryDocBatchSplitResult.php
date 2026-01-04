<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DTAIAGT\Models;

use AlibabaCloud\Tea\Model;

class LibraryDocBatchSplitResult extends Model
{
    // 请求是否成功
    /**
     * @example true, false
     *
     * @var bool
     */
    public $success;

    // 业务状态码
    /**
     * @example 200
     *
     * @var string
     */
    public $code;

    // 返回消息
    /**
     * @example 消息
     *
     * @var string
     */
    public $message;

    // 请求链路追踪ID
    /**
     * @example 123
     *
     * @var string
     */
    public $traceId;

    // 任务ID，可用于异步任务追踪
    /**
     * @example
     *
     * @var int
     */
    public $result;
    protected $_name = [
        'success' => 'success',
        'code'    => 'code',
        'message' => 'message',
        'traceId' => 'trace_id',
        'result'  => 'result',
    ];

    public function validate()
    {
        Model::validateRequired('success', $this->success, true);
        Model::validateRequired('code', $this->code, true);
        Model::validateRequired('message', $this->message, true);
        Model::validateRequired('traceId', $this->traceId, true);
        Model::validateRequired('result', $this->result, true);
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
        if (null !== $this->traceId) {
            $res['trace_id'] = $this->traceId;
        }
        if (null !== $this->result) {
            $res['result'] = $this->result;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return LibraryDocBatchSplitResult
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
        if (isset($map['trace_id'])) {
            $model->traceId = $map['trace_id'];
        }
        if (isset($map['result'])) {
            $model->result = $map['result'];
        }

        return $model;
    }
}
