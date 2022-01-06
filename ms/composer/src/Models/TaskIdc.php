<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class TaskIdc extends Model
{
    // 机房id
    /**
     * @example undefined
     *
     * @var string
     */
    public $idcId;

    // 机房执行状态
    /**
     * @example undefined
     *
     * @var string
     */
    public $taskState;
    protected $_name = [
        'idcId'     => 'idc_id',
        'taskState' => 'task_state',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->idcId) {
            $res['idc_id'] = $this->idcId;
        }
        if (null !== $this->taskState) {
            $res['task_state'] = $this->taskState;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TaskIdc
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['idc_id'])) {
            $model->idcId = $map['idc_id'];
        }
        if (isset($map['task_state'])) {
            $model->taskState = $map['task_state'];
        }

        return $model;
    }
}
