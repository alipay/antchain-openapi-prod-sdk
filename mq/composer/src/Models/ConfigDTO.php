<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class ConfigDTO extends Model
{
    // create time
    /**
     * @example
     *
     * @var int
     */
    public $gmtCreate;

    // modify time
    /**
     * @example
     *
     * @var int
     */
    public $gmtModified;

    // id
    /**
     * @example 1
     *
     * @var int
     */
    public $id;

    // operator
    /**
     * @example alipay
     *
     * @var string
     */
    public $operator;

    // key
    /**
     * @example key
     *
     * @var string
     */
    public $property;

    // 目标名
    /**
     * @example SINGLE
     *
     * @var string
     */
    public $targetName;

    // cluster type or broker type
    /**
     * @example
     *
     * @var int
     */
    public $targetType;

    // value
    /**
     * @example value
     *
     * @var string
     */
    public $value;

    // 生效范围
    /**
     * @example {"envs":["PREPUB"]}
     *
     * @var string
     */
    public $scope;

    // 版本号
    /**
     * @example 1
     *
     * @var int
     */
    public $version;

    // 删除标志
    /**
     * @example DEL
     *
     * @var string
     */
    public $deleteMark;
    protected $_name = [
        'gmtCreate'   => 'gmt_create',
        'gmtModified' => 'gmt_modified',
        'id'          => 'id',
        'operator'    => 'operator',
        'property'    => 'property',
        'targetName'  => 'target_name',
        'targetType'  => 'target_type',
        'value'       => 'value',
        'scope'       => 'scope',
        'version'     => 'version',
        'deleteMark'  => 'delete_mark',
    ];

    public function validate()
    {
        Model::validateRequired('gmtCreate', $this->gmtCreate, true);
        Model::validateRequired('gmtModified', $this->gmtModified, true);
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('operator', $this->operator, true);
        Model::validateRequired('property', $this->property, true);
        Model::validateRequired('targetName', $this->targetName, true);
        Model::validateRequired('targetType', $this->targetType, true);
        Model::validateRequired('value', $this->value, true);
        Model::validateRequired('scope', $this->scope, true);
        Model::validateRequired('version', $this->version, true);
        Model::validateRequired('deleteMark', $this->deleteMark, true);
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
        if (null !== $this->operator) {
            $res['operator'] = $this->operator;
        }
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
        if (null !== $this->scope) {
            $res['scope'] = $this->scope;
        }
        if (null !== $this->version) {
            $res['version'] = $this->version;
        }
        if (null !== $this->deleteMark) {
            $res['delete_mark'] = $this->deleteMark;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ConfigDTO
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
        if (isset($map['operator'])) {
            $model->operator = $map['operator'];
        }
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
        if (isset($map['scope'])) {
            $model->scope = $map['scope'];
        }
        if (isset($map['version'])) {
            $model->version = $map['version'];
        }
        if (isset($map['delete_mark'])) {
            $model->deleteMark = $map['delete_mark'];
        }

        return $model;
    }
}
