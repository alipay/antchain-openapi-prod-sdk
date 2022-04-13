<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class TechStack extends Model
{
    // 技术栈描述
    /**
     * @example 蚂蚁SOFA4框架
     *
     * @var string
     */
    public $description;

    // 该字段为字符串类型Map，序列化为字符串用于存储扩展信息，e.g： 云原生下打包存放目录 /home/admin/release
    /**
     * @example 技术栈扩展信息
     *
     * @var string
     */
    public $extendProperties;

    // 技术栈id
    /**
     * @example 0000000000000001
     *
     * @var string
     */
    public $id;

    // 技术栈名称
    /**
     * @example SOFA
     *
     * @var string
     */
    public $name;

    // 技术栈可见范围，全局可见|租户内可见
    /**
     * @example PUBLIC|TENANT
     *
     * @var string
     */
    public $scope;

    // 创建时间（UTC）
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $utcCreated;

    // 最近修改时间（UTC）
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $utcModified;
    protected $_name = [
        'description'      => 'description',
        'extendProperties' => 'extend_properties',
        'id'               => 'id',
        'name'             => 'name',
        'scope'            => 'scope',
        'utcCreated'       => 'utc_created',
        'utcModified'      => 'utc_modified',
    ];

    public function validate()
    {
        Model::validateRequired('description', $this->description, true);
        Model::validateRequired('extendProperties', $this->extendProperties, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('scope', $this->scope, true);
        Model::validateRequired('utcCreated', $this->utcCreated, true);
        Model::validateRequired('utcModified', $this->utcModified, true);
        Model::validatePattern('utcCreated', $this->utcCreated, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('utcModified', $this->utcModified, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->extendProperties) {
            $res['extend_properties'] = $this->extendProperties;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->scope) {
            $res['scope'] = $this->scope;
        }
        if (null !== $this->utcCreated) {
            $res['utc_created'] = $this->utcCreated;
        }
        if (null !== $this->utcModified) {
            $res['utc_modified'] = $this->utcModified;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TechStack
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['extend_properties'])) {
            $model->extendProperties = $map['extend_properties'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['scope'])) {
            $model->scope = $map['scope'];
        }
        if (isset($map['utc_created'])) {
            $model->utcCreated = $map['utc_created'];
        }
        if (isset($map['utc_modified'])) {
            $model->utcModified = $map['utc_modified'];
        }

        return $model;
    }
}
