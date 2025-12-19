<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\QFTEST\Models;

use AlibabaCloud\Tea\Model;

class AgentTaskData extends Model
{
    // 任务名称
    /**
     * @example 任务名称
     *
     * @var string
     */
    public $taskName;

    // 任务类型
    /**
     * @example 任务类型
     *
     * @var string
     */
    public $taskType;

    // 任务状态
    /**
     * @example 任务状态
     *
     * @var string
     */
    public $taskStatus;

    // 是否有未读的消息
    /**
     * @example false
     *
     * @var bool
     */
    public $messageFlag;

    // 最后更新时间
    /**
     * @example 2024-10-31 00:00:00
     *
     * @var string
     */
    public $updateTime;

    // 单步骤任务直接关联消息id
    /**
     * @example 202503060003000000000001
     *
     * @var string
     */
    public $messageId;

    // 附加信息
    /**
     * @example 附加信息
     *
     * @var string
     */
    public $extInfo;

    // 任务步骤列表
    /**
     * @example 任务步骤列表
     *
     * @var AgentTaskStepData[]
     */
    public $stepList;
    protected $_name = [
        'taskName'    => 'task_name',
        'taskType'    => 'task_type',
        'taskStatus'  => 'task_status',
        'messageFlag' => 'message_flag',
        'updateTime'  => 'update_time',
        'messageId'   => 'message_id',
        'extInfo'     => 'ext_info',
        'stepList'    => 'step_list',
    ];

    public function validate()
    {
        Model::validateRequired('taskName', $this->taskName, true);
        Model::validateRequired('taskType', $this->taskType, true);
        Model::validateRequired('taskStatus', $this->taskStatus, true);
        Model::validateRequired('messageFlag', $this->messageFlag, true);
        Model::validateRequired('updateTime', $this->updateTime, true);
        Model::validateRequired('messageId', $this->messageId, true);
        Model::validateRequired('extInfo', $this->extInfo, true);
        Model::validateRequired('stepList', $this->stepList, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->taskName) {
            $res['task_name'] = $this->taskName;
        }
        if (null !== $this->taskType) {
            $res['task_type'] = $this->taskType;
        }
        if (null !== $this->taskStatus) {
            $res['task_status'] = $this->taskStatus;
        }
        if (null !== $this->messageFlag) {
            $res['message_flag'] = $this->messageFlag;
        }
        if (null !== $this->updateTime) {
            $res['update_time'] = $this->updateTime;
        }
        if (null !== $this->messageId) {
            $res['message_id'] = $this->messageId;
        }
        if (null !== $this->extInfo) {
            $res['ext_info'] = $this->extInfo;
        }
        if (null !== $this->stepList) {
            $res['step_list'] = [];
            if (null !== $this->stepList && \is_array($this->stepList)) {
                $n = 0;
                foreach ($this->stepList as $item) {
                    $res['step_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AgentTaskData
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['task_name'])) {
            $model->taskName = $map['task_name'];
        }
        if (isset($map['task_type'])) {
            $model->taskType = $map['task_type'];
        }
        if (isset($map['task_status'])) {
            $model->taskStatus = $map['task_status'];
        }
        if (isset($map['message_flag'])) {
            $model->messageFlag = $map['message_flag'];
        }
        if (isset($map['update_time'])) {
            $model->updateTime = $map['update_time'];
        }
        if (isset($map['message_id'])) {
            $model->messageId = $map['message_id'];
        }
        if (isset($map['ext_info'])) {
            $model->extInfo = $map['ext_info'];
        }
        if (isset($map['step_list'])) {
            if (!empty($map['step_list'])) {
                $model->stepList = [];
                $n               = 0;
                foreach ($map['step_list'] as $item) {
                    $model->stepList[$n++] = null !== $item ? AgentTaskStepData::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
