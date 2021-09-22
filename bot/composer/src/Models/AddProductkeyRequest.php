<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class AddProductkeyRequest extends Model
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

    // 设备端productKey
    /**
     * @var string
     */
    public $productKey;

    // 场景码
    /**
     * @var string
     */
    public $scene;

    // 租户ID
    /**
     * @var string
     */
    public $tenantName;

    // 数据模型
    /**
     * @var string
     */
    public $dataModelId;

    // sdk前缀
    /**
     * @var string
     */
    public $sdkVersionPrefix;

    // 制造商
    /**
     * @var string
     */
    public $manufacturer;

    // 顾客
    /**
     * @var string
     */
    public $customer;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'productKey'        => 'product_key',
        'scene'             => 'scene',
        'tenantName'        => 'tenant_name',
        'dataModelId'       => 'data_model_id',
        'sdkVersionPrefix'  => 'sdk_version_prefix',
        'manufacturer'      => 'manufacturer',
        'customer'          => 'customer',
    ];

    public function validate()
    {
        Model::validateRequired('productKey', $this->productKey, true);
        Model::validateRequired('scene', $this->scene, true);
        Model::validateRequired('tenantName', $this->tenantName, true);
        Model::validateRequired('dataModelId', $this->dataModelId, true);
        Model::validateRequired('sdkVersionPrefix', $this->sdkVersionPrefix, true);
        Model::validateRequired('manufacturer', $this->manufacturer, true);
        Model::validateRequired('customer', $this->customer, true);
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
        if (null !== $this->productKey) {
            $res['product_key'] = $this->productKey;
        }
        if (null !== $this->scene) {
            $res['scene'] = $this->scene;
        }
        if (null !== $this->tenantName) {
            $res['tenant_name'] = $this->tenantName;
        }
        if (null !== $this->dataModelId) {
            $res['data_model_id'] = $this->dataModelId;
        }
        if (null !== $this->sdkVersionPrefix) {
            $res['sdk_version_prefix'] = $this->sdkVersionPrefix;
        }
        if (null !== $this->manufacturer) {
            $res['manufacturer'] = $this->manufacturer;
        }
        if (null !== $this->customer) {
            $res['customer'] = $this->customer;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AddProductkeyRequest
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
        if (isset($map['product_key'])) {
            $model->productKey = $map['product_key'];
        }
        if (isset($map['scene'])) {
            $model->scene = $map['scene'];
        }
        if (isset($map['tenant_name'])) {
            $model->tenantName = $map['tenant_name'];
        }
        if (isset($map['data_model_id'])) {
            $model->dataModelId = $map['data_model_id'];
        }
        if (isset($map['sdk_version_prefix'])) {
            $model->sdkVersionPrefix = $map['sdk_version_prefix'];
        }
        if (isset($map['manufacturer'])) {
            $model->manufacturer = $map['manufacturer'];
        }
        if (isset($map['customer'])) {
            $model->customer = $map['customer'];
        }

        return $model;
    }
}
