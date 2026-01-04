<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DTAIAGT\Models;

use AlibabaCloud\Tea\Model;

class StringResult extends Model
{
    // success
    /**
     * @example
     *
     * @var bool
     */
    public $success;

    // code
    /**
     * @example code
     *
     * @var string
     */
    public $code;

    // msg
    /**
     * @example msg
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

    // 接口返回值
    /**
     * @example result
     *
     * @var string
     */
    public $result;
    protected $_name = [
        'success' => 'success',
        'code'    => 'code',
        'msg'     => 'msg',
        'traceId' => 'trace_id',
        'reqId'   => 'req_id',
        'result'  => 'result',
    ];

    public function validate()
    {
        Model::validateRequired('success', $this->success, true);
        Model::validateRequired('code', $this->code, true);
        Model::validateRequired('msg', $this->msg, true);
        Model::validateRequired('traceId', $this->traceId, true);
        Model::validateRequired('reqId', $this->reqId, true);
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
        if (null !== $this->msg) {
            $res['msg'] = $this->msg;
        }
        if (null !== $this->traceId) {
            $res['trace_id'] = $this->traceId;
        }
        if (null !== $this->reqId) {
            $res['req_id'] = $this->reqId;
        }
        if (null !== $this->result) {
            $res['result'] = $this->result;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return StringResult
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
        if (isset($map['result'])) {
            $model->result = $map['result'];
        }

        return $model;
    }
}
