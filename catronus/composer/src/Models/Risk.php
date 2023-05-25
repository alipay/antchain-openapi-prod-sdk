<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CATRONUS\Models;

use AlibabaCloud\Tea\Model;

class Risk extends Model
{
    // 风险ID
    /**
     * @example 1000000000001
     *
     * @var string
     */
    public $id;

    // 风险名称
    /**
     * @example cve-2022-1108
     *
     * @var string
     */
    public $name;

    // 类型
    /**
     * @example IMAGE
     *
     * @var string
     */
    public $source;

    // 等级
    /**
     * @example low
     *
     * @var string
     */
    public $priority;

    // 风险唯一标识
    /**
     * @example 11
     *
     * @var string
     */
    public $identity;
    protected $_name = [
        'id'       => 'id',
        'name'     => 'name',
        'source'   => 'source',
        'priority' => 'priority',
        'identity' => 'identity',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('source', $this->source, true);
        Model::validateRequired('priority', $this->priority, true);
        Model::validateRequired('identity', $this->identity, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->source) {
            $res['source'] = $this->source;
        }
        if (null !== $this->priority) {
            $res['priority'] = $this->priority;
        }
        if (null !== $this->identity) {
            $res['identity'] = $this->identity;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Risk
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['source'])) {
            $model->source = $map['source'];
        }
        if (isset($map['priority'])) {
            $model->priority = $map['priority'];
        }
        if (isset($map['identity'])) {
            $model->identity = $map['identity'];
        }

        return $model;
    }
}
