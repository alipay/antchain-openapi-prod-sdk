<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class QueryTraceAppnosqlstatResponse extends Model
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

    // 结果
    /**
     * @var TimeSeriesMetrics[]
     */
    public $result;

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
    protected $_name = [
        'reqMsgId'    => 'req_msg_id',
        'resultCode'  => 'result_code',
        'resultMsg'   => 'result_msg',
        'result'      => 'result',
        'currentPage' => 'current_page',
        'pageSize'    => 'page_size',
        'totalSize'   => 'total_size',
        'totalPage'   => 'total_page',
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
        if (null !== $this->result) {
            $res['result'] = [];
            if (null !== $this->result && \is_array($this->result)) {
                $n = 0;
                foreach ($this->result as $item) {
                    $res['result'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
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

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryTraceAppnosqlstatResponse
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
        if (isset($map['result'])) {
            if (!empty($map['result'])) {
                $model->result = [];
                $n             = 0;
                foreach ($map['result'] as $item) {
                    $model->result[$n++] = null !== $item ? TimeSeriesMetrics::fromMap($item) : $item;
                }
            }
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

        return $model;
    }
}
