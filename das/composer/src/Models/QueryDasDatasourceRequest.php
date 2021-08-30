<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DAS\Models;

use AlibabaCloud\Tea\Model;

class QueryDasDatasourceRequest extends Model
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

    // 数据源接口访问地址
    /**
     * @var string
     */
    public $address;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'name'              => 'name',
        'provider'          => 'provider',
        'dataOwnerType'     => 'data_owner_type',
        'address'           => 'address',
    ];

    public function validate()
    {
        Model::validateRequired('name', $this->name, true);
        Model::validateMaxLength('name', $this->name, 20);
        Model::validateMaxLength('provider', $this->provider, 30);
        Model::validateMaxLength('address', $this->address, 100);
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
        if (null !== $this->address) {
            $res['address'] = $this->address;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryDasDatasourceRequest
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
        if (isset($map['address'])) {
            $model->address = $map['address'];
        }

        return $model;
    }
}
