<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class DeleteSofamqConfigRequest extends Model
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

    // 目标名
    /**
     * @var string
     */
    public $targetName;

    // 目标类型
    /**
     * @var int
     */
    public $targetType;

    // 属性名
    /**
     * @var string
     */
    public $property;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'targetName'        => 'target_name',
        'targetType'        => 'target_type',
        'property'          => 'property',
    ];

    public function validate()
    {
        Model::validateRequired('targetName', $this->targetName, true);
        Model::validateRequired('targetType', $this->targetType, true);
        Model::validateRequired('property', $this->property, true);
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
        if (null !== $this->targetName) {
            $res['target_name'] = $this->targetName;
        }
        if (null !== $this->targetType) {
            $res['target_type'] = $this->targetType;
        }
        if (null !== $this->property) {
            $res['property'] = $this->property;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DeleteSofamqConfigRequest
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
        if (isset($map['target_name'])) {
            $model->targetName = $map['target_name'];
        }
        if (isset($map['target_type'])) {
            $model->targetType = $map['target_type'];
        }
        if (isset($map['property'])) {
            $model->property = $map['property'];
        }

        return $model;
    }
}
