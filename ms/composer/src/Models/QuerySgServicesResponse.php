<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class QuerySgServicesResponse extends Model
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

    // current_page
    /**
     * @var int
     */
    public $currentPage;

    // page_size
    /**
     * @var int
     */
    public $pageSize;

    // List<SimpleServiceInfo>
    /**
     * @var SimpleServiceInfo[]
     */
    public $simpleServiceInfos;

    // start_index
    /**
     * @var int
     */
    public $startIndex;

    // total_size
    /**
     * @var int
     */
    public $totalSize;
    protected $_name = [
        'reqMsgId'           => 'req_msg_id',
        'resultCode'         => 'result_code',
        'resultMsg'          => 'result_msg',
        'currentPage'        => 'current_page',
        'pageSize'           => 'page_size',
        'simpleServiceInfos' => 'simple_service_infos',
        'startIndex'         => 'start_index',
        'totalSize'          => 'total_size',
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
        if (null !== $this->simpleServiceInfos) {
            $res['simple_service_infos'] = [];
            if (null !== $this->simpleServiceInfos && \is_array($this->simpleServiceInfos)) {
                $n = 0;
                foreach ($this->simpleServiceInfos as $item) {
                    $res['simple_service_infos'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->startIndex) {
            $res['start_index'] = $this->startIndex;
        }
        if (null !== $this->totalSize) {
            $res['total_size'] = $this->totalSize;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QuerySgServicesResponse
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
        if (isset($map['simple_service_infos'])) {
            if (!empty($map['simple_service_infos'])) {
                $model->simpleServiceInfos = [];
                $n                         = 0;
                foreach ($map['simple_service_infos'] as $item) {
                    $model->simpleServiceInfos[$n++] = null !== $item ? SimpleServiceInfo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['start_index'])) {
            $model->startIndex = $map['start_index'];
        }
        if (isset($map['total_size'])) {
            $model->totalSize = $map['total_size'];
        }

        return $model;
    }
}
