<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class DetailAuthTaskResponse extends Model
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

    // 历史任务信息
    /**
     * @var OldTaskInfo
     */
    public $oldTaskInfo;

    // 最新的任务信息
    /**
     * @var UpdatedTaskInfo
     */
    public $updateTaskInfo;

    // 是否有未完成的圈人任务
    /**
     * @var bool
     */
    public $haveNotFinishedCrowdTask;
    protected $_name = [
        'reqMsgId'                 => 'req_msg_id',
        'resultCode'               => 'result_code',
        'resultMsg'                => 'result_msg',
        'oldTaskInfo'              => 'old_task_info',
        'updateTaskInfo'           => 'update_task_info',
        'haveNotFinishedCrowdTask' => 'have_not_finished_crowd_task',
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
        if (null !== $this->oldTaskInfo) {
            $res['old_task_info'] = null !== $this->oldTaskInfo ? $this->oldTaskInfo->toMap() : null;
        }
        if (null !== $this->updateTaskInfo) {
            $res['update_task_info'] = null !== $this->updateTaskInfo ? $this->updateTaskInfo->toMap() : null;
        }
        if (null !== $this->haveNotFinishedCrowdTask) {
            $res['have_not_finished_crowd_task'] = $this->haveNotFinishedCrowdTask;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DetailAuthTaskResponse
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
        if (isset($map['old_task_info'])) {
            $model->oldTaskInfo = OldTaskInfo::fromMap($map['old_task_info']);
        }
        if (isset($map['update_task_info'])) {
            $model->updateTaskInfo = UpdatedTaskInfo::fromMap($map['update_task_info']);
        }
        if (isset($map['have_not_finished_crowd_task'])) {
            $model->haveNotFinishedCrowdTask = $map['have_not_finished_crowd_task'];
        }

        return $model;
    }
}
