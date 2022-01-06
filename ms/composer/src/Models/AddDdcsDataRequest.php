<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class AddDdcsDataRequest extends Model
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

    // 属性自增长 ID
    /**
     * @var int
     */
    public $attributeId;

    // 需要发布的单元列表，英文逗号隔开，为空表示推送到所有单元
    /**
     * @var string
     */
    public $cells;

    // 推送的属性值
    /**
     * @var string
     */
    public $data;

    // 系统字段：环境实例 ID
    //
    /**
     * @var string
     */
    public $instanceId;

    // 操作人
    /**
     * @var string
     */
    public $operator;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'attributeId'       => 'attribute_id',
        'cells'             => 'cells',
        'data'              => 'data',
        'instanceId'        => 'instance_id',
        'operator'          => 'operator',
    ];

    public function validate()
    {
        Model::validateRequired('attributeId', $this->attributeId, true);
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
        if (null !== $this->attributeId) {
            $res['attribute_id'] = $this->attributeId;
        }
        if (null !== $this->cells) {
            $res['cells'] = $this->cells;
        }
        if (null !== $this->data) {
            $res['data'] = $this->data;
        }
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->operator) {
            $res['operator'] = $this->operator;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AddDdcsDataRequest
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
        if (isset($map['attribute_id'])) {
            $model->attributeId = $map['attribute_id'];
        }
        if (isset($map['cells'])) {
            $model->cells = $map['cells'];
        }
        if (isset($map['data'])) {
            $model->data = $map['data'];
        }
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['operator'])) {
            $model->operator = $map['operator'];
        }

        return $model;
    }
}
