<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ORG\Models;

use AlibabaCloud\Tea\Model;

class AgentTaskStepData extends Model
{
    // 步骤id
    /**
     * @example 步骤id
     *
     * @var string
     */
    public $stepId;

    // 步骤名称
    /**
     * @example 步骤名称
     *
     * @var string
     */
    public $stepName;

    // PENDING,  RUNNING,COMPLETED,TERMINATED,FAILED
    /**
     * @example FAILED
     *
     * @var string
     */
    public $status;

    // 更新时间
    /**
     * @example 2024-10-31 00:00:00
     *
     * @var string
     */
    public $updateTime;

    // 关联的消息id
    /**
     * @example 关联的消息id
     *
     * @var string
     */
    public $messageId;

    // 关联的异步任务id
    /**
     * @example 关联的异步任务id
     *
     * @var string
     */
    public $jobId;

    // 异步任务结果
    /**
     * @example 异步任务结果
     *
     * @var string
     */
    public $result;

    // 异步任务已读标识
    /**
     * @example false
     *
     * @var bool
     */
    public $messageFlag;
    protected $_name = [
        'stepId'      => 'step_id',
        'stepName'    => 'step_name',
        'status'      => 'status',
        'updateTime'  => 'update_time',
        'messageId'   => 'message_id',
        'jobId'       => 'job_id',
        'result'      => 'result',
        'messageFlag' => 'message_flag',
    ];

    public function validate()
    {
        Model::validateRequired('stepId', $this->stepId, true);
        Model::validateRequired('stepName', $this->stepName, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('updateTime', $this->updateTime, true);
        Model::validateRequired('messageId', $this->messageId, true);
        Model::validateRequired('jobId', $this->jobId, true);
        Model::validateRequired('result', $this->result, true);
        Model::validateRequired('messageFlag', $this->messageFlag, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->stepId) {
            $res['step_id'] = $this->stepId;
        }
        if (null !== $this->stepName) {
            $res['step_name'] = $this->stepName;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->updateTime) {
            $res['update_time'] = $this->updateTime;
        }
        if (null !== $this->messageId) {
            $res['message_id'] = $this->messageId;
        }
        if (null !== $this->jobId) {
            $res['job_id'] = $this->jobId;
        }
        if (null !== $this->result) {
            $res['result'] = $this->result;
        }
        if (null !== $this->messageFlag) {
            $res['message_flag'] = $this->messageFlag;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AgentTaskStepData
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['step_id'])) {
            $model->stepId = $map['step_id'];
        }
        if (isset($map['step_name'])) {
            $model->stepName = $map['step_name'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['update_time'])) {
            $model->updateTime = $map['update_time'];
        }
        if (isset($map['message_id'])) {
            $model->messageId = $map['message_id'];
        }
        if (isset($map['job_id'])) {
            $model->jobId = $map['job_id'];
        }
        if (isset($map['result'])) {
            $model->result = $map['result'];
        }
        if (isset($map['message_flag'])) {
            $model->messageFlag = $map['message_flag'];
        }

        return $model;
    }
}
