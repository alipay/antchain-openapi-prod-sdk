<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class BatchqueryQmpActionplanDetailResponse extends Model
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

    // 触达策略详细信息
    /**
     * @var ActionPlanDetailInfo[]
     */
    public $actionPlanDetailInfo;
    protected $_name = [
        'reqMsgId'             => 'req_msg_id',
        'resultCode'           => 'result_code',
        'resultMsg'            => 'result_msg',
        'actionPlanDetailInfo' => 'action_plan_detail_info',
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
        if (null !== $this->actionPlanDetailInfo) {
            $res['action_plan_detail_info'] = [];
            if (null !== $this->actionPlanDetailInfo && \is_array($this->actionPlanDetailInfo)) {
                $n = 0;
                foreach ($this->actionPlanDetailInfo as $item) {
                    $res['action_plan_detail_info'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BatchqueryQmpActionplanDetailResponse
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
        if (isset($map['action_plan_detail_info'])) {
            if (!empty($map['action_plan_detail_info'])) {
                $model->actionPlanDetailInfo = [];
                $n                           = 0;
                foreach ($map['action_plan_detail_info'] as $item) {
                    $model->actionPlanDetailInfo[$n++] = null !== $item ? ActionPlanDetailInfo::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
