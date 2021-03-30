<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\PROPERTYCHAIN\Models;

use AlibabaCloud\Tea\Model;

class BatchqueryImportassetResponse extends Model
{
    // 请求唯一ID，用于链路跟踪和问题排查
    /**
     * @var string
     */
    public $reqMsgId;

    // 结果码，一般OK表示调用成功
    /**
     * @var string
     */
    public $resultCode;

    // 异常信息的文本描述
    /**
     * @var string
     */
    public $resultMsg;

    // 当前页码
    /**
     * @var int
     */
    public $currentPage;

    // 时间
    /**
     * @var int
     */
    public $date;

    // 请求标识
    /**
     * @var string
     */
    public $requestId;

    // 总条目
    /**
     * @var int
     */
    public $totalCount;

    // 总页数
    /**
     * @var int
     */
    public $totalPage;

    // 溯源信息
    /**
     * @var WarehouseReceiptTraceInfo[]
     */
    public $traceInfoList;
    protected $_name = [
        'reqMsgId'      => 'req_msg_id',
        'resultCode'    => 'result_code',
        'resultMsg'     => 'result_msg',
        'currentPage'   => 'current_page',
        'date'          => 'date',
        'requestId'     => 'request_id',
        'totalCount'    => 'total_count',
        'totalPage'     => 'total_page',
        'traceInfoList' => 'trace_info_list',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->reqMsgId) {
            $res['req_msg_id'] = $this->reqMsgId;
        }
        if (null !== $this->resultCode) {
            $res['result_code'] = $this->resultCode;
        }
        if (null !== $this->resultMsg) {
            $res['result_msg'] = $this->resultMsg;
        }
        if (null !== $this->currentPage) {
            $res['current_page'] = $this->currentPage;
        }
        if (null !== $this->date) {
            $res['date'] = $this->date;
        }
        if (null !== $this->requestId) {
            $res['request_id'] = $this->requestId;
        }
        if (null !== $this->totalCount) {
            $res['total_count'] = $this->totalCount;
        }
        if (null !== $this->totalPage) {
            $res['total_page'] = $this->totalPage;
        }
        if (null !== $this->traceInfoList) {
            $res['trace_info_list'] = [];
            if (null !== $this->traceInfoList && \is_array($this->traceInfoList)) {
                $n = 0;
                foreach ($this->traceInfoList as $item) {
                    $res['trace_info_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BatchqueryImportassetResponse
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['req_msg_id'])) {
            $model->reqMsgId = $map['req_msg_id'];
        }
        if (isset($map['result_code'])) {
            $model->resultCode = $map['result_code'];
        }
        if (isset($map['result_msg'])) {
            $model->resultMsg = $map['result_msg'];
        }
        if (isset($map['current_page'])) {
            $model->currentPage = $map['current_page'];
        }
        if (isset($map['date'])) {
            $model->date = $map['date'];
        }
        if (isset($map['request_id'])) {
            $model->requestId = $map['request_id'];
        }
        if (isset($map['total_count'])) {
            $model->totalCount = $map['total_count'];
        }
        if (isset($map['total_page'])) {
            $model->totalPage = $map['total_page'];
        }
        if (isset($map['trace_info_list'])) {
            if (!empty($map['trace_info_list'])) {
                $model->traceInfoList = [];
                $n                    = 0;
                foreach ($map['trace_info_list'] as $item) {
                    $model->traceInfoList[$n++] = null !== $item ? WarehouseReceiptTraceInfo::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
