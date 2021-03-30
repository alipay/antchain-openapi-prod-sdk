<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;

class QueryMonitorResultResponse extends Model
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

    // 监测任务信息
    /**
     * @var MonitorResult[]
     */
    public $monitorResultList;

    // 页序号(>0)
    /**
     * @var int
     */
    public $pageIndex;

    // 页大小(1-200)
    /**
     * @var int
     */
    public $pageSize;

    // 监测结果数量
    /**
     * @var int
     */
    public $resultCount;
    protected $_name = [
        'reqMsgId'          => 'req_msg_id',
        'resultCode'        => 'result_code',
        'resultMsg'         => 'result_msg',
        'monitorResultList' => 'monitor_result_list',
        'pageIndex'         => 'page_index',
        'pageSize'          => 'page_size',
        'resultCount'       => 'result_count',
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
        if (null !== $this->monitorResultList) {
            $res['monitor_result_list'] = [];
            if (null !== $this->monitorResultList && \is_array($this->monitorResultList)) {
                $n = 0;
                foreach ($this->monitorResultList as $item) {
                    $res['monitor_result_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->pageIndex) {
            $res['page_index'] = $this->pageIndex;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->resultCount) {
            $res['result_count'] = $this->resultCount;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryMonitorResultResponse
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
        if (isset($map['monitor_result_list'])) {
            if (!empty($map['monitor_result_list'])) {
                $model->monitorResultList = [];
                $n                        = 0;
                foreach ($map['monitor_result_list'] as $item) {
                    $model->monitorResultList[$n++] = null !== $item ? MonitorResult::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['page_index'])) {
            $model->pageIndex = $map['page_index'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['result_count'])) {
            $model->resultCount = $map['result_count'];
        }

        return $model;
    }
}
