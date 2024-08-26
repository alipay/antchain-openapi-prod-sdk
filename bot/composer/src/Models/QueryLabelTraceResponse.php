<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class QueryLabelTraceResponse extends Model
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

    // 标签流转历史
    /**
     * @var LabelTrace[]
     */
    public $labelTraceList;

    // 当前页码
    /**
     * @var int
     */
    public $pageIndex;

    // 单页记录数
    /**
     * @var int
     */
    public $pageSize;

    // 总记录数
    /**
     * @var int
     */
    public $totalSize;

    // 总页数
    /**
     * @var int
     */
    public $totalPages;
    protected $_name = [
        'reqMsgId'       => 'req_msg_id',
        'resultCode'     => 'result_code',
        'resultMsg'      => 'result_msg',
        'labelTraceList' => 'label_trace_list',
        'pageIndex'      => 'page_index',
        'pageSize'       => 'page_size',
        'totalSize'      => 'total_size',
        'totalPages'     => 'total_pages',
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
        if (null !== $this->labelTraceList) {
            $res['label_trace_list'] = [];
            if (null !== $this->labelTraceList && \is_array($this->labelTraceList)) {
                $n = 0;
                foreach ($this->labelTraceList as $item) {
                    $res['label_trace_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->pageIndex) {
            $res['page_index'] = $this->pageIndex;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->totalSize) {
            $res['total_size'] = $this->totalSize;
        }
        if (null !== $this->totalPages) {
            $res['total_pages'] = $this->totalPages;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryLabelTraceResponse
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
        if (isset($map['label_trace_list'])) {
            if (!empty($map['label_trace_list'])) {
                $model->labelTraceList = [];
                $n                     = 0;
                foreach ($map['label_trace_list'] as $item) {
                    $model->labelTraceList[$n++] = null !== $item ? LabelTrace::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['page_index'])) {
            $model->pageIndex = $map['page_index'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['total_size'])) {
            $model->totalSize = $map['total_size'];
        }
        if (isset($map['total_pages'])) {
            $model->totalPages = $map['total_pages'];
        }

        return $model;
    }
}
