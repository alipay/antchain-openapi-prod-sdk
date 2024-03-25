<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\NFTC\Models;

use AlibabaCloud\Tea\Model;

class QueryPromoteActivityResponse extends Model
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

    // 助力活动的活动规则编码
    /**
     * @var string
     */
    public $promoteId;

    // 活动状态：
    // ENABLE（进行中）
    // END（活动结束）
    /**
     * @var string
     */
    public $status;

    // 助力活动类型
    // ONCE（生命周期内一次）
    // DAILY（每日一次）
    /**
     * @var string
     */
    public $type;

    // 活动开始时间
    /**
     * @var string
     */
    public $startTime;

    // 活动结束时间
    /**
     * @var string
     */
    public $endTime;

    // 最大助力人数
    /**
     * @var int
     */
    public $maxNum;

    // 当前助力成功人数
    /**
     * @var int
     */
    public $curNum;

    // 参与助力的唯一编码，供三方幂等记录并唯一发奖
    /**
     * @var string[]
     */
    public $promoteList;
    protected $_name = [
        'reqMsgId'    => 'req_msg_id',
        'resultCode'  => 'result_code',
        'resultMsg'   => 'result_msg',
        'promoteId'   => 'promote_id',
        'status'      => 'status',
        'type'        => 'type',
        'startTime'   => 'start_time',
        'endTime'     => 'end_time',
        'maxNum'      => 'max_num',
        'curNum'      => 'cur_num',
        'promoteList' => 'promote_list',
    ];

    public function validate()
    {
        Model::validatePattern('startTime', $this->startTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('endTime', $this->endTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
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
        if (null !== $this->promoteId) {
            $res['promote_id'] = $this->promoteId;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->startTime) {
            $res['start_time'] = $this->startTime;
        }
        if (null !== $this->endTime) {
            $res['end_time'] = $this->endTime;
        }
        if (null !== $this->maxNum) {
            $res['max_num'] = $this->maxNum;
        }
        if (null !== $this->curNum) {
            $res['cur_num'] = $this->curNum;
        }
        if (null !== $this->promoteList) {
            $res['promote_list'] = $this->promoteList;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryPromoteActivityResponse
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
        if (isset($map['promote_id'])) {
            $model->promoteId = $map['promote_id'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['start_time'])) {
            $model->startTime = $map['start_time'];
        }
        if (isset($map['end_time'])) {
            $model->endTime = $map['end_time'];
        }
        if (isset($map['max_num'])) {
            $model->maxNum = $map['max_num'];
        }
        if (isset($map['cur_num'])) {
            $model->curNum = $map['cur_num'];
        }
        if (isset($map['promote_list'])) {
            if (!empty($map['promote_list'])) {
                $model->promoteList = $map['promote_list'];
            }
        }

        return $model;
    }
}
