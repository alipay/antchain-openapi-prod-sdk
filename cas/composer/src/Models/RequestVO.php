<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class RequestVO extends Model
{
    // context
    /**
     * @example context
     *
     * @var string
     */
    public $context;

    // id
    /**
     * @example id
     *
     * @var string
     */
    public $id;

    // operator
    /**
     * @example operator
     *
     * @var string
     */
    public $operator;

    // operator_name
    /**
     * @example operator_name
     *
     * @var string
     */
    public $operatorName;

    // operator_type
    /**
     * @example operator_type
     *
     * @var string
     */
    public $operatorType;

    // status
    /**
     * @example status
     *
     * @var string
     */
    public $status;

    // token
    /**
     * @example token
     *
     * @var string
     */
    public $token;

    // type
    /**
     * @example type
     *
     * @var string
     */
    public $type;

    // utc_create
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $utcCreate;

    // utc_modified
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $utcModified;

    // tasks
    /**
     * @example
     *
     * @var Task[]
     */
    public $tasks;
    protected $_name = [
        'context'      => 'context',
        'id'           => 'id',
        'operator'     => 'operator',
        'operatorName' => 'operator_name',
        'operatorType' => 'operator_type',
        'status'       => 'status',
        'token'        => 'token',
        'type'         => 'type',
        'utcCreate'    => 'utc_create',
        'utcModified'  => 'utc_modified',
        'tasks'        => 'tasks',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('operatorName', $this->operatorName, true);
        Model::validatePattern('utcCreate', $this->utcCreate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
        Model::validatePattern('utcModified', $this->utcModified, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->context) {
            $res['context'] = $this->context;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->operator) {
            $res['operator'] = $this->operator;
        }
        if (null !== $this->operatorName) {
            $res['operator_name'] = $this->operatorName;
        }
        if (null !== $this->operatorType) {
            $res['operator_type'] = $this->operatorType;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->token) {
            $res['token'] = $this->token;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->utcCreate) {
            $res['utc_create'] = $this->utcCreate;
        }
        if (null !== $this->utcModified) {
            $res['utc_modified'] = $this->utcModified;
        }
        if (null !== $this->tasks) {
            $res['tasks'] = [];
            if (null !== $this->tasks && \is_array($this->tasks)) {
                $n = 0;
                foreach ($this->tasks as $item) {
                    $res['tasks'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RequestVO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['context'])) {
            $model->context = $map['context'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['operator'])) {
            $model->operator = $map['operator'];
        }
        if (isset($map['operator_name'])) {
            $model->operatorName = $map['operator_name'];
        }
        if (isset($map['operator_type'])) {
            $model->operatorType = $map['operator_type'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['token'])) {
            $model->token = $map['token'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['utc_create'])) {
            $model->utcCreate = $map['utc_create'];
        }
        if (isset($map['utc_modified'])) {
            $model->utcModified = $map['utc_modified'];
        }
        if (isset($map['tasks'])) {
            if (!empty($map['tasks'])) {
                $model->tasks = [];
                $n            = 0;
                foreach ($map['tasks'] as $item) {
                    $model->tasks[$n++] = null !== $item ? Task::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
