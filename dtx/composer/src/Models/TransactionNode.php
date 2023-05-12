<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DTX\Models;

use AlibabaCloud\Tea\Model;

class TransactionNode extends Model
{
    // id
    /**
     * @example 1
     *
     * @var int
     */
    public $id;

    // start_time
    /**
     * @example start_time
     *
     * @var string
     */
    public $startTime;

    // end_time
    /**
     * @example end_time
     *
     * @var string
     */
    public $endTime;

    // role
    /**
     * @example role
     *
     * @var string
     */
    public $role;

    // name
    /**
     * @example name
     *
     * @var string
     */
    public $name;

    // label
    /**
     * @example label
     *
     * @var string
     */
    public $label;

    // is_end
    /**
     * @example true, false
     *
     * @var bool
     */
    public $isEnd;
    protected $_name = [
        'id'        => 'id',
        'startTime' => 'start_time',
        'endTime'   => 'end_time',
        'role'      => 'role',
        'name'      => 'name',
        'label'     => 'label',
        'isEnd'     => 'is_end',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('startTime', $this->startTime, true);
        Model::validateRequired('endTime', $this->endTime, true);
        Model::validateRequired('role', $this->role, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('label', $this->label, true);
        Model::validateRequired('isEnd', $this->isEnd, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->startTime) {
            $res['start_time'] = $this->startTime;
        }
        if (null !== $this->endTime) {
            $res['end_time'] = $this->endTime;
        }
        if (null !== $this->role) {
            $res['role'] = $this->role;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->label) {
            $res['label'] = $this->label;
        }
        if (null !== $this->isEnd) {
            $res['is_end'] = $this->isEnd;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TransactionNode
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['start_time'])) {
            $model->startTime = $map['start_time'];
        }
        if (isset($map['end_time'])) {
            $model->endTime = $map['end_time'];
        }
        if (isset($map['role'])) {
            $model->role = $map['role'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['label'])) {
            $model->label = $map['label'];
        }
        if (isset($map['is_end'])) {
            $model->isEnd = $map['is_end'];
        }

        return $model;
    }
}
