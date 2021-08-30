<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DAS\Models;

use AlibabaCloud\Tea\Model;

class CreateDasDatasourceRequest extends Model
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

    // 数据源名称
    /**
     * @var string
     */
    public $name;

    // 数据源提供方
    /**
     * @var string
     */
    public $provider;

    // 枚举值：ENTERPRISE、INDIVIDUAL
    /**
     * @var string
     */
    public $dataOwnerType;

    // 数据源接口定义
    /**
     * @var DataSourceInterface
     */
    public $dataSourceInterface;
    protected $_name = [
        'authToken'           => 'auth_token',
        'productInstanceId'   => 'product_instance_id',
        'name'                => 'name',
        'provider'            => 'provider',
        'dataOwnerType'       => 'data_owner_type',
        'dataSourceInterface' => 'data_source_interface',
    ];

    public function validate()
    {
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('provider', $this->provider, true);
        Model::validateRequired('dataOwnerType', $this->dataOwnerType, true);
        Model::validateRequired('dataSourceInterface', $this->dataSourceInterface, true);
        Model::validateMaxLength('name', $this->name, 20);
        Model::validateMaxLength('provider', $this->provider, 30);
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
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->provider) {
            $res['provider'] = $this->provider;
        }
        if (null !== $this->dataOwnerType) {
            $res['data_owner_type'] = $this->dataOwnerType;
        }
        if (null !== $this->dataSourceInterface) {
            $res['data_source_interface'] = null !== $this->dataSourceInterface ? $this->dataSourceInterface->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateDasDatasourceRequest
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
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['provider'])) {
            $model->provider = $map['provider'];
        }
        if (isset($map['data_owner_type'])) {
            $model->dataOwnerType = $map['data_owner_type'];
        }
        if (isset($map['data_source_interface'])) {
            $model->dataSourceInterface = DataSourceInterface::fromMap($map['data_source_interface']);
        }

        return $model;
    }
}
