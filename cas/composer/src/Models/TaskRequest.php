<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class TaskRequest extends Model
{
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

    // status
    /**
     * @example status
     *
     * @var string
     */
    public $status;
    protected $_name = [
        'id'       => 'id',
        'operator' => 'operator',
        'token'    => 'token',
        'type'     => 'type',
        'status'   => 'status',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('type', $this->type, true);
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
        if (null !== $this->token) {
            $res['token'] = $this->token;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TaskRequest
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
        if (isset($map['token'])) {
            $model->token = $map['token'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }

        return $model;
    }
}
