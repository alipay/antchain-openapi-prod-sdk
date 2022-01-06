<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class DeleteDrmDrmattributesRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 属性名称
    /**
     * @var string
     */
    public $attributeName;

    // 资源id
    /**
     * @var string
     */
    public $dataId;

    // 属性id
    /**
     * @var int
     */
    public $id;

    // 实例id
    /**
     * @var string
     */
    public $instanceId;

    // 描述字段
    /**
     * @var string
     */
    public $name;

    // 父节点信息
    /**
     * @var string
     */
    public $parent;

    // 父节点ID，冗余字段
    /**
     * @var string
     */
    public $parentId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'attributeName'     => 'attribute_name',
        'dataId'            => 'data_id',
        'id'                => 'id',
        'instanceId'        => 'instance_id',
        'name'              => 'name',
        'parent'            => 'parent',
        'parentId'          => 'parent_id',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('instanceId', $this->instanceId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
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
            $res['parent'] = $this->parent;
        }
        if (null !== $this->parentId) {
            $res['parent_id'] = $this->parentId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DeleteDrmDrmattributesRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
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
            $model->parent = $map['parent'];
        }
        if (isset($map['parent_id'])) {
            $model->parentId = $map['parent_id'];
        }

        return $model;
    }
}
