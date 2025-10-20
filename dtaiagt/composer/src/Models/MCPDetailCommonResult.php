<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DTAIAGT\Models;

use AlibabaCloud\Tea\Model;

class MCPDetailCommonResult extends Model
{
    // MCP详情信息
    /**
     * @example
     *
     * @var DigitalGatewayMCPDetailVO
     */
    public $result;

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

    // 异常对象
    /**
     * @example biz_error
     *
     * @var BizErrorInfo
     */
    public $bizError;
    protected $_name = [
        'result'   => 'result',
        'success'  => 'success',
        'code'     => 'code',
        'msg'      => 'msg',
        'traceId'  => 'trace_id',
        'reqId'    => 'req_id',
        'bizError' => 'biz_error',
    ];

    public function validate()
    {
        Model::validateRequired('result', $this->result, true);
        Model::validateRequired('success', $this->success, true);
        Model::validateRequired('code', $this->code, true);
        Model::validateRequired('msg', $this->msg, true);
        Model::validateRequired('traceId', $this->traceId, true);
        Model::validateRequired('reqId', $this->reqId, true);
        Model::validateRequired('bizError', $this->bizError, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->result) {
            $res['result'] = null !== $this->result ? $this->result->toMap() : null;
        }
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
        if (null !== $this->bizError) {
            $res['biz_error'] = null !== $this->bizError ? $this->bizError->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return MCPDetailCommonResult
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['result'])) {
            $model->result = DigitalGatewayMCPDetailVO::fromMap($map['result']);
        }
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
        if (isset($map['biz_error'])) {
            $model->bizError = BizErrorInfo::fromMap($map['biz_error']);
        }

        return $model;
    }
}
