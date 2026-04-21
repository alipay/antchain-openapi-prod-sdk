<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\AGORAX\Models;

use AlibabaCloud\Tea\Model;

class ExecBaasPromotionCouponResponse extends Model
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

    // 活动ID
    /**
     * @var string
     */
    public $activityId;

    // 活动名称
    /**
     * @var string
     */
    public $activityName;

    // 活动状态
    /**
     * @var string
     */
    public $activityStatus;

    // 子错误码
    /**
     * @var string
     */
    public $subCode;

    // 子错误描述
    /**
     * @var string
     */
    public $subMessage;
    protected $_name = [
        'reqMsgId'       => 'req_msg_id',
        'resultCode'     => 'result_code',
        'resultMsg'      => 'result_msg',
        'activityId'     => 'activity_id',
        'activityName'   => 'activity_name',
        'activityStatus' => 'activity_status',
        'subCode'        => 'sub_code',
        'subMessage'     => 'sub_message',
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
        if (null !== $this->activityId) {
            $res['activity_id'] = $this->activityId;
        }
        if (null !== $this->activityName) {
            $res['activity_name'] = $this->activityName;
        }
        if (null !== $this->activityStatus) {
            $res['activity_status'] = $this->activityStatus;
        }
        if (null !== $this->subCode) {
            $res['sub_code'] = $this->subCode;
        }
        if (null !== $this->subMessage) {
            $res['sub_message'] = $this->subMessage;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ExecBaasPromotionCouponResponse
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
        if (isset($map['activity_id'])) {
            $model->activityId = $map['activity_id'];
        }
        if (isset($map['activity_name'])) {
            $model->activityName = $map['activity_name'];
        }
        if (isset($map['activity_status'])) {
            $model->activityStatus = $map['activity_status'];
        }
        if (isset($map['sub_code'])) {
            $model->subCode = $map['sub_code'];
        }
        if (isset($map['sub_message'])) {
            $model->subMessage = $map['sub_message'];
        }

        return $model;
    }
}
