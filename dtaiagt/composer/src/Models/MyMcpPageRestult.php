<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DTAIAGT\Models;

use AlibabaCloud\Tea\Model;

class MyMcpPageRestult extends Model
{
    // total_count
    /**
     * @example
     *
     * @var int
     */
    public $totalCount;

    // current_page
    /**
     * @example
     *
     * @var int
     */
    public $currentPage;

    // trace_id
    /**
     * @example trace_id
     *
     * @var string
     */
    public $traceId;

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

    // req_id
    /**
     * @example req_id
     *
     * @var string
     */
    public $reqId;

    // MCP分页内容
    /**
     * @example
     *
     * @var DigitalGatewayMCPPageVO[]
     */
    public $result;
    protected $_name = [
        'totalCount'  => 'total_count',
        'currentPage' => 'current_page',
        'traceId'     => 'trace_id',
        'success'     => 'success',
        'code'        => 'code',
        'msg'         => 'msg',
        'reqId'       => 'req_id',
        'result'      => 'result',
    ];

    public function validate()
    {
        Model::validateRequired('totalCount', $this->totalCount, true);
        Model::validateRequired('currentPage', $this->currentPage, true);
        Model::validateRequired('traceId', $this->traceId, true);
        Model::validateRequired('success', $this->success, true);
        Model::validateRequired('code', $this->code, true);
        Model::validateRequired('msg', $this->msg, true);
        Model::validateRequired('reqId', $this->reqId, true);
        Model::validateRequired('result', $this->result, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->totalCount) {
            $res['total_count'] = $this->totalCount;
        }
        if (null !== $this->currentPage) {
            $res['current_page'] = $this->currentPage;
        }
        if (null !== $this->traceId) {
            $res['trace_id'] = $this->traceId;
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
        if (null !== $this->reqId) {
            $res['req_id'] = $this->reqId;
        }
        if (null !== $this->result) {
            $res['result'] = [];
            if (null !== $this->result && \is_array($this->result)) {
                $n = 0;
                foreach ($this->result as $item) {
                    $res['result'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return MyMcpPageRestult
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['total_count'])) {
            $model->totalCount = $map['total_count'];
        }
        if (isset($map['current_page'])) {
            $model->currentPage = $map['current_page'];
        }
        if (isset($map['trace_id'])) {
            $model->traceId = $map['trace_id'];
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
        if (isset($map['req_id'])) {
            $model->reqId = $map['req_id'];
        }
        if (isset($map['result'])) {
            if (!empty($map['result'])) {
                $model->result = [];
                $n             = 0;
                foreach ($map['result'] as $item) {
                    $model->result[$n++] = null !== $item ? DigitalGatewayMCPPageVO::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
