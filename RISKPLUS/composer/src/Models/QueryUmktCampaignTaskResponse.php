<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class QueryUmktCampaignTaskResponse extends Model
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

    // 圈投计划id
    /**
     * @var int
     */
    public $campaignId;

    // 圈投任务列表
    /**
     * @var UmktCampaignTaskInfo[]
     */
    public $campaignTaskList;
    protected $_name = [
        'reqMsgId'         => 'req_msg_id',
        'resultCode'       => 'result_code',
        'resultMsg'        => 'result_msg',
        'campaignId'       => 'campaign_id',
        'campaignTaskList' => 'campaign_task_list',
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
        if (null !== $this->campaignId) {
            $res['campaign_id'] = $this->campaignId;
        }
        if (null !== $this->campaignTaskList) {
            $res['campaign_task_list'] = [];
            if (null !== $this->campaignTaskList && \is_array($this->campaignTaskList)) {
                $n = 0;
                foreach ($this->campaignTaskList as $item) {
                    $res['campaign_task_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryUmktCampaignTaskResponse
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
        if (isset($map['campaign_id'])) {
            $model->campaignId = $map['campaign_id'];
        }
        if (isset($map['campaign_task_list'])) {
            if (!empty($map['campaign_task_list'])) {
                $model->campaignTaskList = [];
                $n                       = 0;
                foreach ($map['campaign_task_list'] as $item) {
                    $model->campaignTaskList[$n++] = null !== $item ? UmktCampaignTaskInfo::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
