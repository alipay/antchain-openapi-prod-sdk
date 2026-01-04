<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DTAIAGT\Models;

use AlibabaCloud\Tea\Model;

class ContentTask extends Model
{
    // 任务ID
    /**
     * @example
     *
     * @var int
     */
    public $id;

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

    // 任务状态:
    /**
     * @example init/end
     *
     * @var string
     */
    public $status;
    protected $_name = [
        'id'       => 'id',
        'taskName' => 'task_name',
        'taskType' => 'task_type',
        'status'   => 'status',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('taskName', $this->taskName, true);
        Model::validateRequired('taskType', $this->taskType, true);
        Model::validateRequired('status', $this->status, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->taskName) {
            $res['task_name'] = $this->taskName;
        }
        if (null !== $this->taskType) {
            $res['task_type'] = $this->taskType;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ContentTask
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['task_name'])) {
            $model->taskName = $map['task_name'];
        }
        if (isset($map['task_type'])) {
            $model->taskType = $map['task_type'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }

        return $model;
    }
}
