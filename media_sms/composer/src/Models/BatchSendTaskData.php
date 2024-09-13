<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MEDIA_SMS\Models;

use AlibabaCloud\Tea\Model;

class BatchSendTaskData extends Model
{
    // 批量发送任务id
    /**
     * @example 202409050005000000019020
     *
     * @var string
     */
    public $batchTaskId;
    protected $_name = [
        'batchTaskId' => 'batch_task_id',
    ];

    public function validate()
    {
        Model::validateRequired('batchTaskId', $this->batchTaskId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->batchTaskId) {
            $res['batch_task_id'] = $this->batchTaskId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BatchSendTaskData
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['batch_task_id'])) {
            $model->batchTaskId = $map['batch_task_id'];
        }

        return $model;
    }
}
