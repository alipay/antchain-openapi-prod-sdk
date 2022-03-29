<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class QueryTraceSpanResponse extends Model
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

    // 分页号
    /**
     * @var int
     */
    public $currentPage;

    // 分页大小
    /**
     * @var int
     */
    public $pageSize;

    // 查询总数
    /**
     * @var int
     */
    public $totalSize;

    // 查询总页数
    /**
     * @var int
     */
    public $totalPage;

    // 搜索出的spans, 查无结果时为空数组
    /**
     * @var TraceSpan[]
     */
    public $spans;

    // 链路查询结果的关键字段取值集
    /**
     * @var TraceQuerySummary
     */
    public $summary;
    protected $_name = [
        'reqMsgId'    => 'req_msg_id',
        'resultCode'  => 'result_code',
        'resultMsg'   => 'result_msg',
        'currentPage' => 'current_page',
        'pageSize'    => 'page_size',
        'totalSize'   => 'total_size',
        'totalPage'   => 'total_page',
        'spans'       => 'spans',
        'summary'     => 'summary',
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
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->totalSize) {
            $res['total_size'] = $this->totalSize;
        }
        if (null !== $this->totalPage) {
            $res['total_page'] = $this->totalPage;
        }
        if (null !== $this->spans) {
            $res['spans'] = [];
            if (null !== $this->spans && \is_array($this->spans)) {
                $n = 0;
                foreach ($this->spans as $item) {
                    $res['spans'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->summary) {
            $res['summary'] = null !== $this->summary ? $this->summary->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryTraceSpanResponse
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
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['total_size'])) {
            $model->totalSize = $map['total_size'];
        }
        if (isset($map['total_page'])) {
            $model->totalPage = $map['total_page'];
        }
        if (isset($map['spans'])) {
            if (!empty($map['spans'])) {
                $model->spans = [];
                $n            = 0;
                foreach ($map['spans'] as $item) {
                    $model->spans[$n++] = null !== $item ? TraceSpan::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['summary'])) {
            $model->summary = TraceQuerySummary::fromMap($map['summary']);
        }

        return $model;
    }
}
