<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

class QueryEtcTripResponse extends Model
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
    public $totalPage;

    // 总记录数
    /**
     * @var int
     */
    public $totalSize;

    // 当前页码
    //
    /**
     * @var int
     */
    public $pageNum;

    // 每页条数
    /**
     * @var int
     */
    public $pageSize;

    // 是否还有下一页
    /**
     * @var bool
     */
    public $hasNext;

    // 请求方租户所关联的行程单据列表
    /**
     * @var EtcTripInfo[]
     */
    public $tripList;

    // json格式字符串扩展信息，预留字段。
    /**
     * @var string
     */
    public $externInfo;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'totalPage'  => 'total_page',
        'totalSize'  => 'total_size',
        'pageNum'    => 'page_num',
        'pageSize'   => 'page_size',
        'hasNext'    => 'has_next',
        'tripList'   => 'trip_list',
        'externInfo' => 'extern_info',
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
        if (null !== $this->totalPage) {
            $res['total_page'] = $this->totalPage;
        }
        if (null !== $this->totalSize) {
            $res['total_size'] = $this->totalSize;
        }
        if (null !== $this->pageNum) {
            $res['page_num'] = $this->pageNum;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->hasNext) {
            $res['has_next'] = $this->hasNext;
        }
        if (null !== $this->tripList) {
            $res['trip_list'] = [];
            if (null !== $this->tripList && \is_array($this->tripList)) {
                $n = 0;
                foreach ($this->tripList as $item) {
                    $res['trip_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->externInfo) {
            $res['extern_info'] = $this->externInfo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryEtcTripResponse
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
        if (isset($map['total_page'])) {
            $model->totalPage = $map['total_page'];
        }
        if (isset($map['total_size'])) {
            $model->totalSize = $map['total_size'];
        }
        if (isset($map['page_num'])) {
            $model->pageNum = $map['page_num'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['has_next'])) {
            $model->hasNext = $map['has_next'];
        }
        if (isset($map['trip_list'])) {
            if (!empty($map['trip_list'])) {
                $model->tripList = [];
                $n               = 0;
                foreach ($map['trip_list'] as $item) {
                    $model->tripList[$n++] = null !== $item ? EtcTripInfo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['extern_info'])) {
            $model->externInfo = $map['extern_info'];
        }

        return $model;
    }
}
