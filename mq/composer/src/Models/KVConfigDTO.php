<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class KVConfigDTO extends Model
{
    // 创建时间
    /**
     * @example
     *
     * @var int
     */
    public $gmtCreate;

    // 修改时间
    /**
     * @example
     *
     * @var int
     */
    public $gmtModified;

    // id
    /**
     * @example
     *
     * @var int
     */
    public $id;

    // key
    /**
     * @example key
     *
     * @var string
     */
    public $uniformKey;

    // 命名空间
    /**
     * @example SINGLE
     *
     * @var string
     */
    public $namespace;

    // 操作人
    /**
     * @example alipay
     *
     * @var string
     */
    public $operator;

    // value
    /**
     * @example value
     *
     * @var string
     */
    public $uniformValue;
    protected $_name = [
        'gmtCreate'    => 'gmt_create',
        'gmtModified'  => 'gmt_modified',
        'id'           => 'id',
        'uniformKey'   => 'uniform_key',
        'namespace'    => 'namespace',
        'operator'     => 'operator',
        'uniformValue' => 'uniform_value',
    ];

    public function validate()
    {
        Model::validateRequired('gmtCreate', $this->gmtCreate, true);
        Model::validateRequired('gmtModified', $this->gmtModified, true);
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('uniformKey', $this->uniformKey, true);
        Model::validateRequired('namespace', $this->namespace, true);
        Model::validateRequired('operator', $this->operator, true);
        Model::validateRequired('uniformValue', $this->uniformValue, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->gmtCreate) {
            $res['gmt_create'] = $this->gmtCreate;
        }
        if (null !== $this->gmtModified) {
            $res['gmt_modified'] = $this->gmtModified;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->uniformKey) {
            $res['uniform_key'] = $this->uniformKey;
        }
        if (null !== $this->namespace) {
            $res['namespace'] = $this->namespace;
        }
        if (null !== $this->operator) {
            $res['operator'] = $this->operator;
        }
        if (null !== $this->uniformValue) {
            $res['uniform_value'] = $this->uniformValue;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return KVConfigDTO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['gmt_create'])) {
            $model->gmtCreate = $map['gmt_create'];
        }
        if (isset($map['gmt_modified'])) {
            $model->gmtModified = $map['gmt_modified'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['uniform_key'])) {
            $model->uniformKey = $map['uniform_key'];
        }
        if (isset($map['namespace'])) {
            $model->namespace = $map['namespace'];
        }
        if (isset($map['operator'])) {
            $model->operator = $map['operator'];
        }
        if (isset($map['uniform_value'])) {
            $model->uniformValue = $map['uniform_value'];
        }

        return $model;
    }
}
