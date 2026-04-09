<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

class QueryTwevCartravelResponse extends Model
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

    // 总页数
    /**
     * @var int
     */
    public $totaPage;

    // 总条数
    /**
     * @var int
     */
    public $totalSize;

    // 当前页数
    /**
     * @var int
     */
    public $pageIndex;

    // 单页条数
    /**
     * @var int
     */
    public $pageSize;

    // 行程详情信息
    /**
     * @var TripDetailInfo[]
     */
    public $tripDetailList;
    protected $_name = [
        'reqMsgId'       => 'req_msg_id',
        'resultCode'     => 'result_code',
        'resultMsg'      => 'result_msg',
        'totaPage'       => 'tota_page',
        'totalSize'      => 'total_size',
        'pageIndex'      => 'page_index',
        'pageSize'       => 'page_size',
        'tripDetailList' => 'trip_detail_list',
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
        if (null !== $this->totaPage) {
            $res['tota_page'] = $this->totaPage;
        }
        if (null !== $this->totalSize) {
            $res['total_size'] = $this->totalSize;
        }
        if (null !== $this->pageIndex) {
            $res['page_index'] = $this->pageIndex;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->tripDetailList) {
            $res['trip_detail_list'] = [];
            if (null !== $this->tripDetailList && \is_array($this->tripDetailList)) {
                $n = 0;
                foreach ($this->tripDetailList as $item) {
                    $res['trip_detail_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryTwevCartravelResponse
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
        if (isset($map['tota_page'])) {
            $model->totaPage = $map['tota_page'];
        }
        if (isset($map['total_size'])) {
            $model->totalSize = $map['total_size'];
        }
        if (isset($map['page_index'])) {
            $model->pageIndex = $map['page_index'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['trip_detail_list'])) {
            if (!empty($map['trip_detail_list'])) {
                $model->tripDetailList = [];
                $n                     = 0;
                foreach ($map['trip_detail_list'] as $item) {
                    $model->tripDetailList[$n++] = null !== $item ? TripDetailInfo::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
