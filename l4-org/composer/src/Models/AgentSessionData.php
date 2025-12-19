<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ORG\Models;

use AlibabaCloud\Tea\Model;

class AgentSessionData extends Model
{
    // 会话id
    /**
     * @example 082bab66-7b04-11ef-9df1-d38fddccce14
     *
     * @var string
     */
    public $sessionId;

    // 会话标题
    /**
     * @example 会话标题
     *
     * @var string
     */
    public $title;

    // 创建时间
    /**
     * @example 2024-10-31 00:00:00
     *
     * @var string
     */
    public $gmtCreated;

    // VALID("生效"),INVALID("失效"),RUNNING("进行中"),FAILED("失败"),TERMINATED("已终止"), COMPLETED("已完成");
    /**
     * @example VALID
     *
     * @var string
     */
    public $status;

    // 任务列表
    /**
     * @example 任务列表
     *
     * @var AgentTaskData[]
     */
    public $taskList;
    protected $_name = [
        'sessionId'  => 'session_id',
        'title'      => 'title',
        'gmtCreated' => 'gmt_created',
        'status'     => 'status',
        'taskList'   => 'task_list',
    ];

    public function validate()
    {
        Model::validateRequired('sessionId', $this->sessionId, true);
        Model::validateRequired('title', $this->title, true);
        Model::validateRequired('gmtCreated', $this->gmtCreated, true);
        Model::validateRequired('status', $this->status, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->sessionId) {
            $res['session_id'] = $this->sessionId;
        }
        if (null !== $this->title) {
            $res['title'] = $this->title;
        }
        if (null !== $this->gmtCreated) {
            $res['gmt_created'] = $this->gmtCreated;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->taskList) {
            $res['task_list'] = [];
            if (null !== $this->taskList && \is_array($this->taskList)) {
                $n = 0;
                foreach ($this->taskList as $item) {
                    $res['task_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AgentSessionData
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['session_id'])) {
            $model->sessionId = $map['session_id'];
        }
        if (isset($map['title'])) {
            $model->title = $map['title'];
        }
        if (isset($map['gmt_created'])) {
            $model->gmtCreated = $map['gmt_created'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['task_list'])) {
            if (!empty($map['task_list'])) {
                $model->taskList = [];
                $n               = 0;
                foreach ($map['task_list'] as $item) {
                    $model->taskList[$n++] = null !== $item ? AgentTaskData::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
