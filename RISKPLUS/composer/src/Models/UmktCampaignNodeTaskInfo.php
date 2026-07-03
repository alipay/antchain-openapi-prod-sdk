<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class UmktCampaignNodeTaskInfo extends Model
{
    // 节点id
    /**
     * @example xxxxx
     *
     * @var string
     */
    public $nodeId;

    // 节点任务状态
    /**
     * @example D
     *
     * @var string
     */
    public $nodeTaskStatus;

    // 节点任务执行日期 yyyy-MM-dd格式
    /**
     * @example 2025-12-25
     *
     * @var string
     */
    public $execDate;

    // 节点任务关联资源任务列表
    /**
     * @example [{"resourceId":"bizCode","taskStatus":"D"}]
     *
     * @var UmktCampaignRelationTaskInfo[]
     */
    public $relTaskList;
    protected $_name = [
        'nodeId'         => 'node_id',
        'nodeTaskStatus' => 'node_task_status',
        'execDate'       => 'exec_date',
        'relTaskList'    => 'rel_task_list',
    ];

    public function validate()
    {
        Model::validateRequired('nodeId', $this->nodeId, true);
        Model::validateRequired('nodeTaskStatus', $this->nodeTaskStatus, true);
        Model::validateRequired('execDate', $this->execDate, true);
        Model::validateRequired('relTaskList', $this->relTaskList, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->nodeId) {
            $res['node_id'] = $this->nodeId;
        }
        if (null !== $this->nodeTaskStatus) {
            $res['node_task_status'] = $this->nodeTaskStatus;
        }
        if (null !== $this->execDate) {
            $res['exec_date'] = $this->execDate;
        }
        if (null !== $this->relTaskList) {
            $res['rel_task_list'] = [];
            if (null !== $this->relTaskList && \is_array($this->relTaskList)) {
                $n = 0;
                foreach ($this->relTaskList as $item) {
                    $res['rel_task_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UmktCampaignNodeTaskInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['node_id'])) {
            $model->nodeId = $map['node_id'];
        }
        if (isset($map['node_task_status'])) {
            $model->nodeTaskStatus = $map['node_task_status'];
        }
        if (isset($map['exec_date'])) {
            $model->execDate = $map['exec_date'];
        }
        if (isset($map['rel_task_list'])) {
            if (!empty($map['rel_task_list'])) {
                $model->relTaskList = [];
                $n                  = 0;
                foreach ($map['rel_task_list'] as $item) {
                    $model->relTaskList[$n++] = null !== $item ? UmktCampaignRelationTaskInfo::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
