<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class DeployThingudfRequest extends Model
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

    // UDF 唯一ID
    /**
     * @var string
     */
    public $udfId;

    // 场景码
    /**
     * @var string
     */
    public $scene;

    // 物模型功能ID
    /**
     * @var string
     */
    public $featureId;

    // 租户ID
    /**
     * @var string
     */
    public $customerTenant;

    // UDF类型枚举
    /**
     * @var string
     */
    public $udfType;

    // 物模型UDF实例表
    /**
     * @var string
     */
    public $value;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'udfId'             => 'udf_id',
        'scene'             => 'scene',
        'featureId'         => 'feature_id',
        'customerTenant'    => 'customer_tenant',
        'udfType'           => 'udf_type',
        'value'             => 'value',
    ];

    public function validate()
    {
        Model::validateRequired('udfId', $this->udfId, true);
        Model::validateRequired('scene', $this->scene, true);
        Model::validateRequired('featureId', $this->featureId, true);
        Model::validateRequired('customerTenant', $this->customerTenant, true);
        Model::validateRequired('udfType', $this->udfType, true);
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
        if (null !== $this->udfId) {
            $res['udf_id'] = $this->udfId;
        }
        if (null !== $this->scene) {
            $res['scene'] = $this->scene;
        }
        if (null !== $this->featureId) {
            $res['feature_id'] = $this->featureId;
        }
        if (null !== $this->customerTenant) {
            $res['customer_tenant'] = $this->customerTenant;
        }
        if (null !== $this->udfType) {
            $res['udf_type'] = $this->udfType;
        }
        if (null !== $this->value) {
            $res['value'] = $this->value;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DeployThingudfRequest
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
        if (isset($map['udf_id'])) {
            $model->udfId = $map['udf_id'];
        }
        if (isset($map['scene'])) {
            $model->scene = $map['scene'];
        }
        if (isset($map['feature_id'])) {
            $model->featureId = $map['feature_id'];
        }
        if (isset($map['customer_tenant'])) {
            $model->customerTenant = $map['customer_tenant'];
        }
        if (isset($map['udf_type'])) {
            $model->udfType = $map['udf_type'];
        }
        if (isset($map['value'])) {
            $model->value = $map['value'];
        }

        return $model;
    }
}
