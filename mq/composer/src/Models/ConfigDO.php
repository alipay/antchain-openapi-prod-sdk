<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class ConfigDO extends Model
{
    // key
    /**
     * @example key
     *
     * @var string
     */
    public $property;

    // target name
    /**
     * @example cluster
     *
     * @var string
     */
    public $targetName;

    // cluster type or broker type
    /**
     * @example 0
     *
     * @var string
     */
    public $targetType;

    // value
    /**
     * @example value
     *
     * @var string
     */
    public $value;

    // id
    /**
     * @example
     *
     * @var int
     */
    public $id;

    // gmt_create
    /**
     * @example gmt_create
     *
     * @var string
     */
    public $gmtCreate;

    // gmt_modified
    /**
     * @example gmt_modified
     *
     * @var string
     */
    public $gmtModified;
    protected $_name = [
        'property'    => 'property',
        'targetName'  => 'target_name',
        'targetType'  => 'target_type',
        'value'       => 'value',
        'id'          => 'id',
        'gmtCreate'   => 'gmt_create',
        'gmtModified' => 'gmt_modified',
    ];

    public function validate()
    {
        Model::validateRequired('property', $this->property, true);
        Model::validateRequired('targetName', $this->targetName, true);
        Model::validateRequired('targetType', $this->targetType, true);
        Model::validateRequired('value', $this->value, true);
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('gmtCreate', $this->gmtCreate, true);
        Model::validateRequired('gmtModified', $this->gmtModified, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->property) {
            $res['property'] = $this->property;
        }
        if (null !== $this->targetName) {
            $res['target_name'] = $this->targetName;
        }
        if (null !== $this->targetType) {
            $res['target_type'] = $this->targetType;
        }
        if (null !== $this->value) {
            $res['value'] = $this->value;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->gmtCreate) {
            $res['gmt_create'] = $this->gmtCreate;
        }
        if (null !== $this->gmtModified) {
            $res['gmt_modified'] = $this->gmtModified;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ConfigDO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['property'])) {
            $model->property = $map['property'];
        }
        if (isset($map['target_name'])) {
            $model->targetName = $map['target_name'];
        }
        if (isset($map['target_type'])) {
            $model->targetType = $map['target_type'];
        }
        if (isset($map['value'])) {
            $model->value = $map['value'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['gmt_create'])) {
            $model->gmtCreate = $map['gmt_create'];
        }
        if (isset($map['gmt_modified'])) {
            $model->gmtModified = $map['gmt_modified'];
        }

        return $model;
    }
}
