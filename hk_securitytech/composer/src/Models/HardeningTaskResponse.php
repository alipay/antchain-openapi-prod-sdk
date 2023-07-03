<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\HK_SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

class HardeningTaskResponse extends Model
{
    // 加固任务的 ID，后续用来轮询调用
    /**
     * @example task_id
     *
     * @var string
     */
    public $taskId;

    // 加固任务的状态
    /**
     * @example
     *
     * @var int
     */
    public $status;

    // 加固后 APK/ABB 的 MD5
    /**
     * @example after_md_five
     *
     * @var string
     */
    public $afterMdFive;

    // 加固后 APK/ABB 的大小
    /**
     * @example
     *
     * @var int
     */
    public $afterSize;
    protected $_name = [
        'taskId'      => 'task_id',
        'status'      => 'status',
        'afterMdFive' => 'after_md_five',
        'afterSize'   => 'after_size',
    ];

    public function validate()
    {
        Model::validateRequired('taskId', $this->taskId, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('afterMdFive', $this->afterMdFive, true);
        Model::validateRequired('afterSize', $this->afterSize, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->taskId) {
            $res['task_id'] = $this->taskId;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->afterMdFive) {
            $res['after_md_five'] = $this->afterMdFive;
        }
        if (null !== $this->afterSize) {
            $res['after_size'] = $this->afterSize;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return HardeningTaskResponse
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['task_id'])) {
            $model->taskId = $map['task_id'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['after_md_five'])) {
            $model->afterMdFive = $map['after_md_five'];
        }
        if (isset($map['after_size'])) {
            $model->afterSize = $map['after_size'];
        }

        return $model;
    }
}
