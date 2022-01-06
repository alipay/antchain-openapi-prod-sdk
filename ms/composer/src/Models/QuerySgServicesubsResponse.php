<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class QuerySgServicesubsResponse extends Model
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

    // 当前页
    /**
     * @var int
     */
    public $currentPage;

    // 分页大小
    /**
     * @var int
     */
    public $pageSize;

    // 起始索引
    /**
     * @var int
     */
    public $startIndex;

    // [
    // {
    // "gmtModified":"2019-12-12T20:58:22+08:00",
    // "instanceId":"0SGTOGOOLRD8",
    // "alive":true,
    // "dataId":"com.antfin.demo.endpoint.facade.SampleRestFacade:1.0@DEFAULT",
    // "hostIp":"10.15.228.102",
    // "processId":"10.15.228.102:64588",
    // "zone":"DEFAULT_ZONE",
    // "appName":"consumer-demo",
    // "scope":"global",
    // "checkSum":"86f4f564ef778386998b4b19098f5c77",
    // "id":7977,
    // "gmtCreate":"2019-12-12T20:58:22+08:00"
    // }
    // ]
    /**
     * @var Subscriber[]
     */
    public $subscribers;

    // 总条数
    /**
     * @var int
     */
    public $totalSize;
    protected $_name = [
        'reqMsgId'    => 'req_msg_id',
        'resultCode'  => 'result_code',
        'resultMsg'   => 'result_msg',
        'currentPage' => 'current_page',
        'pageSize'    => 'page_size',
        'startIndex'  => 'start_index',
        'subscribers' => 'subscribers',
        'totalSize'   => 'total_size',
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
        if (null !== $this->startIndex) {
            $res['start_index'] = $this->startIndex;
        }
        if (null !== $this->subscribers) {
            $res['subscribers'] = [];
            if (null !== $this->subscribers && \is_array($this->subscribers)) {
                $n = 0;
                foreach ($this->subscribers as $item) {
                    $res['subscribers'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->totalSize) {
            $res['total_size'] = $this->totalSize;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QuerySgServicesubsResponse
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
        if (isset($map['start_index'])) {
            $model->startIndex = $map['start_index'];
        }
        if (isset($map['subscribers'])) {
            if (!empty($map['subscribers'])) {
                $model->subscribers = [];
                $n                  = 0;
                foreach ($map['subscribers'] as $item) {
                    $model->subscribers[$n++] = null !== $item ? Subscriber::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['total_size'])) {
            $model->totalSize = $map['total_size'];
        }

        return $model;
    }
}
