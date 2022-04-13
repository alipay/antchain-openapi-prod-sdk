<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class SidecarOpsMachine extends Model
{
    // 机器运维流程ID
    /**
     * @example 12345
     *
     * @var string
     */
    public $id;

    // 运维机器名称
    /**
     * @example pod-1
     *
     * @var string
     */
    public $target;

    // 执行状态
    /**
     * @example _SUCCEEDED_, _FAILED_
     *
     * @var string
     */
    public $status;

    // 执行状态描述
    /**
     * @example 成功
     *
     * @var string
     */
    public $statusDesc;

    // 扩展属性
    /**
     * @example "{}"
     *
     * @var string
     */
    public $properties;

    // 执行消息日志
    /**
     * @example 执行日志 - 12
     *
     * @var string
     */
    public $message;

    // 机器sidecar运维任务列表
    /**
     * @example []
     *
     * @var SidecarOpsMachineTask[]
     */
    public $subTargets;
    protected $_name = [
        'id'         => 'id',
        'target'     => 'target',
        'status'     => 'status',
        'statusDesc' => 'status_desc',
        'properties' => 'properties',
        'message'    => 'message',
        'subTargets' => 'sub_targets',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('target', $this->target, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('subTargets', $this->subTargets, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->target) {
            $res['target'] = $this->target;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->statusDesc) {
            $res['status_desc'] = $this->statusDesc;
        }
        if (null !== $this->properties) {
            $res['properties'] = $this->properties;
        }
        if (null !== $this->message) {
            $res['message'] = $this->message;
        }
        if (null !== $this->subTargets) {
            $res['sub_targets'] = [];
            if (null !== $this->subTargets && \is_array($this->subTargets)) {
                $n = 0;
                foreach ($this->subTargets as $item) {
                    $res['sub_targets'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SidecarOpsMachine
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['target'])) {
            $model->target = $map['target'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['status_desc'])) {
            $model->statusDesc = $map['status_desc'];
        }
        if (isset($map['properties'])) {
            $model->properties = $map['properties'];
        }
        if (isset($map['message'])) {
            $model->message = $map['message'];
        }
        if (isset($map['sub_targets'])) {
            if (!empty($map['sub_targets'])) {
                $model->subTargets = [];
                $n                 = 0;
                foreach ($map['sub_targets'] as $item) {
                    $model->subTargets[$n++] = null !== $item ? SidecarOpsMachineTask::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
