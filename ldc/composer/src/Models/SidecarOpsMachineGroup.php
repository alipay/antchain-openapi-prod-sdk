<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class SidecarOpsMachineGroup extends Model
{
    // 分组ID
    /**
     * @example 12345
     *
     * @var string
     */
    public $id;

    // 分组名称
    /**
     * @example test
     *
     * @var string
     */
    public $target;

    // 状态
    /**
     * @example _SUCCEEDED_, _FAILED_
     *
     * @var string
     */
    public $status;

    // 扩展属性
    /**
     * @example _{}_
     *
     * @var string
     */
    public $properties;

    // 执行日志
    /**
     * @example test log
     *
     * @var string
     */
    public $messages;

    // sidecar 运维机器列表
    /**
     * @example [{}]
     *
     * @var SidecarOpsMachine[]
     */
    public $subTargets;
    protected $_name = [
        'id'         => 'id',
        'target'     => 'target',
        'status'     => 'status',
        'properties' => 'properties',
        'messages'   => 'messages',
        'subTargets' => 'sub_targets',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
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
        if (null !== $this->properties) {
            $res['properties'] = $this->properties;
        }
        if (null !== $this->messages) {
            $res['messages'] = $this->messages;
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
     * @return SidecarOpsMachineGroup
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
        if (isset($map['properties'])) {
            $model->properties = $map['properties'];
        }
        if (isset($map['messages'])) {
            $model->messages = $map['messages'];
        }
        if (isset($map['sub_targets'])) {
            if (!empty($map['sub_targets'])) {
                $model->subTargets = [];
                $n                 = 0;
                foreach ($map['sub_targets'] as $item) {
                    $model->subTargets[$n++] = null !== $item ? SidecarOpsMachine::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
