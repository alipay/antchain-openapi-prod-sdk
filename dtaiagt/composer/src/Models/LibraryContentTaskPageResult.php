<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DTAIAGT\Models;

use AlibabaCloud\Tea\Model;

class LibraryContentTaskPageResult extends Model
{
    // 请求处理结果标识
    /**
     * @example
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
     * @example message
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

    // 符合查询条件的总记录数
    /**
     * @example
     *
     * @var int
     */
    public $totalCount;

    // 当前返回数据的页码
    /**
     * @example 1
     *
     * @var int
     */
    public $currentPage;

    // 实际返回的每页记录数
    /**
     * @example 10
     *
     * @var int
     */
    public $pageSize;

    // 任务数据列表
    /**
     * @example
     *
     * @var ContentTask[]
     */
    public $result;
    protected $_name = [
        'success'     => 'success',
        'code'        => 'code',
        'message'     => 'message',
        'traceId'     => 'trace_id',
        'totalCount'  => 'total_count',
        'currentPage' => 'current_page',
        'pageSize'    => 'page_size',
        'result'      => 'result',
    ];

    public function validate()
    {
        Model::validateRequired('success', $this->success, true);
        Model::validateRequired('code', $this->code, true);
        Model::validateRequired('message', $this->message, true);
        Model::validateRequired('traceId', $this->traceId, true);
        Model::validateRequired('totalCount', $this->totalCount, true);
        Model::validateRequired('currentPage', $this->currentPage, true);
        Model::validateRequired('pageSize', $this->pageSize, true);
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
        if (null !== $this->totalCount) {
            $res['total_count'] = $this->totalCount;
        }
        if (null !== $this->currentPage) {
            $res['current_page'] = $this->currentPage;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
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
     * @return LibraryContentTaskPageResult
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
        if (isset($map['total_count'])) {
            $model->totalCount = $map['total_count'];
        }
        if (isset($map['current_page'])) {
            $model->currentPage = $map['current_page'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['result'])) {
            if (!empty($map['result'])) {
                $model->result = [];
                $n             = 0;
                foreach ($map['result'] as $item) {
                    $model->result[$n++] = null !== $item ? ContentTask::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
