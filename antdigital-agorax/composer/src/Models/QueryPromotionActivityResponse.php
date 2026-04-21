<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\AGORAX\Models;

use AlibabaCloud\Tea\Model;

class QueryPromotionActivityResponse extends Model
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

    // 活动基本信息
    /**
     * @var ActivityBaseInfo
     */
    public $activityBaseInfo;

    // 关联奖品列表
    /**
     * @var PrizeList
     */
    public $prizeList;
    protected $_name = [
        'reqMsgId'         => 'req_msg_id',
        'resultCode'       => 'result_code',
        'resultMsg'        => 'result_msg',
        'activityBaseInfo' => 'activity_base_info',
        'prizeList'        => 'prize_list',
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
        if (null !== $this->activityBaseInfo) {
            $res['activity_base_info'] = null !== $this->activityBaseInfo ? $this->activityBaseInfo->toMap() : null;
        }
        if (null !== $this->prizeList) {
            $res['prize_list'] = null !== $this->prizeList ? $this->prizeList->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryPromotionActivityResponse
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
        if (isset($map['activity_base_info'])) {
            $model->activityBaseInfo = ActivityBaseInfo::fromMap($map['activity_base_info']);
        }
        if (isset($map['prize_list'])) {
            $model->prizeList = PrizeList::fromMap($map['prize_list']);
        }

        return $model;
    }
}
