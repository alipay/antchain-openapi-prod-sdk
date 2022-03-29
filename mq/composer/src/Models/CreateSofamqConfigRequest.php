<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class CreateSofamqConfigRequest extends Model
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

    // property
    /**
     * @var string
     */
    public $property;

    // target_name
    /**
     * @var string
     */
    public $targetName;

    // target_type
    /**
     * @var int
     */
    public $targetType;

    // value
    /**
     * @var string
     */
    public $value;

    // 生效范围，三板斧使用
    /**
     * @var string
     */
    public $scope;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'property'          => 'property',
        'targetName'        => 'target_name',
        'targetType'        => 'target_type',
        'value'             => 'value',
        'scope'             => 'scope',
    ];

    public function validate()
    {
        Model::validateRequired('property', $this->property, true);
        Model::validateRequired('targetName', $this->targetName, true);
        Model::validateRequired('targetType', $this->targetType, true);
        Model::validateRequired('value', $this->value, true);
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

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateSofamqConfigRequest
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

        return $model;
    }
}
