<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class UmktCampaignTaskInfo extends Model
{
    // 任务唯一id
    /**
     * @example xxx-xxx-xxx
     *
     * @var string
     */
    public $taskId;

    // 圈投任务执行日期，yyyy-MM-dd格式
    /**
     * @example 2025-12-25
     *
     * @var string
     */
    public $execDate;

    // 圈投任务执行批次
    /**
     * @example 202512250020
     *
     * @var string
     */
    public $execBatch;

    // 圈投任务状态
    /**
     * @example D
     *
     * @var string
     */
    public $campaignTaskStatus;

    // 节点任务列表
    /**
     * @example [{"nodeId":"35d2171b68fd472c8f4cc5c293985d37","execDate":"","nodeTaskStatus":"F","relTaskList":[{"resourceId":"1007", "taskStatus":"F","errMsg":"上游节点执行失败"}]}
     *
     * @var UmktCampaignNodeTaskInfo
     */
    public $nodeTaskList;
    protected $_name = [
        'taskId'             => 'task_id',
        'execDate'           => 'exec_date',
        'execBatch'          => 'exec_batch',
        'campaignTaskStatus' => 'campaign_task_status',
        'nodeTaskList'       => 'node_task_list',
    ];

    public function validate()
    {
        Model::validateRequired('taskId', $this->taskId, true);
        Model::validateRequired('execDate', $this->execDate, true);
        Model::validateRequired('execBatch', $this->execBatch, true);
        Model::validateRequired('campaignTaskStatus', $this->campaignTaskStatus, true);
        Model::validateRequired('nodeTaskList', $this->nodeTaskList, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->taskId) {
            $res['task_id'] = $this->taskId;
        }
        if (null !== $this->execDate) {
            $res['exec_date'] = $this->execDate;
        }
        if (null !== $this->execBatch) {
            $res['exec_batch'] = $this->execBatch;
        }
        if (null !== $this->campaignTaskStatus) {
            $res['campaign_task_status'] = $this->campaignTaskStatus;
        }
        if (null !== $this->nodeTaskList) {
            $res['node_task_list'] = null !== $this->nodeTaskList ? $this->nodeTaskList->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UmktCampaignTaskInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['task_id'])) {
            $model->taskId = $map['task_id'];
        }
        if (isset($map['exec_date'])) {
            $model->execDate = $map['exec_date'];
        }
        if (isset($map['exec_batch'])) {
            $model->execBatch = $map['exec_batch'];
        }
        if (isset($map['campaign_task_status'])) {
            $model->campaignTaskStatus = $map['campaign_task_status'];
        }
        if (isset($map['node_task_list'])) {
            $model->nodeTaskList = UmktCampaignNodeTaskInfo::fromMap($map['node_task_list']);
        }

        return $model;
    }
}
