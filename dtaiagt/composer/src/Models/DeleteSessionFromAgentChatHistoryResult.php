<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DTAIAGT\Models;

use AlibabaCloud\Tea\Model;

class DeleteSessionFromAgentChatHistoryResult extends Model
{
    // success
    /**
     * @example true, false
     *
     * @var bool
     */
    public $success;

    // code
    /**
     * @example ok
     *
     * @var string
     */
    public $code;

    // 返回结果信息
    //
    /**
     * @example 返回结果信息
     *
     * @var string
     */
    public $msg;

    // trace_id
    /**
     * @example trace_id
     *
     * @var string
     */
    public $traceId;

    // req_id
    /**
     * @example req_id
     *
     * @var string
     */
    public $reqId;
    protected $_name = [
        'success' => 'success',
        'code'    => 'code',
        'msg'     => 'msg',
        'traceId' => 'trace_id',
        'reqId'   => 'req_id',
    ];

    public function validate()
    {
        Model::validateRequired('success', $this->success, true);
        Model::validateRequired('code', $this->code, true);
        Model::validateRequired('msg', $this->msg, true);
        Model::validateRequired('traceId', $this->traceId, true);
        Model::validateRequired('reqId', $this->reqId, true);
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
        if (null !== $this->msg) {
            $res['msg'] = $this->msg;
        }
        if (null !== $this->traceId) {
            $res['trace_id'] = $this->traceId;
        }
        if (null !== $this->reqId) {
            $res['req_id'] = $this->reqId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DeleteSessionFromAgentChatHistoryResult
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
        if (isset($map['msg'])) {
            $model->msg = $map['msg'];
        }
        if (isset($map['trace_id'])) {
            $model->traceId = $map['trace_id'];
        }
        if (isset($map['req_id'])) {
            $model->reqId = $map['req_id'];
        }

        return $model;
    }
}
