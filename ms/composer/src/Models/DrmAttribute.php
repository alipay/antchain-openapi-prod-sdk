<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class DrmAttribute extends Model
{
    // 属性名，与代码中的成员变量名一致
    /**
     * @example cellConfig
     *
     * @var string
     */
    public $attributeName;

    // 资源id
    //
    /**
     * @example drm.config:name=drmdomain.Alipay.dsrconsole.drmresource.com.alipay.antcloud.dsrconsole.core.service.drm.config.metadata,version=3.0@DRM
     *
     * @var string
     */
    public $dataId;

    // 属性id
    /**
     * @example 11
     *
     * @var int
     */
    public $id;

    // 实例id
    /**
     * @example 00001
     *
     * @var string
     */
    public $instanceId;

    // 节点名称，显示在树形菜单上用的
    /**
     * @example name
     *
     * @var string
     */
    public $name;

    // 属性所属的资源
    /**
     * @example
     *
     * @var DrmResourceWithoutAttributes
     */
    public $parent;

    // 父节点ID，冗余字段
    /**
     * @example 2214
     *
     * @var int
     */
    public $parentId;
    protected $_name = [
        'attributeName' => 'attribute_name',
        'dataId'        => 'data_id',
        'id'            => 'id',
        'instanceId'    => 'instance_id',
        'name'          => 'name',
        'parent'        => 'parent',
        'parentId'      => 'parent_id',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->attributeName) {
            $res['attribute_name'] = $this->attributeName;
        }
        if (null !== $this->dataId) {
            $res['data_id'] = $this->dataId;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->parent) {
            $res['parent'] = null !== $this->parent ? $this->parent->toMap() : null;
        }
        if (null !== $this->parentId) {
            $res['parent_id'] = $this->parentId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DrmAttribute
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['attribute_name'])) {
            $model->attributeName = $map['attribute_name'];
        }
        if (isset($map['data_id'])) {
            $model->dataId = $map['data_id'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['parent'])) {
            $model->parent = DrmResourceWithoutAttributes::fromMap($map['parent']);
        }
        if (isset($map['parent_id'])) {
            $model->parentId = $map['parent_id'];
        }

        return $model;
    }
}
