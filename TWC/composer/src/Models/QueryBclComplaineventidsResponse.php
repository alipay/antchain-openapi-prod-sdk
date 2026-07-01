<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class QueryBclComplaineventidsResponse extends Model
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

    // 投诉单id列表
    /**
     * @var string[]
     */
    public $complainEventIds;

    // 总量
    /**
     * @var int
     */
    public $count;

    // 每页数量
    /**
     * @var int
     */
    public $pageSize;

    // 页码
    /**
     * @var int
     */
    public $pageNum;
    protected $_name = [
        'reqMsgId'         => 'req_msg_id',
        'resultCode'       => 'result_code',
        'resultMsg'        => 'result_msg',
        'complainEventIds' => 'complain_event_ids',
        'count'            => 'count',
        'pageSize'         => 'page_size',
        'pageNum'          => 'page_num',
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
        if (null !== $this->complainEventIds) {
            $res['complain_event_ids'] = $this->complainEventIds;
        }
        if (null !== $this->count) {
            $res['count'] = $this->count;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->pageNum) {
            $res['page_num'] = $this->pageNum;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryBclComplaineventidsResponse
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
        if (isset($map['complain_event_ids'])) {
            if (!empty($map['complain_event_ids'])) {
                $model->complainEventIds = $map['complain_event_ids'];
            }
        }
        if (isset($map['count'])) {
            $model->count = $map['count'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['page_num'])) {
            $model->pageNum = $map['page_num'];
        }

        return $model;
    }
}
