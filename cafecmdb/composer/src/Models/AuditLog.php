<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAFECMDB\Models;

use AlibabaCloud\Tea\Model;

class AuditLog extends Model
{
    // id
    /**
     * @example id
     *
     * @var string
     */
    public $id;

    // 操作者
    /**
     * @example operator
     *
     * @var string
     */
    public $operator;

    // 操作的对象类别
    /**
     * @example resourceType
     *
     * @var string
     */
    public $resourceType;

    // 动作
    /**
     * @example action
     *
     * @var string
     */
    public $action;

    // 对象的ID
    /**
     * @example
     *
     * @var string[]
     */
    public $targets;

    // operation_time
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $operationTime;
    protected $_name = [
        'id'            => 'id',
        'operator'      => 'operator',
        'resourceType'  => 'resource_type',
        'action'        => 'action',
        'targets'       => 'targets',
        'operationTime' => 'operation_time',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('operator', $this->operator, true);
        Model::validateRequired('resourceType', $this->resourceType, true);
        Model::validateRequired('action', $this->action, true);
        Model::validateRequired('targets', $this->targets, true);
        Model::validateRequired('operationTime', $this->operationTime, true);
        Model::validatePattern('operationTime', $this->operationTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->operator) {
            $res['operator'] = $this->operator;
        }
        if (null !== $this->resourceType) {
            $res['resource_type'] = $this->resourceType;
        }
        if (null !== $this->action) {
            $res['action'] = $this->action;
        }
        if (null !== $this->targets) {
            $res['targets'] = $this->targets;
        }
        if (null !== $this->operationTime) {
            $res['operation_time'] = $this->operationTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AuditLog
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['operator'])) {
            $model->operator = $map['operator'];
        }
        if (isset($map['resource_type'])) {
            $model->resourceType = $map['resource_type'];
        }
        if (isset($map['action'])) {
            $model->action = $map['action'];
        }
        if (isset($map['targets'])) {
            if (!empty($map['targets'])) {
                $model->targets = $map['targets'];
            }
        }
        if (isset($map['operation_time'])) {
            $model->operationTime = $map['operation_time'];
        }

        return $model;
    }
}
